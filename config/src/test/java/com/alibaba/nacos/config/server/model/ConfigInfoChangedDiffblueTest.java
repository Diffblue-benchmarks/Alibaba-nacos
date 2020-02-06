package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfoChangedDiffblueTest {
  @Test
  public void setTenantTest() {
    // Arrange
    ConfigInfoChanged configInfoChanged = new ConfigInfoChanged();

    // Act
    configInfoChanged.setTenant("aaaaa");

    // Assert
    assertEquals("aaaaa", configInfoChanged.getTenant());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfoChanged()).equals("aaaaa"));
  }

  @Test
  public void setGroupTest() {
    // Arrange
    ConfigInfoChanged configInfoChanged = new ConfigInfoChanged();

    // Act
    configInfoChanged.setGroup("aaaaa");

    // Assert
    assertEquals("aaaaa", configInfoChanged.getGroup());
  }

  @Test
  public void setDataIdTest() {
    // Arrange
    ConfigInfoChanged configInfoChanged = new ConfigInfoChanged();

    // Act
    configInfoChanged.setDataId("aaaaa");

    // Assert
    assertEquals("aaaaa", configInfoChanged.getDataId());
  }

  @Test
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoChanged()).getTenant());
  }

  @Test
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoChanged()).getGroup());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(961, (new ConfigInfoChanged()).hashCode());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    ConfigInfoChanged actualConfigInfoChanged = new ConfigInfoChanged();

    // Assert
    String actualDataId = actualConfigInfoChanged.getDataId();
    String actualToStringResult = actualConfigInfoChanged.toString();
    String actualGroup = actualConfigInfoChanged.getGroup();
    assertNull(actualDataId);
    assertNull(actualConfigInfoChanged.getTenant());
    assertNull(actualGroup);
    assertEquals("ConfigInfoChanged [dataId=null, group=null]", actualToStringResult);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ConfigInfoChanged [dataId=null, group=null]", (new ConfigInfoChanged()).toString());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ConfigInfoChanged actualConfigInfoChanged = new ConfigInfoChanged("aaaaa", "aaaaa", "aaaaa");

    // Assert
    String actualDataId = actualConfigInfoChanged.getDataId();
    String actualGroup = actualConfigInfoChanged.getGroup();
    assertEquals("aaaaa", actualDataId);
    assertEquals("aaaaa", actualConfigInfoChanged.getTenant());
    assertEquals("aaaaa", actualGroup);
  }

  @Test
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoChanged()).getDataId());
  }
}

