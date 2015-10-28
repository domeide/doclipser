package com.zenika.doclipser.dsl.tests

import com.google.inject.Inject
import com.zenika.doclipser.dsl.DockerfileDslInjectorProvider
import com.zenika.doclipser.dsl.dockerfileDsl.AddDestination
import com.zenika.doclipser.dsl.dockerfileDsl.Dockerfile
import com.zenika.doclipser.dsl.dockerfileDsl.Env
import com.zenika.doclipser.dsl.dockerfileDsl.From
import com.zenika.doclipser.dsl.dockerfileDsl.Workdir
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import com.zenika.doclipser.dsl.dockerfileDsl.Maintainer

@InjectWith(DockerfileDslInjectorProvider)
@RunWith(XtextRunner)
class DockerfileParserTest {
	
  @Inject
  ParseHelper<Dockerfile> parser
  
  def void printErrors(Dockerfile dockerfile) {
  		var errors = dockerfile.eResource.errors
		for (error : errors) {
			println(error)
		}
  }
      
  @Test 
  def void parseBadFile() {
    val dockerfile1 = parser.parse(
      "FROM Hello World!")
    assertFalse(dockerfile1.eResource.errors.empty);
    val dockerfile2 = parser.parse(
      "FROMHelloWorld!")
    assertTrue(dockerfile2 == null);
  }
	
  @Test 
  def void parseSimpleFROM() {
    val dockerfile = parser.parse("FROM busybox")
    if (dockerfile!=null)
    	printErrors(dockerfile) 
    assertTrue(dockerfile.eResource.errors.empty);

    val from = dockerfile.instructions.head as From
    assertEquals("busybox",from.name)
  }
	
  @Test 
  def void parseComment() {
    val dockerfile = parser.parse("# this should be ignored")
    assertTrue(dockerfile == null);
  }
  
  @Test
  def void parseMaintainer() {
  	val dockerfile = parser.parse("MAINTAINER mariolet <mario.loriedo@gmail.com>")
  	
    if (dockerfile!=null)
    	printErrors(dockerfile) 
    assertTrue(dockerfile.eResource.errors.empty);

    val maintainer = dockerfile.instructions.head as Maintainer
    assertEquals(" mariolet <mario.loriedo@gmail.com>",maintainer.name)
  }
	
  @Test 
  def void parseFromWithLatest() {
    var dockerfile = parser.parse("FROM busybox:latest")
    if (dockerfile!=null)
    	printErrors(dockerfile) 
    assertTrue(dockerfile.eResource.errors.empty);
    val from = dockerfile.instructions.head as From
    assertEquals("latest",from.tag)
  }
	
  @Test 
  def void parseFromWithTag() {
    var dockerfile = parser.parse("FROM maven:3.3-jdk-8-onbuild")
    if (dockerfile!=null)
    	printErrors(dockerfile) 
    assertTrue(dockerfile.eResource.errors.empty);
    val from = dockerfile.instructions.head as From
    assertEquals("3.3-jdk-8-onbuild",from.tag)
  }
	
  @Test 
  def void parseFromWithSlash() {
    var dockerfile = parser.parse("FROM mariolet/hamba")
    if (dockerfile!=null)
    	printErrors(dockerfile) 
    assertTrue(dockerfile.eResource.errors.empty);

    val from = dockerfile.instructions.head as From
    assertEquals("mariolet/hamba",from.name)
  }
	
  @Test 
  def void parseEnv() {
    var dockerfile = parser.parse("ENV key value")
    printErrors(dockerfile)
    assertTrue(dockerfile.eResource.errors.empty);
    
    val env1 = dockerfile.instructions.head as Env
    assertEquals("key",env1.key.head)
    assertEquals(" value",env1.value.head)

    dockerfile = parser.parse("ENV key /this/is/a/path")
    printErrors(dockerfile)
    assertTrue(dockerfile.eResource.errors.empty);
	
	val env2 = dockerfile.instructions.head as Env
    assertEquals("key",env2.key.head)
    assertEquals(" /this/is/a/path",env2.value.head)
  }
	
  @Test 
  def void parseEnvWithEqual() {
    var dockerfile1 = parser.parse("ENV key=value")
    printErrors(dockerfile1)
    assertTrue(dockerfile1.eResource.errors.empty);
    
    val env1 = dockerfile1.instructions.head as Env
    assertEquals("key",env1.key.head)
    assertEquals("=value",env1.value.head)

    var dockerfile2 = parser.parse("ENV key1=value1 key2=value2")
    printErrors(dockerfile2)
    assertTrue(dockerfile2.eResource.errors.empty);
    
    val env2 = dockerfile2.instructions.head as Env
    assertEquals("key1",env2.key.head)
    assertEquals("=value1 ",env2.value.head)
  }
	
