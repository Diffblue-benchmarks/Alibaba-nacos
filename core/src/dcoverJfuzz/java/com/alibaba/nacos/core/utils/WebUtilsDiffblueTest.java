package com.alibaba.nacos.core.utils;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.mock.web.MockHttpServletRequest;

public class WebUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void requiredTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    WebUtils.required(new MockHttpServletRequest(), "foo");
  }
}

