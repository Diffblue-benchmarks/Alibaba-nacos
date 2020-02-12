package com.alibaba.nacos.client.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.api.naming.pojo.ServiceInfo;
import com.alibaba.nacos.client.naming.net.NamingProxy;
import java.util.Map;
import org.junit.Test;

public class PushReceiverDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    PushReceiver.PushPacket actualPushPacket = new PushReceiver.PushPacket();

    // Assert
    assertNull(actualPushPacket.type);
    assertNull(actualPushPacket.data);
    assertEquals(0L, actualPushPacket.lastRefTime);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    EventDispatcher eventDispatcher = new EventDispatcher();
    HostReactor hostReactor = new HostReactor(eventDispatcher, new NamingProxy("123", "foo", "foo"), "foo");

    // Act
    new PushReceiver(hostReactor);

    // Assert
    Map<String, ServiceInfo> serviceInfoMap = hostReactor.getServiceInfoMap();
    assertTrue(serviceInfoMap instanceof java.util.concurrent.ConcurrentHashMap);
    assertEquals(0, serviceInfoMap.size());
  }
}

