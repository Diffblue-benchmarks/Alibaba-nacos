package com.alibaba.nacos.client.naming.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class InitUtilsDiffblueTest {
  @Test(timeout=10000)
  public void initEndpointTest() {
    // Arrange, Act and Assert
    assertEquals("", InitUtils.initEndpoint(null));
  }
}

