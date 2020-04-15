package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

public class RequestUtilDiffblueTest {
  @Test
  public void testGetAppName() {
    // Arrange, Act and Assert
    assertNull(RequestUtil.getAppName(new MockHttpServletRequest()));
  }

  @Test
  public void testGetRemoteIp() {
    // Arrange
    MockHttpServletRequest mockHttpServletRequest = new MockHttpServletRequest();
    mockHttpServletRequest.addHeader("X-Forwarded-For", "foo");

    // Act and Assert
    assertEquals("foo", RequestUtil.getRemoteIp(mockHttpServletRequest));
  }

  @Test
  public void testGetRemoteIp2() {
    // Arrange, Act and Assert
    assertEquals("127.0.0.1", RequestUtil.getRemoteIp(new MockHttpServletRequest()));
  }
}

