package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TimeUtilsDiffblueTest {
  @Test
  public void getCurrentTimeStrTest() {
    // Arrange, Act and Assert
    assertEquals("2020-02-06 12:17:45", TimeUtils.getCurrentTimeStr());
  }
}

