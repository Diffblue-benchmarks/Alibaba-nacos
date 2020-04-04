package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.connector.Request;
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
    // Arrange and Act
    LongPollingService actualLongPollingService = new LongPollingService();

    // Assert
    Map<String, Long> retainIps = actualLongPollingService.getRetainIps();
    assertTrue(retainIps instanceof java.util.concurrent.ConcurrentHashMap);
    Queue<LongPollingService.ClientLongPolling> queue = actualLongPollingService.allSubs;
    assertTrue(queue instanceof java.util.concurrent.ConcurrentLinkedQueue);
    assertEquals(0, retainIps.size());
    assertEquals(0, queue.size());
    assertTrue(actualLongPollingService.scheduler instanceof java.util.concurrent.ScheduledThreadPoolExecutor);
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
    assertEquals(1, ((ScheduledThreadPoolExecutor) longPollingService.scheduler).getLargestPoolSize());
  }

  @Test
  public void testGetCollectSubscribleInfoByIp() {
    // Arrange
    LongPollingService longPollingService = new LongPollingService();

    // Act
    longPollingService.getCollectSubscribleInfoByIp("Long-Pulling-Timeout");

    // Assert
    assertEquals(0, ((ScheduledThreadPoolExecutor) longPollingService.scheduler).getActiveCount());
    assertFalse(((ScheduledThreadPoolExecutor) longPollingService.scheduler).getRemoveOnCancelPolicy());
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

