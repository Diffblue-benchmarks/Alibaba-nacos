package com.alibaba.nacos.naming.healthcheck.events;

import static org.junit.Assert.assertSame;
import com.alibaba.nacos.naming.core.Instance;
import org.junit.Test;

public class InstanceHeartbeatTimeoutEventDiffblueTest {
  @Test
  public void setInstanceTest() {
    // Arrange
    Instance instance = new Instance();
    InstanceHeartbeatTimeoutEvent instanceHeartbeatTimeoutEvent = new InstanceHeartbeatTimeoutEvent("aaaaa", instance);

    // Act
    instanceHeartbeatTimeoutEvent.setInstance(instance);

    // Assert
    assertSame(instance, instanceHeartbeatTimeoutEvent.getInstance());
  }

  @Test
  public void getInstanceTest() {
    // Arrange
    Instance instance = new Instance();

    // Act and Assert
    assertSame(instance, (new InstanceHeartbeatTimeoutEvent("aaaaa", instance)).getInstance());
  }

  @Test
  public void constructorTest() {
    // Arrange
    Instance instance = new Instance();

    // Act and Assert
    assertSame(instance, (new InstanceHeartbeatTimeoutEvent("aaaaa", instance)).getInstance());
  }
}

