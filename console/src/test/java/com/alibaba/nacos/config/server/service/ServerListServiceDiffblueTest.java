package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ServerListServiceDiffblueTest {
  @Test
  public void testGetServerListUnhealth() {
    // Arrange, Act and Assert
    assertEquals(0, ServerListService.getServerListUnhealth().size());
  }

  @Test
  public void testIsAddressServerHealth() {
    // Arrange, Act and Assert
    assertTrue(ServerListService.isAddressServerHealth());
  }

  @Test
  public void testIsInIpList() {
    // Arrange, Act and Assert
    assertTrue(ServerListService.isInIpList());
  }
}

