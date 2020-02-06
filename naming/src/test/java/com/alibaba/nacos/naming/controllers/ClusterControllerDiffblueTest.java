package com.alibaba.nacos.naming.controllers;

import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.mock.web.MockHttpServletRequest;

public class ClusterControllerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void updateTest() throws Exception {
    // Arrange
    ClusterController clusterController = new ClusterController();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    clusterController.update(new MockHttpServletRequest());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new ClusterController()).serviceManager);
  }
}

