package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ConfigServiceDiffblueTest {
  @Test(timeout=10000)
  public void removeBetaTest() {
    // Arrange, Act and Assert
    assertTrue(ConfigService.removeBeta("123", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void isUptodateTest2() {
    // Arrange, Act and Assert
    assertFalse(ConfigService.isUptodate("foo", "foo", "127.0.0.1", "foo"));
  }

  @Test(timeout=10000)
  public void dumpBetaTest() {
    // Arrange
    boolean actualDumpBetaResult = ConfigService.dumpBeta("123", "foo", "foo", "foo", 1L, "foo");
    boolean actualDumpBetaResult1 = ConfigService.dumpBeta("", "foo", "foo", "foo", 1L, "foo");
    boolean actualDumpBetaResult2 = ConfigService.dumpBeta("123", "foo", "foo", "acbd18db4cc2f85cedef654fccc4a4d8", 1L,
        "foo");

    // Act and Assert
    assertTrue(actualDumpBetaResult);
    assertFalse(actualDumpBetaResult1);
    assertTrue(actualDumpBetaResult2);
    assertTrue(ConfigService.dumpBeta("123", "foo", "foo", "foo", 0L, "foo"));
  }

  @Test(timeout=10000)
  public void getLastModifiedTsTest() {
    // Arrange, Act and Assert
    assertEquals(0L, ConfigService.getLastModifiedTs("foo"));
  }

  @Test(timeout=10000)
  public void getContentMd5Test2() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentMd5("foo"));
  }

  @Test(timeout=10000)
  public void removeTest() {
    // Arrange, Act and Assert
    assertTrue(ConfigService.remove("123", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void tryWriteLockTest() {
    // Arrange, Act and Assert
    assertEquals(0, ConfigService.tryWriteLock("foo"));
  }

  @Test(timeout=10000)
  public void getContentTagMd5Test() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentTagMd5("foo", "foo"));
  }

  @Test(timeout=10000)
  public void dumpChangeTest() {
    // Arrange
    boolean actualDumpChangeResult = ConfigService.dumpChange("123", "foo", "foo", "foo", 1L);
    boolean actualDumpChangeResult1 = ConfigService.dumpChange("[dump-ignore] ignore to save cache file."
        + " groupKey={}, md5={}, lastModifiedOld={}," + " lastModifiedNew={}", "foo", "foo", "foo", 1L);
    boolean actualDumpChangeResult2 = ConfigService.dumpChange("", "foo", "foo", "foo", 1L);

    // Act and Assert
    assertTrue(actualDumpChangeResult);
    assertTrue(actualDumpChangeResult1);
    assertFalse(actualDumpChangeResult2);
    assertTrue(ConfigService.dumpChange("123", "foo", "foo", "foo", 1L));
  }

  @Test(timeout=10000)
  public void getContentCacheTest() {
    // Arrange, Act and Assert
    assertNull(ConfigService.getContentCache("foo"));
  }

  @Test(timeout=10000)
  public void isUptodateTest() {
    // Arrange, Act and Assert
    assertFalse(ConfigService.isUptodate("foo", "foo"));
  }

  @Test(timeout=10000)
  public void getContentMd5Test() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentMd5("foo", "127.0.0.1", "foo"));
  }

  @Test(timeout=10000)
  public void getBetaIpsTest() {
    // Arrange, Act and Assert
    assertEquals(0, ConfigService.getBetaIps("foo").size());
  }

  @Test(timeout=10000)
  public void tryReadLockTest() {
    // Arrange, Act and Assert
    assertEquals(0, ConfigService.tryReadLock("foo"));
  }

  @Test(timeout=10000)
  public void getContentBetaMd5Test() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentBetaMd5("foo"));
  }

  @Test(timeout=10000)
  public void dumpTagTest() {
    // Arrange
    boolean actualDumpTagResult = ConfigService.dumpTag("123", "foo", "foo", "foo", "foo", 1L);
    boolean actualDumpTagResult1 = ConfigService.dumpTag("123", "foo", "foo", "", "foo", 1L);
    boolean actualDumpTagResult2 = ConfigService.dumpTag("123", "foo", "foo", "acbd18db4cc2f85cedef654fccc4a4d8", "foo",
        1L);

    // Act and Assert
    assertTrue(actualDumpTagResult);
    assertFalse(actualDumpTagResult1);
    assertTrue(actualDumpTagResult2);
    assertTrue(ConfigService.dumpTag("123", "foo", "foo", "foo", "foo", 0L));
  }

  @Test(timeout=10000)
  public void dumpTest() {
    // Arrange
    boolean actualDumpResult = ConfigService.dump("123", "foo", "foo", "foo", 1L);
    boolean actualDumpResult1 = ConfigService.dump("", "foo", "foo", "foo", 1L);
    boolean actualDumpResult2 = ConfigService.dump("123", "foo", "foo", "acbd18db4cc2f85cedef654fccc4a4d8", 1L);

    // Act and Assert
    assertTrue(actualDumpResult);
    assertFalse(actualDumpResult1);
    assertTrue(actualDumpResult2);
    assertTrue(ConfigService.dump("123", "foo", "foo", "foo", 0L));
  }

  @Test(timeout=10000)
  public void hasGroupKeyTest() {
    // Arrange, Act and Assert
    assertFalse(ConfigService.hasGroupKey("foo"));
  }
}

