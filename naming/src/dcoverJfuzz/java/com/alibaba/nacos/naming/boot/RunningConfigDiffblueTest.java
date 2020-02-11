package com.alibaba.nacos.naming.boot;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RunningConfigDiffblueTest {
  @Test(timeout=10000)
  public void getContextPathTest() {
    // Arrange, Act and Assert
    assertEquals("/nacos", RunningConfig.getContextPath());
  }

  @Test(timeout=10000)
  public void getServerPortTest() {
    // Arrange, Act and Assert
    assertEquals(0, RunningConfig.getServerPort());
  }
}

