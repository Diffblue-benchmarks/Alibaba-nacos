package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NoneHealthCheckProcessorDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("NONE", (new NoneHealthCheckProcessor()).getType());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertEquals("NONE", (new NoneHealthCheckProcessor()).getType());
  }
}

