package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleIPFlowDataDiffblueTest {
  @Test
  public void incrementAndGetTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new SimpleIPFlowData(1, 1)).incrementAndGet("aaaaa"));
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleIPFlowData(1, 1)).getAverageCount());
  }

  @Test
  public void getAverageCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleIPFlowData(1, 1)).getAverageCount());
  }

  @Test
  public void getCurrentCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SimpleIPFlowData(1, 1)).getCurrentCount("aaaaa"));
  }
}

