package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NetUtilsDiffblueTest {
  @Test
  public void num2ipTest() {
    // Arrange, Act and Assert
    assertEquals("0.0.0.1", NetUtils.num2ip(1));
  }

  @Test
  public void getLocalAddressTest() {
    // Arrange, Act and Assert
    assertEquals("10.42.2.68", NetUtils.getLocalAddress());
  }

  @Test
  public void localServerTest() {
    // Arrange, Act and Assert
    assertEquals("10.42.2.68:0", NetUtils.localServer());
  }
}

