package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfoAggrDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ConfigInfoAggr actualConfigInfoAggr = new ConfigInfoAggr("123", "group", "123", "appName", "content");

    // Assert
    assertEquals("123", actualConfigInfoAggr.getDataId());
    assertEquals("appName", actualConfigInfoAggr.getAppName());
    assertEquals("123", actualConfigInfoAggr.getDatumId());
    assertEquals("group", actualConfigInfoAggr.getGroup());
    assertEquals("content", actualConfigInfoAggr.getContent());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    ConfigInfoAggr actualConfigInfoAggr = new ConfigInfoAggr();

    // Assert
    assertNull(actualConfigInfoAggr.getDataId());
    assertNull(actualConfigInfoAggr.getAppName());
    assertNull(actualConfigInfoAggr.getTenant());
    assertNull(actualConfigInfoAggr.getDatumId());
    assertNull(actualConfigInfoAggr.getGroup());
    assertEquals("ConfigInfoAggr [dataId=null, group=null, datumId=null," + " content=null]",
        actualConfigInfoAggr.toString());
    assertNull(actualConfigInfoAggr.getContent());
    assertEquals(0L, actualConfigInfoAggr.getId());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    ConfigInfoAggr actualConfigInfoAggr = new ConfigInfoAggr("123", "group", "123", "content");

    // Assert
    assertEquals("123", actualConfigInfoAggr.getDataId());
    assertEquals("123", actualConfigInfoAggr.getDatumId());
    assertEquals("group", actualConfigInfoAggr.getGroup());
    assertEquals("content", actualConfigInfoAggr.getContent());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfoAggr()).equals("obj"));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfoAggr()).equals(null));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfoAggr()).hashCode());
  }

  @Test
  public void testHashCode2() {
    // Arrange
    ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();
    configInfoAggr.setDatumId("123");

    // Act and Assert
    assertEquals(2432911, configInfoAggr.hashCode());
  }

  @Test
  public void testHashCode3() {
    // Arrange
    ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();
    configInfoAggr.setContent("content");

    // Act and Assert
    assertEquals(265380968, configInfoAggr.hashCode());
  }

  @Test
  public void testHashCode4() {
    // Arrange
    ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();
    configInfoAggr.setDataId("123");

    // Act and Assert
    assertEquals(47714611, configInfoAggr.hashCode());
  }

  @Test
  public void testHashCode5() {
    // Arrange
    ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();
    configInfoAggr.setGroup("group");

    // Act and Assert
    assertEquals(99552768, configInfoAggr.hashCode());
  }

  @Test
  public void testSetAppName() {
    // Arrange
    ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();

    // Act
    configInfoAggr.setAppName("appName");

    // Assert
    assertEquals("appName", configInfoAggr.getAppName());
  }

  @Test
  public void testSetContent() {
    // Arrange
    ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();

    // Act
    configInfoAggr.setContent("content");

    // Assert
    assertEquals("content", configInfoAggr.getContent());
  }

  @Test
  public void testSetDataId() {
    // Arrange
    ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();

    // Act
    configInfoAggr.setDataId("123");

    // Assert
    assertEquals("123", configInfoAggr.getDataId());
  }

  @Test
  public void testSetDatumId() {
    // Arrange
    ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();

    // Act
    configInfoAggr.setDatumId("123");

    // Assert
    assertEquals("123", configInfoAggr.getDatumId());
  }

  @Test
  public void testSetGroup() {
    // Arrange
    ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();

    // Act
    configInfoAggr.setGroup("group");

    // Assert
    assertEquals("group", configInfoAggr.getGroup());
  }

  @Test
  public void testSetId() {
    // Arrange
    ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();

    // Act
    configInfoAggr.setId(123L);

    // Assert
    assertEquals(123L, configInfoAggr.getId());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("ConfigInfoAggr [dataId=null, group=null, datumId=null," + " content=null]",
        (new ConfigInfoAggr()).toString());
  }
}

