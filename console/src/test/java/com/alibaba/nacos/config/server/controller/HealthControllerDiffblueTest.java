package com.alibaba.nacos.config.server.controller;

import static org.junit.Assert.assertNull;
import com.alibaba.nacos.config.server.service.DynamicDataSource;
import org.junit.Test;

public class HealthControllerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    DynamicDataSource dynamicDataSource = new DynamicDataSource();

    // Act
    new HealthController(dynamicDataSource);

    // Assert
    assertNull(dynamicDataSource.getApplicationContext());
  }
}

