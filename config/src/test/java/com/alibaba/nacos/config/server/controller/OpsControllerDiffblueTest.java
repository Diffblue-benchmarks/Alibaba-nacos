package com.alibaba.nacos.config.server.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.alibaba.nacos.config.server.service.PersistService;
import org.junit.Test;

public class OpsControllerDiffblueTest {
  @Test
  public void setLogLevelTest() {
    // Arrange, Act and Assert
    assertEquals("200", (new OpsController(new PersistService(), null)).setLogLevel("aaaaa", "aaaaa"));
  }

  @Test
  public void constructorTest() {
    // Arrange
    PersistService persistService = new PersistService();

    // Act and Assert
    assertSame((new OpsController(persistService, null)).persistService, persistService);
  }
}

