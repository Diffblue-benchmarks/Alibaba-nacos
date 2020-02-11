package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.config.server.utils.SimpleReadWriteLock;
import org.junit.Test;

public class CacheItemDiffblueTest {
  @Test(timeout=10000)
  public void setLastModifiedTs4BetaTest() {
    // Arrange
    CacheItem cacheItem = new CacheItem("foo");

    // Act
    cacheItem.setLastModifiedTs4Beta(1L);

    // Assert
    assertEquals(1L, cacheItem.getLastModifiedTs4Beta());
  }

  @Test(timeout=10000)
  public void setMd54BetaTest() {
    // Arrange
    CacheItem cacheItem = new CacheItem("foo");

    // Act
    cacheItem.setMd54Beta("foo");

    // Assert
    assertEquals("foo", cacheItem.getMd54Beta());
  }

  @Test(timeout=10000)
  public void getMd54BetaTest() {
    // Arrange, Act and Assert
    assertEquals("", (new CacheItem("foo")).getMd54Beta());
  }

  @Test(timeout=10000)
  public void setBetaTest() {
    // Arrange
    CacheItem cacheItem = new CacheItem("foo");

    // Act
    cacheItem.setBeta(true);

    // Assert
    assertTrue(cacheItem.isBeta());
  }

  @Test(timeout=10000)
  public void isBetaTest() {
    // Arrange, Act and Assert
    assertFalse((new CacheItem("foo")).isBeta());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    CacheItem actualCacheItem = new CacheItem("foo");

    // Assert
    SimpleReadWriteLock expectedRwLock = actualCacheItem.rwLock;
    String actualMd5 = actualCacheItem.getMd5();
    SimpleReadWriteLock actualRwLock = actualCacheItem.getRwLock();
    String actualGroupKey = actualCacheItem.getGroupKey();
    boolean actualIsBetaResult = actualCacheItem.isBeta();
    assertEquals("", actualCacheItem.getMd54Beta());
    assertFalse(actualIsBetaResult);
    assertEquals("foo", actualGroupKey);
    assertSame(expectedRwLock, actualRwLock);
    assertEquals("", actualMd5);
  }

  @Test(timeout=10000)
  public void getLastModifiedTs4BetaTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new CacheItem("foo")).getLastModifiedTs4Beta());
  }

  @Test(timeout=10000)
  public void getRwLockTest() {
    // Arrange
    CacheItem cacheItem = new CacheItem("foo");

    // Act and Assert
    assertSame(cacheItem.rwLock, cacheItem.getRwLock());
  }

  @Test(timeout=10000)
  public void getMd5Test() {
    // Arrange, Act and Assert
    assertEquals("", (new CacheItem("foo")).getMd5());
  }

  @Test(timeout=10000)
  public void getTagMd5Test() {
    // Arrange, Act and Assert
    assertNull((new CacheItem("foo")).getTagMd5());
  }

  @Test(timeout=10000)
  public void setTagLastModifiedTsTest() {
    // Arrange
    CacheItem cacheItem = new CacheItem("foo");

    // Act
    cacheItem.setTagLastModifiedTs(null);

    // Assert
    assertNull(cacheItem.getTagLastModifiedTs());
  }

  @Test(timeout=10000)
  public void getTagLastModifiedTsTest() {
    // Arrange, Act and Assert
    assertNull((new CacheItem("foo")).getTagLastModifiedTs());
  }

  @Test(timeout=10000)
  public void setTagMd5Test() {
    // Arrange
    CacheItem cacheItem = new CacheItem("foo");

    // Act
    cacheItem.setTagMd5(null);

    // Assert
    assertNull(cacheItem.getTagMd5());
  }

  @Test(timeout=10000)
  public void setLastModifiedTsTest() {
    // Arrange
    CacheItem cacheItem = new CacheItem("foo");

    // Act
    cacheItem.setLastModifiedTs(1L);

    // Assert
    assertEquals(1L, cacheItem.getLastModifiedTs());
  }

  @Test(timeout=10000)
  public void setRwLockTest() {
    // Arrange
    CacheItem cacheItem = new CacheItem("foo");
    SimpleReadWriteLock simpleReadWriteLock = new SimpleReadWriteLock();

    // Act
    cacheItem.setRwLock(simpleReadWriteLock);

    // Assert
    assertSame(simpleReadWriteLock, cacheItem.getRwLock());
  }

  @Test(timeout=10000)
  public void getIps4BetaTest() {
    // Arrange, Act and Assert
    assertNull((new CacheItem("foo")).getIps4Beta());
  }

  @Test(timeout=10000)
  public void getGroupKeyTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new CacheItem("foo")).getGroupKey());
  }

  @Test(timeout=10000)
  public void setMd5Test() {
    // Arrange
    CacheItem cacheItem = new CacheItem("foo");

    // Act
    cacheItem.setMd5("foo");

    // Assert
    assertEquals("foo", cacheItem.getMd5());
  }

  @Test(timeout=10000)
  public void setIps4BetaTest() {
    // Arrange
    CacheItem cacheItem = new CacheItem("foo");

    // Act
    cacheItem.setIps4Beta(null);

    // Assert
    assertNull(cacheItem.getIps4Beta());
  }

  @Test(timeout=10000)
  public void getLastModifiedTsTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new CacheItem("foo")).getLastModifiedTs());
  }
}

