package com.alibaba.nacos.naming.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

public class HealthControllerDiffblueTest {
  @Test(timeout=10000)
  public void checkersTest() {
    // Arrange and Act
    ResponseEntity actualCheckersResult = (new HealthController()).checkers();

    // Assert
    boolean actualHasBodyResult = actualCheckersResult.hasBody();
    assertEquals(200, actualCheckersResult.getStatusCodeValue());
    assertTrue(actualHasBodyResult);
  }
}

