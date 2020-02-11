package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DynamicDataSourceDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new DynamicDataSource()).getApplicationContext());
  }

  @Test(timeout=10000)
  public void getApplicationContextTest() {
    // Arrange, Act and Assert
    assertNull((new DynamicDataSource()).getApplicationContext());
  }
}

