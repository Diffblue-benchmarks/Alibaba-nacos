package com.alibaba.nacos.config.server.service.notify;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.config.server.service.ServerListService;
import java.util.List;
import org.junit.Test;

public class AsyncNotifyServiceDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest8() {
    // Arrange and Act
    AsyncNotifyService.NotifySingleTask actualNotifySingleTask = new AsyncNotifyService.NotifySingleTask("123", "foo",
        "", 1L, "foo", true);

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

  @Test(timeout=10000)
  public void constructorTest7() {
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

  @Test(timeout=10000)
  public void constructorTest6() {
    // Arrange and Act
    AsyncNotifyService.NotifySingleTask actualNotifySingleTask = new AsyncNotifyService.NotifySingleTask("123", "foo",
        "", "foo", 1L, "foo", true);

    // Assert
    String actualDataId = actualNotifySingleTask.getDataId();
    String actualTargetIP = actualNotifySingleTask.getTargetIP();
    long actualTaskInterval = actualNotifySingleTask.getTaskInterval();
    String actualGroup = actualNotifySingleTask.getGroup();
    int actualFailCount = actualNotifySingleTask.getFailCount();
    String actualTenant = actualNotifySingleTask.getTenant();
    assertEquals("123", actualDataId);
    assertEquals("http://foonull/v1/cs/communication/dataChange?dataId" + "=123&group=foo&tag=foo",
        actualNotifySingleTask.url);
    assertEquals(1L, actualNotifySingleTask.getLastModified());
    assertEquals("", actualTenant);
    assertEquals(0, actualFailCount);
    assertEquals("foo", actualGroup);
    assertEquals(3000L, actualTaskInterval);
    assertEquals("foo", actualTargetIP);
  }

  @Test(timeout=10000)
  public void constructorTest5() {
    // Arrange and Act
    AsyncNotifyService.NotifySingleTask actualNotifySingleTask = new AsyncNotifyService.NotifySingleTask("123", "foo",
        "foo", "", 1L, "foo", true);

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

  @Test(timeout=10000)
  public void constructorTest4() {
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

  @Test(timeout=10000)
  public void constructorTest3() {
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

  @Test(timeout=10000)
  public void constructorTest2() {
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

  @Test(timeout=10000)
  public void getExecutorTest() {
    // Arrange, Act and Assert
    assertTrue((new AsyncNotifyService(new ServerListService()))
        .getExecutor() instanceof java.util.concurrent.ScheduledThreadPoolExecutor);
  }

  @Test(timeout=10000)
  public void interestTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new AsyncNotifyService(new ServerListService())).interest().size());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ServerListService serverListService = new ServerListService();

    // Act and Assert
    assertTrue((new AsyncNotifyService(serverListService))
        .getExecutor() instanceof java.util.concurrent.ScheduledThreadPoolExecutor);
    List<String> serverList = serverListService.getServerList();
    boolean actualIsHealthCheckResult = serverListService.isHealthCheck();
    String actualString = serverListService.domainName;
    String actualString1 = serverListService.envIdUrl;
    String actualString2 = serverListService.addressUrl;
    String actualString3 = serverListService.addressPort;
    String actualString4 = serverListService.serverPort;
    assertTrue(serverList instanceof java.util.ArrayList);
    assertNull(serverListService.addressServerUrl);
    assertEquals(0, serverList.size());
    assertNull(actualString4);
    assertNull(actualString3);
    assertNull(actualString2);
    assertNull(actualString1);
    assertNull(actualString);
    assertTrue(actualIsHealthCheckResult);
  }
}

