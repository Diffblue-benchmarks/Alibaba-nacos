package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertEquals;
import com.alibaba.nacos.naming.core.Instance;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.Test;

public class HealthCheckStatusDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(-1L, (new HealthCheckStatus()).checkRT);
  }

  @Test
  public void testGet() {
    // Arrange
    Instance instance = new Instance();

    // Act and Assert
    assertEquals(0, HealthCheckStatus.get(instance).checkOKCount.getAndDecrement());
    assertEquals(0, instance.getPort());
    assertEquals(-1L, instance.getCheckRT());
    assertEquals("null:unknown:null_1.0_true_false_null", instance.toString());
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

  @Test
  public void testReset() {
    // Arrange
    Instance instance = new Instance();

    // Act
    HealthCheckStatus.reset(instance);

    // Assert
    AtomicInteger oKCount = instance.getOKCount();
    assertEquals(-1L, instance.getCheckRT());
    assertEquals("null:0", instance.toIPAddr());
    assertEquals(0, oKCount.getAndDecrement());
    assertEquals(-1, oKCount.getAndIncrement());
  }
}

