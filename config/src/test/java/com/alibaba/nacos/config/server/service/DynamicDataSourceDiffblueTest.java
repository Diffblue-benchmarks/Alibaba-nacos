package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class DynamicDataSourceDiffblueTest {
  @Test
  public void setApplicationContextTest() {
    // Arrange
    DynamicDataSource dynamicDataSource = new DynamicDataSource();

    // Act
    dynamicDataSource.setApplicationContext(null);

    // Assert
    assertNull(dynamicDataSource.getApplicationContext());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new DynamicDataSource()).getApplicationContext());
  }

  @Test
  public void getApplicationContextTest() {
    // Arrange, Act and Assert
    assertNull((new DynamicDataSource()).getApplicationContext());
  }
}

