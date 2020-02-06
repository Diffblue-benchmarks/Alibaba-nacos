package com.alibaba.nacos.naming.controllers;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.mock.web.MockHttpServletRequest;

public class InstanceControllerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void detailTest() throws Exception {
    // Arrange
    InstanceController instanceController = new InstanceController();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    instanceController.detail(new MockHttpServletRequest());
  }
  @Test
  public void patchTest() throws Exception {
    // Arrange
    InstanceController instanceController = new InstanceController();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    instanceController.patch(new MockHttpServletRequest());
  }
  @Test
  public void deregisterTest() throws Exception {
    // Arrange
    InstanceController instanceController = new InstanceController();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    instanceController.deregister(new MockHttpServletRequest());
  }
  @Test
  public void listTest() throws Exception {
    // Arrange
    InstanceController instanceController = new InstanceController();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    instanceController.list(new MockHttpServletRequest());
  }
  @Test
  public void updateTest() throws Exception {
    // Arrange
    InstanceController instanceController = new InstanceController();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    instanceController.update(new MockHttpServletRequest());
  }
  @Test
  public void registerTest() throws Exception {
    // Arrange
    InstanceController instanceController = new InstanceController();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    instanceController.register(new MockHttpServletRequest());
  }
}

