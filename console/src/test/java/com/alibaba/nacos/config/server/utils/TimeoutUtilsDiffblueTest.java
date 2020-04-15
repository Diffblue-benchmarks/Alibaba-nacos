package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TimeoutUtilsDiffblueTest {
  @Test
  public void testAddTotalTime() {
    // Arrange
    TimeoutUtils timeoutUtils = new TimeoutUtils(0L, 42L);

    // Act
    timeoutUtils.addTotalTime(10L);

    // Assert
    assertTrue(timeoutUtils.isTimeout());
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertFalse((new TimeoutUtils(0L, 42L)).isTimeout());
  }

  @Test
  public void testIsTimeout() {
    // Arrange, Act and Assert
    assertTrue((new TimeoutUtils(-1L, 42L)).isTimeout());
  }

  @Test
  public void testIsTimeout2() {
    // Arrange, Act and Assert
    assertFalse((new TimeoutUtils(0L, 42L)).isTimeout());
  }

  @Test
  public void testResetTotalTime() {
    // Arrange
    TimeoutUtils timeoutUtils = new TimeoutUtils(0L, 42L);

    // Act
    timeoutUtils.resetTotalTime();

    // Assert
    assertFalse(timeoutUtils.isTimeout());
  }
}

