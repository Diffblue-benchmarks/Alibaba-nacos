package com.alibaba.nacos.client.naming.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SignUtilDiffblueTest {
  @Test(timeout=10000)
  public void signTest() throws Exception {
    // Arrange, Act and Assert
    assertEquals("sputg0LPIDrWDLp2X2pdKQ6NJiI=", SignUtil.sign("foo", "foo"));
  }
}

