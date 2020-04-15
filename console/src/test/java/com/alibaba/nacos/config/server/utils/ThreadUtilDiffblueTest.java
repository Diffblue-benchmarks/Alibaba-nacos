package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ThreadUtilDiffblueTest {
  @Test
  public void testGetSuitableThreadCount() {
    // Arrange, Act and Assert
    assertEquals(32, ThreadUtil.getSuitableThreadCount());
  }
}

