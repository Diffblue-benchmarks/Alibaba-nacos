package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NetUtilsDiffblueTest {
  @Test(timeout=10000)
  public void num2ipTest() {
    // Arrange, Act and Assert
    assertEquals("0.0.0.1", NetUtils.num2ip(1));
  }
}

