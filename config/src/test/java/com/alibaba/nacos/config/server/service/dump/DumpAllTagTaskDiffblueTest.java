package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DumpAllTagTaskDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    DumpAllTagTask actualDumpAllTagTask = new DumpAllTagTask();

    // Assert
    long actualTaskInterval = actualDumpAllTagTask.getTaskInterval();
    assertEquals(0L, actualTaskInterval);
    assertEquals(0L, actualDumpAllTagTask.getLastProcessTime());
  }
}

