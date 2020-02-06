package com.alibaba.nacos.naming.push;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.net.InetSocketAddress;
import java.util.concurrent.ConcurrentHashMap;
import org.junit.Test;

public class PushServiceDiffblueTest {
  @Test
  public void constructorTest5() {
    // Arrange
    PushService.Receiver.AckEntry ackEntry = new PushService.Receiver.AckEntry("foo", null);

    // Act and Assert
    assertSame(ackEntry, (new PushService.Retransmitter(ackEntry)).ackEntry);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    PushService.Receiver.AckPacket actualAckPacket = new PushService.Receiver.AckPacket();

    // Assert
    assertNull(actualAckPacket.data);
    assertEquals(0L, actualAckPacket.lastRefTime);
    assertNull(actualAckPacket.type);
  }

  @Test
  public void increaseRetryTimeTest() {
    // Arrange
    PushService.Receiver.AckEntry ackEntry = new PushService.Receiver.AckEntry("foo", null);

    // Act
    ackEntry.increaseRetryTime();

    // Assert
    assertEquals(1, ackEntry.getRetryTimes());
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    PushService.Receiver.AckEntry actualAckEntry = new PushService.Receiver.AckEntry("foo", null);

    // Assert
    assertEquals(0, actualAckEntry.getRetryTimes());
    assertNull(actualAckEntry.origin);
    assertEquals("foo", actualAckEntry.key);
  }

  @Test
  public void getRetryTimesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PushService.Receiver.AckEntry("foo", null)).getRetryTimes());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    PushService.PushClient actualPushClient = (new PushService()).new PushClient("123", "name", "foo", "foo", null,
        null, "foo", "foo");

    // Assert
    String actualNamespaceId = actualPushClient.getNamespaceId();
    InetSocketAddress actualSocketAddr = actualPushClient.getSocketAddr();
    String actualClusters = actualPushClient.getClusters();
    String actualTenant = actualPushClient.getTenant();
    DataSource actualDataSource = actualPushClient.getDataSource();
    String actualAgent = actualPushClient.getAgent();
    String actualServiceName = actualPushClient.getServiceName();
    assertEquals("123", actualNamespaceId);
    assertEquals("foo", actualPushClient.getApp());
    assertEquals("name", actualServiceName);
    assertEquals("foo", actualAgent);
    assertNull(actualDataSource);
    assertEquals("foo", actualTenant);
    assertEquals("foo", actualClusters);
    assertNull(actualSocketAddr);
  }

  @Test
  public void setFailedPushTest() {
    // Arrange
    PushService pushService = new PushService();

    // Act
    pushService.setFailedPush(1);

    // Assert
    assertEquals(1, pushService.getFailedPushCount());
  }

  @Test
  public void getFailedPushCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PushService()).getFailedPushCount());
  }

  @Test
  public void getPushCacheKeyTest() {
    // Arrange, Act and Assert
    assertEquals("name@@@@foo", PushService.getPushCacheKey("name", "foo", "foo"));
  }

  @Test
  public void getClientsFuzzyTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PushService()).getClientsFuzzy("name", "123").size());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    PushService actualPushService = new PushService();

    // Assert
    ConcurrentHashMap<String, Long> expectedStringResultLongMap = actualPushService.pushCostMap;
    int actualFailedPushCount = actualPushService.getFailedPushCount();
    int actualTotalPush = actualPushService.getTotalPush();
    ConcurrentHashMap<String, Long> stringResultLongMap = PushService.pushCostMap;
    assertEquals(0, actualFailedPushCount);
    assertSame(expectedStringResultLongMap, stringResultLongMap);
    assertEquals(0, stringResultLongMap.size());
    assertEquals(0, actualTotalPush);
  }

  @Test
  public void getTotalPushTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PushService()).getTotalPush());
  }

  @Test
  public void getClientsTest() {
    // Arrange, Act and Assert
    assertNull((new PushService()).getClients("name", "123"));
  }
}

