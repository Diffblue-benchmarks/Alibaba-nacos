package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleIPFlowDataDiffblueTest {
  @Test
  public void incrementAndGetTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new SimpleIPFlowData(3, 42)).incrementAndGet("127.0.0.1"));
  }

  @Test
  public void constructorTest() {
    // Arrange
    SimpleIPFlowData simpleIPFlowData = new SimpleIPFlowData(3, 42);

    // Act
    SimpleIPFlowData actualSimpleIPFlowData = new SimpleIPFlowData(0, 42);

    // Assert
    assertEquals(0, simpleIPFlowData.getAverageCount());
    assertEquals(0, actualSimpleIPFlowData.getAverageCount());
  }

  @Test
  public void getAverageCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleIPFlowData(3, 42)).getAverageCount());
  }

  @Test
  public void rotateSlotTest2() {
    // Arrange
    SimpleIPFlowData simpleIPFlowData = new SimpleIPFlowData(3, 42);

    // Act
    simpleIPFlowData.rotateSlot();

    // Assert
    assertEquals(0, simpleIPFlowData.getAverageCount());
  }

  @Test
  public void rotateSlotTest() {
    // Arrange
    SimpleIPFlowData simpleIPFlowData = new SimpleIPFlowData(3, 2147483647);

    // Act
    simpleIPFlowData.rotateSlot();

    // Assert
    assertEquals(0, simpleIPFlowData.getAverageCount());
  }

  @Test
  public void getCurrentCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleIPFlowData(3, 42)).getCurrentCount("127.0.0.1"));
  }
}

