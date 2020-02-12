package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleIPFlowDataDiffblueTest {
  @Test(timeout=10000)
  public void incrementAndGetTest2() {
    // Arrange, Act and Assert
    assertEquals(1, (new SimpleIPFlowData(3, 42)).incrementAndGet("127.0.0.1"));
  }

  @Test(timeout=10000)
  public void incrementAndGetTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new SimpleIPFlowData(3, 42)).incrementAndGet("foo"));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    SimpleIPFlowData simpleIPFlowData = new SimpleIPFlowData(3, 42);
    SimpleIPFlowData simpleIPFlowData1 = new SimpleIPFlowData(0, 42);
    SimpleIPFlowData simpleIPFlowData2 = new SimpleIPFlowData(3, 1);

    // Act
    SimpleIPFlowData actualSimpleIPFlowData = new SimpleIPFlowData(3, 2);

    // Assert
    assertEquals(0, simpleIPFlowData.getAverageCount());
    assertEquals(0, simpleIPFlowData1.getAverageCount());
    assertEquals(0, simpleIPFlowData2.getAverageCount());
    assertEquals(0, actualSimpleIPFlowData.getAverageCount());
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
  public void getCurrentCountTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleIPFlowData(3, 42)).getCurrentCount("127.0.0.1"));
  }

  @Test(timeout=10000)
  public void getCurrentCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleIPFlowData(3, 42)).getCurrentCount("foo"));
  }
}

