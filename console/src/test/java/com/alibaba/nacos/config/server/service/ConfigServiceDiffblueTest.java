package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ConfigServiceDiffblueTest {
  @Test
  public void testGetBetaIps() {
    // Arrange, Act and Assert
    assertEquals(0, ConfigService.getBetaIps("设备上没有空间").size());
  }

  @Test
  public void testGetContentBetaMd5() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentBetaMd5("设备上没有空间"));
  }

  @Test
  public void testGetContentCache() {
    // Arrange, Act and Assert
    assertNull(ConfigService.getContentCache("设备上没有空间"));
  }

  @Test
  public void testGetContentMd5() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentMd5("设备上没有空间", "127.0.0.1", "设备上没有空间"));
  }

  @Test
  public void testGetContentMd52() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentMd5("设备上没有空间"));
  }

  @Test
  public void testGetContentTagMd5() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentTagMd5("设备上没有空间", "设备上没有空间"));
  }

  @Test
  public void testGetLastModifiedTs() {
    // Arrange, Act and Assert
    assertEquals(0L, ConfigService.getLastModifiedTs("设备上没有空间"));
  }

  @Test
  public void testHasGroupKey() {
    // Arrange, Act and Assert
    assertFalse(ConfigService.hasGroupKey("设备上没有空间"));
  }

  @Test
  public void testIsUptodate() {
    // Arrange, Act and Assert
    assertFalse(ConfigService.isUptodate("设备上没有空间", "设备上没有空间"));
  }

  @Test
  public void testRemoveBeta() {
    // Arrange, Act and Assert
    assertTrue(ConfigService.removeBeta("123", "设备上没有空间", "设备上没有空间"));
  }

  @Test
  public void testRemoveTag() {
    // Arrange, Act and Assert
    assertTrue(ConfigService.removeTag("123", "设备上没有空间", "设备上没有空间", "设备上没有空间"));
  }

  @Test
  public void testTryReadLock() {
    // Arrange, Act and Assert
    assertEquals(0, ConfigService.tryReadLock("设备上没有空间"));
  }
}

