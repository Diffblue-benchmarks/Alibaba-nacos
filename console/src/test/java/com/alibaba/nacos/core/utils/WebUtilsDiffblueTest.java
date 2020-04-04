package com.alibaba.nacos.core.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

public class WebUtilsDiffblueTest {
  @Test
  public void testGetAcceptEncoding() {
    // Arrange, Act and Assert
    assertEquals("UTF-8", WebUtils.getAcceptEncoding(new MockHttpServletRequest()));
  }

  @Test
  public void testOptional() {
    // Arrange, Act and Assert
    assertEquals(",", WebUtils.optional(new MockHttpServletRequest(), ",", ","));
  }
}

