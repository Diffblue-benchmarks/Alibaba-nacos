package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProtocolDiffblueTest {
  @Test
  public void testGetVersionNumber() {
    // Arrange
    int actualVersionNumber = Protocol.getVersionNumber("0.8.9");
    int actualVersionNumber1 = Protocol.getVersionNumber("\\.");

    // Act and Assert
    assertEquals(89, actualVersionNumber);
    assertEquals(0, actualVersionNumber1);
    assertEquals(-1, Protocol.getVersionNumber(null));
  }
}

