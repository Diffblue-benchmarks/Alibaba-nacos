package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.config.server.utils.SimpleReadWriteLock;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;

public class CacheItemDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    CacheItem actualCacheItem = new CacheItem("");

    // Assert
    assertEquals("", actualCacheItem.getMd54Beta());
    assertFalse(actualCacheItem.isBeta());
    assertEquals("", actualCacheItem.getGroupKey());
    SimpleReadWriteLock expectedRwLock = actualCacheItem.rwLock;
    assertSame(expectedRwLock, actualCacheItem.getRwLock());
    assertEquals("", actualCacheItem.getMd5());
  }

  @Test
  public void testSetBeta() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");

    // Act
    cacheItem.setBeta(true);

    // Assert
    assertTrue(cacheItem.isBeta());
  }

  @Test
  public void testSetIps4Beta() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    cacheItem.setIps4Beta(stringList);

    // Assert
    assertSame(stringList, cacheItem.getIps4Beta());
  }

  @Test
  public void testSetLastModifiedTs() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");

    // Act
    cacheItem.setLastModifiedTs(1L);

    // Assert
    assertEquals(1L, cacheItem.getLastModifiedTs());
  }

  @Test
  public void testSetLastModifiedTs4Beta() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");

    // Act
    cacheItem.setLastModifiedTs4Beta(1L);

    // Assert
    assertEquals(1L, cacheItem.getLastModifiedTs4Beta());
  }

  @Test
  public void testSetMd5() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");

    // Act
    cacheItem.setMd5("");

    // Assert
    assertEquals("", cacheItem.getMd5());
  }

  @Test
  public void testSetMd54Beta() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");

    // Act
    cacheItem.setMd54Beta("");

    // Assert
    assertEquals("", cacheItem.getMd54Beta());
  }

  @Test
  public void testSetRwLock() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");
    SimpleReadWriteLock simpleReadWriteLock = new SimpleReadWriteLock();

    // Act
    cacheItem.setRwLock(simpleReadWriteLock);

    // Assert
    assertSame(simpleReadWriteLock, cacheItem.getRwLock());
  }

  @Test
  public void testSetTagLastModifiedTs() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");
    HashMap<String, Long> stringResultLongMap = new HashMap<String, Long>();
    stringResultLongMap.put("foo", 1L);

    // Act
    cacheItem.setTagLastModifiedTs(stringResultLongMap);

    // Assert
    assertSame(stringResultLongMap, cacheItem.getTagLastModifiedTs());
  }

  @Test
  public void testSetTagMd5() {
    // Arrange
    CacheItem cacheItem = new CacheItem("");
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    cacheItem.setTagMd5(stringStringMap);

    // Assert
    assertSame(stringStringMap, cacheItem.getTagMd5());
  }
}

