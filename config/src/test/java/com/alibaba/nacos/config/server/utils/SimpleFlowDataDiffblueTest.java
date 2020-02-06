package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleFlowDataDiffblueTest {
  @Test
  public void getSlotInfoTest() {
    // Arrange, Act and Assert
    assertEquals("0", (new SimpleFlowData(1, 1)).getSlotInfo());
  }

  @Test
  public void incrementAndGetTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new SimpleFlowData(1, 1)).incrementAndGet());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    SimpleFlowData actualSimpleFlowData = new SimpleFlowData(1, 1);

    // Assert
    int actualSlotCount = actualSimpleFlowData.getSlotCount();
    assertEquals(1, actualSlotCount);
    assertEquals(0, actualSimpleFlowData.getCurrentCount());
  }

  @Test
  public void getAverageCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleFlowData(1, 1)).getAverageCount());
  }

  @Test
  public void getCurrentCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleFlowData(1, 1)).getCurrentCount());
  }

  @Test
  public void rotateSlotTest() {
    // Arrange
    SimpleFlowData simpleFlowData = new SimpleFlowData(1, 1);

    // Act
    simpleFlowData.rotateSlot();

    // Assert
    int actualCurrentCount = simpleFlowData.getCurrentCount();
    assertEquals(0, simpleFlowData.getAverageCount());
    assertEquals(0, actualCurrentCount);
  }

  @Test
  public void addAndGetTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new SimpleFlowData(1, 1)).addAndGet(1));
  }

  @Test
  public void getSlotCountTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new SimpleFlowData(1, 1)).getSlotCount());
  }

  @Test
  public void getCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleFlowData(1, 1)).getCount(1));
  }
}

