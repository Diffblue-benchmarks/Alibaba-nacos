package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.alibaba.nacos.api.naming.pojo.Service;
import org.junit.Test;

public class ServiceDetailViewDiffblueTest {
  @Test(timeout=10000)
  public void setClustersTest() {
    // Arrange
    ServiceDetailView serviceDetailView = new ServiceDetailView();

    // Act
    serviceDetailView.setClusters(null);

    // Assert
    assertNull(serviceDetailView.getClusters());
  }

  @Test(timeout=10000)
  public void getClustersTest() {
    // Arrange, Act and Assert
    assertNull((new ServiceDetailView()).getClusters());
  }

  @Test(timeout=10000)
  public void getServiceTest() {
    // Arrange, Act and Assert
    assertNull((new ServiceDetailView()).getService());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ServiceDetailView actualServiceDetailView = new ServiceDetailView();

    // Assert
    String actualToStringResult = actualServiceDetailView.toString();
    Service actualService = actualServiceDetailView.getService();
    assertEquals("{}", actualToStringResult);
    assertNull(actualServiceDetailView.getClusters());
    assertNull(actualService);
  }

  @Test(timeout=10000)
  public void setServiceTest() {
    // Arrange
    ServiceDetailView serviceDetailView = new ServiceDetailView();
    Service service = new Service();

    // Act
    serviceDetailView.setService(service);

    // Assert
    assertSame(service, serviceDetailView.getService());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    ServiceDetailView serviceDetailView = new ServiceDetailView();

    // Act and Assert
    assertEquals("{}", serviceDetailView.toString());
    assertEquals("{}", serviceDetailView.toString());
  }
}

