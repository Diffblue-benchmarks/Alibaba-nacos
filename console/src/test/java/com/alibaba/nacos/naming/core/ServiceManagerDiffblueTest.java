package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.alibaba.nacos.api.exception.NacosException;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class ServiceManagerDiffblueTest {
  @Autowired
  private ServiceManager serviceManager;

  @Test
  public void testChooseServiceMap() {
    // Arrange, Act and Assert
    assertNull(this.serviceManager.chooseServiceMap("123"));
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceManager()).getServiceCount());
  }

  @Test
  public void testContainService() {
    // Arrange, Act and Assert
    assertFalse(this.serviceManager.containService("123", ":"));
  }

  @Test
  public void testCreateEmptyService() throws NacosException {
    // Arrange and Act
    this.serviceManager.createEmptyService("123", ":", true);

    // Assert
    assertEquals(0, this.serviceManager.getInstanceCount());
  }

  @Test
  public void testGetAllNamespaces() {
    // Arrange, Act and Assert
    assertEquals(2, this.serviceManager.getAllNamespaces().size());
  }

  @Test
  public void testGetAllServiceNameList() {
    // Arrange, Act and Assert
    assertEquals(0, this.serviceManager.getAllServiceNameList("123").size());
  }

  @Test
  public void testGetAllServiceNames() {
    // Arrange, Act and Assert
    assertEquals(2, this.serviceManager.getAllServiceNames().size());
  }

  @Test
  public void testGetAllServiceNames2() {
    // Arrange, Act and Assert
    assertEquals(1, this.serviceManager.getAllServiceNames("123").size());
  }

  @Test
  public void testGetInstance() {
    // Arrange, Act and Assert
    assertNull(this.serviceManager.getInstance("123", ":", ":", "127.0.0.1", 8080));
  }

  @Test
  public void testGetInstanceCount() {
    // Arrange, Act and Assert
    assertEquals(0, this.serviceManager.getInstanceCount());
  }

  @Test
  public void testGetPagedService() {
    // Arrange
    ArrayList<Service> serviceList = new ArrayList<Service>();
    serviceList.add(new Service());

    // Act and Assert
    assertEquals(0, this.serviceManager.getPagedService("123", 1, 3, ":", ":", serviceList));
  }

  @Test
  public void testGetResponsibleInstanceCount() {
    // Arrange, Act and Assert
    assertEquals(0, this.serviceManager.getResponsibleInstanceCount());
  }

  @Test
  public void testGetResponsibleServiceCount() {
    // Arrange, Act and Assert
    assertEquals(0, this.serviceManager.getResponsibleServiceCount());
  }

  @Test
  public void testGetResponsibleServices() {
    // Arrange, Act and Assert
    assertEquals(0, this.serviceManager.getResponsibleServices().size());
  }

  @Test
  public void testGetService() {
    // Arrange, Act and Assert
    assertNull(this.serviceManager.getService("123", ":"));
  }

  @Test
  public void testGetServiceCount() {
    // Arrange, Act and Assert
    assertEquals(1, this.serviceManager.getServiceCount());
  }

  @Test
  public void testGetServiceMap() {
    // Arrange, Act and Assert
    assertNull(this.serviceManager.getServiceMap("123"));
  }

  @Test
  public void testInterests() {
    // Arrange, Act and Assert
    assertFalse(this.serviceManager.interests(":"));
  }

  @Test
  public void testMatchUnlistenKey() {
    // Arrange, Act and Assert
    assertFalse(this.serviceManager.matchUnlistenKey(":"));
  }

  @Test
  public void testOnChange() throws Exception {
    // Arrange
    Service service = new Service();

    // Act
    this.serviceManager.onChange(":", service);

    // Assert
    assertEquals("public", service.getNamespaceId());
  }

  @Test
  public void testSearchServices() {
    // Arrange, Act and Assert
    assertEquals(0, this.serviceManager.searchServices("123", ":").size());
  }

  @Test
  public void testServiceChecksumConstructor() {
    // Arrange, Act and Assert
    assertEquals("public", (new ServiceManager.ServiceChecksum()).namespaceId);
  }

  @Test
  public void testServiceChecksumConstructor2() {
    // Arrange, Act and Assert
    assertEquals("123", (new ServiceManager.ServiceChecksum("123")).namespaceId);
  }
}

