package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class SingletonRepositoryDiffblueTest {
  @Test(timeout=10000)
  public void getSingletonTest2() {
    // Arrange, Act and Assert
    assertEquals("foo", SingletonRepository.DataIdGroupIdCache.getSingleton("foo"));
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertSame((new SingletonRepository.DataIdGroupIdCache()).cache, SingletonRepository.DataIdGroupIdCache.cache);
  }

  @Test(timeout=10000)
  public void sizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SingletonRepository<Object>()).size());
  }

  @Test(timeout=10000)
  public void getSingletonTest() {
    // Arrange
    SingletonRepository<Object> singletonRepository = new SingletonRepository<Object>();

    // Act and Assert
    assertEquals("foo", singletonRepository.getSingleton("foo"));
    assertEquals(1, singletonRepository.size());
  }

  @Test(timeout=10000)
  public void removeTest() {
    // Arrange
    SingletonRepository<Object> singletonRepository = new SingletonRepository<Object>();

    // Act
    singletonRepository.remove("foo");

    // Assert
    assertEquals(0, singletonRepository.size());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SingletonRepository<Object>()).size());
  }
}

