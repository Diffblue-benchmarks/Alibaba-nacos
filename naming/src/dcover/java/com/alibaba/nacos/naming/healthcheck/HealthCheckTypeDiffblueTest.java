package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class HealthCheckTypeDiffblueTest {
  @Test(timeout=10000)
  public void ofHealthCheckerClassTest() {
    // Arrange, Act and Assert
    assertNull(HealthCheckType.ofHealthCheckerClass("foo"));
  }
}

