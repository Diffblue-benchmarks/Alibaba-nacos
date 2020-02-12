package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ClientIpWhiteListDiffblueTest {
  @Test(timeout=10000)
  public void isEnableWhitelistTest() {
    // Arrange, Act and Assert
    assertFalse(ClientIpWhiteList.isEnableWhitelist());
  }

  @Test(timeout=10000)
  public void isLegalClientTest() {
    // Arrange, Act and Assert
    assertFalse(ClientIpWhiteList.isLegalClient("foo"));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    new ClientIpWhiteList();

    // Assert
    assertEquals(Boolean.valueOf(false), ClientIpWhiteList.isOpen);
  }
}

