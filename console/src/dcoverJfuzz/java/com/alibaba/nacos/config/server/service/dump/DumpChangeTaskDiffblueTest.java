package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DumpChangeTaskDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    DumpChangeTask actualDumpChangeTask = new DumpChangeTask();

    // Assert
    long actualTaskInterval = actualDumpChangeTask.getTaskInterval();
    assertEquals(0L, actualTaskInterval);
    assertEquals(0L, actualDumpChangeTask.getLastProcessTime());
  }
}

