package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DumpChangeTaskDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    DumpChangeTask actualDumpChangeTask = new DumpChangeTask();

    // Assert
    assertEquals(0L, actualDumpChangeTask.getTaskInterval());
    assertEquals(0L, actualDumpChangeTask.getLastProcessTime());
  }
}

