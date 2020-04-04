package com.alibaba.nacos.config.server.service.notify;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.config.server.service.ServerListService;
import org.junit.Test;

public class NotifyTaskProcessorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new NotifyTaskProcessor(new ServerListService())).serverListService.isHealthCheck());
  }

  @Test
  public void testNotifyToDump() {
    // Arrange, Act and Assert
    assertFalse(
        (new NotifyTaskProcessor(new ServerListService())).notifyToDump("UTF-8", "UTF-8", "UTF-8", 1L, "UTF-8"));
  }
}

