package com.alibaba.nacos.naming.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.mock.web.MockHttpServletRequest;

public class OperatorControllerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void distroStatusTest3() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new OperatorController()).distroStatus("view");
  }

  @Test
  public void distroStatusTest2() {
    // Arrange, Act and Assert
    thrown.expect(NullPointerException.class);
    (new OperatorController()).distroStatus("clean");
  }

  @Test
  public void distroStatusTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new OperatorController()).distroStatus("foo").size());
  }

  @Test
  public void setLogLevelTest() {
    // Arrange, Act and Assert
    assertEquals("ok", (new OperatorController()).setLogLevel("name", "foo"));
  }

  @Test
  public void switchesTest() {
    // Arrange
    OperatorController operatorController = new OperatorController();

    // Act and Assert
    assertNull(operatorController.switches(new MockHttpServletRequest()));
  }
}

