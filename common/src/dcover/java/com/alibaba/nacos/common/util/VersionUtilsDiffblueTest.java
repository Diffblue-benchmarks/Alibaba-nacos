package com.alibaba.nacos.common.util;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class VersionUtilsDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    new VersionUtils();

    // Assert
    assertNull(VersionUtils.VERSION);
  }
}

