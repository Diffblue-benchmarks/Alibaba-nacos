package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TcpSuperSenseProcessorDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("TCP", (new TcpSuperSenseProcessor()).getType());
  }

  @Test(timeout=10000)
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertEquals("TCP", (new TcpSuperSenseProcessor()).getType());
  }
}

