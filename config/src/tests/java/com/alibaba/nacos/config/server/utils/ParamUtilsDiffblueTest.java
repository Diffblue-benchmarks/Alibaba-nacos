package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ParamUtilsDiffblueTest {
  @Test(timeout=10000)
  public void isValidTest() {
    // Arrange, Act and Assert
    assertTrue(ParamUtils.isValid("foo"));
  }
}

