package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class LimiterDiffblueTest {
  @Test
  public void isLimitTest() {
    // Arrange, Act and Assert
    assertFalse(Limiter.isLimit("foo"));
  }
}

