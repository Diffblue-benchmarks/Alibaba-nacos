package com.alibaba.nacos.console.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.config.server.service.PersistService;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class HealthControllerDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    ResponseEntity livenessResult = (new HealthController(new PersistService(), null)).liveness();
    String actualToStringResult = livenessResult.toString();
    Object body = livenessResult.getBody();
    boolean actualHasBodyResult = livenessResult.hasBody();
    int actualStatusCodeValue = livenessResult.getStatusCodeValue();
    assertEquals("<200 OK OK,OK,{}>", actualToStringResult);
    assertEquals(HttpStatus.OK, livenessResult.getStatusCode());
    assertEquals(200, actualStatusCodeValue);
    assertTrue(actualHasBodyResult);
    assertTrue(body instanceof String);
    assertEquals("OK", body);
  }

  @Test(timeout=10000)
  public void livenessTest() {
    // Arrange and Act
    ResponseEntity actualLivenessResult = (new HealthController(new PersistService(), null)).liveness();

    // Assert
    String actualToStringResult = actualLivenessResult.toString();
    boolean actualHasBodyResult = actualLivenessResult.hasBody();
    assertEquals("<200 OK OK,OK,{}>", actualToStringResult);
    assertEquals(HttpStatus.OK, actualLivenessResult.getStatusCode());
    assertTrue(actualHasBodyResult);
  }
}

