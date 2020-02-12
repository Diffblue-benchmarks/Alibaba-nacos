package com.alibaba.nacos.console.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ServerStateControllerDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    new ServerStateController();

    // Assert
    assertNull(ServerStateController.VERSION);
  }

  @Test(timeout=10000)
  public void serverStateTest() {
    // Arrange and Act
    ResponseEntity actualServerStateResult = (new ServerStateController()).serverState();

    // Assert
    String actualToStringResult = actualServerStateResult.toString();
    boolean actualHasBodyResult = actualServerStateResult.hasBody();
    assertEquals("<200 OK OK,{version=1.1.0, standalone_mode=cluster," + " function_mode=null},{}>",
        actualToStringResult);
    assertEquals(HttpStatus.OK, actualServerStateResult.getStatusCode());
    assertTrue(actualHasBodyResult);
  }
}

