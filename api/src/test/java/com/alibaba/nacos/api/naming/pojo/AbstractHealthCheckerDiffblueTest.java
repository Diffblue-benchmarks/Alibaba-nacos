package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.alibaba.fastjson.serializer.SerializeWriter;
import org.junit.Test;

public class AbstractHealthCheckerDiffblueTest {
  @Test
  public void equalsTest3() {
    // Arrange, Act and Assert
    assertFalse((new AbstractHealthChecker.Tcp()).equals("foo"));
  }

  @Test
  public void hashCodeTest3() {
    // Arrange, Act and Assert
    assertEquals(82912, (new AbstractHealthChecker.Tcp()).hashCode());
  }

  @Test
  public void constructorTest4() {
    // Arrange, Act and Assert
    assertEquals("TCP", (new AbstractHealthChecker.Tcp()).getType());
  }

  @Test
  public void cloneTest4() throws CloneNotSupportedException {
    // Arrange, Act and Assert
    assertEquals("TCP", (new AbstractHealthChecker.Tcp()).clone().getType());
  }

  @Test
  public void cloneTest3() throws CloneNotSupportedException {
    // Arrange, Act and Assert
    assertEquals("NONE", (new AbstractHealthChecker.None()).clone().getType());
  }

  @Test
  public void constructorTest3() {
    // Arrange, Act and Assert
    assertEquals("NONE", (new AbstractHealthChecker.None()).getType());
  }

  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse((new AbstractHealthChecker.Mysql()).equals("foo"));
  }

  @Test
  public void cloneTest2() throws CloneNotSupportedException {
    // Arrange and Act
    AbstractHealthChecker.Mysql actualCloneResult = (new AbstractHealthChecker.Mysql()).clone();

    // Assert
    String actualType = actualCloneResult.getType();
    String actualCmd = actualCloneResult.getCmd();
    String actualPwd = actualCloneResult.getPwd();
    assertEquals("MYSQL", actualType);
    assertNull(actualCloneResult.getUser());
    assertNull(actualPwd);
    assertNull(actualCmd);
  }

  @Test
  public void jsonAdapterCallbackTest2() {
    // Arrange
    AbstractHealthChecker.Mysql mysql = new AbstractHealthChecker.Mysql();
    SerializeWriter serializeWriter = new SerializeWriter();

    // Act
    mysql.jsonAdapterCallback(serializeWriter);

    // Assert
    assertEquals(34, serializeWriter.size());
  }

  @Test
  public void getUserTest() {
    // Arrange, Act and Assert
    assertNull((new AbstractHealthChecker.Mysql()).getUser());
  }

  @Test
  public void setPwdTest() {
    // Arrange
    AbstractHealthChecker.Mysql mysql = new AbstractHealthChecker.Mysql();

    // Act
    mysql.setPwd("foo");

    // Assert
    assertEquals("foo", mysql.getPwd());
  }

  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(29791, (new AbstractHealthChecker.Mysql()).hashCode());
  }

  @Test
  public void getPwdTest() {
    // Arrange, Act and Assert
    assertNull((new AbstractHealthChecker.Mysql()).getPwd());
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("MYSQL", (new AbstractHealthChecker.Mysql()).getType());
  }

  @Test
  public void setUserTest() {
    // Arrange
    AbstractHealthChecker.Mysql mysql = new AbstractHealthChecker.Mysql();

    // Act
    mysql.setUser("foo");

    // Assert
    assertEquals("foo", mysql.getUser());
  }

  @Test
  public void getCmdTest() {
    // Arrange, Act and Assert
    assertNull((new AbstractHealthChecker.Mysql()).getCmd());
  }

  @Test
  public void setCmdTest() {
    // Arrange
    AbstractHealthChecker.Mysql mysql = new AbstractHealthChecker.Mysql();

    // Act
    mysql.setCmd("foo");

    // Assert
    assertEquals("foo", mysql.getCmd());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new AbstractHealthChecker.Http()).equals("foo"));
  }

  @Test
  public void setPathTest() {
    // Arrange
    AbstractHealthChecker.Http http = new AbstractHealthChecker.Http();

    // Act
    http.setPath("foo");

    // Assert
    assertEquals("foo", http.getPath());
  }

  @Test
  public void cloneTest() throws CloneNotSupportedException {
    // Arrange and Act
    AbstractHealthChecker.Http actualCloneResult = (new AbstractHealthChecker.Http()).clone();

    // Assert
    String actualHeaders = actualCloneResult.getHeaders();
    String actualType = actualCloneResult.getType();
    String actualPath = actualCloneResult.getPath();
    assertEquals("", actualHeaders);
    assertEquals(200, actualCloneResult.getExpectedResponseCode());
    assertEquals("", actualPath);
    assertEquals("HTTP", actualType);
  }

  @Test
  public void jsonAdapterCallbackTest() {
    // Arrange
    AbstractHealthChecker.Http http = new AbstractHealthChecker.Http();
    SerializeWriter serializeWriter = new SerializeWriter();

    // Act
    http.jsonAdapterCallback(serializeWriter);

    // Assert
    assertEquals(23, serializeWriter.size());
  }

  @Test
  public void setExpectedResponseCodeTest() {
    // Arrange
    AbstractHealthChecker.Http http = new AbstractHealthChecker.Http();

    // Act
    http.setExpectedResponseCode(1);

    // Assert
    assertEquals(1, http.getExpectedResponseCode());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(29991, (new AbstractHealthChecker.Http()).hashCode());
  }

  @Test
  public void getExpectedResponseCodeTest() {
    // Arrange, Act and Assert
    assertEquals(200, (new AbstractHealthChecker.Http()).getExpectedResponseCode());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    AbstractHealthChecker.Http actualHttp = new AbstractHealthChecker.Http();

    // Assert
    String actualHeaders = actualHttp.getHeaders();
    String actualType = actualHttp.getType();
    String actualPath = actualHttp.getPath();
    assertEquals("", actualHeaders);
    assertEquals(200, actualHttp.getExpectedResponseCode());
    assertEquals("", actualPath);
    assertEquals("HTTP", actualType);
  }

  @Test
  public void getPathTest() {
    // Arrange, Act and Assert
    assertEquals("", (new AbstractHealthChecker.Http()).getPath());
  }

  @Test
  public void getCustomHeadersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new AbstractHealthChecker.Http()).getCustomHeaders().size());
  }

  @Test
  public void getHeadersTest() {
    // Arrange, Act and Assert
    assertEquals("", (new AbstractHealthChecker.Http()).getHeaders());
  }

  @Test
  public void setHeadersTest() {
    // Arrange
    AbstractHealthChecker.Http http = new AbstractHealthChecker.Http();

    // Act
    http.setHeaders("foo");

    // Assert
    assertEquals("foo", http.getHeaders());
  }
}

