package com.alibaba.nacos.console.utils;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class JwtTokenUtilsDiffblueTest {
  @Test
  public void testValidateToken() {
    // Arrange, Act and Assert
    assertFalse((new JwtTokenUtils()).validateToken(""));
  }
}

