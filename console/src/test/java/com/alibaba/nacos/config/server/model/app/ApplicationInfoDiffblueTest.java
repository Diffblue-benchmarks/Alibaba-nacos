package com.alibaba.nacos.config.server.model.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ApplicationInfoDiffblueTest {
  @Test
  public void testCanCurrentServerOwnTheLock() {
    // Arrange, Act and Assert
    assertTrue((new ApplicationInfo("appName")).canCurrentServerOwnTheLock());
  }

  @Test
  public void testCanCurrentServerOwnTheLock2() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo("appName");
    applicationInfo.setSubInfoCollectLockOwner("subInfoCollectLockOwner");

    // Act and Assert
    assertTrue(applicationInfo.canCurrentServerOwnTheLock());
  }

  @Test
  public void testCanCurrentServerOwnTheLock3() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo("appName");
    applicationInfo.setSubInfoCollectLockOwner(System.getProperty("nacos.local.ip"));

    // Act and Assert
    assertTrue(applicationInfo.canCurrentServerOwnTheLock());
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    ApplicationInfo actualApplicationInfo = new ApplicationInfo("appName");

    // Assert
    assertFalse(actualApplicationInfo.isDynamicCollectDisabled());
    assertNull(actualApplicationInfo.getSubInfoCollectLockOwner());
    assertEquals(0L, actualApplicationInfo.getSubInfoCollectLockExpireTime());
    assertEquals(0L, actualApplicationInfo.getLastSubscribeInfoCollectedTime());
    assertEquals("appName", actualApplicationInfo.getAppName());
  }

  @Test
  public void testCurrentServer() {
    // Arrange and Act
    String actualCurrentServerResult = (new ApplicationInfo("appName")).currentServer();

    // Assert
    assertEquals(System.getProperty("nacos.local.ip"), actualCurrentServerResult);
  }

  @Test
  public void testIsSubInfoRecentlyCollected() {
    // Arrange, Act and Assert
    assertFalse((new ApplicationInfo("appName")).isSubInfoRecentlyCollected());
  }

  @Test
  public void testSetAppName() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo("appName");

    // Act
    applicationInfo.setAppName("appName");

    // Assert
    assertEquals("appName", applicationInfo.getAppName());
  }

  @Test
  public void testSetDynamicCollectDisabled() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo("appName");

    // Act
    applicationInfo.setDynamicCollectDisabled(true);

    // Assert
    assertTrue(applicationInfo.isDynamicCollectDisabled());
  }

  @Test
  public void testSetLastSubscribeInfoCollectedTime() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo("appName");

    // Act
    applicationInfo.setLastSubscribeInfoCollectedTime(0L);

    // Assert
    assertEquals(0L, applicationInfo.getLastSubscribeInfoCollectedTime());
  }

  @Test
  public void testSetSubInfoCollectLockExpireTime() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo("appName");

    // Act
    applicationInfo.setSubInfoCollectLockExpireTime(0L);

    // Assert
    assertEquals(0L, applicationInfo.getSubInfoCollectLockExpireTime());
  }

  @Test
  public void testSetSubInfoCollectLockOwner() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo("appName");

    // Act
    applicationInfo.setSubInfoCollectLockOwner("subInfoCollectLockOwner");

    // Assert
    assertEquals("subInfoCollectLockOwner", applicationInfo.getSubInfoCollectLockOwner());
  }
}

