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
    PushService.Receiver.AckEntry ackEntry = new PushService.Receiver.AckEntry("aaaaa", null);

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
    PushService.Receiver.AckEntry ackEntry = new PushService.Receiver.AckEntry("aaaaa", null);

    // Act
    ackEntry.increaseRetryTime();

    // Assert
    assertEquals(1, ackEntry.getRetryTimes());
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    PushService.Receiver.AckEntry actualAckEntry = new PushService.Receiver.AckEntry("aaaaa", null);

    // Assert
    assertEquals(0, actualAckEntry.getRetryTimes());
    assertNull(actualAckEntry.origin);
    assertEquals("aaaaa", actualAckEntry.key);
  }

  @Test
  public void getRetryTimesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PushService.Receiver.AckEntry("aaaaa", null)).getRetryTimes());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    PushService.PushClient actualPushClient = (new PushService()).new PushClient("aaaaa", "aaaaa", "aaaaa", "aaaaa",
        null, null, "aaaaa", "aaaaa");

    // Assert
    String actualNamespaceId = actualPushClient.getNamespaceId();
    InetSocketAddress actualSocketAddr = actualPushClient.getSocketAddr();
    String actualClusters = actualPushClient.getClusters();
    String actualTenant = actualPushClient.getTenant();
    DataSource actualDataSource = actualPushClient.getDataSource();
    String actualAgent = actualPushClient.getAgent();
    String actualServiceName = actualPushClient.getServiceName();
    assertEquals("aaaaa", actualNamespaceId);
    assertEquals("aaaaa", actualPushClient.getApp());
    assertEquals("aaaaa", actualServiceName);
    assertEquals("aaaaa", actualAgent);
    assertNull(actualDataSource);
    assertEquals("aaaaa", actualTenant);
    assertEquals("aaaaa", actualClusters);
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
    assertEquals("com.alibaba.nacos.naming.push.receiver@@@@com.alibaba" + ".nacos.naming.push.receiver",
        PushService.getPushCacheKey("com.alibaba.nacos.naming.push.receiver", "com.alibaba.nacos.naming.push.receiver",
            "com.alibaba.nacos.naming.push.receiver"));
  }

  @Test
  public void getClientsFuzzyTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PushService())
        .getClientsFuzzy("com.alibaba.nacos.naming.push.receiver", "com.alibaba.nacos.naming.push.receiver").size());
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
    assertNull((new PushService()).getClients("com.alibaba.nacos.naming.push.receiver",
        "com.alibaba.nacos.naming.push.receiver"));
  }
}

