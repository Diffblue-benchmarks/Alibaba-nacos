package com.alibaba.nacos.config.server.controller;

import static org.junit.Assert.assertSame;
import com.alibaba.nacos.config.server.service.PersistService;
import com.alibaba.nacos.config.server.service.dump.DumpService;
import org.junit.Test;

public class OpsControllerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    PersistService persistService = new PersistService();

    // Act and Assert
    assertSame((new OpsController(persistService, new DumpService())).persistService, persistService);
  }
}

