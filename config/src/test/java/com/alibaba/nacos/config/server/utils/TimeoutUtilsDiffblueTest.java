package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TimeoutUtilsDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertFalse((new TimeoutUtils(1L, 42L)).isTimeout());
  }

  @Test
  public void addTotalTimeTest() {
    // Arrange
    TimeoutUtils timeoutUtils = new TimeoutUtils(1L, 42L);

    // Act
    timeoutUtils.addTotalTime(10L);

    // Assert
    assertTrue(timeoutUtils.isTimeout());
  }

  @Test
  public void resetTotalTimeTest() {
    // Arrange
    TimeoutUtils timeoutUtils = new TimeoutUtils(1L, 42L);

    // Act
    timeoutUtils.resetTotalTime();

    // Assert
    assertFalse(timeoutUtils.isTimeout());
  }

  @Test
  public void isTimeoutTest2() {
    // Arrange, Act and Assert
    assertFalse((new TimeoutUtils(1L, 42L)).isTimeout());
  }

  @Test
  public void isTimeoutTest() {
    // Arrange, Act and Assert
    assertTrue((new TimeoutUtils(-1L, 42L)).isTimeout());
  }
}

