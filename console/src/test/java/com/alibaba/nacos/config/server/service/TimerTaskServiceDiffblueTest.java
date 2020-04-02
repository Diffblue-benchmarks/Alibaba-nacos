package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertNull;
import ch.qos.logback.classic.joran.ReconfigureOnChangeTask;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class TimerTaskServiceDiffblueTest {
  @Test
  public void testScheduleWithFixedDelay() {
    // Arrange
    ReconfigureOnChangeTask reconfigureOnChangeTask = new ReconfigureOnChangeTask();

    // Act
    TimerTaskService.scheduleWithFixedDelay(reconfigureOnChangeTask, 1L, 1L, TimeUnit.NANOSECONDS);

    // Assert
    assertNull(reconfigureOnChangeTask.getContext());
  }
}

