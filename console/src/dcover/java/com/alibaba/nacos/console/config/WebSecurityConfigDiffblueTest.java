package com.alibaba.nacos.console.config;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class WebSecurityConfigDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void authenticationManagerBeanTest() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new WebSecurityConfig()).authenticationManagerBean();
  }
}

