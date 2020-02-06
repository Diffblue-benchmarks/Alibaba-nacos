package com.alibaba.nacos.naming.controllers;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.mock.web.MockHttpServletRequest;

public class ApiControllerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void srvIPXTTest() throws Exception {
    // Arrange
    ApiController apiController = new ApiController();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    apiController.srvIPXT(new MockHttpServletRequest());
  }
  @Test
  public void helloTest() throws Exception {
    // Arrange
    ApiController apiController = new ApiController();

    // Act and Assert
    assertEquals("ok", apiController.hello(new MockHttpServletRequest()));
  }
  @Test
  public void clientBeatTest() throws Exception {
    // Arrange
    ApiController apiController = new ApiController();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    apiController.clientBeat(new MockHttpServletRequest());
  }
}

