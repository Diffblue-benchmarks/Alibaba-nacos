package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ParamUtilsDiffblueTest {
  @Test
  public void testIsValid() {
    // Arrange
    boolean actualIsValidResult = ParamUtils.isValid(",");

    // Act and Assert
    assertFalse(actualIsValidResult);
    assertFalse(ParamUtils.isValid(null));
  }
}

