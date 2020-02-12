package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ClientIpWhiteListDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void isEnableWhitelistTest() {
    // Arrange, Act and Assert
    assertFalse(ClientIpWhiteList.isEnableWhitelist());
  }

  @Test(timeout=10000)
  public void isLegalClientTest2() {
    // Arrange, Act and Assert
    assertFalse(ClientIpWhiteList.isLegalClient("foo"));
  }

  @Test(timeout=10000)
  public void isLegalClientTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ClientIpWhiteList.isLegalClient("");
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    new ClientIpWhiteList();

    // Assert
    assertEquals(Boolean.valueOf(false), ClientIpWhiteList.isOpen);
  }
}

