package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ThreadUtilDiffblueTest {
  @Test
  public void getSuitableThreadCountTest() {
    // Arrange, Act and Assert
    assertEquals(16, ThreadUtil.getSuitableThreadCount());
  }
}

