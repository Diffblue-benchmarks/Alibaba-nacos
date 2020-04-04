package com.alibaba.nacos.config.server.service.notify;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class NotifySingleServiceDiffblueTest {
  @Test
  public void testNotifySingleTaskConstructor() {
    // Arrange and Act
    NotifySingleService.NotifySingleTask actualNotifySingleTask = new NotifySingleService.NotifySingleTask("123",
        "group", "tenant", 1L, "target", null);

    // Assert
    assertEquals("123", actualNotifySingleTask.getDataId());
    assertEquals(1L, actualNotifySingleTask.getLastModified());
    assertEquals("tenant", actualNotifySingleTask.getTenant());
    assertEquals("group", actualNotifySingleTask.getGroup());
    assertEquals(3000L, actualNotifySingleTask.getTaskInterval());
  }

  @Test
  public void testNotifyTaskProcessorWrapperConstructor() {
    // Arrange, Act and Assert
    assertNull((new NotifySingleService.NotifyTaskProcessorWrapper()).serverListService);
  }
}

