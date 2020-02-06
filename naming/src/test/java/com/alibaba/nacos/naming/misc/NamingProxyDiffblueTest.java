package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class NamingProxyDiffblueTest {
  @Test
  public void toUrlTest() {
    // Arrange, Act and Assert
    assertEquals("", (new NamingProxy.Request()).toUrl());
  }

  @Test
  public void appendParamTest() {
    // Arrange
    NamingProxy.Request request = new NamingProxy.Request();

    // Act and Assert
    assertSame(request, request.appendParam("aaaaa", "aaaaa"));
  }
}

