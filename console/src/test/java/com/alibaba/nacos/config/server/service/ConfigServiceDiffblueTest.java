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
    assertEquals(0, ConfigService.getBetaIps("???????").size());
  }

  @Test
  public void testGetContentBetaMd5() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentBetaMd5("???????"));
  }

  @Test
  public void testGetContentCache() {
    // Arrange, Act and Assert
    assertNull(ConfigService.getContentCache("???????"));
  }

  @Test
  public void testGetContentMd5() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentMd5("???????", "???????", "???????"));
  }

  @Test
  public void testGetContentMd52() {
    // Arrange, Act and Assert
    assertEquals("", ConfigService.getContentMd5("???????"));
  }

  @Test
  public void testGetContentTagMd5() {
    // Arrange
    String actualContentTagMd5 = ConfigService.getContentTagMd5("???????", "???????");

    // Act and Assert
    assertEquals("", actualContentTagMd5);
    assertEquals("", ConfigService.getContentTagMd5("", "???????"));
  }

  @Test
  public void testGetLastModifiedTs() {
    // Arrange
    long actualLastModifiedTs = ConfigService.getLastModifiedTs("???????");

    // Act and Assert
    assertEquals(0L, actualLastModifiedTs);
    assertEquals(0L, ConfigService.getLastModifiedTs("java/util/concurrent/ConcurrentHashMap"));
  }

  @Test
  public void testHasGroupKey() {
    // Arrange, Act and Assert
    assertFalse(ConfigService.hasGroupKey("???????"));
  }

  @Test
  public void testIsUptodate() {
    // Arrange, Act and Assert
    assertFalse(ConfigService.isUptodate("???????", "???????"));
  }

  @Test
  public void testRemove() {
    // Arrange
    boolean actualRemoveResult = ConfigService.remove("???????", "???????", "???????");

    // Act and Assert
    assertTrue(actualRemoveResult);
    assertTrue(ConfigService.remove("", "???????", "???????"));
  }

  @Test
  public void testRemoveBeta() {
    // Arrange
    boolean actualRemoveBetaResult = ConfigService.removeBeta("???????", "???????", "???????");

    // Act and Assert
    assertTrue(actualRemoveBetaResult);
    assertTrue(ConfigService.removeBeta("getIps4Beta", "???????", "???????"));
  }

  @Test
  public void testRemoveTag() {
    // Arrange
    boolean actualRemoveTagResult = ConfigService.removeTag("???????", "???????", "???????", "???????");

    // Act and Assert
    assertTrue(actualRemoveTagResult);
    assertTrue(ConfigService.removeTag("", "???????", "???????", "???????"));
  }

  @Test
  public void testTryReadLock() {
    // Arrange, Act and Assert
    assertEquals(0, ConfigService.tryReadLock("???????"));
  }
}

