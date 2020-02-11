package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class LimiterDiffblueTest {
  @Test(timeout=10000)
  public void isLimitTest() {
    // Arrange, Act and Assert
    assertFalse(Limiter.isLimit("foo"));
  }
}

