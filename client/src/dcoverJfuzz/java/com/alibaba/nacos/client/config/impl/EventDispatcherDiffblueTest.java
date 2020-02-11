package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EventDispatcherDiffblueTest {
  @Test(timeout=10000)
  public void getListenerListTest() {
    // Arrange, Act and Assert
    assertEquals(0, EventDispatcher.getListenerList(null).size());
  }
}

