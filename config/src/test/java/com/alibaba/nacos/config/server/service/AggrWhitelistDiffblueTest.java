package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class AggrWhitelistDiffblueTest {
  @Test
  public void isAggrDataIdTest() {
    // Arrange, Act and Assert
    assertFalse(AggrWhitelist.isAggrDataId("aaaaa"));
  }
}

