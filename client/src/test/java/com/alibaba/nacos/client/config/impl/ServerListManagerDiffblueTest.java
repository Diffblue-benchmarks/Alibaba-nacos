package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.alibaba.nacos.api.exception.NacosException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ServerListManagerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest7() {
    // Arrange, Act and Assert
    assertEquals("https://www.diffblue.com",
        ((new ServerListManager()).new GetServerListTask("https://www.diffblue.com")).url);
  }

  @Test
  public void getFixedNameSuffixTest() {
    // Arrange, Act and Assert
    assertEquals("foo-foo-foo", (new ServerListManager()).getFixedNameSuffix("foo", "foo", "foo"));
  }

  @Test
  public void getContentPathTest() {
    // Arrange, Act and Assert
    assertEquals("nacos", (new ServerListManager()).getContentPath());
  }

  @Test
  public void iteratorTest() {
    // Arrange, Act and Assert
    assertFalse((new ServerListManager()).iterator().hasNext());
  }

  @Test
  public void refreshCurrentServerAddrTest() {
    // Arrange, Act and Assert
    thrown.expect(NoSuchElementException.class);
    (new ServerListManager()).refreshCurrentServerAddr();
  }

  @Test
  public void startTest() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    (new ServerListManager()).start();
  }

  @Test
  public void constructorTest6() throws NacosException {
    // Arrange and Act
    ServerListManager actualServerListManager = new ServerListManager("foo");

    // Assert
    String actualNamespace = actualServerListManager.getNamespace();
    String actualName = actualServerListManager.getName();
    String actualTenant = actualServerListManager.getTenant();
    String actualUrlString = actualServerListManager.getUrlString();
    assertEquals("", actualNamespace);
    assertEquals("8848", actualServerListManager.serverPort);
    assertFalse(actualServerListManager.isFixed);
    assertEquals("http://foo:8080/nacos/serverlist", actualServerListManager.addressServerUrl);
    assertFalse(actualServerListManager.isStarted);
    assertEquals("nacos", actualServerListManager.getContentPath());
    assertEquals("[]", actualUrlString);
    assertEquals("foo", actualName);
    assertEquals("", actualTenant);
  }

  @Test
  public void constructorTest5() {
    // Arrange and Act
    ServerListManager actualServerListManager = new ServerListManager("localhost", 8080);

    // Assert
    String actualNamespace = actualServerListManager.getNamespace();
    String actualName = actualServerListManager.getName();
    String actualTenant = actualServerListManager.getTenant();
    String actualUrlString = actualServerListManager.getUrlString();
    assertEquals("", actualNamespace);
    assertEquals("8848", actualServerListManager.serverPort);
    assertFalse(actualServerListManager.isFixed);
    assertEquals("http://localhost:8080/nacos/serverlist", actualServerListManager.addressServerUrl);
    assertFalse(actualServerListManager.isStarted);
    assertEquals("nacos", actualServerListManager.getContentPath());
    assertEquals("[]", actualUrlString);
    assertEquals("custom-localhost-8080", actualName);
    assertEquals("", actualTenant);
  }

  @Test
  public void updateCurrentServerAddrTest() {
    // Arrange
    ServerListManager serverListManager = new ServerListManager();

    // Act
    serverListManager.updateCurrentServerAddr("foo");

    // Assert
    assertEquals("foo", serverListManager.getCurrentServerAddr());
  }

  @Test
  public void containTest() {
    // Arrange, Act and Assert
    assertFalse((new ServerListManager()).contain("127.0.0.1"));
  }

  @Test
  public void getNamespaceTest() {
    // Arrange, Act and Assert
    assertEquals("", (new ServerListManager()).getNamespace());
  }

  @Test
  public void constructorTest4() throws NacosException {
    // Arrange, Act and Assert
    thrown.expect(NacosException.class);
    new ServerListManager("", "foo");
  }

  @Test
  public void constructorTest3() throws NacosException {
    // Arrange and Act
    ServerListManager actualServerListManager = new ServerListManager("foo", "");

    // Assert
    String actualNamespace = actualServerListManager.getNamespace();
    String actualName = actualServerListManager.getName();
    String actualTenant = actualServerListManager.getTenant();
    String actualUrlString = actualServerListManager.getUrlString();
    assertEquals("", actualNamespace);
    assertEquals("8848", actualServerListManager.serverPort);
    assertFalse(actualServerListManager.isFixed);
    assertEquals("http://foo:8080/nacos/serverlist", actualServerListManager.addressServerUrl);
    assertFalse(actualServerListManager.isStarted);
    assertEquals("nacos", actualServerListManager.getContentPath());
    assertEquals("[]", actualUrlString);
    assertEquals("foo", actualName);
    assertEquals("", actualTenant);
  }

  @Test
  public void constructorTest2() throws NacosException {
    // Arrange and Act
    ServerListManager actualServerListManager = new ServerListManager("foo", "foo");

    // Assert
    String actualNamespace = actualServerListManager.getNamespace();
    String actualName = actualServerListManager.getName();
    String actualTenant = actualServerListManager.getTenant();
    String actualUrlString = actualServerListManager.getUrlString();
    assertEquals("foo", actualNamespace);
    assertEquals("8848", actualServerListManager.serverPort);
    assertFalse(actualServerListManager.isFixed);
    assertEquals("http://foo:8080/nacos/serverlist?namespace=foo", actualServerListManager.addressServerUrl);
    assertFalse(actualServerListManager.isStarted);
    assertEquals("nacos", actualServerListManager.getContentPath());
    assertEquals("[]", actualUrlString);
    assertEquals("foo-foo", actualName);
    assertEquals("foo", actualTenant);
  }

  @Test
  public void getUrlStringTest() {
    // Arrange, Act and Assert
    assertEquals("[]", (new ServerListManager()).getUrlString());
  }

  @Test
  public void getIteratorTest() {
    // Arrange, Act and Assert
    assertNull((new ServerListManager()).getIterator());
  }

  @Test
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertEquals("", (new ServerListManager()).getTenant());
  }

  @Test
  public void getCurrentServerAddrTest() {
    // Arrange, Act and Assert
    thrown.expect(NoSuchElementException.class);
    (new ServerListManager()).getCurrentServerAddr();
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ServerListManager actualServerListManager = new ServerListManager();

    // Assert
    String actualNamespace = actualServerListManager.getNamespace();
    String actualName = actualServerListManager.getName();
    String actualTenant = actualServerListManager.getTenant();
    String actualUrlString = actualServerListManager.getUrlString();
    assertEquals("", actualNamespace);
    assertEquals("8848", actualServerListManager.serverPort);
    assertFalse(actualServerListManager.isFixed);
    assertFalse(actualServerListManager.isStarted);
    assertEquals("nacos", actualServerListManager.getContentPath());
    assertEquals("[]", actualUrlString);
    assertEquals("default", actualName);
    assertEquals("", actualTenant);
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("default", (new ServerListManager()).getName());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ServerManager-default-[]", (new ServerListManager()).toString());
  }

  @Test
  public void getServerUrlsTest() {
    // Arrange
    ServerListManager serverListManager = new ServerListManager();

    // Act
    List<String> actualServerUrls = serverListManager.getServerUrls();

    // Assert
    assertSame(serverListManager.serverUrls, actualServerUrls);
    assertEquals(0, actualServerUrls.size());
  }
}

