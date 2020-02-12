package com.alibaba.nacos.client.naming.beat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.client.naming.net.NamingProxy;
import java.util.List;
import java.util.Map;
import org.junit.Test;

public class BeatReactorDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange
    BeatReactor beatReactor = new BeatReactor(new NamingProxy("123", "foo", "foo"));
    BeatInfo beatInfo = new BeatInfo();

    // Act and Assert
    assertSame((beatReactor.new BeatTask(beatInfo)).beatInfo, beatInfo);
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("123", "foo", "foo");

    // Act and Assert
    Map<String, BeatInfo> stringBeatInfoMap = (new BeatReactor(namingProxy, 3)).dom2Beat;
    assertTrue(stringBeatInfoMap instanceof java.util.concurrent.ConcurrentHashMap);
    assertEquals(0, stringBeatInfoMap.size());
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
    NamingProxy namingProxy = new NamingProxy("123", "foo", "foo");

    // Act and Assert
    Map<String, BeatInfo> stringBeatInfoMap = (new BeatReactor(namingProxy)).dom2Beat;
    assertTrue(stringBeatInfoMap instanceof java.util.concurrent.ConcurrentHashMap);
    assertEquals(0, stringBeatInfoMap.size());
    String actualNamespaceId = namingProxy.getNamespaceId();
    String actualSecretKey = namingProxy.getSecretKey();
    List<String> actualServerListFromEndpoint = namingProxy.getServerListFromEndpoint();
    assertEquals("123", actualNamespaceId);
    assertNull(namingProxy.getAccessKey());
    assertNull(actualServerListFromEndpoint);
    assertNull(actualSecretKey);
  }
}

