package com.alibaba.nacos.config.server.service.notify;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class NotifyTaskProcessorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new NotifyTaskProcessor(null)).serverListService);
  }

  @Test
  public void testNotifyToDump() {
    // Arrange, Act and Assert
    assertFalse((new NotifyTaskProcessor(null)).notifyToDump("UTF-8", "UTF-8", "UTF-8", 1L, "UTF-8"));
  }
}

