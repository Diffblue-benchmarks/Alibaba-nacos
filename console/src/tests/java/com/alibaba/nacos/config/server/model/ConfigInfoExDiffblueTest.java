package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfoExDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfoEx()).equals("foo"));
  }

  @Test(timeout=10000)
  public void getStatusTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ConfigInfoEx()).getStatus());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfoEx()).hashCode());
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange and Act
    ConfigInfoEx actualConfigInfoEx = new ConfigInfoEx();

    // Assert
    String actualDataId = actualConfigInfoEx.getDataId();
    long actualId = actualConfigInfoEx.getId();
    String actualContent = actualConfigInfoEx.getContent();
    String actualToStringResult = actualConfigInfoEx.toString();
    String actualMessage = actualConfigInfoEx.getMessage();
    String actualMd5 = actualConfigInfoEx.getMd5();
    String actualGroup = actualConfigInfoEx.getGroup();
    String actualTenant = actualConfigInfoEx.getTenant();
    String actualAppName = actualConfigInfoEx.getAppName();
    assertNull(actualDataId);
    assertEquals(0, actualConfigInfoEx.getStatus());
    assertNull(actualAppName);
    assertNull(actualTenant);
    assertNull(actualGroup);
    assertNull(actualMd5);
    assertNull(actualMessage);
    assertEquals("ConfigInfoEx [status=0, message=null, dataId=null," + " group=null, appName=null, content=null]",
        actualToStringResult);
    assertNull(actualContent);
    assertEquals(0L, actualId);
  }

  @Test(timeout=10000)
  public void getMessageTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoEx()).getMessage());
  }

  @Test(timeout=10000)
  public void setStatusTest() {
    // Arrange
    ConfigInfoEx configInfoEx = new ConfigInfoEx();

    // Act
    configInfoEx.setStatus(1);

    // Assert
    assertEquals(1, configInfoEx.getStatus());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ConfigInfoEx [status=0, message=null, dataId=null," + " group=null, appName=null, content=null]",
        (new ConfigInfoEx()).toString());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    ConfigInfoEx actualConfigInfoEx = new ConfigInfoEx("123", "foo", "foo");

    // Assert
    String actualDataId = actualConfigInfoEx.getDataId();
    String actualContent = actualConfigInfoEx.getContent();
    String actualMd5 = actualConfigInfoEx.getMd5();
    assertEquals("123", actualDataId);
    assertEquals("foo", actualConfigInfoEx.getGroup());
    assertEquals("acbd18db4cc2f85cedef654fccc4a4d8", actualMd5);
    assertEquals("foo", actualContent);
  }

  @Test(timeout=10000)
  public void setMessageTest() {
    // Arrange
    ConfigInfoEx configInfoEx = new ConfigInfoEx();

    // Act
    configInfoEx.setMessage("message");

    // Assert
    assertEquals("message", configInfoEx.getMessage());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ConfigInfoEx actualConfigInfoEx = new ConfigInfoEx("123", "foo", "foo", 1, "message");

    // Assert
    String actualDataId = actualConfigInfoEx.getDataId();
    String actualContent = actualConfigInfoEx.getContent();
    String actualMessage = actualConfigInfoEx.getMessage();
    String actualMd5 = actualConfigInfoEx.getMd5();
    String actualGroup = actualConfigInfoEx.getGroup();
    assertEquals("123", actualDataId);
    assertEquals(1, actualConfigInfoEx.getStatus());
    assertEquals("foo", actualGroup);
    assertEquals("acbd18db4cc2f85cedef654fccc4a4d8", actualMd5);
    assertEquals("message", actualMessage);
    assertEquals("foo", actualContent);
  }
}

