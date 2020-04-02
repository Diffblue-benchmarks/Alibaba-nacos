package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;

public class LongPollingServiceDiffblueTest {
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
}

