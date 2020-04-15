package com.alibaba.nacos.config.server.service.notify;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NotifyServiceDiffblueTest {
  @Test
  public void testHttpResultConstructor() {
    // Arrange and Act
    NotifyService.HttpResult actualHttpResult = new NotifyService.HttpResult(1, "content");

    // Assert
    assertEquals(1, actualHttpResult.code);
    assertEquals("content", actualHttpResult.content);
  }
}

