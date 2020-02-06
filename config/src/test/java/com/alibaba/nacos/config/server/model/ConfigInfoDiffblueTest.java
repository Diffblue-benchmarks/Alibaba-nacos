package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfoDiffblueTest {
  @Test
  public void setAppNameTest() {
    // Arrange
    ConfigInfo configInfo = new ConfigInfo();

    // Act
    configInfo.setAppName("name");

    // Assert
    assertEquals("name", configInfo.getAppName());
  }

  @Test
  public void setTypeTest() {
    // Arrange
    ConfigInfo configInfo = new ConfigInfo();

    // Act
    configInfo.setType("foo");

    // Assert
    assertEquals("foo", configInfo.getType());
  }

  @Test
  public void getAppNameTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfo()).getAppName());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfo()).getType());
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    ConfigInfo actualConfigInfo = new ConfigInfo("123", "foo", "name", "foo");

    // Assert
    String actualDataId = actualConfigInfo.getDataId();
    String actualContent = actualConfigInfo.getContent();
    String actualMd5 = actualConfigInfo.getMd5();
    String actualGroup = actualConfigInfo.getGroup();
    assertEquals("123", actualDataId);
    assertEquals("name", actualConfigInfo.getAppName());
    assertEquals("foo", actualGroup);
    assertEquals("acbd18db4cc2f85cedef654fccc4a4d8", actualMd5);
    assertEquals("foo", actualContent);
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfo()).equals("foo"));
  }

  @Test
  public void setTenantTest() {
    // Arrange
    ConfigInfo configInfo = new ConfigInfo();

    // Act
    configInfo.setTenant("foo");

    // Assert
    assertEquals("foo", configInfo.getTenant());
  }

  @Test
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfo()).getTenant());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfo()).hashCode());
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    ConfigInfo actualConfigInfo = new ConfigInfo();

    // Assert
    String actualDataId = actualConfigInfo.getDataId();
    long actualId = actualConfigInfo.getId();
    String actualContent = actualConfigInfo.getContent();
    String actualToStringResult = actualConfigInfo.toString();
    String actualType = actualConfigInfo.getType();
    String actualMd5 = actualConfigInfo.getMd5();
    String actualGroup = actualConfigInfo.getGroup();
    String actualTenant = actualConfigInfo.getTenant();
    assertNull(actualDataId);
    assertNull(actualConfigInfo.getAppName());
    assertNull(actualTenant);
    assertNull(actualGroup);
    assertNull(actualMd5);
    assertNull(actualType);
    assertEquals("ConfigInfo{id=0, dataId='null', group='null'," + " tenant='null', appName='null', content='null',"
        + " md5='null'}", actualToStringResult);
    assertNull(actualContent);
    assertEquals(0L, actualId);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ConfigInfo{id=0, dataId='null', group='null'," + " tenant='null', appName='null', content='null',"
        + " md5='null'}", (new ConfigInfo()).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    ConfigInfo actualConfigInfo = new ConfigInfo("123", "foo", "foo", "name", "foo");

    // Assert
    String actualDataId = actualConfigInfo.getDataId();
    String actualContent = actualConfigInfo.getContent();
    String actualMd5 = actualConfigInfo.getMd5();
    String actualGroup = actualConfigInfo.getGroup();
    String actualTenant = actualConfigInfo.getTenant();
    assertEquals("123", actualDataId);
    assertEquals("name", actualConfigInfo.getAppName());
    assertEquals("foo", actualTenant);
    assertEquals("foo", actualGroup);
    assertEquals("acbd18db4cc2f85cedef654fccc4a4d8", actualMd5);
    assertEquals("foo", actualContent);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ConfigInfo actualConfigInfo = new ConfigInfo("123", "foo", "foo");

    // Assert
    String actualDataId = actualConfigInfo.getDataId();
    String actualContent = actualConfigInfo.getContent();
    String actualMd5 = actualConfigInfo.getMd5();
    assertEquals("123", actualDataId);
    assertEquals("foo", actualConfigInfo.getGroup());
    assertEquals("acbd18db4cc2f85cedef654fccc4a4d8", actualMd5);
    assertEquals("foo", actualContent);
  }
}

