package com.alibaba.nacos.config.server.service.notify;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AsyncNotifyServiceDiffblueTest {
  @Test
  public void constructorTest3() {
    // Arrange and Act
    AsyncNotifyService.NotifySingleTask actualNotifySingleTask = new AsyncNotifyService.NotifySingleTask("&tag=",
        "&tag=", "&tag=", 1L, "&tag=", true);

    // Assert
    String actualDataId = actualNotifySingleTask.getDataId();
    String actualTargetIP = actualNotifySingleTask.getTargetIP();
    long actualTaskInterval = actualNotifySingleTask.getTaskInterval();
    String actualGroup = actualNotifySingleTask.getGroup();
    int actualFailCount = actualNotifySingleTask.getFailCount();
    String actualTenant = actualNotifySingleTask.getTenant();
    assertEquals("&tag=", actualDataId);
    assertEquals("http://&tag=null/v1/cs/communication/dataChange" + "?dataId=%26tag%3D&group=%26tag%3D&tenant=&tag=",
        actualNotifySingleTask.url);
    assertEquals(1L, actualNotifySingleTask.getLastModified());
    assertEquals("&tag=", actualTenant);
    assertEquals(0, actualFailCount);
    assertEquals("&tag=", actualGroup);
    assertEquals(3000L, actualTaskInterval);
    assertEquals("&tag=", actualTargetIP);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    AsyncNotifyService.NotifySingleTask actualNotifySingleTask = new AsyncNotifyService.NotifySingleTask("&tag=",
        "&tag=", "&tag=", "&tag=", 1L, "&tag=", true);

    // Assert
    String actualDataId = actualNotifySingleTask.getDataId();
    String actualTargetIP = actualNotifySingleTask.getTargetIP();
    long actualTaskInterval = actualNotifySingleTask.getTaskInterval();
    String actualGroup = actualNotifySingleTask.getGroup();
    int actualFailCount = actualNotifySingleTask.getFailCount();
    String actualTenant = actualNotifySingleTask.getTenant();
    assertEquals("&tag=", actualDataId);
    assertEquals("http://&tag=null/v1/cs/communication/dataChange" + "?dataId=%26tag%3D&group=%26tag%3D&tenant=&tag="
        + "&tag=&tag=", actualNotifySingleTask.url);
    assertEquals(1L, actualNotifySingleTask.getLastModified());
    assertEquals("&tag=", actualTenant);
    assertEquals(0, actualFailCount);
    assertEquals("&tag=", actualGroup);
    assertEquals(3000L, actualTaskInterval);
    assertEquals("&tag=", actualTargetIP);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    AsyncNotifyService.NotifySingleTask actualNotifySingleTask = new AsyncNotifyService.NotifySingleTask("&tag=",
        "&tag=", "&tag=", 1L, "&tag=");

    // Assert
    String actualDataId = actualNotifySingleTask.getDataId();
    String actualTargetIP = actualNotifySingleTask.getTargetIP();
    long actualTaskInterval = actualNotifySingleTask.getTaskInterval();
    String actualGroup = actualNotifySingleTask.getGroup();
    int actualFailCount = actualNotifySingleTask.getFailCount();
    String actualTenant = actualNotifySingleTask.getTenant();
    assertEquals("&tag=", actualDataId);
    assertEquals("http://&tag=null/v1/cs/communication/dataChange" + "?dataId=%26tag%3D&group=%26tag%3D&tenant=&tag=",
        actualNotifySingleTask.url);
    assertEquals(1L, actualNotifySingleTask.getLastModified());
    assertEquals("&tag=", actualTenant);
    assertEquals(0, actualFailCount);
    assertEquals("&tag=", actualGroup);
    assertEquals(3000L, actualTaskInterval);
    assertEquals("&tag=", actualTargetIP);
  }
}

