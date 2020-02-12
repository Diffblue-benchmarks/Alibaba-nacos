package com.alibaba.nacos.naming.push;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.concurrent.ConcurrentHashMap;
import org.junit.Test;

public class PushServiceDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest5() {
    // Arrange
    PushService.Receiver.AckEntry ackEntry = new PushService.Receiver.AckEntry("foo", null);

    // Act and Assert
    assertSame(ackEntry, (new PushService.Retransmitter(ackEntry)).ackEntry);
  }

  @Test(timeout=10000)
  public void constructorTest4() {
    // Arrange and Act
    PushService.Receiver.AckPacket actualAckPacket = new PushService.Receiver.AckPacket();

    // Assert
    assertNull(actualAckPacket.data);
    assertEquals(0L, actualAckPacket.lastRefTime);
    assertNull(actualAckPacket.type);
  }

  @Test(timeout=10000)
  public void increaseRetryTimeTest() {
    // Arrange
    PushService.Receiver.AckEntry ackEntry = new PushService.Receiver.AckEntry("foo", null);

    // Act
    ackEntry.increaseRetryTime();

    // Assert
    assertEquals(1, ackEntry.getRetryTimes());
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange and Act
    PushService.Receiver.AckEntry actualAckEntry = new PushService.Receiver.AckEntry("foo", null);

    // Assert
    assertEquals(0, actualAckEntry.getRetryTimes());
    assertNull(actualAckEntry.origin);
    assertEquals("foo", actualAckEntry.key);
  }

  @Test(timeout=10000)
  public void getRetryTimesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PushService.Receiver.AckEntry("foo", null)).getRetryTimes());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertNull(((new PushService()).new PushClient(null)).getSocketAddr());
  }

  @Test(timeout=10000)
  public void setFailedPushTest() {
    // Arrange
    PushService pushService = new PushService();

    // Act
    pushService.setFailedPush(1);

    // Assert
    assertEquals(1, pushService.getFailedPushCount());
  }

  @Test(timeout=10000)
  public void getFailedPushCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PushService()).getFailedPushCount());
  }

  @Test(timeout=10000)
  public void getPushCacheKeyTest() {
    // Arrange, Act and Assert
    assertEquals("name@@@@foo", PushService.getPushCacheKey("name", "foo", "foo"));
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void getTotalPushTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PushService()).getTotalPush());
  }

  @Test(timeout=10000)
  public void getClientsTest() {
    // Arrange, Act and Assert
    assertNull((new PushService()).getClients("name", "123"));
  }
}

