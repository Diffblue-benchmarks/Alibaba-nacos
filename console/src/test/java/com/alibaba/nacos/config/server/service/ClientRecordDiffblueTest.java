package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ClientRecordDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("clientIp", (new ClientRecord("clientIp")).ip);
  }
}

