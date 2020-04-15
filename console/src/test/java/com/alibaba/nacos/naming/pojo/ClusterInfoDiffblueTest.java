package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import org.junit.Test;

public class ClusterInfoDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new ClusterInfo()).getHosts());
  }

  @Test
  public void testSetHosts() {
    // Arrange
    ClusterInfo clusterInfo = new ClusterInfo();
    ArrayList<IpAddressInfo> ipAddressInfoList = new ArrayList<IpAddressInfo>();
    ipAddressInfoList.add(new IpAddressInfo());

    // Act
    clusterInfo.setHosts(ipAddressInfoList);

    // Assert
    assertSame(ipAddressInfoList, clusterInfo.getHosts());
  }
}

