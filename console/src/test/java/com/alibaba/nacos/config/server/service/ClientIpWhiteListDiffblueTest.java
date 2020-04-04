package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ClientIpWhiteListDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    new ClientIpWhiteList();

    // Assert
    assertFalse(ClientIpWhiteList.isOpen);
  }

  @Test
  public void testIsEnableWhitelist() {
    // Arrange, Act and Assert
    assertFalse(ClientIpWhiteList.isEnableWhitelist());
  }

  @Test
  public void testIsLegalClient() {
    // Arrange, Act and Assert
    assertFalse(ClientIpWhiteList.isLegalClient("clientIp"));
  }
}

