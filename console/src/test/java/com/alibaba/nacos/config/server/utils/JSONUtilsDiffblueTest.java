package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.io.IOException;
import org.junit.Test;

public class JSONUtilsDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertSame((new JSONUtils()).mapper, JSONUtils.mapper);
  }

  @Test
  public void testSerializeObject() throws IOException {
    // Arrange, Act and Assert
    assertEquals("\"o\"", JSONUtils.serializeObject("o"));
  }
}

