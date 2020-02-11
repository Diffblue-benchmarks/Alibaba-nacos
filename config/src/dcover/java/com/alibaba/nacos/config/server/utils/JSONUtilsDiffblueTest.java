package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import java.io.IOException;
import org.junit.Test;

public class JSONUtilsDiffblueTest {
  @Test(timeout=10000)
  public void serializeObjectTest() throws IOException {
    // Arrange, Act and Assert
    assertEquals("\"foo\"", JSONUtils.serializeObject("foo"));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertSame((new JSONUtils()).mapper, JSONUtils.mapper);
  }
}

