package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.core.AsyncContextImpl;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

public class LongPollingServiceDiffblueTest {
  @Test
  public void testClientLongPollingConstructor() {
    // Arrange
    LongPollingService longPollingService = new LongPollingService();
    AsyncContextImpl ac = new AsyncContextImpl(new Request(new Connector()));
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    LongPollingService.ClientLongPolling actualClientLongPolling = longPollingService.new ClientLongPolling(ac,
        stringStringMap, "127.0.0.1", 3, 10L, "appName", "tag");

    // Assert
    assertEquals("appName", actualClientLongPolling.appName);
    assertEquals("127.0.0.1", actualClientLongPolling.ip);
    assertEquals(3, actualClientLongPolling.probeRequestSize);
    assertEquals(10L, actualClientLongPolling.timeoutTime);
    assertTrue(actualClientLongPolling.asyncContext instanceof AsyncContextImpl);
    assertEquals("tag", actualClientLongPolling.tag);
  }

  @Test
  public void testCollectApplicationSubscribeConfigInfos() {
    // Arrange, Act and Assert
    assertNull((new LongPollingService()).collectApplicationSubscribeConfigInfos());
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertFalse(((ScheduledThreadPoolExecutor) (new LongPollingService()).scheduler).getRemoveOnCancelPolicy());
  }

  @Test
  public void testDataChangeTaskConstructor() {
    // Arrange and Act
    LongPollingService.DataChangeTask actualDataChangeTask = (new LongPollingService()).new DataChangeTask("groupKey");

    // Assert
    assertEquals("groupKey", actualDataChangeTask.groupKey);
    assertNull(actualDataChangeTask.tag);
    assertFalse(actualDataChangeTask.isBeta);
    assertNull(actualDataChangeTask.betaIps);
  }

  @Test
  public void testDataChangeTaskConstructor2() {
    // Arrange
    LongPollingService longPollingService = new LongPollingService();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    LongPollingService.DataChangeTask actualDataChangeTask = longPollingService.new DataChangeTask("groupKey", true,
        stringList, "tag");

    // Assert
    assertEquals("groupKey", actualDataChangeTask.groupKey);
    assertEquals("tag", actualDataChangeTask.tag);
    assertTrue(actualDataChangeTask.isBeta);
  }

  @Test
  public void testDataChangeTaskConstructor3() {
    // Arrange
    LongPollingService longPollingService = new LongPollingService();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    LongPollingService.DataChangeTask actualDataChangeTask = longPollingService.new DataChangeTask("groupKey", true,
        stringList);

    // Assert
    assertEquals("groupKey", actualDataChangeTask.groupKey);
    assertNull(actualDataChangeTask.tag);
    assertTrue(actualDataChangeTask.isBeta);
  }

  @Test
  public void testGenerateResponse() {
    // Arrange
    LongPollingService longPollingService = new LongPollingService();
    MockHttpServletRequest mockHttpServletRequest = new MockHttpServletRequest();
    Response response = new Response();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    longPollingService.generateResponse(mockHttpServletRequest, response, stringList);

    // Assert
    assertNull(mockHttpServletRequest.getContentAsByteArray());
    assertNull(mockHttpServletRequest.getPathInfo());
    assertEquals("http", mockHttpServletRequest.getScheme());
  }

  @Test
  public void testGetClientSubConfigInfo() {
    // Arrange, Act and Assert
    assertEquals(0, (new LongPollingService()).getClientSubConfigInfo("Long-Pulling-Timeout").size());
  }

  @Test
  public void testGetCollectSubscribleInfo() {
    // Arrange
    LongPollingService longPollingService = new LongPollingService();

    // Act
    longPollingService.getCollectSubscribleInfo("Long-Pulling-Timeout", "Long-Pulling-Timeout", "Long-Pulling-Timeout");

    // Assert
    ScheduledExecutorService scheduledExecutorService = longPollingService.scheduler;
    assertEquals(1, ((ScheduledThreadPoolExecutor) scheduledExecutorService).getCorePoolSize());
    assertTrue(
        ((ScheduledThreadPoolExecutor) scheduledExecutorService).getExecuteExistingDelayedTasksAfterShutdownPolicy());
    assertFalse(scheduledExecutorService.isShutdown());
    assertEquals(2147483647, ((ScheduledThreadPoolExecutor) scheduledExecutorService).getMaximumPoolSize());
  }

  @Test
  public void testGetCollectSubscribleInfoByIp() {
    // Arrange
    LongPollingService longPollingService = new LongPollingService();

    // Act
    longPollingService.getCollectSubscribleInfoByIp("Long-Pulling-Timeout");

    // Assert
    assertEquals(2L, ((ScheduledThreadPoolExecutor) longPollingService.scheduler).getTaskCount());
  }

  @Test
  public void testInterest() {
    // Arrange, Act and Assert
    assertEquals(1, (new LongPollingService()).interest().size());
  }

  @Test
  public void testIsClientLongPolling() {
    // Arrange, Act and Assert
    assertFalse((new LongPollingService()).isClientLongPolling("Long-Pulling-Timeout"));
  }

  @Test
  public void testIsSupportLongPolling() {
    // Arrange, Act and Assert
    assertFalse(LongPollingService.isSupportLongPolling(new MockHttpServletRequest()));
  }

  @Test
  public void testSetRetainIps() {
    // Arrange
    LongPollingService longPollingService = new LongPollingService();
    HashMap<String, Long> stringResultLongMap = new HashMap<String, Long>();
    stringResultLongMap.put("foo", 1L);

    // Act
    longPollingService.setRetainIps(stringResultLongMap);

    // Assert
    assertSame(stringResultLongMap, longPollingService.getRetainIps());
  }
}

