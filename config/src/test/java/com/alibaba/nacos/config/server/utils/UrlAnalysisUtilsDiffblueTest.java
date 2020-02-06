package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UrlAnalysisUtilsDiffblueTest {
  @Test
  public void getContentIdentityTest() {
    // Arrange, Act and Assert
    assertEquals("", UrlAnalysisUtils.getContentIdentity("^(\\w+://)?([\\w\\.]+:)(\\d*)?(\\??.*)"));
  }
}

