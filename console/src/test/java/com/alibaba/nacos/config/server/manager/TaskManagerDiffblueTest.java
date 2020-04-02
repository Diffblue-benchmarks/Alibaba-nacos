package com.alibaba.nacos.config.server.manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.config.server.service.dump.DumpTask;
import com.alibaba.nacos.config.server.service.notify.NotifyTaskProcessor;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class TaskManagerDiffblueTest {
  @Test
  public void testAddProcessor() {
    // Arrange
    NotifyTaskProcessor taskProcessor = new NotifyTaskProcessor(null);
    TaskManager taskManager = new TaskManager();

    // Act
    taskManager.addProcessor(":type=", taskProcessor);

    // Assert
    assertEquals(":type=:finished\r\n", taskManager.getTaskInfos());
  }

  @Test
  public void testAddTask() {
    // Arrange
    DumpTask task = new DumpTask("groupKey", 1000L, "handleIp");
    TaskManager taskManager = new TaskManager();

    // Act
    taskManager.addTask(":type=", task);

    // Assert
    assertEquals(1, taskManager.size());
  }

  @Test
  public void testAddTask2() {
    // Arrange
    DumpTask task = new DumpTask("groupKey", 1000L, "lock");
    TaskManager taskManager = new TaskManager();

    // Act
    taskManager.addTask(":type=", task);

    // Assert
    assertEquals(1, taskManager.size());
  }

  @Test
  public void testAwait() throws InterruptedException {
    // Arrange, Act and Assert
    assertFalse((new TaskManager()).await(10L, TimeUnit.NANOSECONDS));
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    TaskManager actualTaskManager = new TaskManager(":type=");

    // Assert
    assertEquals("", actualTaskManager.getTaskInfos());
    assertNull(actualTaskManager.getDefaultTaskProcessor());
    assertTrue(actualTaskManager.isEmpty());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    TaskManager actualTaskManager = new TaskManager("processingThread");

    // Assert
    assertEquals("", actualTaskManager.getTaskInfos());
    assertNull(actualTaskManager.getDefaultTaskProcessor());
    assertEquals(0, actualTaskManager.size());
  }

  @Test
  public void testGetDefaultTaskProcessor() {
    // Arrange
    TaskManager taskManager = new TaskManager();

    // Act and Assert
    assertNull(taskManager.getDefaultTaskProcessor());
    assertFalse(((ThreadGroup) taskManager.processingThread.getUncaughtExceptionHandler()).isDaemon());
  }

  @Test
  public void testGetTask() {
    // Arrange, Act and Assert
    assertNull((new TaskManager()).getTask(":type="));
  }

  @Test
  public void testGetTaskInfos() {
    // Arrange, Act and Assert
    assertEquals("", (new TaskManager()).getTaskInfos());
  }

  @Test
  public void testGetTaskProcessor() {
    // Arrange, Act and Assert
    assertNull((new TaskManager()).getTaskProcessor(":type="));
  }

  @Test
  public void testIsEmpty() {
    // Arrange
    TaskManager taskManager = new TaskManager();

    // Act and Assert
    assertTrue(taskManager.isEmpty());
    assertFalse(taskManager.lock.isHeldByCurrentThread());
  }

  @Test
  public void testRemoveProcessor() {
    // Arrange
    TaskManager taskManager = new TaskManager();

    // Act
    taskManager.removeProcessor(":type=");

    // Assert
    assertEquals("", taskManager.getTaskInfos());
  }

  @Test
  public void testRemoveTask() {
    // Arrange
    TaskManager taskManager = new TaskManager();

    // Act
    taskManager.removeTask(":type=");

    // Assert
    assertEquals(0, taskManager.size());
  }

  @Test
  public void testSetDefaultTaskProcessor() {
    // Arrange
    NotifyTaskProcessor notifyTaskProcessor = new NotifyTaskProcessor(null);
    TaskManager taskManager = new TaskManager();

    // Act
    taskManager.setDefaultTaskProcessor(notifyTaskProcessor);

    // Assert
    assertSame(notifyTaskProcessor, taskManager.getDefaultTaskProcessor());
  }

  @Test
  public void testSize() {
    // Arrange, Act and Assert
    assertEquals(0, (new TaskManager()).size());
  }
}

