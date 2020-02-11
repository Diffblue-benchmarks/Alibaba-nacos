package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AccumulateStatCountDiffblueTest {
  @Test(timeout=10000)
  public void statTest() {
    // Arrange
    AccumulateStatCount accumulateStatCount = new AccumulateStatCount();

    // Act and Assert
    assertEquals(0L, accumulateStatCount.stat());
    assertEquals(0L, accumulateStatCount.lastStatValue);
  }

  @Test(timeout=10000)
  public void increaseTest() {
    // Arrange, Act and Assert
    assertEquals(1L, (new AccumulateStatCount()).increase());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new AccumulateStatCount()).lastStatValue);
  }
}

