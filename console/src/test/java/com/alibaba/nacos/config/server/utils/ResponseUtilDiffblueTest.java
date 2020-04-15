package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletResponse;

public class ResponseUtilDiffblueTest {
  @Test
  public void testWriteErrMsg() {
    // Arrange
    MockHttpServletResponse mockHttpServletResponse = new MockHttpServletResponse();

    // Act
    ResponseUtil.writeErrMsg(mockHttpServletResponse, 19088743, "msg");

    // Assert
    assertEquals(19088743, mockHttpServletResponse.getStatus());
  }
}

