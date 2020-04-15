package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DumpAllBetaTaskDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    DumpAllBetaTask actualDumpAllBetaTask = new DumpAllBetaTask();

    // Assert
    assertEquals(0L, actualDumpAllBetaTask.getTaskInterval());
    assertEquals(0L, actualDumpAllBetaTask.getLastProcessTime());
  }
}

