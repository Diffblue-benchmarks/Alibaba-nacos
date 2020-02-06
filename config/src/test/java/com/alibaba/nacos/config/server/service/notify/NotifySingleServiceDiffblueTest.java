package com.alibaba.nacos.config.server.service.notify;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class NotifySingleServiceDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new NotifySingleService.NotifyTaskProcessorWrapper()).serverListService);
  }
}

