package com.alibaba.nacos.core.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.junit.Test;

public class InetUtilsDiffblueTest {
  @Test
  public void testFindFirstNonLoopbackAddress() {
    // Arrange, Act and Assert
    assertTrue(InetUtils.findFirstNonLoopbackAddress() instanceof java.net.Inet4Address);
  }

  @Test
  public void testGetSelfIp() {
    // Arrange
    String expectedSelfIp = System.getProperty("nacos.local.ip");

    // Act and Assert
    assertEquals(expectedSelfIp, InetUtils.getSelfIp());
  }

  @Test
  public void testIgnoreInterface() {
    // Arrange, Act and Assert
    assertFalse(InetUtils.ignoreInterface("$"));
  }

  @Test
  public void testIsIP() {
    // Arrange, Act and Assert
    assertFalse(InetUtils.isIP("$"));
  }

  @Test
  public void testIsPreferredAddress() throws UnknownHostException {
    // Arrange, Act and Assert
    assertTrue(InetUtils.isPreferredAddress(InetAddress.getLocalHost()));
  }

  @Test
  public void testMatch() {
    // Arrange, Act and Assert
    assertFalse(InetUtils.match("$", "$"));
  }
}

