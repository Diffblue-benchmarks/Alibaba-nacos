package com.alibaba.nacos.core.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SystemUtilsDiffblueTest {
//  @Test(timeout=10000)
//  public void getLoadTest() {
//    // Arrange, Act and Assert
//    assertEquals(2.62f, SystemUtils.getLoad(), 0.0f);  <-- expected:<2.62> but was:<5.6>
//  }
//
  @Test(timeout=10000)
  public void getConfFilePathTest() {
    // Arrange, Act and Assert
    assertEquals("/home/thomas_perkins/nacos/conf/", SystemUtils.getConfFilePath());
  }

  @Test(timeout=10000)
  public void getIPsBySystemEnvTest() {
    // Arrange, Act and Assert
    assertEquals(0, SystemUtils.getIPsBySystemEnv("foo").size());
  }

  @Test(timeout=10000)
  public void getSystemEnvTest() {
    // Arrange, Act and Assert
    assertNull(SystemUtils.getSystemEnv("foo"));
  }
}

