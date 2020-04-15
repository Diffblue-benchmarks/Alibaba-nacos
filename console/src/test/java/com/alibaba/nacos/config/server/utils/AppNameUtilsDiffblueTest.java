package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppNameUtilsDiffblueTest {
  @Test
  public void testGetAppName() {
    // Arrange
    String expectedAppName = System.getProperty("sun.os.patch.level");

    // Act and Assert
    assertEquals(expectedAppName, AppNameUtils.getAppName());
  }
}

