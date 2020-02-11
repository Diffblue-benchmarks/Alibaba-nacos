package com.alibaba.nacos.config.server.service.notify;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import com.alibaba.nacos.config.server.service.ServerListService;
import org.junit.Test;

public class NotifyTaskProcessorDiffblueTest {
  @Test(timeout=10000)
  public void notifyToDumpTest() {
    // Arrange, Act and Assert
    assertFalse((new NotifyTaskProcessor(new ServerListService())).notifyToDump("123", "foo", "foo", 1L, "foo"));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ServerListService serverListService = new ServerListService();

    // Act and Assert
    assertSame((new NotifyTaskProcessor(serverListService)).serverListService, serverListService);
  }
}

