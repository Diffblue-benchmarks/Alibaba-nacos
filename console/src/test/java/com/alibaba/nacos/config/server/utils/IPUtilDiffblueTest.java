package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class IPUtilDiffblueTest {
  @Test
  public void testIsIPV4() {
    // Arrange, Act and Assert
    assertFalse(IPUtil.isIPV4("addr"));
  }

  @Test
  public void testIsIPV6() {
    // Arrange, Act and Assert
    assertFalse(IPUtil.isIPV6("addr"));
  }
}

