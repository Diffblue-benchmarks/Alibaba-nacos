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
    assertEquals(0, (new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=")).getTaskId());
  }

  @Test
  public void setTypeTest() {
    // Arrange
    CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=");

    // Act
    cacheData.setType("dataId=");

    // Assert
    assertEquals("dataId=", cacheData.getType());
  }

  @Test
  public void setTaskIdTest() {
    // Arrange
    CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=");

    // Act
    cacheData.setTaskId(1);

    // Assert
    assertEquals(1, cacheData.getTaskId());
  }

  @Test
  public void setContentTest() {
    // Arrange
    CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=");

    // Act
    cacheData.setContent("dataId=");

    // Assert
    String actualContent = cacheData.getContent();
    assertEquals("c09c83251b1e5b813b98d84de8cc4dc3", cacheData.getMd5());
    assertEquals("dataId=", actualContent);
  }

  @Test
  public void setLocalConfigInfoVersionTest() {
    // Arrange
    CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=");

    // Act
    cacheData.setLocalConfigInfoVersion(1L);

    // Assert
    assertEquals(1L, cacheData.getLocalConfigInfoVersion());
  }

  @Test
  public void setInitializingTest() {
    // Arrange
    CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=");

    // Act
    cacheData.setInitializing(true);

    // Assert
    assertTrue(cacheData.isInitializing());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    CacheData actualCacheData = new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=");

    // Assert
    String actualContent = actualCacheData.getContent();
    boolean actualIsInitializingResult = actualCacheData.isInitializing();
    String actualMd5 = actualCacheData.getMd5();
    boolean actualIsUseLocalConfigInfoResult = actualCacheData.isUseLocalConfigInfo();
    assertEquals("dataId=", actualCacheData.group);
    assertEquals("dataId=", actualCacheData.dataId);
    assertEquals("", actualCacheData.getTenant());
    assertFalse(actualIsUseLocalConfigInfoResult);
    assertEquals("", actualMd5);
    assertTrue(actualIsInitializingResult);
    assertNull(actualContent);
  }

  @Test
  public void setUseLocalConfigInfoTest() {
    // Arrange
    CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=");

    // Act
    cacheData.setUseLocalConfigInfo(true);

    // Assert
    assertTrue(cacheData.isUseLocalConfigInfo());
  }

  @Test
  public void getMd5Test() {
    // Arrange, Act and Assert
    assertEquals("", (new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=")).getMd5());
  }

  @Test
  public void getMd5StringTest() {
    // Arrange, Act and Assert
    assertEquals("c09c83251b1e5b813b98d84de8cc4dc3", CacheData.getMd5String("dataId="));
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=")).getType());
  }

  @Test
  public void getContentTest() {
    // Arrange, Act and Assert
    assertNull((new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=")).getContent());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    CacheData actualCacheData = new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=",
        "dataId=");

    // Assert
    String actualContent = actualCacheData.getContent();
    boolean actualIsInitializingResult = actualCacheData.isInitializing();
    String actualMd5 = actualCacheData.getMd5();
    boolean actualIsUseLocalConfigInfoResult = actualCacheData.isUseLocalConfigInfo();
    assertEquals("dataId=", actualCacheData.group);
    assertEquals("dataId=", actualCacheData.dataId);
    assertEquals("dataId=", actualCacheData.getTenant());
    assertFalse(actualIsUseLocalConfigInfoResult);
    assertEquals("", actualMd5);
    assertTrue(actualIsInitializingResult);
    assertNull(actualContent);
  }

  @Test
  public void getLocalConfigInfoVersionTest() {
    // Arrange, Act and Assert
    assertEquals(0L,
        (new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=")).getLocalConfigInfoVersion());
  }

  @Test
  public void getListenersTest() {
    // Arrange, Act and Assert
    assertEquals(0,
        (new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=")).getListeners().size());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=")).equals("dataId="));
  }

  @Test
  public void removeListenerTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=")).removeListener(null);
  }

  @Test
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertEquals("", (new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=")).getTenant());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(-1063071039,
        (new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=")).hashCode());
  }

  @Test
  public void isUseLocalConfigInfoTest() {
    // Arrange, Act and Assert
    assertFalse(
        (new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=")).isUseLocalConfigInfo());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("CacheData [dataId=, dataId=]",
        (new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=")).toString());
  }

  @Test
  public void addListenerTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=")).addListener(null);
  }

  @Test
  public void isInitializingTest() {
    // Arrange, Act and Assert
    assertTrue((new CacheData(new ConfigFilterChainManager(), "dataId=", "dataId=", "dataId=")).isInitializing());
  }
}

