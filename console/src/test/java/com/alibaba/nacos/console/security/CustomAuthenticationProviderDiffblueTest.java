package com.alibaba.nacos.console.security;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class CustomAuthenticationProviderDiffblueTest {
  @Test
  public void testSupports() {
    // Arrange
    Class<?> aClass = Object.class;

    // Act and Assert
    assertFalse((new CustomAuthenticationProvider()).supports(aClass));
  }
}

