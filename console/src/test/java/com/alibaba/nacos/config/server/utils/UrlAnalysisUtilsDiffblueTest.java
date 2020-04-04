package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class UrlAnalysisUtilsDiffblueTest {
  @Test
  public void testGetContentIdentity() {
    // Arrange
    String actualContentIdentity = UrlAnalysisUtils.getContentIdentity("^(\\w+://)?([\\w\\.]+:)(\\d*)?(\\??.*)");
    String actualContentIdentity1 = UrlAnalysisUtils.getContentIdentity("UUU://UUU:99xx");

    // Act and Assert
    assertEquals("", actualContentIdentity);
    assertEquals("UUU://UUU:99", actualContentIdentity1);
    assertNull(UrlAnalysisUtils.getContentIdentity(null));
  }
}

