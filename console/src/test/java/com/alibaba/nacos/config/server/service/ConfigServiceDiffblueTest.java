package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ConfigServiceDiffblueTest {
  @Test
  public void testDump() {
    // Arrange
    boolean actualDumpResult = ConfigService.dump("设备上没有空间", "设备上没有空间", "设备上没有空间", "设备上没有空间", 1L);
    boolean actualDumpResult1 = ConfigService.dump("设备上没有空间", "设备上没有空间", "设备上没有空间", "设备上没有空间", 9223372036854775807L);

    // Act and Assert
    assertTrue(actualDumpResult);
    assertTrue(actualDumpResult1);
    assertTrue(ConfigService.dump("123", "设备上没有空间", "设备上没有空间", "设备上没有空间", 9223372036854775807L));
  }

  @Test
  public void testDumpBeta() {
    // Arrange
    boolean actualDumpBetaResult = ConfigService.dumpBeta("设备上没有空间", "设备上没有空间", "设备上没有空间", "设备上没有空间", 1L, "设备上没有空间");
    boolean actualDumpBetaResult1 = ConfigService.dumpBeta("123", "设备上没有空间", "设备上没有空间", "设备上没有空间", 1L, "设备上没有空间");

    // Act and Assert
    assertTrue(actualDumpBetaResult);
    assertTrue(actualDumpBetaResult1);
    assertTrue(ConfigService.dumpBeta("设备上没有空间", "设备上没有空间", "设备上没有空间", "设备上没有空间", 1L,
        "com/alibaba/nacos/config/server/model/CacheItem"));
  }

  @Test
  public void testDumpTag() {
    // Arrange
    boolean actualDumpTagResult = ConfigService.dumpTag("设备上没有空间", "设备上没有空间", "设备上没有空间", "设备上没有空间", "设备上没有空间", 1L);
    boolean actualDumpTagResult1 = ConfigService.dumpTag("设备上没有空间", "设备上没有空间", "设备上没有空间",
        "com/alibaba/nacos/config/server/model/CacheItem", "设备上没有空间", 1L);
    boolean actualDumpTagResult2 = ConfigService.dumpTag("设备上没有空间", "设备上没有空间", "设备上没有空间", "设备上没有空间",
        "com/alibaba/nacos/config/server/model/CacheItem", 1L);

    // Act and Assert
    assertTrue(actualDumpTagResult);
    assertTrue(actualDumpTagResult1);
    assertTrue(actualDumpTagResult2);
    assertTrue(ConfigService.dumpTag("设备上没有空间", "设备上没有空间", "设备上没有空间", "com/alibaba/nacos/config/server/model/CacheItem",
        "设备上没有空间", 9223372036854775807L));
  }

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
    assertEquals("", ConfigService.getContentMd5("设备上没有空间", "设备上没有空间", "设备上没有空间"));
  }

  @Test
  public void testGetContentMd52() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentMd5("设备上没有空间"));
  }

  @Test
  public void testGetContentTagMd5() {
    // Arrange
    String actualContentTagMd5 = ConfigService.getContentTagMd5("设备上没有空间", "设备上没有空间");

    // Act and Assert
    assertEquals("", actualContentTagMd5);
    assertEquals("", ConfigService.getContentTagMd5("", "设备上没有空间"));
  }

  @Test
  public void testGetLastModifiedTs() {
    // Arrange
    long actualLastModifiedTs = ConfigService.getLastModifiedTs("设备上没有空间");

    // Act and Assert
    assertEquals(0L, actualLastModifiedTs);
    assertEquals(0L, ConfigService.getLastModifiedTs("java/util/concurrent/ConcurrentHashMap"));
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
  public void testRemove() {
    // Arrange, Act and Assert
    assertTrue(ConfigService.remove("设备上没有空间", "设备上没有空间", "设备上没有空间"));
  }

  @Test
  public void testRemoveBeta() {
    // Arrange
    boolean actualRemoveBetaResult = ConfigService.removeBeta("设备上没有空间", "设备上没有空间", "设备上没有空间");

    // Act and Assert
    assertTrue(actualRemoveBetaResult);
    assertTrue(ConfigService.removeBeta("getIps4Beta", "设备上没有空间", "设备上没有空间"));
  }

  @Test
  public void testRemoveTag() {
    // Arrange
    boolean actualRemoveTagResult = ConfigService.removeTag("设备上没有空间", "设备上没有空间", "设备上没有空间", "设备上没有空间");

    // Act and Assert
    assertTrue(actualRemoveTagResult);
    assertTrue(ConfigService.removeTag("", "设备上没有空间", "设备上没有空间", "设备上没有空间"));
  }

  @Test
  public void testTryReadLock() {
    // Arrange, Act and Assert
    assertEquals(0, ConfigService.tryReadLock("设备上没有空间"));
  }
}

