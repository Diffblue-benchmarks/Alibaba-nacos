package com.alibaba.nacos.core.listener;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StandaloneProfileApplicationListenerDiffblueTest {
  @Test
  public void getOrderTest() {
    // Arrange, Act and Assert
    assertEquals(-2147483648, (new StandaloneProfileApplicationListener()).getOrder());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(-2147483648, (new StandaloneProfileApplicationListener()).getOrder());
  }
}

