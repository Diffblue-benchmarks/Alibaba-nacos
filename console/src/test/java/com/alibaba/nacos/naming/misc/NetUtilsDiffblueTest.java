package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NetUtilsDiffblueTest {
  @Test
  public void testGetLocalAddress() {
    // Arrange
    String expectedLocalAddress = System.getProperty("nacos.local.ip");

    // Act and Assert
    assertEquals(expectedLocalAddress, NetUtils.getLocalAddress());
  }

  @Test
  public void testLocalServer() {
    // Arrange and Act
    String actualLocalServerResult = NetUtils.localServer();

    // Assert
    assertEquals(String.join("", System.getProperty("nacos.local.ip"), ":0"), actualLocalServerResult);
  }

  @Test
  public void testNum2ip() {
    // Arrange, Act and Assert
    assertEquals("0.0.0.3", NetUtils.num2ip(3));
  }
}

