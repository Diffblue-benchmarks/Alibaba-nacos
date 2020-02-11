package com.alibaba.nacos.config.server.constant;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CounterModeDiffblueTest {
  @Test(timeout=10000)
  public void reverseTest() {
    // Arrange, Act and Assert
    assertEquals(CounterMode.DECREMENT, CounterMode.INCREMENT.reverse());
  }
}

