package com.alibaba.nacos.naming.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;

public class HealthControllerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void checkersTest() {
    // Arrange and Act
    ResponseEntity actualCheckersResult = (new HealthController()).checkers();

    // Assert
    boolean actualHasBodyResult = actualCheckersResult.hasBody();
    assertEquals(200, actualCheckersResult.getStatusCodeValue());
    assertTrue(actualHasBodyResult);
  }
  @Test
  public void updateTest() {
    // Arrange
    HealthController healthController = new HealthController();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    healthController.update(new MockHttpServletRequest());
  }
}

