package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfoBaseDiffblueTest {
  @Test
  public void testCompareTo() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();
    configInfoBase.setGroup("group");
    configInfoBase.setDataId("123");

    // Act and Assert
    assertEquals(0, configInfoBase.compareTo(configInfoBase));
  }

  @Test
  public void testCompareTo2() {
    // Arrange, Act and Assert
    assertEquals(0, (new ConfigInfoBase()).compareTo(new ConfigInfoBase()));
  }

  @Test
  public void testCompareTo3() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();
    configInfoBase.setContent("content");
    configInfoBase.setGroup("group");
    configInfoBase.setDataId("123");

    // Act and Assert
    assertEquals(0, configInfoBase.compareTo(configInfoBase));
  }

  @Test
  public void testCompareTo4() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();
    configInfoBase.setDataId("123");

    // Act and Assert
    assertEquals(0, configInfoBase.compareTo(configInfoBase));
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    ConfigInfoBase actualConfigInfoBase = new ConfigInfoBase("123", "group", null);

    // Assert
    assertEquals("123", actualConfigInfoBase.getDataId());
    assertEquals("group", actualConfigInfoBase.getGroup());
    assertNull(actualConfigInfoBase.getContent());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    ConfigInfoBase actualConfigInfoBase = new ConfigInfoBase("123", "group", "content");

    // Assert
    assertEquals("123", actualConfigInfoBase.getDataId());
    assertEquals("group", actualConfigInfoBase.getGroup());
    assertEquals("9a0364b9e99bb480dd25e1f0284c8555", actualConfigInfoBase.getMd5());
    assertEquals("content", actualConfigInfoBase.getContent());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    ConfigInfoBase actualConfigInfoBase = new ConfigInfoBase();

    // Assert
    assertNull(actualConfigInfoBase.getDataId());
    assertNull(actualConfigInfoBase.getGroup());
    assertNull(actualConfigInfoBase.getMd5());
    assertEquals("ConfigInfoBase{id=0, dataId='null', group='null'," + " content='null', md5='null'}",
        actualConfigInfoBase.toString());
    assertNull(actualConfigInfoBase.getContent());
    assertEquals(0L, actualConfigInfoBase.getId());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfoBase()).equals(null));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfoBase()).equals("obj"));
  }

  @Test
  public void testHashCode() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();
    configInfoBase.setContent("content");

    // Act and Assert
    assertEquals(265380968, configInfoBase.hashCode());
  }

  @Test
  public void testHashCode2() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();
    configInfoBase.setDataId("123");

    // Act and Assert
    assertEquals(47714611, configInfoBase.hashCode());
  }

  @Test
  public void testHashCode3() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfoBase()).hashCode());
  }

  @Test
  public void testHashCode4() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();
    configInfoBase.setMd5("md5");

    // Act and Assert
    assertEquals(1031423, configInfoBase.hashCode());
  }

  @Test
  public void testHashCode5() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();
    configInfoBase.setGroup("group");

    // Act and Assert
    assertEquals(-1236537118, configInfoBase.hashCode());
  }

  @Test
  public void testSetContent() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();

    // Act
    configInfoBase.setContent("content");

    // Assert
    assertEquals("content", configInfoBase.getContent());
  }

  @Test
  public void testSetDataId() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();

    // Act
    configInfoBase.setDataId("123");

    // Assert
    assertEquals("123", configInfoBase.getDataId());
  }

  @Test
  public void testSetGroup() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();

    // Act
    configInfoBase.setGroup("group");

    // Assert
    assertEquals("group", configInfoBase.getGroup());
  }

  @Test
  public void testSetId() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();

    // Act
    configInfoBase.setId(123L);

    // Assert
    assertEquals(123L, configInfoBase.getId());
  }

  @Test
  public void testSetMd5() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();

    // Act
    configInfoBase.setMd5("md5");

    // Assert
    assertEquals("md5", configInfoBase.getMd5());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("ConfigInfoBase{id=0, dataId='null', group='null'," + " content='null', md5='null'}",
        (new ConfigInfoBase()).toString());
  }
}

