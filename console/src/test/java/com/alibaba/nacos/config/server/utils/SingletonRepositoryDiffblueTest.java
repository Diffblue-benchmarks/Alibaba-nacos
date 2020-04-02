package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class SingletonRepositoryDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(0, (new SingletonRepository<Object>()).size());
  }

  @Test
  public void testDataIdGroupIdCacheConstructor() {
    // Arrange, Act and Assert
    assertSame((new SingletonRepository.DataIdGroupIdCache()).cache, SingletonRepository.DataIdGroupIdCache.cache);
  }

  @Test
  public void testDataIdGroupIdCacheGetSingleton() {
    // Arrange, Act and Assert
    assertEquals("str", SingletonRepository.DataIdGroupIdCache.getSingleton("str"));
  }

  @Test
  public void testGetSingleton() {
    // Arrange
    SingletonRepository<Object> singletonRepository = new SingletonRepository<Object>();

    // Act and Assert
    assertEquals("obj", singletonRepository.getSingleton("obj"));
    assertEquals(1, singletonRepository.size());
  }

  @Test
  public void testRemove() {
    // Arrange
    SingletonRepository<Object> singletonRepository = new SingletonRepository<Object>();

    // Act
    singletonRepository.remove("obj");

    // Assert
    assertEquals(0, singletonRepository.size());
  }

  @Test
  public void testSize() {
    // Arrange, Act and Assert
    assertEquals(0, (new SingletonRepository<Object>()).size());
  }
}

