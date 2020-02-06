package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ServerAddressIteratorDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    ServerAddressIterator.RandomizedServerAddress actualRandomizedServerAddress = new ServerAddressIterator.RandomizedServerAddress(
        "127.0.0.1");

    // Assert
    assertEquals(0, actualRandomizedServerAddress.priority);
    assertEquals("127.0.0.1", actualRandomizedServerAddress.serverIp);
  }
}

