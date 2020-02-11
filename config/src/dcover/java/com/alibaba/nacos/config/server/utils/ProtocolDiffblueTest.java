package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProtocolDiffblueTest {
  @Test(timeout=10000)
  public void getVersionNumberTest() {
    // Arrange, Act and Assert
    assertEquals(0, Protocol.getVersionNumber("foo"));
  }
}

