package com.alibaba.nacos.naming.controllers;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ClusterControllerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new ClusterController()).serviceManager);
  }
}

