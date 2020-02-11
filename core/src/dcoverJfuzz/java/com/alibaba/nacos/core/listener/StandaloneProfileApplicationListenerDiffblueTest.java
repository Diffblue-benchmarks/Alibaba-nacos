package com.alibaba.nacos.core.listener;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StandaloneProfileApplicationListenerDiffblueTest {
  @Test(timeout=10000)
  public void getOrderTest() {
    // Arrange, Act and Assert
    assertEquals(-2147483648, (new StandaloneProfileApplicationListener()).getOrder());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(-2147483648, (new StandaloneProfileApplicationListener()).getOrder());
  }
}

