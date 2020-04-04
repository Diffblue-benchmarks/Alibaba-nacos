package com.alibaba.nacos.config.server.service.notify;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.config.server.service.ServerListService;
import org.junit.Test;

public class AsyncNotifyServiceDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    ServerListService serverListService = new ServerListService();

    // Act
    new AsyncNotifyService(serverListService);

    // Assert
    assertTrue(serverListService.isHealthCheck());
  }

  @Test
  public void testGetExecutor() {
    // Arrange, Act and Assert
    assertTrue((new AsyncNotifyService(new ServerListService()))
        .getExecutor() instanceof java.util.concurrent.ScheduledThreadPoolExecutor);
  }

  @Test
  public void testInterest() {
    // Arrange, Act and Assert
    assertEquals(1, (new AsyncNotifyService(new ServerListService())).interest().size());
  }

  @Test
  public void testNotifySingleTaskConstructor() {
    // Arrange and Act
    AsyncNotifyService.NotifySingleTask actualNotifySingleTask = new AsyncNotifyService.NotifySingleTask("&tag=",
        "&tag=", "", 1L, "&tag=");

    // Assert
    assertEquals("&tag=", actualNotifySingleTask.getDataId());
    assertEquals("http://&tag=null/v1/cs/communication/dataChange" + "?dataId=%26tag%3D&group=%26tag%3D",
        actualNotifySingleTask.url);
    assertEquals(1L, actualNotifySingleTask.getLastModified());
    assertEquals("", actualNotifySingleTask.getTenant());
    assertEquals(0, actualNotifySingleTask.getFailCount());
    assertEquals("&tag=", actualNotifySingleTask.getGroup());
    assertEquals(3000L, actualNotifySingleTask.getTaskInterval());
    assertEquals("&tag=", actualNotifySingleTask.getTargetIP());
  }

  @Test
  public void testNotifySingleTaskConstructor2() {
    // Arrange and Act
    AsyncNotifyService.NotifySingleTask actualNotifySingleTask = new AsyncNotifyService.NotifySingleTask("&tag=",
        "&tag=", "&tag=", 1L, "&tag=");

    // Assert
    assertEquals("&tag=", actualNotifySingleTask.getDataId());
    assertEquals("http://&tag=null/v1/cs/communication/dataChange" + "?dataId=%26tag%3D&group=%26tag%3D&tenant=&tag=",
        actualNotifySingleTask.url);
    assertEquals(1L, actualNotifySingleTask.getLastModified());
    assertEquals("&tag=", actualNotifySingleTask.getTenant());
    assertEquals(0, actualNotifySingleTask.getFailCount());
    assertEquals("&tag=", actualNotifySingleTask.getGroup());
    assertEquals(3000L, actualNotifySingleTask.getTaskInterval());
    assertEquals("&tag=", actualNotifySingleTask.getTargetIP());
  }

  @Test
  public void testNotifySingleTaskConstructor3() {
    // Arrange and Act
    AsyncNotifyService.NotifySingleTask actualNotifySingleTask = new AsyncNotifyService.NotifySingleTask("&tag=",
        "&tag=", "&tag=", "&tag=", 1L, "&tag=", true);

    // Assert
    assertEquals("&tag=", actualNotifySingleTask.getDataId());
    assertEquals("http://&tag=null/v1/cs/communication/dataChange" + "?dataId=%26tag%3D&group=%26tag%3D&tenant=&tag="
        + "&tag=&tag=", actualNotifySingleTask.url);
    assertEquals(1L, actualNotifySingleTask.getLastModified());
    assertEquals("&tag=", actualNotifySingleTask.getTenant());
    assertEquals(0, actualNotifySingleTask.getFailCount());
    assertEquals("&tag=", actualNotifySingleTask.getGroup());
    assertEquals(3000L, actualNotifySingleTask.getTaskInterval());
    assertEquals("&tag=", actualNotifySingleTask.getTargetIP());
  }

  @Test
  public void testNotifySingleTaskConstructor4() {
    // Arrange and Act
    AsyncNotifyService.NotifySingleTask actualNotifySingleTask = new AsyncNotifyService.NotifySingleTask("&tag=",
        "&tag=", "&tag=", 1L, "&tag=", true);

    // Assert
    assertEquals("&tag=", actualNotifySingleTask.getDataId());
    assertEquals("http://&tag=null/v1/cs/communication/dataChange" + "?dataId=%26tag%3D&group=%26tag%3D&tenant=&tag=",
        actualNotifySingleTask.url);
    assertEquals(1L, actualNotifySingleTask.getLastModified());
    assertEquals("&tag=", actualNotifySingleTask.getTenant());
    assertEquals(0, actualNotifySingleTask.getFailCount());
    assertEquals("&tag=", actualNotifySingleTask.getGroup());
    assertEquals(3000L, actualNotifySingleTask.getTaskInterval());
    assertEquals("&tag=", actualNotifySingleTask.getTargetIP());
  }

  @Test
  public void testNotifySingleTaskSetFailCount() {
    // Arrange
    AsyncNotifyService.NotifySingleTask notifySingleTask = new AsyncNotifyService.NotifySingleTask("&tag=", "&tag=",
        "&tag=", 1L, "&tag=");

    // Act
    notifySingleTask.setFailCount(3);

    // Assert
    assertEquals(3, notifySingleTask.getFailCount());
  }
}

