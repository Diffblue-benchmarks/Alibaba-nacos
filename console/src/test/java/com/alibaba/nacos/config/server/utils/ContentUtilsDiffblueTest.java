package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContentUtilsDiffblueTest {
  @Test
  public void testTruncateContent() {
    // Arrange
    String actualTruncateContentResult = ContentUtils.truncateContent("");

    // Act and Assert
    assertEquals("", actualTruncateContentResult);
    assertEquals("", ContentUtils.truncateContent(null));
  }
}

