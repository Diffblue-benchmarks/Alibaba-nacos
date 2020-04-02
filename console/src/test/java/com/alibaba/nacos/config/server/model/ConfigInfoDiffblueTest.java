package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfoDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ConfigInfo actualConfigInfo = new ConfigInfo("123", "group", "appName", "content");

    // Assert
    assertEquals("123", actualConfigInfo.getDataId());
    assertEquals("appName", actualConfigInfo.getAppName());
    assertEquals("group", actualConfigInfo.getGroup());
    assertEquals("9a0364b9e99bb480dd25e1f0284c8555", actualConfigInfo.getMd5());
    assertEquals("content", actualConfigInfo.getContent());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    ConfigInfo actualConfigInfo = new ConfigInfo("123", "group", "content");

    // Assert
    assertEquals("123", actualConfigInfo.getDataId());
    assertEquals("group", actualConfigInfo.getGroup());
    assertEquals("9a0364b9e99bb480dd25e1f0284c8555", actualConfigInfo.getMd5());
    assertEquals("content", actualConfigInfo.getContent());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    ConfigInfo actualConfigInfo = new ConfigInfo("123", "group", "tenant", "appName", "content");

    // Assert
    assertEquals("123", actualConfigInfo.getDataId());
    assertEquals("appName", actualConfigInfo.getAppName());
    assertEquals("tenant", actualConfigInfo.getTenant());
    assertEquals("group", actualConfigInfo.getGroup());
    assertEquals("9a0364b9e99bb480dd25e1f0284c8555", actualConfigInfo.getMd5());
    assertEquals("content", actualConfigInfo.getContent());
  }

  @Test
  public void testConstructor4() {
    // Arrange and Act
    ConfigInfo actualConfigInfo = new ConfigInfo();

    // Assert
    assertNull(actualConfigInfo.getDataId());
    assertNull(actualConfigInfo.getAppName());
    assertNull(actualConfigInfo.getTenant());
    assertNull(actualConfigInfo.getGroup());
    assertNull(actualConfigInfo.getMd5());
    assertEquals("ConfigInfo{id=0, dataId='null', group='null'," + " tenant='null', appName='null', content='null',"
        + " md5='null'}", actualConfigInfo.toString());
    assertNull(actualConfigInfo.getContent());
    assertEquals(0L, actualConfigInfo.getId());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfo()).equals("obj"));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfo()).hashCode());
  }

  @Test
  public void testSetAppName() {
    // Arrange
    ConfigInfo configInfo = new ConfigInfo();

    // Act
    configInfo.setAppName("appName");

    // Assert
    assertEquals("appName", configInfo.getAppName());
  }

  @Test
  public void testSetTenant() {
    // Arrange
    ConfigInfo configInfo = new ConfigInfo();

    // Act
    configInfo.setTenant("tenant");

    // Assert
    assertEquals("tenant", configInfo.getTenant());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("ConfigInfo{id=0, dataId='null', group='null'," + " tenant='null', appName='null', content='null',"
        + " md5='null'}", (new ConfigInfo()).toString());
  }
}

