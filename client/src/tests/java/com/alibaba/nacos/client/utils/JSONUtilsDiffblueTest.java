package com.alibaba.nacos.client.utils;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;

public class JSONUtilsDiffblueTest {
  @Test(timeout=10000)
  public void serializeObjectTest() throws IOException {
    // Arrange, Act and Assert
    assertEquals("\"foo\"", JSONUtils.serializeObject("foo"));
  }
}

