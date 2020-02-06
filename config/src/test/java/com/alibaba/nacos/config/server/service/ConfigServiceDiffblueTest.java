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
    assertTrue(ConfigService.removeBeta("123", "foo", "foo"));
  }

  @Test
  public void isUptodateTest2() {
    // Arrange, Act and Assert
    assertFalse(ConfigService.isUptodate("foo", "foo", "127.0.0.1", "foo"));
  }

  @Test
  public void dumpBetaTest() {
    // Arrange
    boolean actualDumpBetaResult = ConfigService.dumpBeta("123", "foo", "foo", "foo", 1L, "foo");

    // Act and Assert
    assertTrue(actualDumpBetaResult);
    assertTrue(ConfigService.dumpBeta("123", "foo", "foo", "foo", 0L, "foo"));
  }

  @Test
  public void getLastModifiedTsTest() {
    // Arrange, Act and Assert
    assertEquals(0L, ConfigService.getLastModifiedTs("foo"));
  }

  @Test
  public void groupCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, ConfigService.groupCount());
  }

  @Test
  public void getContentMd5Test2() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentMd5("foo"));
  }

  @Test
  public void removeTest() {
    // Arrange, Act and Assert
    assertTrue(ConfigService.remove("123", "foo", "foo"));
  }

  @Test
  public void tryWriteLockTest() {
    // Arrange, Act and Assert
    assertEquals(0, ConfigService.tryWriteLock("foo"));
  }

  @Test
  public void getContentTagMd5Test() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentTagMd5("foo", "foo"));
  }

  @Test
  public void getContentCacheTest() {
    // Arrange, Act and Assert
    assertNull(ConfigService.getContentCache("foo"));
  }

  @Test
  public void isUptodateTest() {
    // Arrange, Act and Assert
    assertFalse(ConfigService.isUptodate("foo", "foo"));
  }

  @Test
  public void getContentMd5Test() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentMd5("foo", "127.0.0.1", "foo"));
  }

  @Test
  public void removeTagTest() {
    // Arrange, Act and Assert
    assertTrue(ConfigService.removeTag("123", "foo", "foo", "foo"));
  }

  @Test
  public void getBetaIpsTest() {
    // Arrange, Act and Assert
    assertEquals(0, ConfigService.getBetaIps("foo").size());
  }

  @Test
  public void tryReadLockTest() {
    // Arrange, Act and Assert
    assertEquals(0, ConfigService.tryReadLock("foo"));
  }

  @Test
  public void getContentBetaMd5Test() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentBetaMd5("foo"));
  }

  @Test
  public void hasGroupKeyTest() {
    // Arrange, Act and Assert
    assertFalse(ConfigService.hasGroupKey("foo"));
  }
}

