package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class AggrWhitelistDiffblueTest {
  @Test
  public void testGetWhiteList() {
    // Arrange, Act and Assert
    assertEquals(0, AggrWhitelist.getWhiteList().size());
  }

  @Test
  public void testIsAggrDataId() {
    // Arrange, Act and Assert
    assertFalse(AggrWhitelist.isAggrDataId("123"));
  }
}

