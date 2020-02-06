package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ClientRecordDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new ClientRecord("foo")).ip);
  }
}

