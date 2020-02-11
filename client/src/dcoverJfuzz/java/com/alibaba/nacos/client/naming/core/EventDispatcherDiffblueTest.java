package com.alibaba.nacos.client.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.api.naming.pojo.ServiceInfo;
import java.util.List;
import org.junit.Test;

public class EventDispatcherDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    List<ServiceInfo> subscribeServices = (new EventDispatcher()).getSubscribeServices();
    assertTrue(subscribeServices instanceof java.util.ArrayList);
    assertEquals(0, subscribeServices.size());
  }

  @Test(timeout=10000)
  public void getSubscribeServicesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new EventDispatcher()).getSubscribeServices().size());
  }
}

