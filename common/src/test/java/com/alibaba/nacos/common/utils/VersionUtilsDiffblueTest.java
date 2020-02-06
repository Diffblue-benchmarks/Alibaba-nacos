package com.alibaba.nacos.common.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VersionUtilsDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    new VersionUtils();

    // Assert
    assertEquals("1.2.0-SNAPSHOT", VersionUtils.VERSION);
  }
}

