package com.alibaba.nacos.config.server.service.dump;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DumpTaskDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange and Act
    DumpTask actualDumpTask = new DumpTask("foo", "foo", 1L, "foo", true);

    // Assert
    assertEquals(1000L, actualDumpTask.getTaskInterval());
    assertEquals("foo", actualDumpTask.groupKey);
    assertTrue(actualDumpTask.isBeta);
    assertEquals("foo", actualDumpTask.tag);
    assertEquals(1L, actualDumpTask.lastModified);
    assertEquals("foo", actualDumpTask.handleIp);
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    DumpTask actualDumpTask = new DumpTask("foo", 1L, "foo", true);

    // Assert
    assertEquals(1000L, actualDumpTask.getTaskInterval());
    assertEquals("foo", actualDumpTask.groupKey);
    assertTrue(actualDumpTask.isBeta);
    assertNull(actualDumpTask.tag);
    assertEquals(1L, actualDumpTask.lastModified);
    assertEquals("foo", actualDumpTask.handleIp);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    DumpTask actualDumpTask = new DumpTask("foo", 1L, "foo");

    // Assert
    assertEquals(1000L, actualDumpTask.getTaskInterval());
    assertEquals("foo", actualDumpTask.groupKey);
    assertFalse(actualDumpTask.isBeta);
    assertNull(actualDumpTask.tag);
    assertEquals(1L, actualDumpTask.lastModified);
    assertEquals("foo", actualDumpTask.handleIp);
  }
}

