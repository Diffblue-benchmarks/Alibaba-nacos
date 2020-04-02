package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.alibaba.nacos.naming.core.Instance;
import org.junit.Test;

public class HealthCheckCommonDiffblueTest {
  @Test
  public void testHealthCheckResultConstructor() {
    // Arrange
    Instance instance = new Instance();

    // Act
    HealthCheckCommon.HealthCheckResult actualHealthCheckResult = new HealthCheckCommon.HealthCheckResult("serviceName",
        instance);

    // Assert
    assertSame(instance, actualHealthCheckResult.getInstance());
    assertEquals("serviceName", actualHealthCheckResult.getServiceName());
  }

  @Test
  public void testHealthCheckResultSetInstance() {
    // Arrange
    Instance instance = new Instance();
    HealthCheckCommon.HealthCheckResult healthCheckResult = new HealthCheckCommon.HealthCheckResult("serviceName",
        instance);

    // Act
    healthCheckResult.setInstance(instance);

    // Assert
    assertSame(instance, healthCheckResult.getInstance());
  }

  @Test
  public void testHealthCheckResultSetServiceName() {
    // Arrange
    HealthCheckCommon.HealthCheckResult healthCheckResult = new HealthCheckCommon.HealthCheckResult("serviceName",
        new Instance());

    // Act
    healthCheckResult.setServiceName("serviceName");

    // Assert
    assertEquals("serviceName", healthCheckResult.getServiceName());
  }
}

