package com.alibaba.nacos.client.naming.net;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.List;
import org.junit.Test;

public class NamingProxyDiffblueTest {
  @Test(timeout=10000)
  public void getAccessKeyTest() {
    // Arrange, Act and Assert
    assertNull((new NamingProxy("123", "foo", "foo")).getAccessKey());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    NamingProxy actualNamingProxy = new NamingProxy("123", "foo", "foo");

    // Assert
    String actualNamespaceId = actualNamingProxy.getNamespaceId();
    assertEquals("123", actualNamespaceId);
    assertNull(actualNamingProxy.getServerListFromEndpoint());
  }

  @Test(timeout=10000)
  public void getNamespaceIdTest() {
    // Arrange, Act and Assert
    assertEquals("123", (new NamingProxy("123", "foo", "foo")).getNamespaceId());
  }

  @Test(timeout=10000)
  public void getSecretKeyTest() {
    // Arrange, Act and Assert
    assertNull((new NamingProxy("123", "foo", "foo")).getSecretKey());
  }

  @Test(timeout=10000)
  public void builderHeadersTest() {
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
  public void setPropertiesTest() {
    // Arrange
    NamingProxy namingProxy = new NamingProxy("123", "foo", "foo");

    // Act
    namingProxy.setProperties(null);

    // Assert
    assertNull(namingProxy.getAccessKey());
  }

  @Test(timeout=10000)
  public void getServerListFromEndpointTest() {
    // Arrange, Act and Assert
    assertNull((new NamingProxy("123", "foo", "foo")).getServerListFromEndpoint());
  }
}

