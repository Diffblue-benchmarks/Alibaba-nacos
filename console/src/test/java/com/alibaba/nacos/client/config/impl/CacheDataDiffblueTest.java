package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.client.config.filter.impl.ConfigFilterChainManager;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CacheDataDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getTaskIdTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).getTaskId());
  }

  @Test
  public void setTypeTest() {
    // Arrange
    CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "name", "123", "foo");

    // Act
    cacheData.setType("foo");

    // Assert
    assertEquals("foo", cacheData.getType());
  }

  @Test
  public void setTaskIdTest() {
    // Arrange
    CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "name", "123", "foo");

    // Act
    cacheData.setTaskId(123);

    // Assert
    assertEquals(123, cacheData.getTaskId());
  }

  @Test
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

  @Test
  public void setLocalConfigInfoVersionTest() {
    // Arrange
    CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "name", "123", "foo");

    // Act
    cacheData.setLocalConfigInfoVersion(1L);

    // Assert
    assertEquals(1L, cacheData.getLocalConfigInfoVersion());
  }

  @Test
  public void setInitializingTest() {
    // Arrange
    CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "name", "123", "foo");

    // Act
    cacheData.setInitializing(true);

    // Assert
    assertTrue(cacheData.isInitializing());
  }

  @Test
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

  @Test
  public void setUseLocalConfigInfoTest2() {
    // Arrange
    CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "name", "123", "foo");

    // Act
    cacheData.setUseLocalConfigInfo(true);

    // Assert
    assertTrue(cacheData.isUseLocalConfigInfo());
  }

  @Test
  public void setUseLocalConfigInfoTest() {
    // Arrange
    CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "name", "123", "foo");

    // Act
    cacheData.setUseLocalConfigInfo(false);

    // Assert
    long actualLocalConfigInfoVersion = cacheData.getLocalConfigInfoVersion();
    assertEquals(-1L, actualLocalConfigInfoVersion);
    assertFalse(cacheData.isUseLocalConfigInfo());
  }

  @Test
  public void getMd5Test() {
    // Arrange, Act and Assert
    assertEquals("", (new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).getMd5());
  }

  @Test
  public void getMd5StringTest() {
    // Arrange, Act and Assert
    assertEquals("acbd18db4cc2f85cedef654fccc4a4d8", CacheData.getMd5String("foo"));
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).getType());
  }

  @Test
  public void getContentTest() {
    // Arrange, Act and Assert
    assertNull((new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).getContent());
  }

  @Test
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

  @Test
  public void getLocalConfigInfoVersionTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).getLocalConfigInfoVersion());
  }

  @Test
  public void getListenersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).getListeners().size());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).equals("foo"));
  }

  @Test
  public void removeListenerTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).removeListener(null);
  }

  @Test
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertEquals("", (new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).getTenant());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(1611925, (new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).hashCode());
  }

  @Test
  public void isUseLocalConfigInfoTest() {
    // Arrange, Act and Assert
    assertFalse((new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).isUseLocalConfigInfo());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("CacheData [123, foo]",
        (new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).toString());
  }

  @Test
  public void addListenerTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).addListener(null);
  }

  @Test
  public void isInitializingTest() {
    // Arrange, Act and Assert
    assertTrue((new CacheData(new ConfigFilterChainManager(), "name", "123", "foo")).isInitializing());
  }
}

