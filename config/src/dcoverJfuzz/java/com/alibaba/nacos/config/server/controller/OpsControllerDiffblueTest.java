package com.alibaba.nacos.config.server.controller;

import static org.junit.Assert.assertSame;
import com.alibaba.nacos.config.server.service.PersistService;
import org.junit.Test;

public class OpsControllerDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    PersistService persistService = new PersistService();

    // Act and Assert
    assertSame(persistService, (new OpsController(persistService, null)).persistService);
  }
}

