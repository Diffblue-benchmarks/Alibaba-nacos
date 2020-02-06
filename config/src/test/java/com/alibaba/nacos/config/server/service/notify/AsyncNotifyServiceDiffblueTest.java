package com.alibaba.nacos.config.server.service.notify;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AsyncNotifyServiceDiffblueTest {
  @Test
  public void constructorTest4() {
    // Arrange and Act
    AsyncNotifyService.NotifySingleTask actualNotifySingleTask = new AsyncNotifyService.NotifySingleTask("123", "foo",
        "foo", 1L, "foo", true);

    // Assert
    String actualDataId = actualNotifySingleTask.getDataId();
    String actualTargetIP = actualNotifySingleTask.getTargetIP();
    long actualTaskInterval = actualNotifySingleTask.getTaskInterval();
    String actualGroup = actualNotifySingleTask.getGroup();
    int actualFailCount = actualNotifySingleTask.getFailCount();
    String actualTenant = actualNotifySingleTask.getTenant();
    assertEquals("123", actualDataId);
    assertEquals("http://foonull/v1/cs/communication/dataChange?dataId" + "=123&group=foo&tenant=foo",
        actualNotifySingleTask.url);
    assertEquals(1L, actualNotifySingleTask.getLastModified());
    assertEquals("foo", actualTenant);
    assertEquals(0, actualFailCount);
    assertEquals("foo", actualGroup);
    assertEquals(3000L, actualTaskInterval);
    assertEquals("foo", actualTargetIP);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    AsyncNotifyService.NotifySingleTask actualNotifySingleTask = new AsyncNotifyService.NotifySingleTask("123", "foo",
        "foo", "foo", 1L, "foo", true);

    // Assert
    String actualDataId = actualNotifySingleTask.getDataId();
    String actualTargetIP = actualNotifySingleTask.getTargetIP();
    long actualTaskInterval = actualNotifySingleTask.getTaskInterval();
    String actualGroup = actualNotifySingleTask.getGroup();
    int actualFailCount = actualNotifySingleTask.getFailCount();
    String actualTenant = actualNotifySingleTask.getTenant();
    assertEquals("123", actualDataId);
    assertEquals("http://foonull/v1/cs/communication/dataChange?dataId" + "=123&group=foo&tenant=foo&tag=foo",
        actualNotifySingleTask.url);
    assertEquals(1L, actualNotifySingleTask.getLastModified());
    assertEquals("foo", actualTenant);
    assertEquals(0, actualFailCount);
    assertEquals("foo", actualGroup);
    assertEquals(3000L, actualTaskInterval);
    assertEquals("foo", actualTargetIP);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    AsyncNotifyService.NotifySingleTask actualNotifySingleTask = new AsyncNotifyService.NotifySingleTask("123", "foo",
        "foo", 1L, "foo");

    // Assert
    String actualDataId = actualNotifySingleTask.getDataId();
    String actualTargetIP = actualNotifySingleTask.getTargetIP();
    long actualTaskInterval = actualNotifySingleTask.getTaskInterval();
    String actualGroup = actualNotifySingleTask.getGroup();
    int actualFailCount = actualNotifySingleTask.getFailCount();
    String actualTenant = actualNotifySingleTask.getTenant();
    assertEquals("123", actualDataId);
    assertEquals("http://foonull/v1/cs/communication/dataChange?dataId" + "=123&group=foo&tenant=foo",
        actualNotifySingleTask.url);
    assertEquals(1L, actualNotifySingleTask.getLastModified());
    assertEquals("foo", actualTenant);
    assertEquals(0, actualFailCount);
    assertEquals("foo", actualGroup);
    assertEquals(3000L, actualTaskInterval);
    assertEquals("foo", actualTargetIP);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    AsyncNotifyService.NotifySingleTask actualNotifySingleTask = new AsyncNotifyService.NotifySingleTask("123", "foo",
        "", 1L, "foo");

    // Assert
    String actualDataId = actualNotifySingleTask.getDataId();
    String actualTargetIP = actualNotifySingleTask.getTargetIP();
    long actualTaskInterval = actualNotifySingleTask.getTaskInterval();
    String actualGroup = actualNotifySingleTask.getGroup();
    int actualFailCount = actualNotifySingleTask.getFailCount();
    String actualTenant = actualNotifySingleTask.getTenant();
    assertEquals("123", actualDataId);
    assertEquals("http://foonull/v1/cs/communication/dataChange?dataId" + "=123&group=foo", actualNotifySingleTask.url);
    assertEquals(1L, actualNotifySingleTask.getLastModified());
    assertEquals("", actualTenant);
    assertEquals(0, actualFailCount);
    assertEquals("foo", actualGroup);
    assertEquals(3000L, actualTaskInterval);
    assertEquals("foo", actualTargetIP);
  }
}

