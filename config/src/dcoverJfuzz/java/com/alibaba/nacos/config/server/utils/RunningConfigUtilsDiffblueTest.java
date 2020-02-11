package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class RunningConfigUtilsDiffblueTest {
  @Test(timeout=10000)
  public void getContextPathTest() {
    // Arrange, Act and Assert
    assertNull(RunningConfigUtils.getContextPath());
  }

  @Test(timeout=10000)
  public void getServerPortTest() {
    // Arrange, Act and Assert
    assertEquals(0, RunningConfigUtils.getServerPort());
  }

  @Test(timeout=10000)
  public void getClusterNameTest() {
    // Arrange, Act and Assert
    assertEquals("serverlist", RunningConfigUtils.getClusterName());
  }
}

