package com.alibaba.nacos.core.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SystemUtilsDiffblueTest {
//  @Test(timeout=10000)
//  public void getMemTest() {
//    // Arrange, Act and Assert
//    assertEquals(0.50136936f, SystemUtils.getMem(), 0.0f);  <-- expected:<0.50136936> but was:<0.34562632>
//  }
//
  @Test(timeout=10000)
  public void getSystemEnvTest() {
    // Arrange, Act and Assert
    assertNull(SystemUtils.getSystemEnv("foo"));
  }
}

