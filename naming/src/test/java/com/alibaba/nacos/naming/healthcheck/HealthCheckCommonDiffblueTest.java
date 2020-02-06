package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.alibaba.nacos.naming.core.Instance;
import org.junit.Test;

public class HealthCheckCommonDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    HealthCheckCommon.HealthCheckResult actualHealthCheckResult = new HealthCheckCommon.HealthCheckResult("aaaaa",
        instance);

    // Assert
    Instance actualInstance = actualHealthCheckResult.getInstance();
    assertSame(instance, actualInstance);
    assertEquals("aaaaa", actualHealthCheckResult.getServiceName());
  }
}

