package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class SingletonRepositoryDiffblueTest {
  @Test
  public void getSingletonTest2() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", SingletonRepository.DataIdGroupIdCache.getSingleton("aaaaa"));
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertSame((new SingletonRepository.DataIdGroupIdCache()).cache, SingletonRepository.DataIdGroupIdCache.cache);
  }

  @Test
  public void sizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SingletonRepository<Object>()).size());
  }

  @Test
  public void getSingletonTest() {
    // Arrange
    SingletonRepository<Object> singletonRepository = new SingletonRepository<Object>();

    // Act and Assert
    assertEquals("aaaaa", singletonRepository.getSingleton("aaaaa"));
    assertEquals(1, singletonRepository.size());
  }

  @Test
  public void removeTest() {
    // Arrange
    SingletonRepository<Object> singletonRepository = new SingletonRepository<Object>();

    // Act
    singletonRepository.remove("aaaaa");

    // Assert
    assertEquals(0, singletonRepository.size());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SingletonRepository<Object>()).size());
  }
}

