package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TimeoutUtilsDiffblueTest {
  @Test
  public void testAddTotalTime() {
    // Arrange
    TimeoutUtils timeoutUtils = new TimeoutUtils(0L, 0L);

    // Act
    timeoutUtils.addTotalTime(0L);

    // Assert
    assertFalse(timeoutUtils.isTimeout());
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertFalse((new TimeoutUtils(0L, 0L)).isTimeout());
  }

  @Test
  public void testIsTimeout() {
    // Arrange, Act and Assert
    assertFalse((new TimeoutUtils(0L, 0L)).isTimeout());
  }

  @Test
  public void testResetTotalTime() {
    // Arrange
    TimeoutUtils timeoutUtils = new TimeoutUtils(0L, 0L);

    // Act
    timeoutUtils.resetTotalTime();

    // Assert
    assertFalse(timeoutUtils.isTimeout());
  }
}

