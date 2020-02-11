package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DumpAllTaskDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    DumpAllTask actualDumpAllTask = new DumpAllTask();

    // Assert
    long actualTaskInterval = actualDumpAllTask.getTaskInterval();
    assertEquals(0L, actualTaskInterval);
    assertEquals(0L, actualDumpAllTask.getLastProcessTime());
  }
}

