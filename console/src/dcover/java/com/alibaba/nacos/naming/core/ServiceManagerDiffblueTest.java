package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.alibaba.nacos.api.exception.NacosException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ServiceManagerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange, Act and Assert
    assertEquals("123", (new ServiceManager.ServiceChecksum("123")).namespaceId);
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("public", (new ServiceManager.ServiceChecksum()).namespaceId);
  }

  @Test(timeout=10000)
  public void getServiceCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getServiceCount());
  }

  @Test(timeout=10000)
  public void updateInstanceTest() throws NacosException {
    // Arrange
    ServiceManager serviceManager = new ServiceManager();

    // Act and Assert
    thrown.expect(NacosException.class);
    serviceManager.updateInstance("123", "name", new Instance());
  }

  @Test(timeout=10000)
  public void getInstanceCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getInstanceCount());
  }

  @Test(timeout=10000)
  public void getAllServiceNamesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getAllServiceNames().size());
  }

  @Test(timeout=10000)
  public void getAllNamespacesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getAllNamespaces().size());
  }

  @Test(timeout=10000)
  public void onDeleteTest() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    (new ServiceManager()).onDelete("foo");
  }

  @Test(timeout=10000)
  public void createServiceIfAbsentTest() throws NacosException {
    // Arrange
    ServiceManager serviceManager = new ServiceManager();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    serviceManager.createServiceIfAbsent("123", "name", true, new Cluster());
  }

  @Test(timeout=10000)
  public void getServiceTest() {
    // Arrange, Act and Assert
    assertNull((new ServiceManager()).getService("123", "name"));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getInstanceCount());
  }

  @Test(timeout=10000)
  public void getAllServiceNameListTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getAllServiceNameList("123").size());
  }

  @Test(timeout=10000)
  public void chooseServiceMapTest() {
    // Arrange, Act and Assert
    assertNull((new ServiceManager()).chooseServiceMap("123"));
  }

  @Test(timeout=10000)
  public void onChangeTest() throws Exception {
    // Arrange
    ServiceManager serviceManager = new ServiceManager();
    Service service = new Service();

    // Act
    serviceManager.onChange("foo", service);

    // Assert
    assertEquals("public", service.getNamespaceId());
    assertEquals(0, serviceManager.getServiceCount());
  }

  @Test(timeout=10000)
  public void interestsTest() {
    // Arrange, Act and Assert
    assertFalse((new ServiceManager()).interests("foo"));
  }

  @Test(timeout=10000)
  public void getPagedServiceTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getPagedService("123", 1, 3, "foo", "foo", null));
  }

  @Test(timeout=10000)
  public void getResponsibleInstanceCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getResponsibleInstanceCount());
  }

  @Test(timeout=10000)
  public void getResponsibleServiceCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getResponsibleServiceCount());
  }

  @Test(timeout=10000)
  public void containServiceTest() {
    // Arrange, Act and Assert
    assertFalse((new ServiceManager()).containService("123", "name"));
  }

  @Test(timeout=10000)
  public void getResponsibleServicesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getResponsibleServices().size());
  }

  @Test(timeout=10000)
  public void getServiceMapTest() {
    // Arrange, Act and Assert
    assertNull((new ServiceManager()).getServiceMap("123"));
  }

  @Test(timeout=10000)
  public void getInstanceTest() {
    // Arrange, Act and Assert
    assertNull((new ServiceManager()).getInstance("123", "name", "foo", "127.0.0.1", 8080));
  }

  @Test(timeout=10000)
  public void easyRemoveServiceTest() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new ServiceManager()).easyRemoveService("123", "name");
  }

  @Test(timeout=10000)
  public void matchUnlistenKeyTest() {
    // Arrange, Act and Assert
    assertFalse((new ServiceManager()).matchUnlistenKey("foo"));
  }
}

