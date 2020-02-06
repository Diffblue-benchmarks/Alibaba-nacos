package com.alibaba.nacos.config.server.controller;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class HistoryControllerDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new HistoryController()).persistService);
  }
}

