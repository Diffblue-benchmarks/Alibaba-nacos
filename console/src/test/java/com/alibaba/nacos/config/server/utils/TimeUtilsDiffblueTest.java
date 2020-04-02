package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TimeUtilsDiffblueTest {
  @Test
  public void testGetCurrentTimeStr() {
    // Arrange, Act and Assert
    assertEquals("2020-04-02 17:36:05", TimeUtils.getCurrentTimeStr());
  }
}

