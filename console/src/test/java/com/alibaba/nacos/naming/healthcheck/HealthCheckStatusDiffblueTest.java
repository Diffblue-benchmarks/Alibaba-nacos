package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.naming.core.Instance;
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
    assertFalse(HealthCheckStatus.get(instance).isBeingChecked.get());
    assertEquals(30000L, instance.getIpDeleteTimeout());
    assertTrue(instance.isEnabled());
    assertEquals(-1L, instance.getCheckRT());
    assertEquals("null:unknown:null_1.0_true_false_null", instance.toString());
    assertNull(instance.getServiceName());
    assertEquals(1.0, instance.getWeight(), 0.0);
  }

  @Test
  public void testRemv() {
    // Arrange
    Instance instance = new Instance();

    // Act
    HealthCheckStatus.remv(instance);

    // Assert
    assertEquals(5000L, instance.getInstanceHeartBeatInterval());
    assertEquals(15000L, instance.getInstanceHeartBeatTimeOut());
    assertFalse(instance.isMarked());
    assertTrue(instance.isEphemeral());
    assertEquals(-1L, instance.getCheckRT());
    assertNull(instance.getServiceName());
    assertFalse(instance.isMockValid());
  }

  @Test
  public void testReset() {
    // Arrange
    Instance instance = new Instance();

    // Act
    HealthCheckStatus.reset(instance);

    // Assert
    assertEquals(30000L, instance.getIpDeleteTimeout());
    assertTrue(instance.isEphemeral());
    assertEquals(-1L, instance.getCheckRT());
    assertNull(instance.getInstanceId());
    assertFalse(instance.isMockValid());
  }
}

