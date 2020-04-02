package com.alibaba.nacos.core.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SystemUtilsDiffblueTest {
  @Test
  public void testGetCPU() {
    // Arrange, Act and Assert
    assertEquals(0.0f, SystemUtils.getCPU(), 0.0f);
  }

  @Test
  public void testGetSystemEnv() {
    // Arrange, Act and Assert
    assertNull(SystemUtils.getSystemEnv("UTF-8"));
  }
}

