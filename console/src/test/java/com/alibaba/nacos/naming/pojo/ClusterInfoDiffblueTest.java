package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ClusterInfoDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new ClusterInfo()).getHosts());
  }
}

