package com.alibaba.nacos.core.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class InetUtilsDiffblueTest {
  @Test(timeout=10000)
  public void findFirstNonLoopbackAddressTest() {
    // Arrange, Act and Assert
    assertTrue(InetUtils.findFirstNonLoopbackAddress() instanceof java.net.Inet4Address);
  }

  @Test(timeout=10000)
  public void matchTest() {
    // Arrange, Act and Assert
    assertTrue(InetUtils.match("foo", "foo"));
  }

  @Test(timeout=10000)
  public void isPreferredAddressTest() {
    // Arrange, Act and Assert
    assertTrue(InetUtils.isPreferredAddress(null));
  }

  @Test(timeout=10000)
  public void isIPTest() {
    // Arrange, Act and Assert
    assertFalse(InetUtils.isIP("foo"));
  }

  @Test(timeout=10000)
  public void ignoreInterfaceTest() {
    // Arrange, Act and Assert
    assertFalse(InetUtils.ignoreInterface("name"));
  }

  @Test(timeout=10000)
  public void getSelfIpTest() {
    // Arrange, Act and Assert
    assertEquals("10.128.0.37", InetUtils.getSelfIp());
  }
}

