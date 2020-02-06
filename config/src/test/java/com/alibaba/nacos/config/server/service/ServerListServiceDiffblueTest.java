package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ServerListServiceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void isFirstIpTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ServerListService.isFirstIp();
  }

  @Test
  public void isAddressServerHealthTest() {
    // Arrange, Act and Assert
    assertTrue(ServerListService.isAddressServerHealth());
  }

  @Test
  public void isInIpListTest() {
    // Arrange, Act and Assert
    assertTrue(ServerListService.isInIpList());
  }
}

