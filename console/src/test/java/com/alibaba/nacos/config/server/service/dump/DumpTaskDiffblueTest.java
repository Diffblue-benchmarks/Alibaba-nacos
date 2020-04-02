package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DumpTaskDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    DumpTask actualDumpTask = new DumpTask("groupKey", 1000L, "handleIp");

    // Assert
    assertEquals(1000L, actualDumpTask.getTaskInterval());
    assertEquals("groupKey", actualDumpTask.groupKey);
    assertFalse(actualDumpTask.isBeta);
    assertNull(actualDumpTask.tag);
    assertEquals(1000L, actualDumpTask.lastModified);
    assertEquals("handleIp", actualDumpTask.handleIp);
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    DumpTask actualDumpTask = new DumpTask("groupKey", 1000L, "handleIp", true);

    // Assert
    assertEquals(1000L, actualDumpTask.getTaskInterval());
    assertEquals("groupKey", actualDumpTask.groupKey);
    assertTrue(actualDumpTask.isBeta);
    assertNull(actualDumpTask.tag);
    assertEquals(1000L, actualDumpTask.lastModified);
    assertEquals("handleIp", actualDumpTask.handleIp);
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    DumpTask actualDumpTask = new DumpTask("groupKey", "tag", 1000L, "handleIp", true);

    // Assert
    assertEquals(1000L, actualDumpTask.getTaskInterval());
    assertEquals("groupKey", actualDumpTask.groupKey);
    assertTrue(actualDumpTask.isBeta);
    assertEquals("tag", actualDumpTask.tag);
    assertEquals(1000L, actualDumpTask.lastModified);
    assertEquals("handleIp", actualDumpTask.handleIp);
  }
}

