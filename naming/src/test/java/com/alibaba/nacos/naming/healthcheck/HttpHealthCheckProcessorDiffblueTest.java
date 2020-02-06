package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HttpHealthCheckProcessorDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("HTTP", (new HttpHealthCheckProcessor()).getType());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertEquals("HTTP", (new HttpHealthCheckProcessor()).getType());
  }
}

