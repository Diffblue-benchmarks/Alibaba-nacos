package com.alibaba.nacos.naming.boot;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RunningConfigDiffblueTest {
  @Test
  public void testGetContextPath() {
    // Arrange, Act and Assert
    assertEquals("/nacos", RunningConfig.getContextPath());
  }

  @Test
  public void testGetServerPort() {
    // Arrange, Act and Assert
    assertEquals(0, RunningConfig.getServerPort());
  }
}

