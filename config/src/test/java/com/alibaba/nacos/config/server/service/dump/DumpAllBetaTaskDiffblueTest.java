package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DumpAllBetaTaskDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    DumpAllBetaTask actualDumpAllBetaTask = new DumpAllBetaTask();

    // Assert
    long actualTaskInterval = actualDumpAllBetaTask.getTaskInterval();
    assertEquals(0L, actualTaskInterval);
    assertEquals(0L, actualDumpAllBetaTask.getLastProcessTime());
  }
}

