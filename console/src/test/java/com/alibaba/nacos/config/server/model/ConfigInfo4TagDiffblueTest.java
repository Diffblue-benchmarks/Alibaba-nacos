package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfo4TagDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ConfigInfo4Tag actualConfigInfo4Tag = new ConfigInfo4Tag("123", "group", "tag", "appName", "content");

    // Assert
    assertEquals("123", actualConfigInfo4Tag.getDataId());
    assertEquals("tag", actualConfigInfo4Tag.getTag());
    assertEquals("appName", actualConfigInfo4Tag.getAppName());
    assertEquals("group", actualConfigInfo4Tag.getGroup());
    assertEquals("9a0364b9e99bb480dd25e1f0284c8555", actualConfigInfo4Tag.getMd5());
    assertEquals("content", actualConfigInfo4Tag.getContent());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    ConfigInfo4Tag actualConfigInfo4Tag = new ConfigInfo4Tag();

    // Assert
    assertNull(actualConfigInfo4Tag.getDataId());
    assertNull(actualConfigInfo4Tag.getTag());
    assertNull(actualConfigInfo4Tag.getAppName());
    assertNull(actualConfigInfo4Tag.getTenant());
    assertNull(actualConfigInfo4Tag.getGroup());
    assertNull(actualConfigInfo4Tag.getMd5());
    assertEquals("ConfigInfo{id=0, dataId='null', group='null'," + " tenant='null', appName='null', content='null',"
        + " md5='null'}", actualConfigInfo4Tag.toString());
    assertNull(actualConfigInfo4Tag.getContent());
    assertEquals(0L, actualConfigInfo4Tag.getId());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfo4Tag()).equals("obj"));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfo4Tag()).hashCode());
  }

  @Test
  public void testSetTag() {
    // Arrange
    ConfigInfo4Tag configInfo4Tag = new ConfigInfo4Tag();

    // Act
    configInfo4Tag.setTag("tag");

    // Assert
    assertEquals("tag", configInfo4Tag.getTag());
  }
}

