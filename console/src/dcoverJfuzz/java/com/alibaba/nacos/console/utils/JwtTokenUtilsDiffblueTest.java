package com.alibaba.nacos.console.utils;

import static org.junit.Assert.assertFalse;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JwtTokenUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void getAuthenticationTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new JwtTokenUtils()).getAuthentication("ABC123");
  }

  @Test(timeout=10000)
  public void validateTokenTest() {
    // Arrange, Act and Assert
    assertFalse((new JwtTokenUtils()).validateToken("ABC123"));
  }
}

