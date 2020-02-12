package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleIPFlowDataDiffblueTest {
  @Test(timeout=10000)
  public void incrementAndGetTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new SimpleIPFlowData(3, 42)).incrementAndGet("127.0.0.1"));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleIPFlowData(3, 42)).getAverageCount());
  }

  @Test(timeout=10000)
  public void getAverageCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleIPFlowData(3, 42)).getAverageCount());
  }

  @Test(timeout=10000)
  public void rotateSlotTest() {
    // Arrange
    SimpleIPFlowData simpleIPFlowData = new SimpleIPFlowData(3, 42);

    // Act
    simpleIPFlowData.rotateSlot();

    // Assert
    assertEquals(0, simpleIPFlowData.getAverageCount());
  }

  @Test(timeout=10000)
  public void getCurrentCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleIPFlowData(3, 42)).getCurrentCount("127.0.0.1"));
  }
}

