package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DynamicDataSourceDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new DynamicDataSource()).getApplicationContext());
  }
}

