package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class NamingProxyDiffblueTest {
  @Test
  public void testRequestAppendParam() {
    // Arrange
    NamingProxy.Request request = new NamingProxy.Request();

    // Act and Assert
    assertSame(request, request.appendParam("key", "value"));
  }

  @Test
  public void testRequestToUrl() {
    // Arrange, Act and Assert
    assertEquals("", (new NamingProxy.Request()).toUrl());
  }
}

