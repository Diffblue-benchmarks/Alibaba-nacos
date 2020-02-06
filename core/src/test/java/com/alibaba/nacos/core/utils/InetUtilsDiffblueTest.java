package com.alibaba.nacos.core.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class InetUtilsDiffblueTest {
  @Test
  public void findFirstNonLoopbackAddressTest() {
    // Arrange, Act and Assert
    assertTrue(InetUtils.findFirstNonLoopbackAddress() instanceof java.net.Inet4Address);
  }

  @Test
  public void matchTest() {
    // Arrange, Act and Assert
    assertFalse(InetUtils.match("$", "$"));
  }

  @Test
  public void isPreferredAddressTest() {
    // Arrange, Act and Assert
    assertTrue(InetUtils.isPreferredAddress(null));
  }

  @Test
  public void isIPTest() {
    // Arrange, Act and Assert
    assertFalse(InetUtils.isIP("$"));
  }

  @Test
  public void ignoreInterfaceTest() {
    // Arrange, Act and Assert
    assertFalse(InetUtils.ignoreInterface("$"));
  }

  @Test
  public void getSelfIpTest() {
    // Arrange, Act and Assert
    assertEquals("10.42.2.68", InetUtils.getSelfIp());
  }
}

