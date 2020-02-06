package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class IPUtilDiffblueTest {
  @Test
  public void isIPV4Test() {
    // Arrange, Act and Assert
    assertFalse(IPUtil.isIPV4("aaaaa"));
  }

  @Test
  public void isIPV6Test() {
    // Arrange, Act and Assert
    assertFalse(IPUtil.isIPV6("aaaaa"));
  }
}

