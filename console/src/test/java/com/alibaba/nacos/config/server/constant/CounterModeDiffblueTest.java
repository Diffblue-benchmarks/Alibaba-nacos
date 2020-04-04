package com.alibaba.nacos.config.server.constant;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CounterModeDiffblueTest {
  @Test
  public void testReverse() {
    // Arrange, Act and Assert
    assertEquals(CounterMode.DECREMENT, CounterMode.INCREMENT.reverse());
  }

  @Test
  public void testReverse2() {
    // Arrange, Act and Assert
    assertEquals(CounterMode.INCREMENT, CounterMode.DECREMENT.reverse());
  }
}

