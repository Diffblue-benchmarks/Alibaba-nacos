package com.alibaba.nacos.console.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.config.server.service.PersistService;
import com.alibaba.nacos.naming.controllers.OperatorController;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class HealthControllerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    PersistService persistService = new PersistService();

    // Act and Assert
    ResponseEntity livenessResult = (new HealthController(persistService, new OperatorController())).liveness();
    assertEquals("<200 OK OK,OK,{}>", livenessResult.toString());
    assertEquals(HttpStatus.OK, livenessResult.getStatusCode());
    assertEquals(200, livenessResult.getStatusCodeValue());
    assertTrue(livenessResult.hasBody());
    Object body = livenessResult.getBody();
    assertTrue(body instanceof String);
    assertEquals("OK", body);
  }
}

