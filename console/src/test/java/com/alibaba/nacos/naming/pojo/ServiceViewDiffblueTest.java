package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ServiceViewDiffblueTest {
  @Test
  public void testSetClusterCount() {
    // Arrange
    ServiceView serviceView = new ServiceView();

    // Act
    serviceView.setClusterCount(3);

    // Assert
    assertEquals(3, serviceView.getClusterCount());
  }

  @Test
  public void testSetGroupName() {
    // Arrange
    ServiceView serviceView = new ServiceView();

    // Act
    serviceView.setGroupName("groupName");

    // Assert
    assertEquals("groupName", serviceView.getGroupName());
  }

  @Test
  public void testSetHealthyInstanceCount() {
    // Arrange
    ServiceView serviceView = new ServiceView();

    // Act
    serviceView.setHealthyInstanceCount(3);

    // Assert
    assertEquals(3, serviceView.getHealthyInstanceCount());
  }

  @Test
  public void testSetIpCount() {
    // Arrange
    ServiceView serviceView = new ServiceView();

    // Act
    serviceView.setIpCount(3);

    // Assert
    assertEquals(3, serviceView.getIpCount());
  }

  @Test
  public void testSetName() {
    // Arrange
    ServiceView serviceView = new ServiceView();

    // Act
    serviceView.setName("name");

    // Assert
    assertEquals("name", serviceView.getName());
  }
}

