package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.io.IOException;
import org.junit.Test;

public class JSONUtilsDiffblueTest {
  @Test
  public void serializeObjectTest() throws IOException {
    // Arrange, Act and Assert
    assertEquals("\"aaaaa\"", JSONUtils.serializeObject("aaaaa"));
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertSame((new JSONUtils()).mapper, JSONUtils.mapper);
  }
}

