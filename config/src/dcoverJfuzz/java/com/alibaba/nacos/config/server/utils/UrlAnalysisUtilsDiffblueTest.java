package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class UrlAnalysisUtilsDiffblueTest {
  @Test(timeout=10000)
  public void getContentIdentityTest() {
    // Arrange
    String actualContentIdentity = UrlAnalysisUtils.getContentIdentity("foo");

    // Act and Assert
    assertEquals("", actualContentIdentity);
    assertNull(UrlAnalysisUtils.getContentIdentity(""));
  }
}

