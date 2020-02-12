package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ServiceViewDiffblueTest {
  @Test(timeout=10000)
  public void getHealthyInstanceCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceView()).getHealthyInstanceCount());
  }

  @Test(timeout=10000)
  public void setClusterCountTest() {
    // Arrange
    ServiceView serviceView = new ServiceView();

    // Act
    serviceView.setClusterCount(3);

    // Assert
    assertEquals(3, serviceView.getClusterCount());
  }

  @Test(timeout=10000)
  public void setGroupNameTest() {
    // Arrange
    ServiceView serviceView = new ServiceView();

    // Act
    serviceView.setGroupName("name");

    // Assert
    assertEquals("name", serviceView.getGroupName());
  }

  @Test(timeout=10000)
  public void setNameTest() {
    // Arrange
    ServiceView serviceView = new ServiceView();

    // Act
    serviceView.setName("name");

    // Assert
    assertEquals("name", serviceView.getName());
  }

  @Test(timeout=10000)
  public void getClusterCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceView()).getClusterCount());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ServiceView actualServiceView = new ServiceView();

    // Assert
    String actualGroupName = actualServiceView.getGroupName();
    int actualIpCount = actualServiceView.getIpCount();
    String actualName = actualServiceView.getName();
    String actualToStringResult = actualServiceView.toString();
    int actualClusterCount = actualServiceView.getClusterCount();
    assertNull(actualGroupName);
    assertEquals(0, actualServiceView.getHealthyInstanceCount());
    assertEquals(0, actualClusterCount);
    assertEquals("{\"clusterCount\":0,\"healthyInstanceCount\":0," + "\"ipCount\":0}", actualToStringResult);
    assertNull(actualName);
    assertEquals(0, actualIpCount);
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    ServiceView serviceView = new ServiceView();

    // Act and Assert
    assertEquals("{\"clusterCount\":0,\"healthyInstanceCount\":0," + "\"ipCount\":0}", serviceView.toString());
    assertEquals("{\"clusterCount\":0,\"healthyInstanceCount\":0," + "\"ipCount\":0}", serviceView.toString());
  }

  @Test(timeout=10000)
  public void getNameTest() {
    // Arrange, Act and Assert
    assertNull((new ServiceView()).getName());
  }

  @Test(timeout=10000)
  public void setHealthyInstanceCountTest() {
    // Arrange
    ServiceView serviceView = new ServiceView();

    // Act
    serviceView.setHealthyInstanceCount(3);

    // Assert
    assertEquals(3, serviceView.getHealthyInstanceCount());
  }

  @Test(timeout=10000)
  public void getIpCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceView()).getIpCount());
  }

  @Test(timeout=10000)
  public void getGroupNameTest() {
    // Arrange, Act and Assert
    assertNull((new ServiceView()).getGroupName());
  }
}

