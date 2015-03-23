package com.zenika.docker.dsl.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import com.zenika.docker.dsl.DockerfileDslInjectorProvider
import com.zenika.docker.dsl.dockerfileDsl.Dockerfile
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test

import static org.junit.Assert.*
import com.google.inject.Inject
import com.zenika.docker.dsl.dockerfileDsl.From
import com.zenika.docker.dsl.dockerfileDsl.Env

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
  def void parseFromWithTag() {
    var dockerfile = parser.parse("FROM busybox:latest")
    printErrors(dockerfile)
    assertTrue(dockerfile.eResource.errors.empty);
    val from = dockerfile.instructions.head as From
    assertEquals("latest",from.tag)
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
	
	
}
