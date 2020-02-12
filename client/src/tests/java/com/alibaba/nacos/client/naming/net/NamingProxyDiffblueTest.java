package com.alibaba.nacos.client.naming.net;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.pojo.Instance;
import com.alibaba.nacos.client.naming.beat.BeatInfo;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NamingProxyDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void constructorTest7() {
    // Arrange and Act
    NamingProxy actualNamingProxy = new NamingProxy("123", "foo", ",");

    // Assert
    String actualNamespaceId = actualNamingProxy.getNamespaceId();
    String actualSecretKey = actualNamingProxy.getSecretKey();
    assertEquals("123", actualNamespaceId);
    assertNull(actualNamingProxy.getServerListFromEndpoint());
    assertNull(actualSecretKey);
  }

  @Test(timeout=10000)
  public void constructorTest6() {
    // Arrange and Act
    NamingProxy actualNamingProxy = new NamingProxy("123", "foo", "server list provided by user: ");

    // Assert
    String actualNamespaceId = actualNamingProxy.getNamespaceId();
    assertEquals("123", actualNamespaceId);
    assertNull(actualNamingProxy.getServerListFromEndpoint());
  }

  @Test(timeout=10000)
  public void constructorTest5() {
    // Arrange and Act
    NamingProxy actualNamingProxy = new NamingProxy(",", "foo", "http://");

    // Assert
    String actualNamespaceId = actualNamingProxy.getNamespaceId();
    assertEquals(",", actualNamespaceId);
    assertNull(actualNamingProxy.getServerListFromEndpoint());
  }

  @Test(timeout=10000)
  public void constructorTest4() {
    // Arrange and Act
    NamingProxy actualNamingProxy = new NamingProxy("123", "foo", "foo");

    // Assert
    String actualNamespaceId = actualNamingProxy.getNamespaceId();
    assertEquals("123", actualNamespaceId);
    assertNull(actualNamingProxy.getServerListFromEndpoint());
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange and Act
    NamingProxy actualNamingProxy = new NamingProxy("failed to update server list", "foo", ",");

    // Assert
    String actualNamespaceId = actualNamingProxy.getNamespaceId();
    assertEquals("failed to update server list", actualNamespaceId);
    assertNull(actualNamingProxy.getAccessKey());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    NamingProxy actualNamingProxy = new NamingProxy(",", "foo", ",");

    // Assert
    String actualNamespaceId = actualNamingProxy.getNamespaceId();
    assertEquals(",", actualNamespaceId);
    assertNull(actualNamingProxy.getServerListFromEndpoint());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    NamingProxy actualNamingProxy = new NamingProxy("123", "", "foo");

    // Assert
    String actualNamespaceId = actualNamingProxy.getNamespaceId();
    assertEquals("123", actualNamespaceId);
    assertNull(actualNamingProxy.getServerListFromEndpoint());
  }

  @Test(timeout=10000)
  public void getNamespaceIdTest2() {
    // Arrange, Act and Assert
    assertEquals("123", (new NamingProxy("123", "foo", "foo")).getNamespaceId());
  }

  @Test(timeout=10000)
  public void getNamespaceIdTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new NamingProxy("foo", "foo", "foo")).getNamespaceId());
  }

  @Test(timeout=10000)
  public void getSecretKeyTest2() {
    // Arrange, Act and Assert
    assertNull((new NamingProxy("123", "foo", "foo")).getSecretKey());
  }

  @Test(timeout=10000)
  public void getSecretKeyTest() {
    // Arrange, Act and Assert
    assertNull((new NamingProxy("", "foo", "foo")).getSecretKey());
  }

  @Test(timeout=10000)
  public void builderHeadersTest2() {
    // Arrange and Act
    List<String> actualBuilderHeadersResult = (new NamingProxy("123", "foo", "foo")).builderHeaders();

    // Assert
    assertEquals(12, actualBuilderHeadersResult.size());
    assertEquals("Client-Version", actualBuilderHeadersResult.get(0));
    assertEquals("Nacos-Java-Client:v1.1.1", actualBuilderHeadersResult.get(1));
    assertEquals("User-Agent", actualBuilderHeadersResult.get(2));
    assertEquals("Nacos-Java-Client:v1.1.1", actualBuilderHeadersResult.get(3));
    assertEquals("Accept-Encoding", actualBuilderHeadersResult.get(4));
    assertEquals("gzip,deflate,sdch", actualBuilderHeadersResult.get(5));
    assertEquals("Connection", actualBuilderHeadersResult.get(6));
    assertEquals("Keep-Alive", actualBuilderHeadersResult.get(7));
    assertEquals("RequestId", actualBuilderHeadersResult.get(8));
    assertEquals("Request-Module", actualBuilderHeadersResult.get(10));
    assertEquals("Naming", actualBuilderHeadersResult.get(11));
  }

  @Test(timeout=10000)
  public void builderHeadersTest() {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("123", "gzip,deflate,sdch", "foo");

    // Act
    List<String> actualBuilderHeadersResult = namingProxy.builderHeaders();

    // Assert
    assertEquals(12, actualBuilderHeadersResult.size());
    assertEquals("Client-Version", actualBuilderHeadersResult.get(0));
    assertEquals("Nacos-Java-Client:v1.1.1", actualBuilderHeadersResult.get(1));
    assertEquals("User-Agent", actualBuilderHeadersResult.get(2));
    assertEquals("Nacos-Java-Client:v1.1.1", actualBuilderHeadersResult.get(3));
    assertEquals("Accept-Encoding", actualBuilderHeadersResult.get(4));
    assertEquals("gzip,deflate,sdch", actualBuilderHeadersResult.get(5));
    assertEquals("Connection", actualBuilderHeadersResult.get(6));
    assertEquals("Keep-Alive", actualBuilderHeadersResult.get(7));
    assertEquals("RequestId", actualBuilderHeadersResult.get(8));
    assertEquals("Request-Module", actualBuilderHeadersResult.get(10));
    assertEquals("Naming", actualBuilderHeadersResult.get(11));
    assertNull(namingProxy.getServerListFromEndpoint());
  }

  @Test(timeout=10000)
  public void setServerPortTest() {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("", "foo", "foo");

    // Act
    namingProxy.setServerPort(-2147483648);

    // Assert
    assertEquals("", namingProxy.getNamespaceId());
  }

  @Test(timeout=10000)
  public void deregisterServiceTest8() throws NacosException {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("", "foo", "");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    namingProxy.deregisterService("name", new Instance());
  }

  @Test(timeout=10000)
  public void deregisterServiceTest7() throws NacosException {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("User-Agent", "foo", "");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    namingProxy.deregisterService("name", new Instance());
  }

  @Test(timeout=10000)
  public void deregisterServiceTest6() throws NacosException {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("DELETE", "foo", "");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    namingProxy.deregisterService("name", new Instance());
  }

  @Test(timeout=10000)
  public void deregisterServiceTest5() throws NacosException {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("123", "foo", "");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    namingProxy.deregisterService("", new Instance());
  }

  @Test(timeout=10000)
  public void deregisterServiceTest4() throws NacosException {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("namespaceId", "foo", "");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    namingProxy.deregisterService("name", new Instance());
  }

  @Test(timeout=10000)
  public void deregisterServiceTest3() throws NacosException {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("clusterName", "foo", "");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    namingProxy.deregisterService("name", new Instance());
  }

  @Test(timeout=10000)
  public void deregisterServiceTest2() throws NacosException {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("123", "foo", "");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    namingProxy.deregisterService("name", new Instance());
  }

  @Test(timeout=10000)
  public void deregisterServiceTest() throws NacosException {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("123", "ip", "");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    namingProxy.deregisterService("name", new Instance());
  }

  @Test(timeout=10000)
  public void setPropertiesTest() {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("123", "foo", "foo");

    // Act
    namingProxy.setProperties(null);

    // Assert
    assertNull(namingProxy.getAccessKey());
  }

  @Test(timeout=10000)
  public void getServerListFromEndpointTest7() {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("123", "foo", "failed to update server list");

    // Act and Assert
    assertNull(namingProxy.getServerListFromEndpoint());
    assertNull(namingProxy.getServerListFromEndpoint());
  }

  @Test(timeout=10000)
  public void getServerListFromEndpointTest6() {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("Nacos-Java-Client:v1.1.1", "foo", "foo");

    // Act and Assert
    assertNull(namingProxy.getServerListFromEndpoint());
    assertNull(namingProxy.getServerListFromEndpoint());
  }

  @Test(timeout=10000)
  public void getServerListFromEndpointTest5() {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("123", "Connection", "");

    // Act and Assert
    assertNull(namingProxy.getServerListFromEndpoint());
    assertNull(namingProxy.getServerListFromEndpoint());
  }

  @Test(timeout=10000)
  public void getServerListFromEndpointTest4() {
    // Arrange, Act and Assert
    assertNull((new NamingProxy("123", "foo", "foo")).getServerListFromEndpoint());
  }

  @Test(timeout=10000)
  public void getServerListFromEndpointTest3() {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("123", "foo", "");

    // Act and Assert
    assertNull(namingProxy.getServerListFromEndpoint());
    assertNull(namingProxy.getAccessKey());
  }

  @Test(timeout=10000)
  public void getServerListFromEndpointTest2() {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("/nacos/serverlist", "foo", "");

    // Act and Assert
    assertNull(namingProxy.getServerListFromEndpoint());
    assertNull(namingProxy.getServerListFromEndpoint());
  }

  @Test(timeout=10000)
  public void getServerListFromEndpointTest() {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("Request-Module", "foo", "");

    // Act and Assert
    assertNull(namingProxy.getServerListFromEndpoint());
    assertEquals("Request-Module", namingProxy.getNamespaceId());
  }

  @Test(timeout=10000)
  public void serverHealthyTest() {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("123", "foo", "");

    // Act and Assert
    assertFalse(namingProxy.serverHealthy());
    assertNull(namingProxy.getServerListFromEndpoint());
  }

  @Test(timeout=10000)
  public void sendBeatTest4() {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("123", "no server available", "");
    BeatInfo beatInfo = new BeatInfo();

    // Act and Assert
    assertEquals(0L, namingProxy.sendBeat(beatInfo));
    assertEquals("{\"period\":0,\"port\":0,\"scheduled\":false,\"stopped\"" + ":false,\"weight\":0.0}",
        beatInfo.toString());
    assertNull(namingProxy.getServerListFromEndpoint());
  }

  @Test(timeout=10000)
  public void sendBeatTest3() {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("namespaceId", "foo", "");
    BeatInfo beatInfo = new BeatInfo();

    // Act and Assert
    assertEquals(0L, namingProxy.sendBeat(beatInfo));
    assertEquals("{\"period\":0,\"port\":0,\"scheduled\":false,\"stopped\"" + ":false,\"weight\":0.0}",
        beatInfo.toString());
    assertNull(namingProxy.getServerListFromEndpoint());
  }

  @Test(timeout=10000)
  public void sendBeatTest2() {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("serviceName", "foo", "");
    BeatInfo beatInfo = new BeatInfo();

    // Act and Assert
    assertEquals(0L, namingProxy.sendBeat(beatInfo));
    String actualToStringResult = beatInfo.toString();
    assertEquals(0, beatInfo.getPort());
    assertEquals("{\"period\":0,\"port\":0,\"scheduled\":false,\"stopped\"" + ":false,\"weight\":0.0}",
        actualToStringResult);
  }

  @Test(timeout=10000)
  public void sendBeatTest() {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("123", "foo", "");
    BeatInfo beatInfo = new BeatInfo();

    // Act and Assert
    assertEquals(0L, namingProxy.sendBeat(beatInfo));
    assertEquals("{\"period\":0,\"port\":0,\"scheduled\":false,\"stopped\"" + ":false,\"weight\":0.0}",
        beatInfo.toString());
  }
}

