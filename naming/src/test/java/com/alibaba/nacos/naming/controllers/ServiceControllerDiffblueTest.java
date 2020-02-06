package com.alibaba.nacos.naming.controllers;

import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.mock.web.MockHttpServletRequest;

public class ServiceControllerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void updateTest() throws Exception {
    // Arrange
    ServiceController serviceController = new ServiceController();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    serviceController.update(new MockHttpServletRequest());
  }
  @Test
  public void listTest() throws Exception {
    // Arrange
    ServiceController serviceController = new ServiceController();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    serviceController.list(new MockHttpServletRequest());
  }
  @Test
  public void subscribersTest() {
    // Arrange
    ServiceController serviceController = new ServiceController();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    serviceController.subscribers(new MockHttpServletRequest());
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new ServiceController()).serviceManager);
  }
  @Test
  public void checksumTest() throws Exception {
    // Arrange
    ServiceController serviceController = new ServiceController();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    serviceController.checksum(new MockHttpServletRequest());
  }
}

