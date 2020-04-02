package com.alibaba.nacos.naming.controllers;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

public class RaftControllerDiffblueTest {
  @Test
  public void testGetAcceptEncoding() {
    // Arrange, Act and Assert
    assertEquals("UTF-8", RaftController.getAcceptEncoding(new MockHttpServletRequest()));
  }
}

