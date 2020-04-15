package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfoChangedDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ConfigInfoChanged actualConfigInfoChanged = new ConfigInfoChanged("123", "group", "tenant");

    // Assert
    assertEquals("123", actualConfigInfoChanged.getDataId());
    assertEquals("tenant", actualConfigInfoChanged.getTenant());
    assertEquals("group", actualConfigInfoChanged.getGroup());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    ConfigInfoChanged actualConfigInfoChanged = new ConfigInfoChanged();

    // Assert
    assertNull(actualConfigInfoChanged.getDataId());
    assertNull(actualConfigInfoChanged.getTenant());
    assertNull(actualConfigInfoChanged.getGroup());
    assertEquals("ConfigInfoChanged [dataId=null, group=null]", actualConfigInfoChanged.toString());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfoChanged()).equals(null));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfoChanged()).equals("obj"));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(961, (new ConfigInfoChanged()).hashCode());
  }

  @Test
  public void testHashCode2() {
    // Arrange, Act and Assert
    assertEquals(100139598, (new ConfigInfoChanged("123", "group", "tenant")).hashCode());
  }

  @Test
  public void testSetDataId() {
    // Arrange
    ConfigInfoChanged configInfoChanged = new ConfigInfoChanged();

    // Act
    configInfoChanged.setDataId("123");

    // Assert
    assertEquals("123", configInfoChanged.getDataId());
  }

  @Test
  public void testSetGroup() {
    // Arrange
    ConfigInfoChanged configInfoChanged = new ConfigInfoChanged();

    // Act
    configInfoChanged.setGroup("group");

    // Assert
    assertEquals("group", configInfoChanged.getGroup());
  }

  @Test
  public void testSetTenant() {
    // Arrange
    ConfigInfoChanged configInfoChanged = new ConfigInfoChanged();

    // Act
    configInfoChanged.setTenant("tenant");

    // Assert
    assertEquals("tenant", configInfoChanged.getTenant());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("ConfigInfoChanged [dataId=null, group=null]", (new ConfigInfoChanged()).toString());
  }
}

