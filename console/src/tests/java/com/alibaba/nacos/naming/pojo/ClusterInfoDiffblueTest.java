package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ClusterInfoDiffblueTest {
  @Test(timeout=10000)
  public void setHostsTest() {
    // Arrange
    ClusterInfo clusterInfo = new ClusterInfo();

    // Act
    clusterInfo.setHosts(null);

    // Assert
    assertNull(clusterInfo.getHosts());
  }

  @Test(timeout=10000)
  public void getHostsTest() {
    // Arrange, Act and Assert
    assertNull((new ClusterInfo()).getHosts());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new ClusterInfo()).getHosts());
  }
}

