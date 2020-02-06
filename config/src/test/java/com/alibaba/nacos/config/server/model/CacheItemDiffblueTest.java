package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.config.server.utils.SimpleReadWriteLock;
import org.junit.Test;

public class CacheItemDiffblueTest {
  @Test
  public void setLastModifiedTs4BetaTest() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");

    // Act
    cacheItem.setLastModifiedTs4Beta(1L);

    // Assert
    assertEquals(1L, cacheItem.getLastModifiedTs4Beta());
  }

  @Test
  public void setTypeTest() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");

    // Act
    cacheItem.setType("");

    // Assert
    assertEquals("", cacheItem.getType());
  }

  @Test
  public void setMd54BetaTest() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");

    // Act
    cacheItem.setMd54Beta("");

    // Assert
    assertEquals("", cacheItem.getMd54Beta());
  }

  @Test
  public void getMd54BetaTest() {
    // Arrange, Act and Assert
    assertEquals("", (new CacheItem("")).getMd54Beta());
  }

  @Test
  public void setBetaTest() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");

    // Act
    cacheItem.setBeta(true);

    // Assert
    assertTrue(cacheItem.isBeta());
  }

  @Test
  public void isBetaTest() {
    // Arrange, Act and Assert
    assertFalse((new CacheItem("")).isBeta());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    CacheItem actualCacheItem = new CacheItem("");

    // Assert
    SimpleReadWriteLock expectedRwLock = actualCacheItem.rwLock;
    String actualMd5 = actualCacheItem.getMd5();
    SimpleReadWriteLock actualRwLock = actualCacheItem.getRwLock();
    String actualGroupKey = actualCacheItem.getGroupKey();
    boolean actualIsBetaResult = actualCacheItem.isBeta();
    assertEquals("", actualCacheItem.getMd54Beta());
    assertFalse(actualIsBetaResult);
    assertEquals("", actualGroupKey);
    assertSame(expectedRwLock, actualRwLock);
    assertEquals("", actualMd5);
  }

  @Test
  public void getLastModifiedTs4BetaTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new CacheItem("")).getLastModifiedTs4Beta());
  }

  @Test
  public void getRwLockTest() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");

    // Act and Assert
    assertSame(cacheItem.rwLock, cacheItem.getRwLock());
  }

  @Test
  public void getMd5Test() {
    // Arrange, Act and Assert
    assertEquals("", (new CacheItem("")).getMd5());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new CacheItem("")).getType());
  }

  @Test
  public void getTagMd5Test() {
    // Arrange, Act and Assert
    assertNull((new CacheItem("")).getTagMd5());
  }

  @Test
  public void setTagLastModifiedTsTest() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");

    // Act
    cacheItem.setTagLastModifiedTs(null);

    // Assert
    assertNull(cacheItem.getTagLastModifiedTs());
  }

  @Test
  public void getTagLastModifiedTsTest() {
    // Arrange, Act and Assert
    assertNull((new CacheItem("")).getTagLastModifiedTs());
  }

  @Test
  public void setTagMd5Test() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");

    // Act
    cacheItem.setTagMd5(null);

    // Assert
    assertNull(cacheItem.getTagMd5());
  }

  @Test
  public void setLastModifiedTsTest() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");

    // Act
    cacheItem.setLastModifiedTs(1L);

    // Assert
    assertEquals(1L, cacheItem.getLastModifiedTs());
  }

  @Test
  public void setRwLockTest() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");
    SimpleReadWriteLock simpleReadWriteLock = new SimpleReadWriteLock();

    // Act
    cacheItem.setRwLock(simpleReadWriteLock);

    // Assert
    assertSame(simpleReadWriteLock, cacheItem.getRwLock());
  }

  @Test
  public void getIps4BetaTest() {
    // Arrange, Act and Assert
    assertNull((new CacheItem("")).getIps4Beta());
  }

  @Test
  public void getGroupKeyTest() {
    // Arrange, Act and Assert
    assertEquals("", (new CacheItem("")).getGroupKey());
  }

  @Test
  public void setMd5Test() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");

    // Act
    cacheItem.setMd5("");

    // Assert
    assertEquals("", cacheItem.getMd5());
  }

  @Test
  public void setIps4BetaTest() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");

    // Act
    cacheItem.setIps4Beta(null);

    // Assert
    assertNull(cacheItem.getIps4Beta());
  }

  @Test
  public void getLastModifiedTsTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new CacheItem("")).getLastModifiedTs());
  }
}

