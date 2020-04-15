package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import org.junit.Test;

public class SyncTaskDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    SyncTask actualSyncTask = new SyncTask();

    // Assert
    assertEquals(0, actualSyncTask.getRetryCount());
    assertNull(actualSyncTask.getKeys());
    assertNull(actualSyncTask.getTargetServer());
    assertEquals(0L, actualSyncTask.getLastExecuteTime());
  }

  @Test
  public void testSetKeys() {
    // Arrange
    SyncTask syncTask = new SyncTask();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    syncTask.setKeys(stringList);

    // Assert
    assertSame(stringList, syncTask.getKeys());
  }

  @Test
  public void testSetLastExecuteTime() {
    // Arrange
    SyncTask syncTask = new SyncTask();

    // Act
    syncTask.setLastExecuteTime(1L);

    // Assert
    assertEquals(1L, syncTask.getLastExecuteTime());
  }

  @Test
  public void testSetRetryCount() {
    // Arrange
    SyncTask syncTask = new SyncTask();

    // Act
    syncTask.setRetryCount(3);

    // Assert
    assertEquals(3, syncTask.getRetryCount());
  }

  @Test
  public void testSetTargetServer() {
    // Arrange
    SyncTask syncTask = new SyncTask();

    // Act
    syncTask.setTargetServer("targetServer");

    // Assert
    assertEquals("targetServer", syncTask.getTargetServer());
  }
}

