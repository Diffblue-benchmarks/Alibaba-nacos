package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.client.config.filter.impl.ConfigFilterChainManager;
import org.junit.Test;

public class CacheDataDiffblueTest {
  @Test(timeout=10000)
  public void getTaskIdTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).getTaskId());
  }

  @Test(timeout=10000)
  public void setTaskIdTest() {
    // Arrange
    CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "name", "123", "foo");

    // Act
    cacheData.setTaskId(123);

    // Assert
    assertEquals(123, cacheData.getTaskId());
  }

  @Test(timeout=10000)
  public void setContentTest() {
    // Arrange
    CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "name", "123", "foo");

    // Act
    cacheData.setContent("foo");

    // Assert
    String actualContent = cacheData.getContent();
    assertEquals("acbd18db4cc2f85cedef654fccc4a4d8", cacheData.getMd5());
    assertEquals("foo", actualContent);
  }

  @Test(timeout=10000)
  public void setLocalConfigInfoVersionTest() {
    // Arrange
    CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "name", "123", "foo");

    // Act
    cacheData.setLocalConfigInfoVersion(1L);

    // Assert
    assertEquals(1L, cacheData.getLocalConfigInfoVersion());
  }

  @Test(timeout=10000)
  public void setInitializingTest() {
    // Arrange
    CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "name", "123", "foo");

    // Act
    cacheData.setInitializing(true);

    // Assert
    assertTrue(cacheData.isInitializing());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    CacheData actualCacheData = new CacheData(new ConfigFilterChainManager(), "name", "123", "foo");

    // Assert
    String actualContent = actualCacheData.getContent();
    boolean actualIsInitializingResult = actualCacheData.isInitializing();
    String actualMd5 = actualCacheData.getMd5();
    boolean actualIsUseLocalConfigInfoResult = actualCacheData.isUseLocalConfigInfo();
    assertEquals("foo", actualCacheData.group);
    assertEquals("123", actualCacheData.dataId);
    assertEquals("", actualCacheData.getTenant());
    assertFalse(actualIsUseLocalConfigInfoResult);
    assertEquals("", actualMd5);
    assertTrue(actualIsInitializingResult);
    assertNull(actualContent);
  }

  @Test(timeout=10000)
  public void setUseLocalConfigInfoTest() {
    // Arrange
    CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "name", "123", "foo");

    // Act
    cacheData.setUseLocalConfigInfo(true);

    // Assert
    assertTrue(cacheData.isUseLocalConfigInfo());
  }

  @Test(timeout=10000)
  public void getMd5Test() {
    // Arrange, Act and Assert
    assertEquals("", (new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).getMd5());
  }

  @Test(timeout=10000)
  public void getMd5StringTest() {
    // Arrange, Act and Assert
    assertEquals("acbd18db4cc2f85cedef654fccc4a4d8", CacheData.getMd5String("foo"));
  }

  @Test(timeout=10000)
  public void getContentTest() {
    // Arrange, Act and Assert
    assertNull((new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).getContent());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    CacheData actualCacheData = new CacheData(new ConfigFilterChainManager(), "name", "123", "foo", "foo");

    // Assert
    String actualContent = actualCacheData.getContent();
    boolean actualIsInitializingResult = actualCacheData.isInitializing();
    String actualMd5 = actualCacheData.getMd5();
    boolean actualIsUseLocalConfigInfoResult = actualCacheData.isUseLocalConfigInfo();
    assertEquals("foo", actualCacheData.group);
    assertEquals("123", actualCacheData.dataId);
    assertEquals("foo", actualCacheData.getTenant());
    assertFalse(actualIsUseLocalConfigInfoResult);
    assertEquals("", actualMd5);
    assertTrue(actualIsInitializingResult);
    assertNull(actualContent);
  }

  @Test(timeout=10000)
  public void getLocalConfigInfoVersionTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).getLocalConfigInfoVersion());
  }

  @Test(timeout=10000)
  public void getListenersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).getListeners().size());
  }

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).equals("foo"));
  }

  @Test(timeout=10000)
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertEquals("", (new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).getTenant());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(1611925, (new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).hashCode());
  }

  @Test(timeout=10000)
  public void isUseLocalConfigInfoTest() {
    // Arrange, Act and Assert
    assertFalse((new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).isUseLocalConfigInfo());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("CacheData [123, foo]",
        (new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).toString());
  }

  @Test(timeout=10000)
  public void isInitializingTest() {
    // Arrange, Act and Assert
    assertTrue((new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).isInitializing());
  }
}

