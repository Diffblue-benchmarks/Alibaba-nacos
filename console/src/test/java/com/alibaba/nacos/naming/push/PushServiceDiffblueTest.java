package com.alibaba.nacos.naming.push;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.net.DatagramPacket;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class PushServiceDiffblueTest {
  @Autowired
  private PushService pushService;
  @Test
  public void testCanEnablePush() {
    // Arrange, Act and Assert
    assertFalse(this.pushService.canEnablePush("com.alibaba.nacos.naming.push.receiver"));
  }
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
  public void testGetClients() {
    // Arrange, Act and Assert
    assertNull(this.pushService.getClients("com.alibaba.nacos.naming.push.receiver", "123"));
  }
  @Test
  public void testGetFailedPushCount() {
    // Arrange, Act and Assert
    assertEquals(0, this.pushService.getFailedPushCount());
  }
  @Test
  public void testGetFailedPushes() {
    // Arrange, Act and Assert
    assertEquals(0, PushService.getFailedPushes().size());
  }
  @Test
  public void testGetPushCacheKey() {
    // Arrange, Act and Assert
    assertEquals("com.alibaba.nacos.naming.push.receiver@@@@com.alibaba" + ".nacos.naming.push.receiver",
        PushService.getPushCacheKey("com.alibaba.nacos.naming.push.receiver", "com.alibaba.nacos.naming.push.receiver",
            "com.alibaba.nacos.naming.push.receiver"));
  }
  @Test
  public void testGetTotalPush() {
    // Arrange, Act and Assert
    assertEquals(0, this.pushService.getTotalPush());
  }
  @Test
  public void testPushClientConstructor() {
    // Arrange
    InetSocketAddress createUnresolvedResult = InetSocketAddress.createUnresolved("foo", 1);

    // Act and Assert
    assertSame((this.pushService.new PushClient(createUnresolvedResult)).getSocketAddr(), createUnresolvedResult);
  }
  @Test
  public void testPushClientConstructor2() {
    // Arrange
    String clusters = String.join("", System.getProperty("nacos.mode"), "s");

    // Act
    PushService.PushClient actualPushClient = this.pushService.new PushClient("123", "serviceName", clusters, "agent",
        InetSocketAddress.createUnresolved("serviceName", 1), null, "tenant", "123");

    // Assert
    String actualNamespaceId = actualPushClient.getNamespaceId();
    String actualClusters = actualPushClient.getClusters();
    assertEquals("123", actualNamespaceId);
    assertEquals("123", actualPushClient.getApp());
    assertEquals("serviceName", actualPushClient.getServiceName());
    assertEquals("agent", actualPushClient.getAgent());
    assertNull(actualPushClient.getDataSource());
    assertEquals("tenant", actualPushClient.getTenant());
    assertEquals(String.join("", System.getProperty("nacos.mode"), "s"), actualClusters);
  }
  @Test
  public void testPushClientEquals() {
    // Arrange, Act and Assert
    assertFalse((this.pushService.new PushClient(InetSocketAddress.createUnresolved("foo", 1))).equals("obj"));
  }
  @Test
  public void testPushClientHashCode() {
    // Arrange, Act and Assert
    assertEquals(131366, (this.pushService.new PushClient(InetSocketAddress.createUnresolved("foo", 1))).hashCode());
  }
  @Test
  public void testPushClientSetApp() {
    // Arrange
    PushService.PushClient pushClient = this.pushService.new PushClient(InetSocketAddress.createUnresolved("foo", 1));

    // Act
    pushClient.setApp("app");

    // Assert
    assertEquals("app", pushClient.getApp());
  }
  @Test
  public void testPushClientSetClusters() {
    // Arrange
    PushService.PushClient pushClient = this.pushService.new PushClient(InetSocketAddress.createUnresolved("foo", 1));

    // Act
    pushClient.setClusters(String.join("", System.getProperty("nacos.mode"), "s"));

    // Assert
    String actualClusters = pushClient.getClusters();
    assertEquals(String.join("", System.getProperty("nacos.mode"), "s"), actualClusters);
  }
  @Test
  public void testPushClientSetNamespaceId() {
    // Arrange
    PushService.PushClient pushClient = this.pushService.new PushClient(InetSocketAddress.createUnresolved("foo", 1));

    // Act
    pushClient.setNamespaceId("123");

    // Assert
    assertEquals("123", pushClient.getNamespaceId());
  }
  @Test
  public void testPushClientSetParams() {
    // Arrange
    PushService.PushClient pushClient = this.pushService.new PushClient(InetSocketAddress.createUnresolved("foo", 1));
    HashMap<String, String[]> stringStringArrayMap = new HashMap<String, String[]>();
    stringStringArrayMap.put("foo", new String[]{"foo", "foo", "foo"});

    // Act
    pushClient.setParams(stringStringArrayMap);

    // Assert
    assertSame(stringStringArrayMap, pushClient.getParams());
  }
  @Test
  public void testPushClientSetServiceName() {
    // Arrange
    PushService.PushClient pushClient = this.pushService.new PushClient(InetSocketAddress.createUnresolved("foo", 1));

    // Act
    pushClient.setServiceName("serviceName");

    // Assert
    assertEquals("serviceName", pushClient.getServiceName());
  }
  @Test
  public void testPushClientSetTenant() {
    // Arrange
    PushService.PushClient pushClient = this.pushService.new PushClient(InetSocketAddress.createUnresolved("foo", 1));

    // Act
    pushClient.setTenant("tenant");

    // Assert
    assertEquals("tenant", pushClient.getTenant());
  }
  @Test
  public void testPushClientZombie() {
    // Arrange, Act and Assert
    assertFalse((this.pushService.new PushClient(InetSocketAddress.createUnresolved("foo", 1))).zombie());
  }
  @Test
  public void testReceiver_AckEntryConstructor() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 88);

    // Act
    PushService.Receiver.AckEntry actualAckEntry = new PushService.Receiver.AckEntry("key",
        new DatagramPacket(byteArray, 1));

    // Assert
    assertEquals(0, actualAckEntry.getRetryTimes());
    assertEquals("key", actualAckEntry.key);
  }
  @Test
  public void testReceiver_AckEntryGetRetryTimes() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 88);

    // Act and Assert
    assertEquals(0, (new PushService.Receiver.AckEntry("key", new DatagramPacket(byteArray, 1))).getRetryTimes());
  }
  @Test
  public void testReceiver_AckEntryIncreaseRetryTime() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 88);
    PushService.Receiver.AckEntry ackEntry = new PushService.Receiver.AckEntry("key", new DatagramPacket(byteArray, 1));

    // Act
    ackEntry.increaseRetryTime();

    // Assert
    assertEquals(1, ackEntry.getRetryTimes());
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
  @Test
  public void testSetFailedPush() {
    // Arrange and Act
    this.pushService.setFailedPush(0);

    // Assert
    assertEquals(0, this.pushService.getFailedPushCount());
  }
  @Test
  public void testSetTotalPush() {
    // Arrange and Act
    this.pushService.setTotalPush(0);

    // Assert
    assertEquals(0, this.pushService.getTotalPush());
  }
}

