#!/bin/bash

set -u
set -e

export DOCLIPSER_ROOT_PATH=$(pwd)
export PARENT_PROJECT_PATH=$DOCLIPSER_ROOT_PATH/com.zenika.doclipser.parent

export SNAPSHOT_VERSION=`cd $PARENT_PROJECT_PATH && python -c "import xml.etree.ElementTree as ET; \
  print(ET.parse(open('pom.xml')).getroot().find( \
  '{http://maven.apache.org/POM/4.0.0}version').text)"`
export VERSION=`echo $SNAPSHOT_VERSION | cut -d'-' -f 1`
export NEXT_VERSION=`echo $VERSION | awk -F. -v OFS=. 'NF==1{print ++$NF}; NF>1{if(length($NF+1)>length($NF))$(NF-1)++; $NF=sprintf("%0*d", length($NF), ($NF+1)%(10^length($NF))); print}'`

# Switch to realease version
cd $PARENT_PROJECT_PATH
mvn tycho-versions:set-version -DnewVersion=$VERSION

# Build (generates file com.zenika.doclipser.repository-$VERSION.zip)
cd $DOCLIPSER_ROOT_PATH/com.zenika.doclipser.parent/
mvn clean install dependency:resolve

# Upload to bintray (API docs https://bintray.com/docs/api/)
cd $DOCLIPSER_ROOT_PATH
export SITE_FILE=com.zenika.doclipser.repository-$VERSION.zip
export ARTIFACT=$REPO_PROJECT_PATH/target/$SITE_FILE
export API_KEY=$BINTRAY_API_KEY
export SUBJECT=zenika
export REPO=doclipser
export PACKAGE=doclipser-p2-site
export URL="https://api.bintray.com/content/$SUBJECT/$REPO/$PACKAGE/v$VERSION/$SITE_FILE?publish=1&override=1&explode=1"
curl -T $ARTIFACT -H "Content-Type:application/zip" -u l0rd:$API_KEY "$URL"

# Commit changes
cd $DOCLIPSER_ROOT_PATH
git add *MANIFEST.MF *pom.xml *feature.xml *category.xml
git commit -m "version $VERSION release"

# Tag
git tag v$VERSION

# Switch to next snapshot version
cd $PARENT_PROJECT_PATH
mvn tycho-versions:set-version -DnewVersion=$NEXT_VERSION-SNAPSHOT

# Commit changes
cd $DOCLIPSER_ROOT_PATH
git add *MANIFEST.MF *pom.xml *feature.xml *category.xml
git commit -m "version $NEXT_VERSION-SNAPSHOT release"

# Push changes to origin
git push origin master
git push origin --tags
