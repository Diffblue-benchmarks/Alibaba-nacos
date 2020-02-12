package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class IPUtilDiffblueTest {
  @Test(timeout=10000)
  public void isIPV4Test() {
    // Arrange, Act and Assert
    assertFalse(IPUtil.isIPV4("foo"));
  }

  @Test(timeout=10000)
  public void isIPV6Test() {
    // Arrange, Act and Assert
    assertFalse(IPUtil.isIPV6("foo"));
  }
}

