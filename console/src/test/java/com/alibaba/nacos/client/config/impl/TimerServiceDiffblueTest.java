package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class TimerServiceDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertSame((new TimerService()).scheduledExecutor, TimerService.scheduledExecutor);
  }
}

