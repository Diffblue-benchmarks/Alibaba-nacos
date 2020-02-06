package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfoExDiffblueTest {
  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfoEx()).equals("aaaaa"));
  }

  @Test
  public void getStatusTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ConfigInfoEx()).getStatus());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfoEx()).hashCode());
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    ConfigInfoEx actualConfigInfoEx = new ConfigInfoEx();

    // Assert
    String actualDataId = actualConfigInfoEx.getDataId();
    long actualId = actualConfigInfoEx.getId();
    String actualContent = actualConfigInfoEx.getContent();
    String actualToStringResult = actualConfigInfoEx.toString();
    String actualType = actualConfigInfoEx.getType();
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
    assertNull(actualType);
    assertEquals("ConfigInfoEx [status=0, message=null, dataId=null," + " group=null, appName=null, content=null]",
        actualToStringResult);
    assertNull(actualContent);
    assertEquals(0L, actualId);
  }

  @Test
  public void getMessageTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoEx()).getMessage());
  }

  @Test
  public void setStatusTest() {
    // Arrange
    ConfigInfoEx configInfoEx = new ConfigInfoEx();

    // Act
    configInfoEx.setStatus(1);

    // Assert
    assertEquals(1, configInfoEx.getStatus());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ConfigInfoEx [status=0, message=null, dataId=null," + " group=null, appName=null, content=null]",
        (new ConfigInfoEx()).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    ConfigInfoEx actualConfigInfoEx = new ConfigInfoEx("aaaaa", "aaaaa", "aaaaa");

    // Assert
    String actualDataId = actualConfigInfoEx.getDataId();
    String actualContent = actualConfigInfoEx.getContent();
    String actualMd5 = actualConfigInfoEx.getMd5();
    assertEquals("aaaaa", actualDataId);
    assertEquals("aaaaa", actualConfigInfoEx.getGroup());
    assertEquals("594f803b380a41396ed63dca39503542", actualMd5);
    assertEquals("aaaaa", actualContent);
  }

  @Test
  public void setMessageTest() {
    // Arrange
    ConfigInfoEx configInfoEx = new ConfigInfoEx();

    // Act
    configInfoEx.setMessage("aaaaa");

    // Assert
    assertEquals("aaaaa", configInfoEx.getMessage());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ConfigInfoEx actualConfigInfoEx = new ConfigInfoEx("aaaaa", "aaaaa", "aaaaa", 1, "aaaaa");

    // Assert
    String actualDataId = actualConfigInfoEx.getDataId();
    String actualContent = actualConfigInfoEx.getContent();
    String actualMessage = actualConfigInfoEx.getMessage();
    String actualMd5 = actualConfigInfoEx.getMd5();
    String actualGroup = actualConfigInfoEx.getGroup();
    assertEquals("aaaaa", actualDataId);
    assertEquals(1, actualConfigInfoEx.getStatus());
    assertEquals("aaaaa", actualGroup);
    assertEquals("594f803b380a41396ed63dca39503542", actualMd5);
    assertEquals("aaaaa", actualMessage);
    assertEquals("aaaaa", actualContent);
  }
}

