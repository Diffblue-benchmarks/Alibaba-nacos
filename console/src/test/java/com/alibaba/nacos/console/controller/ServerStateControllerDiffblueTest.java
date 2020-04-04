package com.alibaba.nacos.console.controller;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ServerStateControllerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    new ServerStateController();

    // Assert
    assertNull(ServerStateController.VERSION);
  }
}

