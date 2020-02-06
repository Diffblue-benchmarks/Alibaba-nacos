package com.alibaba.nacos.config.server.model.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ApplicationInfoDiffblueTest {
  @Test
  public void currentServerTest() {
    // Arrange, Act and Assert
    assertEquals("10.42.2.68", (new ApplicationInfo("name")).currentServer());
  }

  @Test
  public void setAppNameTest() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo("name");

    // Act
    applicationInfo.setAppName("name");

    // Assert
    assertEquals("name", applicationInfo.getAppName());
  }

  @Test
  public void getSubInfoCollectLockOwnerTest() {
    // Arrange, Act and Assert
    assertNull((new ApplicationInfo("name")).getSubInfoCollectLockOwner());
  }

  @Test
  public void setSubInfoCollectLockExpireTimeTest() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo("name");

    // Act
    applicationInfo.setSubInfoCollectLockExpireTime(1L);

    // Assert
    assertEquals(1L, applicationInfo.getSubInfoCollectLockExpireTime());
  }

  @Test
  public void getLastSubscribeInfoCollectedTimeTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ApplicationInfo("name")).getLastSubscribeInfoCollectedTime());
  }

  @Test
  public void getAppNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new ApplicationInfo("name")).getAppName());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ApplicationInfo actualApplicationInfo = new ApplicationInfo("name");

    // Assert
    boolean actualIsDynamicCollectDisabledResult = actualApplicationInfo.isDynamicCollectDisabled();
    String actualAppName = actualApplicationInfo.getAppName();
    long actualLastSubscribeInfoCollectedTime = actualApplicationInfo.getLastSubscribeInfoCollectedTime();
    long actualSubInfoCollectLockExpireTime = actualApplicationInfo.getSubInfoCollectLockExpireTime();
    assertFalse(actualIsDynamicCollectDisabledResult);
    assertNull(actualApplicationInfo.getSubInfoCollectLockOwner());
    assertEquals(0L, actualSubInfoCollectLockExpireTime);
    assertEquals(0L, actualLastSubscribeInfoCollectedTime);
    assertEquals("name", actualAppName);
  }

  @Test
  public void isSubInfoRecentlyCollectedTest() {
    // Arrange, Act and Assert
    assertFalse((new ApplicationInfo("name")).isSubInfoRecentlyCollected());
  }

  @Test
  public void setDynamicCollectDisabledTest() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo("name");

    // Act
    applicationInfo.setDynamicCollectDisabled(true);

    // Assert
    assertTrue(applicationInfo.isDynamicCollectDisabled());
  }

  @Test
  public void setLastSubscribeInfoCollectedTimeTest() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo("name");

    // Act
    applicationInfo.setLastSubscribeInfoCollectedTime(1L);

    // Assert
    assertEquals(1L, applicationInfo.getLastSubscribeInfoCollectedTime());
  }

  @Test
  public void getSubInfoCollectLockExpireTimeTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ApplicationInfo("name")).getSubInfoCollectLockExpireTime());
  }

  @Test
  public void setSubInfoCollectLockOwnerTest() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo("name");

    // Act
    applicationInfo.setSubInfoCollectLockOwner("foo");

    // Assert
    assertEquals("foo", applicationInfo.getSubInfoCollectLockOwner());
  }

  @Test
  public void canCurrentServerOwnTheLockTest() {
    // Arrange, Act and Assert
    assertTrue((new ApplicationInfo("name")).canCurrentServerOwnTheLock());
  }

  @Test
  public void isDynamicCollectDisabledTest() {
    // Arrange, Act and Assert
    assertFalse((new ApplicationInfo("name")).isDynamicCollectDisabled());
  }
}

