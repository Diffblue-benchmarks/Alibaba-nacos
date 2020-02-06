package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.junit.Test;

public class ClientTrackServiceDiffblueTest {
  @Test
  public void listSubscriberByGroupTest() {
    // Arrange, Act and Assert
    assertEquals(0, ClientTrackService.listSubscriberByGroup("aaaaa").size());
  }

  @Test
  public void isClientUptodateTest() {
    // Arrange, Act and Assert
    assertEquals(0, ClientTrackService.isClientUptodate("aaaaa").size());
  }

  @Test
  public void listSubStatusTest() {
    // Arrange, Act and Assert
    assertEquals(0, ClientTrackService.listSubStatus("aaaaa").size());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    ConcurrentMap<String, ClientRecord> stringClientRecordMap = (new ClientTrackService()).clientRecords;
    ConcurrentMap<String, ClientRecord> stringClientRecordMap1 = ClientTrackService.clientRecords;
    assertSame(stringClientRecordMap, stringClientRecordMap1);
    assertTrue(stringClientRecordMap1 instanceof ConcurrentHashMap);
    assertSame(stringClientRecordMap, stringClientRecordMap1);
    assertEquals(0, stringClientRecordMap1.size());
  }

  @Test
  public void listSubsByGroupTest() {
    // Arrange, Act and Assert
    assertEquals(0, ClientTrackService.listSubsByGroup("aaaaa").size());
  }

  @Test
  public void subscriberCountTest() {
    // Arrange, Act and Assert
    assertEquals(0L, ClientTrackService.subscriberCount());
  }
}

