package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfoAggrDiffblueTest {
  @Test
  public void setAppNameTest() {
    // Arrange
    ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();

    // Act
    configInfoAggr.setAppName("name");

    // Assert
    assertEquals("name", configInfoAggr.getAppName());
  }

  @Test
  public void setGroupTest() {
    // Arrange
    ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();

    // Act
    configInfoAggr.setGroup("foo");

    // Assert
    assertEquals("foo", configInfoAggr.getGroup());
  }

  @Test
  public void setContentTest() {
    // Arrange
    ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();

    // Act
    configInfoAggr.setContent("foo");

    // Assert
    assertEquals("foo", configInfoAggr.getContent());
  }

  @Test
  public void getAppNameTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoAggr()).getAppName());
  }

  @Test
  public void setDatumIdTest() {
    // Arrange
    ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();

    // Act
    configInfoAggr.setDatumId("123");

    // Assert
    assertEquals("123", configInfoAggr.getDatumId());
  }

  @Test
  public void getContentTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoAggr()).getContent());
  }

  @Test
  public void getIdTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConfigInfoAggr()).getId());
  }

  @Test
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoAggr()).getDataId());
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    ConfigInfoAggr actualConfigInfoAggr = new ConfigInfoAggr("123", "foo", "123", "foo");

    // Assert
    String actualDataId = actualConfigInfoAggr.getDataId();
    String actualContent = actualConfigInfoAggr.getContent();
    String actualGroup = actualConfigInfoAggr.getGroup();
    assertEquals("123", actualDataId);
    assertEquals("123", actualConfigInfoAggr.getDatumId());
    assertEquals("foo", actualGroup);
    assertEquals("foo", actualContent);
  }

  @Test
  public void setTenantTest() {
    // Arrange
    ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();

    // Act
    configInfoAggr.setTenant("foo");

    // Assert
    assertEquals("foo", configInfoAggr.getTenant());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfoAggr()).equals("foo"));
  }

  @Test
  public void setDataIdTest() {
    // Arrange
    ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();

    // Act
    configInfoAggr.setDataId("123");

    // Assert
    assertEquals("123", configInfoAggr.getDataId());
  }

  @Test
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoAggr()).getTenant());
  }

  @Test
  public void getDatumIdTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoAggr()).getDatumId());
  }

  @Test
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoAggr()).getGroup());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfoAggr()).hashCode());
  }

  @Test
  public void setIdTest() {
    // Arrange
    ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();

    // Act
    configInfoAggr.setId(123L);

    // Assert
    assertEquals(123L, configInfoAggr.getId());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    ConfigInfoAggr actualConfigInfoAggr = new ConfigInfoAggr();

    // Assert
    String actualDataId = actualConfigInfoAggr.getDataId();
    long actualId = actualConfigInfoAggr.getId();
    String actualContent = actualConfigInfoAggr.getContent();
    String actualToStringResult = actualConfigInfoAggr.toString();
    String actualGroup = actualConfigInfoAggr.getGroup();
    String actualDatumId = actualConfigInfoAggr.getDatumId();
    String actualTenant = actualConfigInfoAggr.getTenant();
    assertNull(actualDataId);
    assertNull(actualConfigInfoAggr.getAppName());
    assertNull(actualTenant);
    assertNull(actualDatumId);
    assertNull(actualGroup);
    assertEquals("ConfigInfoAggr [dataId=null, group=null, datumId=null," + " content=null]", actualToStringResult);
    assertNull(actualContent);
    assertEquals(0L, actualId);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ConfigInfoAggr [dataId=null, group=null, datumId=null," + " content=null]",
        (new ConfigInfoAggr()).toString());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ConfigInfoAggr actualConfigInfoAggr = new ConfigInfoAggr("123", "foo", "123", "name", "foo");

    // Assert
    String actualDataId = actualConfigInfoAggr.getDataId();
    String actualContent = actualConfigInfoAggr.getContent();
    String actualGroup = actualConfigInfoAggr.getGroup();
    String actualDatumId = actualConfigInfoAggr.getDatumId();
    assertEquals("123", actualDataId);
    assertEquals("name", actualConfigInfoAggr.getAppName());
    assertEquals("123", actualDatumId);
    assertEquals("foo", actualGroup);
    assertEquals("foo", actualContent);
  }
}