  @Test 
  def void parseWorkdir() {
    var dockerfile1 = parser.parse("WORKDIR /a")
    printErrors(dockerfile1)
    assertTrue(dockerfile1.eResource.errors.empty);
    
    val workdir1 = dockerfile1.instructions.head as Workdir
    assertEquals(" /a",workdir1.path)

    var dockerfile2 = parser.parse("WORKDIR abc/d")
    printErrors(dockerfile2)
    assertTrue(dockerfile2.eResource.errors.empty);
    
    val workdir2 = dockerfile1.instructions.head as Workdir
    assertEquals(" /a",workdir2.path)
  }
	
  @Test 
  def void parseAdd() {
    var dockerfile1 = parser.parse("ADD file mydir/")
    printErrors(dockerfile1)
    assertTrue(dockerfile1.eResource.errors.empty);
    
    val add1 = dockerfile1.instructions.head as AddDestination
    assertEquals("file",add1.source_left)
    assertEquals(" mydir/",add1.dest)

    var dockerfile2 = parser.parse("ADD file file/in/path mydir/")
    printErrors(dockerfile2)
    assertTrue(dockerfile2.eResource.errors.empty);
    
    val add2 = dockerfile2.instructions.head as AddDestination
    assertEquals("file",add2.source_left)
    assertEquals(" file/in/path mydir/",add2.dest)

    var dockerfile3 = parser.parse("ADD http://url/file mydir/")
    assertTrue(dockerfile3.eResource.errors.empty);
    
    val add3 = dockerfile3.instructions.head as AddDestination
    assertEquals("http://url/file",add3.source_left)
    assertEquals(" mydir/",add3.dest)

    var dockerfile4 = parser.parse("ADD ../file /mydir/")
    assertFalse(dockerfile4.eResource.errors.empty);    
  }
	
  @Test 
  def void parseRun() {
    var dockerfile1 = parser.parse("RUN echo hello world")
    printErrors(dockerfile1)
    assertTrue(dockerfile1.eResource.errors.empty);
    var dockerfile2 = parser.parse("RUN [\"executable\" \"param1\" \"param2\"]")
    printErrors(dockerfile2)
    assertTrue(dockerfile2.eResource.errors.empty);
  }
	
  @Test 
  def void parseExpose() {
    var dockerfile1 = parser.parse("EXPOSE 1234")
    printErrors(dockerfile1)
    assertTrue(dockerfile1.eResource.errors.empty);
    var dockerfile2 = parser.parse("EXPOSE 1234 8978 12345")
    printErrors(dockerfile2)
    assertTrue(dockerfile2.eResource.errors.empty);
  }
	
  @Test 
  def void parseVolume() {
    var dockerfile1 = parser.parse("VOLUME [\"/var/log/\"]")
    printErrors(dockerfile1)
    assertTrue(dockerfile1.eResource.errors.empty);
    var dockerfile2 = parser.parse("VOLUME /var/log/")
    printErrors(dockerfile2)
    assertTrue(dockerfile2.eResource.errors.empty);
  }
	
  @Test 
  def void parseCmd() {
    var dockerfile1 = parser.parse("CMD [\"executable\",\"param1\",\"param2\"]")
    printErrors(dockerfile1)
    assertTrue(dockerfile1.eResource.errors.empty);
    var dockerfile2 = parser.parse("CMD command param1 param2")
    printErrors(dockerfile2)
    assertTrue(dockerfile2.eResource.errors.empty);
  }
	
  @Test 
  def void parseCopy() {
    var dockerfile1 = parser.parse("COPY [\"hom*\",\"/mydir/\"]")
    printErrors(dockerfile1)
    assertTrue(dockerfile1.eResource.errors.empty);
    var dockerfile2 = parser.parse("COPY hom* /mydir/")
    printErrors(dockerfile2)
    assertTrue(dockerfile2.eResource.errors.empty);
  }
	
  @Test 
  def void parseEntrypoint() {
    var dockerfile1 = parser.parse("ENTRYPOINT [\"executable\",\"param1\",\"param2\"]")
    printErrors(dockerfile1)
    assertTrue(dockerfile1.eResource.errors.empty);
    var dockerfile2 = parser.parse("ENTRYPOINT command param1 param2")
    printErrors(dockerfile2)
    assertTrue(dockerfile2.eResource.errors.empty);
  }
	
  @Test 
  def void parseUser() {
    var dockerfile1 = parser.parse("USER daemon")
    printErrors(dockerfile1)
    assertTrue(dockerfile1.eResource.errors.empty);
  }
	
  @Test 
  def void parseOnbuild() {
    var dockerfile2 = parser.parse("ONBUILD RUN /usr/local/bin/python-build --dir /app/src")
    printErrors(dockerfile2)
    assertTrue(dockerfile2.eResource.errors.empty);
    var dockerfile1 = parser.parse("ONBUILD ADD . /app/src")
    printErrors(dockerfile1)
    assertTrue(dockerfile1.eResource.errors.empty);
  }
	
	
}
