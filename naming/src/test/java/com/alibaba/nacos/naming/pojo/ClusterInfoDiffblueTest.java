package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ClusterInfoDiffblueTest {
  @Test
  public void setHostsTest() {
    // Arrange
    ClusterInfo clusterInfo = new ClusterInfo();

    // Act
    clusterInfo.setHosts(null);

    // Assert
    assertNull(clusterInfo.getHosts());
  }

  @Test
  public void getHostsTest() {
    // Arrange, Act and Assert
    assertNull((new ClusterInfo()).getHosts());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new ClusterInfo()).getHosts());
  }
}

