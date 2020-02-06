package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfoBaseExDiffblueTest {
  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfoBaseEx()).equals("foo"));
  }

  @Test
  public void getStatusTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ConfigInfoBaseEx()).getStatus());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfoBaseEx()).hashCode());
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    ConfigInfoBaseEx actualConfigInfoBaseEx = new ConfigInfoBaseEx();

    // Assert
    String actualDataId = actualConfigInfoBaseEx.getDataId();
    long actualId = actualConfigInfoBaseEx.getId();
    String actualContent = actualConfigInfoBaseEx.getContent();
    String actualToStringResult = actualConfigInfoBaseEx.toString();
    String actualMessage = actualConfigInfoBaseEx.getMessage();
    String actualMd5 = actualConfigInfoBaseEx.getMd5();
    String actualGroup = actualConfigInfoBaseEx.getGroup();
    assertNull(actualDataId);
    assertEquals(0, actualConfigInfoBaseEx.getStatus());
    assertNull(actualGroup);
    assertNull(actualMd5);
    assertNull(actualMessage);
    assertEquals("ConfigInfoBaseEx [status=0, message=null, dataId=null," + " group()=null, content()=null]",
        actualToStringResult);
    assertNull(actualContent);
    assertEquals(0L, actualId);
  }

  @Test
  public void getMessageTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoBaseEx()).getMessage());
  }

  @Test
  public void setStatusTest() {
    // Arrange
    ConfigInfoBaseEx configInfoBaseEx = new ConfigInfoBaseEx();

    // Act
    configInfoBaseEx.setStatus(1);

    // Assert
    assertEquals(1, configInfoBaseEx.getStatus());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ConfigInfoBaseEx [status=0, message=null, dataId=null," + " group()=null, content()=null]",
        (new ConfigInfoBaseEx()).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    ConfigInfoBaseEx actualConfigInfoBaseEx = new ConfigInfoBaseEx("123", "foo", "foo");

    // Assert
    String actualDataId = actualConfigInfoBaseEx.getDataId();
    String actualContent = actualConfigInfoBaseEx.getContent();
    String actualMd5 = actualConfigInfoBaseEx.getMd5();
    assertEquals("123", actualDataId);
    assertEquals("foo", actualConfigInfoBaseEx.getGroup());
    assertEquals("acbd18db4cc2f85cedef654fccc4a4d8", actualMd5);
    assertEquals("foo", actualContent);
  }

  @Test
  public void setMessageTest() {
    // Arrange
    ConfigInfoBaseEx configInfoBaseEx = new ConfigInfoBaseEx();

    // Act
    configInfoBaseEx.setMessage("message");

    // Assert
    assertEquals("message", configInfoBaseEx.getMessage());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ConfigInfoBaseEx actualConfigInfoBaseEx = new ConfigInfoBaseEx("123", "foo", "foo", 1, "message");

    // Assert
    String actualDataId = actualConfigInfoBaseEx.getDataId();
    String actualContent = actualConfigInfoBaseEx.getContent();
    String actualMessage = actualConfigInfoBaseEx.getMessage();
    String actualMd5 = actualConfigInfoBaseEx.getMd5();
    String actualGroup = actualConfigInfoBaseEx.getGroup();
    assertEquals("123", actualDataId);
    assertEquals(1, actualConfigInfoBaseEx.getStatus());
    assertEquals("foo", actualGroup);
    assertEquals("acbd18db4cc2f85cedef654fccc4a4d8", actualMd5);
    assertEquals("message", actualMessage);
    assertEquals("foo", actualContent);
  }
}

