package com.alibaba.nacos.config.server.service.notify;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.alibaba.nacos.config.server.service.ServerListService;
import org.junit.Test;

public class NotifySingleServiceDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertNull((new NotifySingleService.NotifyTaskProcessorWrapper()).serverListService);
  }

  @Test(timeout=10000)
  public void getExecutorsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NotifySingleService(new ServerListService())).getExecutors().size());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NotifySingleService(new ServerListService())).getExecutors().size());
  }
}

