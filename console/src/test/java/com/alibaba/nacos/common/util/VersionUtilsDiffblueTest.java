package com.alibaba.nacos.common.util;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VersionUtilsDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    new VersionUtils();

    // Assert
    assertEquals("1.1.0", VersionUtils.VERSION);
  }
}

