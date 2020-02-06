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

  @Test
  public void constructorTest3() {
    // Arrange, Act and Assert
    assertEquals("123", (new ServiceManager.ServiceChecksum("123")).namespaceId);
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("public", (new ServiceManager.ServiceChecksum()).namespaceId);
  }

  @Test
  public void getServiceCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getServiceCount());
  }

  @Test
  public void updateInstanceTest() throws NacosException {
    // Arrange
    ServiceManager serviceManager = new ServiceManager();

    // Act and Assert
    thrown.expect(NacosException.class);
    serviceManager.updateInstance("123", "name", new Instance());
  }

  @Test
  public void getInstanceCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getInstanceCount());
  }

  @Test
  public void getAllServiceNamesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getAllServiceNames().size());
  }

  @Test
  public void getPagedServiceTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getPagedService("123", 1, 3, "foo", "foo", null, true));
  }

  @Test
  public void getAllNamespacesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getAllNamespaces().size());
  }

  @Test
  public void onDeleteTest() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    (new ServiceManager()).onDelete("foo");
  }

  @Test
  public void createServiceIfAbsentTest() throws NacosException {
    // Arrange
    ServiceManager serviceManager = new ServiceManager();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    serviceManager.createServiceIfAbsent("123", "name", true, new Cluster());
  }

  @Test
  public void getServiceTest() {
    // Arrange, Act and Assert
    assertNull((new ServiceManager()).getService("123", "name"));
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getServiceCount());
  }

  @Test
  public void getAllServiceNameListTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getAllServiceNameList("123").size());
  }

  @Test
  public void chooseServiceMapTest() {
    // Arrange, Act and Assert
    assertNull((new ServiceManager()).chooseServiceMap("123"));
  }

  @Test
  public void onChangeTest() throws Exception {
    // Arrange
    ServiceManager serviceManager = new ServiceManager();
    Service service = new Service();

    // Act
    serviceManager.onChange("foo", service);

    // Assert
    assertEquals("public", service.getNamespaceId());
    assertEquals(0, serviceManager.getInstanceCount());
  }

  @Test
  public void interestsTest() {
    // Arrange, Act and Assert
    assertFalse((new ServiceManager()).interests("foo"));
  }

  @Test
  public void getResponsibleInstanceCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getResponsibleInstanceCount());
  }

  @Test
  public void getResponsibleServiceCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getResponsibleServiceCount());
  }

  @Test
  public void containServiceTest() {
    // Arrange, Act and Assert
    assertFalse((new ServiceManager()).containService("123", "name"));
  }

  @Test
  public void getResponsibleServicesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getResponsibleServices().size());
  }

  @Test
  public void getServiceMapTest() {
    // Arrange, Act and Assert
    assertNull((new ServiceManager()).getServiceMap("123"));
  }

  @Test
  public void getInstanceTest() {
    // Arrange, Act and Assert
    assertNull((new ServiceManager()).getInstance("123", "name", "foo", "127.0.0.1", 8080));
  }

  @Test
  public void easyRemoveServiceTest() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new ServiceManager()).easyRemoveService("123", "name");
  }

  @Test
  public void matchUnlistenKeyTest() {
    // Arrange, Act and Assert
    assertFalse((new ServiceManager()).matchUnlistenKey("foo"));
  }
}

