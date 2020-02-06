package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ConfigServiceDiffblueTest {
  @Test
  public void removeBetaTest() {
    // Arrange, Act and Assert
    assertTrue(ConfigService.removeBeta("设备上没有空间", "设备上没有空间", "设备上没有空间"));
  }

  @Test
  public void isUptodateTest2() {
    // Arrange, Act and Assert
    assertFalse(ConfigService.isUptodate("设备上没有空间", "设备上没有空间", "设备上没有空间", "设备上没有空间"));
  }

  @Test
  public void dumpBetaTest() {
    // Arrange, Act and Assert
    assertTrue(ConfigService.dumpBeta("设备上没有空间", "设备上没有空间", "设备上没有空间", "设备上没有空间", 1L, "设备上没有空间"));
  }

  @Test
  public void getLastModifiedTsTest() {
    // Arrange, Act and Assert
    assertEquals(0L, ConfigService.getLastModifiedTs("设备上没有空间"));
  }

  @Test
  public void groupCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, ConfigService.groupCount());
  }

  @Test
  public void getContentMd5Test2() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentMd5("设备上没有空间"));
  }

  @Test
  public void removeTest() {
    // Arrange, Act and Assert
    assertTrue(ConfigService.remove("设备上没有空间", "设备上没有空间", "设备上没有空间"));
  }

  @Test
  public void tryWriteLockTest() {
    // Arrange, Act and Assert
    assertEquals(0, ConfigService.tryWriteLock("设备上没有空间"));
  }

  @Test
  public void getContentTagMd5Test() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentTagMd5("设备上没有空间", "设备上没有空间"));
  }

  @Test
  public void getContentCacheTest() {
    // Arrange, Act and Assert
    assertNull(ConfigService.getContentCache("设备上没有空间"));
  }

  @Test
  public void isUptodateTest() {
    // Arrange, Act and Assert
    assertFalse(ConfigService.isUptodate("设备上没有空间", "设备上没有空间"));
  }

  @Test
  public void getContentMd5Test() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentMd5("设备上没有空间", "设备上没有空间", "设备上没有空间"));
  }

  @Test
  public void removeTagTest() {
    // Arrange, Act and Assert
    assertTrue(ConfigService.removeTag("设备上没有空间", "设备上没有空间", "设备上没有空间", "设备上没有空间"));
  }

  @Test
  public void getBetaIpsTest() {
    // Arrange, Act and Assert
    assertEquals(0, ConfigService.getBetaIps("设备上没有空间").size());
  }

  @Test
  public void tryReadLockTest() {
    // Arrange, Act and Assert
    assertEquals(0, ConfigService.tryReadLock("设备上没有空间"));
  }

  @Test
  public void getContentBetaMd5Test() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentBetaMd5("设备上没有空间"));
  }

  @Test
  public void dumpTagTest() {
    // Arrange, Act and Assert
    assertTrue(ConfigService.dumpTag("设备上没有空间", "设备上没有空间", "设备上没有空间", "设备上没有空间", "设备上没有空间", 1L));
  }

  @Test
  public void hasGroupKeyTest() {
    // Arrange, Act and Assert
    assertFalse(ConfigService.hasGroupKey("设备上没有空间"));
  }
}

