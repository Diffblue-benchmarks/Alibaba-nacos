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
import org.apache.catalina.connector.Connector;
import org.apache.catalina.connector.Request;
import org.apache.catalina.core.AsyncContextImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class LongPollingServiceDiffblueTest {
  @Autowired
  private LongPollingService longPollingService;
  @Test
  public void testClientLongPollingConstructor() {
    // Arrange
    AsyncContextImpl ac = new AsyncContextImpl(new Request(new Connector()));
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    LongPollingService.ClientLongPolling actualClientLongPolling = this.longPollingService.new ClientLongPolling(ac,
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
    assertNull(this.longPollingService.collectApplicationSubscribeConfigInfos());
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
    LongPollingService.DataChangeTask actualDataChangeTask = this.longPollingService.new DataChangeTask("groupKey");

    // Assert
    assertEquals("groupKey", actualDataChangeTask.groupKey);
    assertNull(actualDataChangeTask.tag);
    assertFalse(actualDataChangeTask.isBeta);
    assertNull(actualDataChangeTask.betaIps);
  }
  @Test
  public void testDataChangeTaskConstructor2() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    LongPollingService.DataChangeTask actualDataChangeTask = this.longPollingService.new DataChangeTask("groupKey",
        true, stringList, "tag");

    // Assert
    assertEquals("groupKey", actualDataChangeTask.groupKey);
    assertEquals("tag", actualDataChangeTask.tag);
    assertTrue(actualDataChangeTask.isBeta);
  }
  @Test
  public void testDataChangeTaskConstructor3() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    LongPollingService.DataChangeTask actualDataChangeTask = this.longPollingService.new DataChangeTask("groupKey",
        true, stringList);

    // Assert
    assertEquals("groupKey", actualDataChangeTask.groupKey);
    assertNull(actualDataChangeTask.tag);
    assertTrue(actualDataChangeTask.isBeta);
  }
  @Test
  public void testGetClientSubConfigInfo() {
    // Arrange, Act and Assert
    assertEquals(0, this.longPollingService.getClientSubConfigInfo("Long-Pulling-Timeout").size());
  }
  @Test
  public void testInterest() {
    // Arrange, Act and Assert
    assertEquals(1, this.longPollingService.interest().size());
  }
  @Test
  public void testIsClientLongPolling() {
    // Arrange, Act and Assert
    assertFalse(this.longPollingService.isClientLongPolling("Long-Pulling-Timeout"));
  }
  @Test
  public void testIsSupportLongPolling() {
    // Arrange, Act and Assert
    assertFalse(LongPollingService.isSupportLongPolling(new MockHttpServletRequest()));
  }
  @Test
  public void testIsSupportLongPolling2() {
    // Arrange
    MockHttpServletRequest mockHttpServletRequest = new MockHttpServletRequest();
    mockHttpServletRequest.addHeader("Long-Pulling-Timeout", "foo");

    // Act and Assert
    assertTrue(LongPollingService.isSupportLongPolling(mockHttpServletRequest));
  }
  @Test
  public void testSetRetainIps() {
    // Arrange
    HashMap<String, Long> stringResultLongMap = new HashMap<String, Long>();
    stringResultLongMap.put("foo", 1L);

    // Act
    this.longPollingService.setRetainIps(stringResultLongMap);

    // Assert
    assertSame(stringResultLongMap, this.longPollingService.getRetainIps());
  }
}

