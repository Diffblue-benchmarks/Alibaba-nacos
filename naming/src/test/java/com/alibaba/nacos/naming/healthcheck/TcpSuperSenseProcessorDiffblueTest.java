package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TcpSuperSenseProcessorDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("TCP", (new TcpSuperSenseProcessor()).getType());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertEquals("TCP", (new TcpSuperSenseProcessor()).getType());
  }
}

