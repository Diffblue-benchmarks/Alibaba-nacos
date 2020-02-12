package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UrlAnalysisUtilsDiffblueTest {
  @Test(timeout=10000)
  public void getContentIdentityTest() {
    // Arrange, Act and Assert
    assertEquals("", UrlAnalysisUtils.getContentIdentity("foo"));
  }
}

