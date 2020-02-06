package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ClientIpWhiteListDiffblueTest {
  @Test
  public void isEnableWhitelistTest() {
    // Arrange, Act and Assert
    assertFalse(ClientIpWhiteList.isEnableWhitelist());
  }

  @Test
  public void isLegalClientTest() {
    // Arrange, Act and Assert
    assertFalse(ClientIpWhiteList.isLegalClient("aaaaa"));
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    new ClientIpWhiteList();

    // Assert
    assertEquals(Boolean.valueOf(false), ClientIpWhiteList.isOpen);
  }
}

