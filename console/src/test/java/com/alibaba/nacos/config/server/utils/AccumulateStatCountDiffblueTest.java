package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AccumulateStatCountDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(0L, (new AccumulateStatCount()).lastStatValue);
  }

  @Test
  public void testIncrease() {
    // Arrange, Act and Assert
    assertEquals(1L, (new AccumulateStatCount()).increase());
  }

  @Test
  public void testStat() {
    // Arrange
    AccumulateStatCount accumulateStatCount = new AccumulateStatCount();

    // Act and Assert
    assertEquals(0L, accumulateStatCount.stat());
    assertEquals(0L, accumulateStatCount.lastStatValue);
  }
}

