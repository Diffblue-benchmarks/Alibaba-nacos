package com.alibaba.nacos.client.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.fastjson.JSONException;
import com.alibaba.nacos.api.naming.pojo.ServiceInfo;
import com.alibaba.nacos.client.naming.net.NamingProxy;
import java.util.List;
import java.util.Map;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class HostReactorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange
    EventDispatcher eventDispatcher = new EventDispatcher();

    // Act and Assert
    assertEquals(9223372036854775807L,
        ((new HostReactor(eventDispatcher, new NamingProxy("123", "foo", "foo"), "foo")).new UpdateTask("name",
            "123")).lastRefTime);
  }
  @Test(timeout=10000)
  public void getServiceInfoMapTest() {
    // Arrange
    EventDispatcher eventDispatcher = new EventDispatcher();

    // Act and Assert
    assertEquals(0,
        (new HostReactor(eventDispatcher, new NamingProxy("123", "foo", "foo"), "foo")).getServiceInfoMap().size());
  }
  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange
    EventDispatcher eventDispatcher = new EventDispatcher();
    NamingProxy namingProxy = new NamingProxy("123", "foo", "foo");

    // Act and Assert
    Map<String, ServiceInfo> serviceInfoMap = (new HostReactor(eventDispatcher, namingProxy, "foo"))
        .getServiceInfoMap();
    assertTrue(serviceInfoMap instanceof java.util.concurrent.ConcurrentHashMap);
    assertEquals(0, serviceInfoMap.size());
    List<ServiceInfo> subscribeServices = eventDispatcher.getSubscribeServices();
    assertTrue(subscribeServices instanceof java.util.ArrayList);
    assertEquals(0, subscribeServices.size());
    String actualNamespaceId = namingProxy.getNamespaceId();
    String actualSecretKey = namingProxy.getSecretKey();
    List<String> actualServerListFromEndpoint = namingProxy.getServerListFromEndpoint();
    assertEquals("123", actualNamespaceId);
    assertNull(namingProxy.getAccessKey());
    assertNull(actualServerListFromEndpoint);
    assertNull(actualSecretKey);
  }
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    EventDispatcher eventDispatcher = new EventDispatcher();
    NamingProxy namingProxy = new NamingProxy("123", "foo", "foo");

    // Act and Assert
    Map<String, ServiceInfo> serviceInfoMap = (new HostReactor(eventDispatcher, namingProxy, "foo", true, 3))
        .getServiceInfoMap();
    assertTrue(serviceInfoMap instanceof java.util.concurrent.ConcurrentHashMap);
    assertEquals(0, serviceInfoMap.size());
    List<ServiceInfo> subscribeServices = eventDispatcher.getSubscribeServices();
    assertTrue(subscribeServices instanceof java.util.ArrayList);
    assertEquals(0, subscribeServices.size());
    String actualNamespaceId = namingProxy.getNamespaceId();
    String actualSecretKey = namingProxy.getSecretKey();
    List<String> actualServerListFromEndpoint = namingProxy.getServerListFromEndpoint();
    assertEquals("123", actualNamespaceId);
    assertNull(namingProxy.getAccessKey());
    assertNull(actualServerListFromEndpoint);
    assertNull(actualSecretKey);
  }
  @Test(timeout=10000)
  public void getServiceInfoTest() {
    // Arrange
    EventDispatcher eventDispatcher = new EventDispatcher();

    // Act
    ServiceInfo actualServiceInfo = (new HostReactor(eventDispatcher, new NamingProxy("123", "foo", "foo"), "foo"))
        .getServiceInfo("name", "123");

    // Assert
    String actualName = actualServiceInfo.getName();
    String actualClusters = actualServiceInfo.getClusters();
    boolean actualIsAllIPsResult = actualServiceInfo.isAllIPs();
    long actualCacheMillis = actualServiceInfo.getCacheMillis();
    String actualJsonFromServer = actualServiceInfo.getJsonFromServer();
    long actualLastRefTime = actualServiceInfo.getLastRefTime();
    boolean actualIsValidResult = actualServiceInfo.isValid();
    assertEquals("", actualServiceInfo.getChecksum());
    assertTrue(actualIsValidResult);
    assertEquals(0L, actualLastRefTime);
    assertEquals("", actualJsonFromServer);
    assertEquals(1000L, actualCacheMillis);
    assertFalse(actualIsAllIPsResult);
    assertEquals("123", actualClusters);
    assertEquals("name", actualName);
  }
  @Test(timeout=10000)
  public void processServiceJSONTest() {
    // Arrange
    EventDispatcher eventDispatcher = new EventDispatcher();

    // Act and Assert
    thrown.expect(JSONException.class);
    (new HostReactor(eventDispatcher, new NamingProxy("123", "foo", "foo"), "foo")).processServiceJSON("foo");
  }
}

