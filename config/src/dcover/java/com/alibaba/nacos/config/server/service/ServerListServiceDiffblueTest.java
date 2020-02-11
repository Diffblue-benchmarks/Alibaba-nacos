package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ServerListServiceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void isHealthCheckTest() {
    // Arrange, Act and Assert
    assertTrue((new ServerListService()).isHealthCheck());
  }

  @Test(timeout=10000)
  public void isFirstIpTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    ServerListService.isFirstIp();
  }

  @Test(timeout=10000)
  public void getEnvIdTest() {
    // Arrange, Act and Assert
    assertEquals("", (new ServerListService()).getEnvId());
  }

  @Test(timeout=10000)
  public void getServerListTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServerListService()).getServerList().size());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertTrue((new ServerListService()).isHealthCheck());
  }

  @Test(timeout=10000)
  public void isAddressServerHealthTest() {
    // Arrange, Act and Assert
    assertTrue(ServerListService.isAddressServerHealth());
  }

  @Test(timeout=10000)
  public void isInIpListTest() {
    // Arrange, Act and Assert
    assertTrue(ServerListService.isInIpList());
  }
}

