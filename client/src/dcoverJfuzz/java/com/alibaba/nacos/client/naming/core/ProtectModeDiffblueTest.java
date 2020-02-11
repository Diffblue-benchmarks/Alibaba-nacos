package com.alibaba.nacos.client.naming.core;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProtectModeDiffblueTest {
  @Test(timeout=10000)
  public void getProtectThresholdTest() {
    // Arrange, Act and Assert
    assertEquals(0.8f, (new ProtectMode()).getProtectThreshold(), 0.0f);
  }

  @Test(timeout=10000)
  public void setProtectThresholdTest() {
    // Arrange
    ProtectMode protectMode = new ProtectMode();

    // Act
    protectMode.setProtectThreshold(10.0f);

    // Assert
    assertEquals(10.0f, protectMode.getProtectThreshold(), 0.0f);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0.8f, (new ProtectMode()).getProtectThreshold(), 0.0f);
  }
}

