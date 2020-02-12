package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.alibaba.fastjson.serializer.SerializeWriter;
import org.junit.Test;

public class AbstractHealthCheckerDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest3() {
    // Arrange, Act and Assert
    assertFalse((new AbstractHealthChecker.Tcp()).equals("foo"));
  }

  @Test(timeout=10000)
  public void hashCodeTest3() {
    // Arrange, Act and Assert
    assertEquals(82912, (new AbstractHealthChecker.Tcp()).hashCode());
  }

  @Test(timeout=10000)
  public void constructorTest4() {
    // Arrange, Act and Assert
    assertEquals("TCP", (new AbstractHealthChecker.Tcp()).getType());
  }

  @Test(timeout=10000)
  public void cloneTest4() throws CloneNotSupportedException {
    // Arrange, Act and Assert
    assertEquals("TCP", (new AbstractHealthChecker.Tcp()).clone().getType());
  }

  @Test(timeout=10000)
  public void cloneTest3() throws CloneNotSupportedException {
    // Arrange, Act and Assert
    assertEquals("NONE", (new AbstractHealthChecker.None()).clone().getType());
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange, Act and Assert
    assertEquals("NONE", (new AbstractHealthChecker.None()).getType());
  }

  @Test(timeout=10000)
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse((new AbstractHealthChecker.Mysql()).equals("foo"));
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void jsonAdapterCallbackTest2() {
    // Arrange
    AbstractHealthChecker.Mysql mysql = new AbstractHealthChecker.Mysql();
    SerializeWriter serializeWriter = new SerializeWriter();

    // Act
    mysql.jsonAdapterCallback(serializeWriter);

    // Assert
    assertEquals(34, serializeWriter.size());
  }

  @Test(timeout=10000)
  public void getUserTest() {
    // Arrange, Act and Assert
    assertNull((new AbstractHealthChecker.Mysql()).getUser());
  }

  @Test(timeout=10000)
  public void setPwdTest() {
    // Arrange
    AbstractHealthChecker.Mysql mysql = new AbstractHealthChecker.Mysql();

    // Act
    mysql.setPwd("foo");

    // Assert
    assertEquals("foo", mysql.getPwd());
  }

  @Test(timeout=10000)
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(29791, (new AbstractHealthChecker.Mysql()).hashCode());
  }

  @Test(timeout=10000)
  public void getPwdTest() {
    // Arrange, Act and Assert
    assertNull((new AbstractHealthChecker.Mysql()).getPwd());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("MYSQL", (new AbstractHealthChecker.Mysql()).getType());
  }

  @Test(timeout=10000)
  public void setUserTest() {
    // Arrange
    AbstractHealthChecker.Mysql mysql = new AbstractHealthChecker.Mysql();

    // Act
    mysql.setUser("foo");

    // Assert
    assertEquals("foo", mysql.getUser());
  }

  @Test(timeout=10000)
  public void getCmdTest() {
    // Arrange, Act and Assert
    assertNull((new AbstractHealthChecker.Mysql()).getCmd());
  }

  @Test(timeout=10000)
  public void setCmdTest() {
    // Arrange
    AbstractHealthChecker.Mysql mysql = new AbstractHealthChecker.Mysql();

    // Act
    mysql.setCmd("foo");

    // Assert
    assertEquals("foo", mysql.getCmd());
  }

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new AbstractHealthChecker.Http()).equals("foo"));
  }

  @Test(timeout=10000)
  public void setPathTest() {
    // Arrange
    AbstractHealthChecker.Http http = new AbstractHealthChecker.Http();

    // Act
    http.setPath("foo");

    // Assert
    assertEquals("foo", http.getPath());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void jsonAdapterCallbackTest() {
    // Arrange
    AbstractHealthChecker.Http http = new AbstractHealthChecker.Http();
    SerializeWriter serializeWriter = new SerializeWriter();

    // Act
    http.jsonAdapterCallback(serializeWriter);

    // Assert
    assertEquals(23, serializeWriter.size());
  }

  @Test(timeout=10000)
  public void setExpectedResponseCodeTest() {
    // Arrange
    AbstractHealthChecker.Http http = new AbstractHealthChecker.Http();

    // Act
    http.setExpectedResponseCode(1);

    // Assert
    assertEquals(1, http.getExpectedResponseCode());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(29991, (new AbstractHealthChecker.Http()).hashCode());
  }

  @Test(timeout=10000)
  public void getExpectedResponseCodeTest() {
    // Arrange, Act and Assert
    assertEquals(200, (new AbstractHealthChecker.Http()).getExpectedResponseCode());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void getPathTest() {
    // Arrange, Act and Assert
    assertEquals("", (new AbstractHealthChecker.Http()).getPath());
  }

  @Test(timeout=10000)
  public void getCustomHeadersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new AbstractHealthChecker.Http()).getCustomHeaders().size());
  }

  @Test(timeout=10000)
  public void getHeadersTest() {
    // Arrange, Act and Assert
    assertEquals("", (new AbstractHealthChecker.Http()).getHeaders());
  }

  @Test(timeout=10000)
  public void setHeadersTest() {
    // Arrange
    AbstractHealthChecker.Http http = new AbstractHealthChecker.Http();

    // Act
    http.setHeaders("foo");

    // Assert
    assertEquals("foo", http.getHeaders());
  }
}

