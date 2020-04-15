package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.junit.Test;

public class ClientTrackServiceDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    ConcurrentMap<String, ClientRecord> stringClientRecordMap = (new ClientTrackService()).clientRecords;
    ConcurrentMap<String, ClientRecord> stringClientRecordMap1 = ClientTrackService.clientRecords;
    assertSame(stringClientRecordMap, stringClientRecordMap1);
    assertTrue(stringClientRecordMap1 instanceof ConcurrentHashMap);
    assertSame(stringClientRecordMap, stringClientRecordMap1);
    assertEquals(0, stringClientRecordMap1.size());
  }

  @Test
  public void testListSubsByGroup() {
    // Arrange, Act and Assert
    assertEquals(0, ClientTrackService.listSubsByGroup("groupKey").size());
  }

  @Test
  public void testSubscriberCount() {
    // Arrange, Act and Assert
    assertEquals(0L, ClientTrackService.subscriberCount());
  }
}

