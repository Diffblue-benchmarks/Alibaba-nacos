package com.alibaba.nacos.config.server.manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.config.server.service.ServerListService;
import com.alibaba.nacos.config.server.service.notify.NotifyTaskProcessor;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class TaskManagerDiffblueTest {
  @Test
  public void testAwait() throws InterruptedException {
    // Arrange, Act and Assert
    assertFalse((new TaskManager()).await(10L, TimeUnit.NANOSECONDS));
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    TaskManager actualTaskManager = new TaskManager();

    // Assert
    assertEquals("", actualTaskManager.getTaskInfos());
    assertNull(actualTaskManager.getDefaultTaskProcessor());
    StackTraceElement[] stackTrace = actualTaskManager.processingThread.getStackTrace();
    assertTrue(actualTaskManager.isEmpty());
    StackTraceElement stackTraceElement = stackTrace[1];
    String actualClassName = (stackTrace[0]).getClassName();
    assertEquals("TaskManager.java", stackTraceElement.getFileName());
    assertEquals("java.lang.Thread", actualClassName);
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    TaskManager actualTaskManager = new TaskManager(":type=");

    // Assert
    assertEquals("", actualTaskManager.getTaskInfos());
    assertNull(actualTaskManager.getDefaultTaskProcessor());
    assertTrue(actualTaskManager.isEmpty());
  }

  @Test
  public void testGetDefaultTaskProcessor() {
    // Arrange, Act and Assert
    assertNull((new TaskManager()).getDefaultTaskProcessor());
  }

  @Test
  public void testGetTaskInfos() {
    // Arrange, Act and Assert
    assertEquals("", (new TaskManager()).getTaskInfos());
  }

  @Test
  public void testIsEmpty() {
    // Arrange, Act and Assert
    assertTrue((new TaskManager()).isEmpty());
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
    taskManager.removeTask("registerMBean_fail");

    // Assert
    assertEquals(0, taskManager.size());
  }

  @Test
  public void testRemoveTask2() {
    // Arrange
    TaskManager taskManager = new TaskManager();

    // Act
    taskManager.removeTask(":type=");

    // Assert
    assertTrue(taskManager.isEmpty());
  }

  @Test
  public void testSetDefaultTaskProcessor() {
    // Arrange
    TaskManager taskManager = new TaskManager();
    NotifyTaskProcessor notifyTaskProcessor = new NotifyTaskProcessor(new ServerListService());

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

