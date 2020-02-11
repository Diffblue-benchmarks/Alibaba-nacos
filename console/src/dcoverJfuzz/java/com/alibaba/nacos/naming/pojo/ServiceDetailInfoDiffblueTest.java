package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.Map;
import org.junit.Test;

public class ServiceDetailInfoDiffblueTest {
  @Test(timeout=10000)
  public void setServiceNameTest() {
    // Arrange
    ServiceDetailInfo serviceDetailInfo = new ServiceDetailInfo();

    // Act
    serviceDetailInfo.setServiceName("name");

    // Assert
    assertEquals("name", serviceDetailInfo.getServiceName());
  }

  @Test(timeout=10000)
  public void setClusterMapTest() {
    // Arrange
    ServiceDetailInfo serviceDetailInfo = new ServiceDetailInfo();

    // Act
    serviceDetailInfo.setClusterMap(null);

    // Assert
    assertNull(serviceDetailInfo.getClusterMap());
  }

  @Test(timeout=10000)
  public void getServiceNameTest() {
    // Arrange, Act and Assert
    assertNull((new ServiceDetailInfo()).getServiceName());
  }

  @Test(timeout=10000)
  public void setGroupNameTest() {
    // Arrange
    ServiceDetailInfo serviceDetailInfo = new ServiceDetailInfo();

    // Act
    serviceDetailInfo.setGroupName("name");

    // Assert
    assertEquals("name", serviceDetailInfo.getGroupName());
  }

  @Test(timeout=10000)
  public void getMetadataTest() {
    // Arrange, Act and Assert
    assertNull((new ServiceDetailInfo()).getMetadata());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ServiceDetailInfo actualServiceDetailInfo = new ServiceDetailInfo();

    // Assert
    String actualGroupName = actualServiceDetailInfo.getGroupName();
    Map<String, ClusterInfo> actualClusterMap = actualServiceDetailInfo.getClusterMap();
    Map<String, String> actualMetadata = actualServiceDetailInfo.getMetadata();
    assertNull(actualGroupName);
    assertNull(actualServiceDetailInfo.getServiceName());
    assertNull(actualMetadata);
    assertNull(actualClusterMap);
  }

  @Test(timeout=10000)
  public void setMetadataTest() {
    // Arrange
    ServiceDetailInfo serviceDetailInfo = new ServiceDetailInfo();

    // Act
    serviceDetailInfo.setMetadata(null);

    // Assert
    assertNull(serviceDetailInfo.getMetadata());
  }

  @Test(timeout=10000)
  public void getClusterMapTest() {
    // Arrange, Act and Assert
    assertNull((new ServiceDetailInfo()).getClusterMap());
  }

  @Test(timeout=10000)
  public void getGroupNameTest() {
    // Arrange, Act and Assert
    assertNull((new ServiceDetailInfo()).getGroupName());
  }
}

