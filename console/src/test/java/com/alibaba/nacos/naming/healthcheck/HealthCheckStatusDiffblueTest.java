package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertEquals;
import com.alibaba.nacos.naming.core.Instance;
import org.junit.Test;

public class HealthCheckStatusDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(-1L, (new HealthCheckStatus()).checkRT);
  }

  @Test
  public void testRemv() {
    // Arrange
    Instance instance = new Instance();

    // Act
    HealthCheckStatus.remv(instance);

    // Assert
    assertEquals(-1L, instance.getCheckRT());
  }
}

