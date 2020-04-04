package com.alibaba.nacos.core.listener;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StandaloneProfileApplicationListenerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(-2147483648, (new StandaloneProfileApplicationListener()).getOrder());
  }

  @Test
  public void testGetOrder() {
    // Arrange, Act and Assert
    assertEquals(-2147483648, (new StandaloneProfileApplicationListener()).getOrder());
  }
}

