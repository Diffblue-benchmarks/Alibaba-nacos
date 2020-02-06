package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfo4TagDiffblueTest {
  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfo4Tag()).equals("foo"));
  }

  @Test
  public void setTagTest() {
    // Arrange
    ConfigInfo4Tag configInfo4Tag = new ConfigInfo4Tag();

    // Act
    configInfo4Tag.setTag("foo");

    // Assert
    assertEquals("foo", configInfo4Tag.getTag());
  }

  @Test
  public void getTagTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfo4Tag()).getTag());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfo4Tag()).hashCode());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    ConfigInfo4Tag actualConfigInfo4Tag = new ConfigInfo4Tag();

    // Assert
    String actualDataId = actualConfigInfo4Tag.getDataId();
    long actualId = actualConfigInfo4Tag.getId();
    String actualContent = actualConfigInfo4Tag.getContent();
    String actualToStringResult = actualConfigInfo4Tag.toString();
    String actualType = actualConfigInfo4Tag.getType();
    String actualMd5 = actualConfigInfo4Tag.getMd5();
    String actualGroup = actualConfigInfo4Tag.getGroup();
    String actualTenant = actualConfigInfo4Tag.getTenant();
    String actualAppName = actualConfigInfo4Tag.getAppName();
    assertNull(actualDataId);
    assertNull(actualConfigInfo4Tag.getTag());
    assertNull(actualAppName);
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
  public void constructorTest() {
    // Arrange and Act
    ConfigInfo4Tag actualConfigInfo4Tag = new ConfigInfo4Tag("123", "foo", "foo", "name", "foo");

    // Assert
    String actualDataId = actualConfigInfo4Tag.getDataId();
    String actualContent = actualConfigInfo4Tag.getContent();
    String actualMd5 = actualConfigInfo4Tag.getMd5();
    String actualGroup = actualConfigInfo4Tag.getGroup();
    String actualAppName = actualConfigInfo4Tag.getAppName();
    assertEquals("123", actualDataId);
    assertEquals("foo", actualConfigInfo4Tag.getTag());
    assertEquals("name", actualAppName);
    assertEquals("foo", actualGroup);
    assertEquals("acbd18db4cc2f85cedef654fccc4a4d8", actualMd5);
    assertEquals("foo", actualContent);
  }
}

