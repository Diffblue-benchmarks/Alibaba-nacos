package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HealthCheckTypeDiffblueTest {
  @Test
  public void testGetLoadedHealthCheckerClasses() {
    // Arrange, Act and Assert
    assertEquals(4, HealthCheckType.getLoadedHealthCheckerClasses().size());
  }
}

