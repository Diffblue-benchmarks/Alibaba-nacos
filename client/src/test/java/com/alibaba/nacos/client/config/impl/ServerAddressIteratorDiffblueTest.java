package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ServerAddressIteratorDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    ServerAddressIterator.RandomizedServerAddress actualRandomizedServerAddress = new ServerAddressIterator.RandomizedServerAddress(
        "aaaaa");

    // Assert
    assertEquals(0, actualRandomizedServerAddress.priority);
    assertEquals("aaaaa", actualRandomizedServerAddress.serverIp);
  }
}

