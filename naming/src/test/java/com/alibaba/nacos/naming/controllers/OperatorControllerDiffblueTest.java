package com.alibaba.nacos.naming.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

public class OperatorControllerDiffblueTest {
  @Test
  public void distroStatusTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new OperatorController()).distroStatus("UTF-8").size());
  }

  @Test
  public void setLogLevelTest() {
    // Arrange, Act and Assert
    assertEquals("ok", (new OperatorController()).setLogLevel("UTF-8", "UTF-8"));
  }

  @Test
  public void switchesTest() {
    // Arrange
    OperatorController operatorController = new OperatorController();

    // Act and Assert
    assertNull(operatorController.switches(new MockHttpServletRequest()));
  }
}

