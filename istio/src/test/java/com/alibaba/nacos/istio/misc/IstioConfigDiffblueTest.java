package com.alibaba.nacos.istio.misc;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class IstioConfigDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertFalse((new IstioConfig()).isMcpServerEnabled());
  }

  @Test
  public void isMcpServerEnabledTest() {
    // Arrange, Act and Assert
    assertFalse((new IstioConfig()).isMcpServerEnabled());
  }
}

