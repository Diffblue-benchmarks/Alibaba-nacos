package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DumpAllTagTaskDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    DumpAllTagTask actualDumpAllTagTask = new DumpAllTagTask();

    // Assert
    assertEquals(0L, actualDumpAllTagTask.getTaskInterval());
    assertEquals(0L, actualDumpAllTagTask.getLastProcessTime());
  }
}

