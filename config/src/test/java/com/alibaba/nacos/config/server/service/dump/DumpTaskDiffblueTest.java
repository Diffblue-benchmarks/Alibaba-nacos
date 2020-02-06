package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DumpTaskDiffblueTest {
  @Test
  public void constructorTest3() {
    // Arrange and Act
    DumpTask actualDumpTask = new DumpTask("aaaaa", "aaaaa", 1L, "aaaaa", true);

    // Assert
    assertEquals(1000L, actualDumpTask.getTaskInterval());
    assertEquals("aaaaa", actualDumpTask.groupKey);
    assertTrue(actualDumpTask.isBeta);
    assertEquals("aaaaa", actualDumpTask.tag);
    assertEquals(1L, actualDumpTask.lastModified);
    assertEquals("aaaaa", actualDumpTask.handleIp);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    DumpTask actualDumpTask = new DumpTask("aaaaa", 1L, "aaaaa", true);

    // Assert
    assertEquals(1000L, actualDumpTask.getTaskInterval());
    assertEquals("aaaaa", actualDumpTask.groupKey);
    assertTrue(actualDumpTask.isBeta);
    assertNull(actualDumpTask.tag);
    assertEquals(1L, actualDumpTask.lastModified);
    assertEquals("aaaaa", actualDumpTask.handleIp);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    DumpTask actualDumpTask = new DumpTask("aaaaa", 1L, "aaaaa");

    // Assert
    assertEquals(1000L, actualDumpTask.getTaskInterval());
    assertEquals("aaaaa", actualDumpTask.groupKey);
    assertFalse(actualDumpTask.isBeta);
    assertNull(actualDumpTask.tag);
    assertEquals(1L, actualDumpTask.lastModified);
    assertEquals("aaaaa", actualDumpTask.handleIp);
  }
}

