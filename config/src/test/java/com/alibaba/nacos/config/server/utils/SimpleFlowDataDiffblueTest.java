package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleFlowDataDiffblueTest {
  @Test
  public void getSlotInfoTest() {
    // Arrange, Act and Assert
    assertEquals("0 0 0", (new SimpleFlowData(3, 42)).getSlotInfo());
  }

  @Test
  public void incrementAndGetTest() {
    // Arrange
    SimpleFlowData simpleFlowData = new SimpleFlowData(3, 42);

    // Act and Assert
    assertEquals(1, simpleFlowData.incrementAndGet());
    assertEquals(1, simpleFlowData.getCurrentCount());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    SimpleFlowData actualSimpleFlowData = new SimpleFlowData(3, 42);

    // Assert
    int actualSlotCount = actualSimpleFlowData.getSlotCount();
    int actualCurrentCount = actualSimpleFlowData.getCurrentCount();
    assertEquals(3, actualSlotCount);
    assertEquals("0 0 0", actualSimpleFlowData.getSlotInfo());
    assertEquals(0, actualCurrentCount);
  }

  @Test
  public void getAverageCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleFlowData(3, 42)).getAverageCount());
  }

  @Test
  public void getCurrentCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleFlowData(3, 42)).getCurrentCount());
  }

  @Test
  public void rotateSlotTest() {
    // Arrange
    SimpleFlowData simpleFlowData = new SimpleFlowData(3, 42);

    // Act
    simpleFlowData.rotateSlot();

    // Assert
    int actualCurrentCount = simpleFlowData.getCurrentCount();
    assertEquals(0, simpleFlowData.getAverageCount());
    assertEquals(0, actualCurrentCount);
  }

  @Test
  public void addAndGetTest() {
    // Arrange
    SimpleFlowData simpleFlowData = new SimpleFlowData(3, 42);

    // Act and Assert
    assertEquals(3, simpleFlowData.addAndGet(3));
    assertEquals(3, simpleFlowData.getCurrentCount());
  }

  @Test
  public void getSlotCountTest() {
    // Arrange, Act and Assert
    assertEquals(3, (new SimpleFlowData(3, 42)).getSlotCount());
  }

  @Test
  public void getCountTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleFlowData(3, 42)).getCount(3));
  }

  @Test
  public void getCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleFlowData(3, 42)).getCount(0));
  }
}

