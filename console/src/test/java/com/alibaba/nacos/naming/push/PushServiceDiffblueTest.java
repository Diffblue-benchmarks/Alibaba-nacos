package com.alibaba.nacos.naming.push;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.net.DatagramPacket;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import org.junit.Test;

public class PushServiceDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    PushService actualPushService = new PushService();

    // Assert
    assertEquals(0, actualPushService.getFailedPushCount());
    ConcurrentHashMap<String, Long> stringResultLongMap = PushService.pushCostMap;
    assertSame(actualPushService.pushCostMap, stringResultLongMap);
    assertEquals(0, stringResultLongMap.size());
    assertEquals(0, actualPushService.getTotalPush());
  }

  @Test
  public void testReceiver_AckPacketConstructor() {
    // Arrange and Act
    PushService.Receiver.AckPacket actualAckPacket = new PushService.Receiver.AckPacket();

    // Assert
    assertNull(actualAckPacket.data);
    assertEquals(0L, actualAckPacket.lastRefTime);
    assertNull(actualAckPacket.type);
  }

  @Test
  public void testRetransmitterConstructor() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 88);
    PushService.Receiver.AckEntry ackEntry = new PushService.Receiver.AckEntry("key", new DatagramPacket(byteArray, 1));

    // Act and Assert
    assertSame((new PushService.Retransmitter(ackEntry)).ackEntry, ackEntry);
  }
}

