package com.alibaba.nacos.naming.controllers;

import static org.junit.Assert.assertEquals;
import org.apache.catalina.connector.Response;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.mock.web.MockHttpServletRequest;

public class RaftControllerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void reloadDatumTest() throws Exception {
    // Arrange
    RaftController raftController = new RaftController();
    MockHttpServletRequest request = new MockHttpServletRequest();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    raftController.reloadDatum(request, new Response());
  }

  @Test
  public void voteTest() throws Exception {
    // Arrange
    RaftController raftController = new RaftController();
    MockHttpServletRequest request = new MockHttpServletRequest();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    raftController.vote(request, new Response());
  }

  @Test
  public void getAcceptEncodingTest() {
    // Arrange, Act and Assert
    assertEquals("UTF-8", RaftController.getAcceptEncoding(new MockHttpServletRequest()));
  }
}

