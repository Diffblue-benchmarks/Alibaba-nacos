package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HttpHealthCheckProcessorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("HTTP", (new HttpHealthCheckProcessor()).getType());
  }
}

