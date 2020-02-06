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
    assertEquals("10.42.2.68", (new ApplicationInfo("aaaaa")).currentServer());
  }

  @Test
  public void setAppNameTest() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo("aaaaa");

    // Act
    applicationInfo.setAppName("aaaaa");

    // Assert
    assertEquals("aaaaa", applicationInfo.getAppName());
  }

  @Test
  public void getSubInfoCollectLockOwnerTest() {
    // Arrange, Act and Assert
    assertNull((new ApplicationInfo("aaaaa")).getSubInfoCollectLockOwner());
  }

  @Test
  public void setSubInfoCollectLockExpireTimeTest() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo("aaaaa");

    // Act
    applicationInfo.setSubInfoCollectLockExpireTime(1L);

    // Assert
    assertEquals(1L, applicationInfo.getSubInfoCollectLockExpireTime());
  }

  @Test
  public void getLastSubscribeInfoCollectedTimeTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ApplicationInfo("aaaaa")).getLastSubscribeInfoCollectedTime());
  }

  @Test
  public void getAppNameTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new ApplicationInfo("aaaaa")).getAppName());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ApplicationInfo actualApplicationInfo = new ApplicationInfo("aaaaa");

    // Assert
    boolean actualIsDynamicCollectDisabledResult = actualApplicationInfo.isDynamicCollectDisabled();
    String actualAppName = actualApplicationInfo.getAppName();
    long actualLastSubscribeInfoCollectedTime = actualApplicationInfo.getLastSubscribeInfoCollectedTime();
    long actualSubInfoCollectLockExpireTime = actualApplicationInfo.getSubInfoCollectLockExpireTime();
    assertFalse(actualIsDynamicCollectDisabledResult);
    assertNull(actualApplicationInfo.getSubInfoCollectLockOwner());
    assertEquals(0L, actualSubInfoCollectLockExpireTime);
    assertEquals(0L, actualLastSubscribeInfoCollectedTime);
    assertEquals("aaaaa", actualAppName);
  }

  @Test
  public void isSubInfoRecentlyCollectedTest() {
    // Arrange, Act and Assert
    assertFalse((new ApplicationInfo("aaaaa")).isSubInfoRecentlyCollected());
  }

  @Test
  public void setDynamicCollectDisabledTest() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo("aaaaa");

    // Act
    applicationInfo.setDynamicCollectDisabled(true);

    // Assert
    assertTrue(applicationInfo.isDynamicCollectDisabled());
  }

  @Test
  public void setLastSubscribeInfoCollectedTimeTest() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo("aaaaa");

    // Act
    applicationInfo.setLastSubscribeInfoCollectedTime(1L);

    // Assert
    assertEquals(1L, applicationInfo.getLastSubscribeInfoCollectedTime());
  }

  @Test
  public void getSubInfoCollectLockExpireTimeTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ApplicationInfo("aaaaa")).getSubInfoCollectLockExpireTime());
  }

  @Test
  public void setSubInfoCollectLockOwnerTest() {
    // Arrange
    ApplicationInfo applicationInfo = new ApplicationInfo("aaaaa");

    // Act
    applicationInfo.setSubInfoCollectLockOwner("aaaaa");

    // Assert
    assertEquals("aaaaa", applicationInfo.getSubInfoCollectLockOwner());
  }

  @Test
  public void canCurrentServerOwnTheLockTest() {
    // Arrange, Act and Assert
    assertTrue((new ApplicationInfo("aaaaa")).canCurrentServerOwnTheLock());
  }

  @Test
  public void isDynamicCollectDisabledTest() {
    // Arrange, Act and Assert
    assertFalse((new ApplicationInfo("aaaaa")).isDynamicCollectDisabled());
  }
}

