package com.alibaba.nacos.naming.push;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class PushServiceDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange
    PushService.Receiver.AckEntry ackEntry = new PushService.Receiver.AckEntry("foo", null);

    // Act and Assert
    assertSame(ackEntry, (new PushService.Retransmitter(ackEntry)).ackEntry);
  }

  @Test(timeout=10000)
  public void constructorTest2() {
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
  public void constructorTest() {
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
}

