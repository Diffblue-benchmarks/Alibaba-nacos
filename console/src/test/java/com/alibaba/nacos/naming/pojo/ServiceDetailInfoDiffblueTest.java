package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.HashMap;
import org.junit.Test;

public class ServiceDetailInfoDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ServiceDetailInfo actualServiceDetailInfo = new ServiceDetailInfo();

    // Assert
    assertNull(actualServiceDetailInfo.getGroupName());
    assertNull(actualServiceDetailInfo.getServiceName());
    assertNull(actualServiceDetailInfo.getMetadata());
    assertNull(actualServiceDetailInfo.getClusterMap());
  }

  @Test
  public void testSetClusterMap() {
    // Arrange
    ServiceDetailInfo serviceDetailInfo = new ServiceDetailInfo();
    HashMap<String, ClusterInfo> stringClusterInfoMap = new HashMap<String, ClusterInfo>();
    stringClusterInfoMap.put("foo", new ClusterInfo());

    // Act
    serviceDetailInfo.setClusterMap(stringClusterInfoMap);

    // Assert
    assertSame(stringClusterInfoMap, serviceDetailInfo.getClusterMap());
  }

  @Test
  public void testSetGroupName() {
    // Arrange
    ServiceDetailInfo serviceDetailInfo = new ServiceDetailInfo();

    // Act
    serviceDetailInfo.setGroupName("groupName");

    // Assert
    assertEquals("groupName", serviceDetailInfo.getGroupName());
  }

  @Test
  public void testSetMetadata() {
    // Arrange
    ServiceDetailInfo serviceDetailInfo = new ServiceDetailInfo();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    serviceDetailInfo.setMetadata(stringStringMap);

    // Assert
    assertSame(stringStringMap, serviceDetailInfo.getMetadata());
  }

  @Test
  public void testSetServiceName() {
    // Arrange
    ServiceDetailInfo serviceDetailInfo = new ServiceDetailInfo();

    // Act
    serviceDetailInfo.setServiceName("serviceName");

    // Assert
    assertEquals("serviceName", serviceDetailInfo.getServiceName());
  }
}

