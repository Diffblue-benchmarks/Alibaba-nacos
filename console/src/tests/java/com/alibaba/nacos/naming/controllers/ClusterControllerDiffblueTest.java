package com.alibaba.nacos.naming.controllers;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ClusterControllerDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new ClusterController()).serviceManager);
  }
}

