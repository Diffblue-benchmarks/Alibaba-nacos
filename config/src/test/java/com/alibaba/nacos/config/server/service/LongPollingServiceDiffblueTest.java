package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import org.junit.Test;

public class LongPollingServiceDiffblueTest {
  @Test
  public void constructorTest4() {
    // Arrange and Act
    LongPollingService.DataChangeTask actualDataChangeTask = (new LongPollingService()).new DataChangeTask("aaaaa",
        true, null);

    // Assert
    assertEquals("aaaaa", actualDataChangeTask.groupKey);
    assertNull(actualDataChangeTask.tag);
    assertTrue(actualDataChangeTask.isBeta);
    assertNull(actualDataChangeTask.betaIps);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    LongPollingService.DataChangeTask actualDataChangeTask = (new LongPollingService()).new DataChangeTask("aaaaa",
        true, null, "aaaaa");

    // Assert
    assertEquals("aaaaa", actualDataChangeTask.groupKey);
    assertEquals("aaaaa", actualDataChangeTask.tag);
    assertTrue(actualDataChangeTask.isBeta);
    assertNull(actualDataChangeTask.betaIps);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    LongPollingService.DataChangeTask actualDataChangeTask = (new LongPollingService()).new DataChangeTask("aaaaa");

    // Assert
    assertEquals("aaaaa", actualDataChangeTask.groupKey);
    assertNull(actualDataChangeTask.tag);
    assertFalse(actualDataChangeTask.isBeta);
    assertNull(actualDataChangeTask.betaIps);
  }

  @Test
  public void getRetainIpsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new LongPollingService()).getRetainIps().size());
  }

  @Test
  public void isClientLongPollingTest() {
    // Arrange, Act and Assert
    assertFalse((new LongPollingService()).isClientLongPolling("Long-Pulling-Timeout"));
  }

  @Test
  public void interestTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new LongPollingService()).interest().size());
  }

  @Test
  public void getClientSubConfigInfoTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new LongPollingService()).getClientSubConfigInfo("Long-Pulling-Timeout").size());
  }

  @Test
  public void collectApplicationSubscribeConfigInfosTest() {
    // Arrange, Act and Assert
    assertNull((new LongPollingService()).collectApplicationSubscribeConfigInfos());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    LongPollingService actualLongPollingService = new LongPollingService();

    // Assert
    Map<String, Long> retainIps = actualLongPollingService.getRetainIps();
    ScheduledExecutorService scheduledExecutorService = actualLongPollingService.scheduler;
    Queue<LongPollingService.ClientLongPolling> queue = actualLongPollingService.allSubs;
    assertTrue(retainIps instanceof java.util.concurrent.ConcurrentHashMap);
    assertTrue(queue instanceof java.util.concurrent.ConcurrentLinkedQueue);
    assertEquals(0, retainIps.size());
    assertEquals(0, queue.size());
    assertTrue(scheduledExecutorService instanceof java.util.concurrent.ScheduledThreadPoolExecutor);
  }

  @Test
  public void setRetainIpsTest() {
    // Arrange
    LongPollingService longPollingService = new LongPollingService();

    // Act
    longPollingService.setRetainIps(null);

    // Assert
    assertNull(longPollingService.getRetainIps());
  }
}

