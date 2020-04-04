package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfoExDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ConfigInfoEx actualConfigInfoEx = new ConfigInfoEx("123", "group", "content", 1, "message");

    // Assert
    assertEquals("123", actualConfigInfoEx.getDataId());
    assertEquals(1, actualConfigInfoEx.getStatus());
    assertEquals("group", actualConfigInfoEx.getGroup());
    assertEquals("9a0364b9e99bb480dd25e1f0284c8555", actualConfigInfoEx.getMd5());
    assertEquals("message", actualConfigInfoEx.getMessage());
    assertEquals("content", actualConfigInfoEx.getContent());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    ConfigInfoEx actualConfigInfoEx = new ConfigInfoEx("123", "group", "content");

    // Assert
    assertEquals("123", actualConfigInfoEx.getDataId());
    assertEquals("group", actualConfigInfoEx.getGroup());
    assertEquals("9a0364b9e99bb480dd25e1f0284c8555", actualConfigInfoEx.getMd5());
    assertEquals("content", actualConfigInfoEx.getContent());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    ConfigInfoEx actualConfigInfoEx = new ConfigInfoEx();

    // Assert
    assertNull(actualConfigInfoEx.getDataId());
    assertEquals(0, actualConfigInfoEx.getStatus());
    assertNull(actualConfigInfoEx.getAppName());
    assertNull(actualConfigInfoEx.getTenant());
    assertNull(actualConfigInfoEx.getGroup());
    assertNull(actualConfigInfoEx.getMd5());
    assertNull(actualConfigInfoEx.getMessage());
    assertEquals("ConfigInfoEx [status=0, message=null, dataId=null," + " group=null, appName=null, content=null]",
        actualConfigInfoEx.toString());
    assertNull(actualConfigInfoEx.getContent());
    assertEquals(0L, actualConfigInfoEx.getId());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfoEx()).equals("obj"));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfoEx()).hashCode());
  }

  @Test
  public void testSetMessage() {
    // Arrange
    ConfigInfoEx configInfoEx = new ConfigInfoEx();

    // Act
    configInfoEx.setMessage("message");

    // Assert
    assertEquals("message", configInfoEx.getMessage());
  }

  @Test
  public void testSetStatus() {
    // Arrange
    ConfigInfoEx configInfoEx = new ConfigInfoEx();

    // Act
    configInfoEx.setStatus(1);

    // Assert
    assertEquals(1, configInfoEx.getStatus());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("ConfigInfoEx [status=0, message=null, dataId=null," + " group=null, appName=null, content=null]",
        (new ConfigInfoEx()).toString());
  }
}

