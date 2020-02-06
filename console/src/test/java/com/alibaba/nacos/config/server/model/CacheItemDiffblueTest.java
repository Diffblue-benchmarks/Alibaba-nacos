package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.alibaba.nacos.config.server.utils.SimpleReadWriteLock;
import org.junit.Test;

public class CacheItemDiffblueTest {
  @Test
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
}

