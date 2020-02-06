package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ServiceViewDiffblueTest {
  @Test
  public void getClusterCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServiceView()).getClusterCount());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ServiceView actualServiceView = new ServiceView();

    // Assert
    String actualGroupName = actualServiceView.getGroupName();
    int actualIpCount = actualServiceView.getIpCount();
    String actualName = actualServiceView.getName();
    String actualToStringResult = actualServiceView.toString();
    int actualClusterCount = actualServiceView.getClusterCount();
    String actualTriggerFlag = actualServiceView.getTriggerFlag();
    assertNull(actualGroupName);
    assertEquals(0, actualServiceView.getHealthyInstanceCount());
    assertNull(actualTriggerFlag);
    assertEquals(0, actualClusterCount);
    assertEquals("{\"clusterCount\":0,\"healthyInstanceCount\":0," + "\"ipCount\":0}", actualToStringResult);
    assertNull(actualName);
    assertEquals(0, actualIpCount);
  }

  @Test
  public void toStringTest() {
    // Arrange
    ServiceView serviceView = new ServiceView();

    // Act and Assert
    assertEquals("{\"clusterCount\":0,\"healthyInstanceCount\":0," + "\"ipCount\":0}", serviceView.toString());
    assertEquals("{\"clusterCount\":0,\"healthyInstanceCount\":0," + "\"ipCount\":0}", serviceView.toString());
  }
}

