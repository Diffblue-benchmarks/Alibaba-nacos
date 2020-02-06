package com.alibaba.nacos.core.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SystemUtilsDiffblueTest {
  @Test
  public void getLoadTest() {
    // Arrange, Act and Assert
    assertEquals(5.824707f, SystemUtils.getLoad(), 0.0f);
  }

  @Test
  public void getConfFilePathTest() {
    // Arrange, Act and Assert
    assertEquals("/Users/peterschrammel/nacos/conf/", SystemUtils.getConfFilePath());
  }

  @Test
  public void getIPsBySystemEnvTest() {
    // Arrange, Act and Assert
    assertEquals(0, SystemUtils.getIPsBySystemEnv(",").size());
  }

  @Test
  public void getSystemEnvTest() {
    // Arrange, Act and Assert
    assertNull(SystemUtils.getSystemEnv(","));
  }
}

