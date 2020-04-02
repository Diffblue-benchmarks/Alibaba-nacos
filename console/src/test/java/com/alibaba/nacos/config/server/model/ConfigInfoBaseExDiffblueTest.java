package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfoBaseExDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ConfigInfoBaseEx actualConfigInfoBaseEx = new ConfigInfoBaseEx("123", "group", "content", 1, "message");

    // Assert
    assertEquals("123", actualConfigInfoBaseEx.getDataId());
    assertEquals(1, actualConfigInfoBaseEx.getStatus());
    assertEquals("group", actualConfigInfoBaseEx.getGroup());
    assertEquals("9a0364b9e99bb480dd25e1f0284c8555", actualConfigInfoBaseEx.getMd5());
    assertEquals("message", actualConfigInfoBaseEx.getMessage());
    assertEquals("content", actualConfigInfoBaseEx.getContent());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    ConfigInfoBaseEx actualConfigInfoBaseEx = new ConfigInfoBaseEx("123", "group", "content");

    // Assert
    assertEquals("123", actualConfigInfoBaseEx.getDataId());
    assertEquals("group", actualConfigInfoBaseEx.getGroup());
    assertEquals("9a0364b9e99bb480dd25e1f0284c8555", actualConfigInfoBaseEx.getMd5());
    assertEquals("content", actualConfigInfoBaseEx.getContent());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    ConfigInfoBaseEx actualConfigInfoBaseEx = new ConfigInfoBaseEx();

    // Assert
    assertNull(actualConfigInfoBaseEx.getDataId());
    assertEquals(0, actualConfigInfoBaseEx.getStatus());
    assertNull(actualConfigInfoBaseEx.getGroup());
    assertNull(actualConfigInfoBaseEx.getMd5());
    assertNull(actualConfigInfoBaseEx.getMessage());
    assertEquals("ConfigInfoBaseEx [status=0, message=null, dataId=null," + " group()=null, content()=null]",
        actualConfigInfoBaseEx.toString());
    assertNull(actualConfigInfoBaseEx.getContent());
    assertEquals(0L, actualConfigInfoBaseEx.getId());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfoBaseEx()).equals("obj"));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfoBaseEx()).hashCode());
  }

  @Test
  public void testSetMessage() {
    // Arrange
    ConfigInfoBaseEx configInfoBaseEx = new ConfigInfoBaseEx();

    // Act
    configInfoBaseEx.setMessage("message");

    // Assert
    assertEquals("message", configInfoBaseEx.getMessage());
  }

  @Test
  public void testSetStatus() {
    // Arrange
    ConfigInfoBaseEx configInfoBaseEx = new ConfigInfoBaseEx();

    // Act
    configInfoBaseEx.setStatus(1);

    // Assert
    assertEquals(1, configInfoBaseEx.getStatus());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("ConfigInfoBaseEx [status=0, message=null, dataId=null," + " group()=null, content()=null]",
        (new ConfigInfoBaseEx()).toString());
  }
}

