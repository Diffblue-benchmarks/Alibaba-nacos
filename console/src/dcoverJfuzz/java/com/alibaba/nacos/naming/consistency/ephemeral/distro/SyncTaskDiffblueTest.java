package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SyncTaskDiffblueTest {
  @Test(timeout=10000)
  public void getKeysTest() {
    // Arrange, Act and Assert
    assertNull((new SyncTask()).getKeys());
  }

  @Test(timeout=10000)
  public void setTargetServerTest() {
    // Arrange
    SyncTask syncTask = new SyncTask();

    // Act
    syncTask.setTargetServer("foo");

    // Assert
    assertEquals("foo", syncTask.getTargetServer());
  }

  @Test(timeout=10000)
  public void setKeysTest() {
    // Arrange
    SyncTask syncTask = new SyncTask();

    // Act
    syncTask.setKeys(null);

    // Assert
    assertNull(syncTask.getKeys());
  }

  @Test(timeout=10000)
  public void getTargetServerTest() {
    // Arrange, Act and Assert
    assertNull((new SyncTask()).getTargetServer());
  }

  @Test(timeout=10000)
  public void getLastExecuteTimeTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new SyncTask()).getLastExecuteTime());
  }

  @Test(timeout=10000)
  public void getRetryCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SyncTask()).getRetryCount());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    SyncTask actualSyncTask = new SyncTask();

    // Assert
    int actualRetryCount = actualSyncTask.getRetryCount();
    long actualLastExecuteTime = actualSyncTask.getLastExecuteTime();
    String actualTargetServer = actualSyncTask.getTargetServer();
    assertEquals(0, actualRetryCount);
    assertNull(actualSyncTask.getKeys());
    assertNull(actualTargetServer);
    assertEquals(0L, actualLastExecuteTime);
  }

  @Test(timeout=10000)
  public void setLastExecuteTimeTest() {
    // Arrange
    SyncTask syncTask = new SyncTask();

    // Act
    syncTask.setLastExecuteTime(1L);

    // Assert
    assertEquals(1L, syncTask.getLastExecuteTime());
  }

  @Test(timeout=10000)
  public void setRetryCountTest() {
    // Arrange
    SyncTask syncTask = new SyncTask();

    // Act
    syncTask.setRetryCount(3);

    // Assert
    assertEquals(3, syncTask.getRetryCount());
  }
}

