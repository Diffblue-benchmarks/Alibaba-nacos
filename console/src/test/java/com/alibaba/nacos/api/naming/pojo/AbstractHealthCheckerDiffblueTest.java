package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.alibaba.fastjson.serializer.SerializeWriter;
import org.junit.Test;

public class AbstractHealthCheckerDiffblueTest {
  @Test
  public void testHttpClone() throws CloneNotSupportedException {
    // Arrange and Act
    AbstractHealthChecker.Http actualCloneResult = (new AbstractHealthChecker.Http()).clone();

    // Assert
    assertEquals("", actualCloneResult.getHeaders());
    assertEquals(200, actualCloneResult.getExpectedResponseCode());
    assertEquals("", actualCloneResult.getPath());
    assertEquals("HTTP", actualCloneResult.getType());
  }

  @Test
  public void testHttpConstructor() {
    // Arrange and Act
    AbstractHealthChecker.Http actualHttp = new AbstractHealthChecker.Http();

    // Assert
    assertEquals("", actualHttp.getHeaders());
    assertEquals(200, actualHttp.getExpectedResponseCode());
    assertEquals("", actualHttp.getPath());
    assertEquals("HTTP", actualHttp.getType());
  }

  @Test
  public void testHttpEquals() {
    // Arrange, Act and Assert
    assertFalse((new AbstractHealthChecker.Http()).equals(""));
  }

  @Test
  public void testHttpGetCustomHeaders() {
    // Arrange, Act and Assert
    assertEquals(0, (new AbstractHealthChecker.Http()).getCustomHeaders().size());
  }

  @Test
  public void testHttpHashCode() {
    // Arrange, Act and Assert
    assertEquals(29991, (new AbstractHealthChecker.Http()).hashCode());
  }

  @Test
  public void testHttpJsonAdapterCallback() {
    // Arrange
    AbstractHealthChecker.Http http = new AbstractHealthChecker.Http();
    SerializeWriter serializeWriter = new SerializeWriter();

    // Act
    http.jsonAdapterCallback(serializeWriter);

    // Assert
    assertEquals(23, serializeWriter.size());
  }

  @Test
  public void testHttpSetExpectedResponseCode() {
    // Arrange
    AbstractHealthChecker.Http http = new AbstractHealthChecker.Http();

    // Act
    http.setExpectedResponseCode(0);

    // Assert
    assertEquals(0, http.getExpectedResponseCode());
  }

  @Test
  public void testHttpSetHeaders() {
    // Arrange
    AbstractHealthChecker.Http http = new AbstractHealthChecker.Http();

    // Act
    http.setHeaders("");

    // Assert
    assertEquals("", http.getHeaders());
  }

  @Test
  public void testHttpSetPath() {
    // Arrange
    AbstractHealthChecker.Http http = new AbstractHealthChecker.Http();

    // Act
    http.setPath("");

    // Assert
    assertEquals("", http.getPath());
  }

  @Test
  public void testMysqlClone() throws CloneNotSupportedException {
    // Arrange and Act
    AbstractHealthChecker.Mysql actualCloneResult = (new AbstractHealthChecker.Mysql()).clone();

    // Assert
    assertEquals("MYSQL", actualCloneResult.getType());
    assertNull(actualCloneResult.getUser());
    assertNull(actualCloneResult.getPwd());
    assertNull(actualCloneResult.getCmd());
  }

  @Test
  public void testMysqlConstructor() {
    // Arrange, Act and Assert
    assertEquals("MYSQL", (new AbstractHealthChecker.Mysql()).getType());
  }

  @Test
  public void testMysqlEquals() {
    // Arrange, Act and Assert
    assertFalse((new AbstractHealthChecker.Mysql()).equals("MYSQL"));
  }

  @Test
  public void testMysqlHashCode() {
    // Arrange, Act and Assert
    assertEquals(29791, (new AbstractHealthChecker.Mysql()).hashCode());
  }

  @Test
  public void testMysqlJsonAdapterCallback() {
    // Arrange
    AbstractHealthChecker.Mysql mysql = new AbstractHealthChecker.Mysql();
    SerializeWriter serializeWriter = new SerializeWriter();

    // Act
    mysql.jsonAdapterCallback(serializeWriter);

    // Assert
    assertEquals(34, serializeWriter.size());
  }

  @Test
  public void testMysqlSetCmd() {
    // Arrange
    AbstractHealthChecker.Mysql mysql = new AbstractHealthChecker.Mysql();

    // Act
    mysql.setCmd("MYSQL");

    // Assert
    assertEquals("MYSQL", mysql.getCmd());
  }

  @Test
  public void testMysqlSetPwd() {
    // Arrange
    AbstractHealthChecker.Mysql mysql = new AbstractHealthChecker.Mysql();

    // Act
    mysql.setPwd("MYSQL");

    // Assert
    assertEquals("MYSQL", mysql.getPwd());
  }

  @Test
  public void testMysqlSetUser() {
    // Arrange
    AbstractHealthChecker.Mysql mysql = new AbstractHealthChecker.Mysql();

    // Act
    mysql.setUser("MYSQL");

    // Assert
    assertEquals("MYSQL", mysql.getUser());
  }

  @Test
  public void testNoneClone() throws CloneNotSupportedException {
    // Arrange, Act and Assert
    assertEquals("NONE", (new AbstractHealthChecker.None()).clone().getType());
  }

  @Test
  public void testNoneConstructor() {
    // Arrange, Act and Assert
    assertEquals("NONE", (new AbstractHealthChecker.None()).getType());
  }

  @Test
  public void testTcpClone() throws CloneNotSupportedException {
    // Arrange, Act and Assert
    assertEquals("TCP", (new AbstractHealthChecker.Tcp()).clone().getType());
  }

  @Test
  public void testTcpConstructor() {
    // Arrange, Act and Assert
    assertEquals("TCP", (new AbstractHealthChecker.Tcp()).getType());
  }

  @Test
  public void testTcpEquals() {
    // Arrange, Act and Assert
    assertFalse((new AbstractHealthChecker.Tcp()).equals("TCP"));
  }

  @Test
  public void testTcpHashCode() {
    // Arrange, Act and Assert
    assertEquals(82912, (new AbstractHealthChecker.Tcp()).hashCode());
  }
}

