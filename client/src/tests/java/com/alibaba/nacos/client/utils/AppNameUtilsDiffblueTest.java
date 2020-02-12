package com.alibaba.nacos.client.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppNameUtilsDiffblueTest {
  @Test(timeout=10000)
  public void getAppNameTest() {
    // Arrange, Act and Assert
    assertEquals("unknown", AppNameUtils.getAppName());
  }
}

