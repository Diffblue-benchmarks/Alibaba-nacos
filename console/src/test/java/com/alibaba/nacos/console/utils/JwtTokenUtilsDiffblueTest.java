package com.alibaba.nacos.console.utils;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.security.authentication.TestingAuthenticationToken;

public class JwtTokenUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void createTokenTest() {
    // Arrange
    JwtTokenUtils jwtTokenUtils = new JwtTokenUtils();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    jwtTokenUtils.createToken(new TestingAuthenticationToken("", ""));
  }
}

