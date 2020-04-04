package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DumpAllTaskDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    DumpAllTask actualDumpAllTask = new DumpAllTask();

    // Assert
    assertEquals(0L, actualDumpAllTask.getTaskInterval());
    assertEquals(0L, actualDumpAllTask.getLastProcessTime());
  }
}

