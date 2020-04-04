package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleFlowDataDiffblueTest {
  @Test
  public void testAddAndGet() {
    // Arrange
    SimpleFlowData simpleFlowData = new SimpleFlowData(3, 42);

    // Act and Assert
    assertEquals(3, simpleFlowData.addAndGet(3));
    assertEquals(3, simpleFlowData.getCurrentCount());
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    SimpleFlowData actualSimpleFlowData = new SimpleFlowData(3, 42);

    // Assert
    assertEquals(3, actualSimpleFlowData.getSlotCount());
    assertEquals("0 0 0", actualSimpleFlowData.getSlotInfo());
    assertEquals(0, actualSimpleFlowData.getCurrentCount());
  }

  @Test
  public void testGetCount() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleFlowData(3, 42)).getCount(3));
  }

  @Test
  public void testGetCount2() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleFlowData(3, 42)).getCount(0));
  }

  @Test
  public void testGetCount3() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleFlowData(3, 1)).getCount(0));
  }

  @Test
  public void testGetCurrentCount() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleFlowData(3, 42)).getCurrentCount());
  }

  @Test
  public void testGetSlotInfo() {
    // Arrange, Act and Assert
    assertEquals("0 0 0", (new SimpleFlowData(3, 42)).getSlotInfo());
  }

  @Test
  public void testGetSlotInfo2() {
    // Arrange, Act and Assert
    assertEquals("0 0 0", (new SimpleFlowData(3, 1)).getSlotInfo());
  }

  @Test
  public void testIncrementAndGet() {
    // Arrange
    SimpleFlowData simpleFlowData = new SimpleFlowData(3, 42);

    // Act and Assert
    assertEquals(1, simpleFlowData.incrementAndGet());
    assertEquals(1, simpleFlowData.getCurrentCount());
  }

  @Test
  public void testRotateSlot() {
    // Arrange
    SimpleFlowData simpleFlowData = new SimpleFlowData(3, 42);

    // Act
    simpleFlowData.rotateSlot();

    // Assert
    assertEquals(0, simpleFlowData.getAverageCount());
    assertEquals(0, simpleFlowData.getCurrentCount());
  }
}

