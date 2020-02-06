package com.alibaba.nacos.config.server.manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class TaskManagerDiffblueTest {
  @Test
  public void getTaskProcessorTest() {
    // Arrange, Act and Assert
    assertNull((new TaskManager()).getTaskProcessor(":type="));
  }

  @Test
  public void getDefaultTaskProcessorTest() {
    // Arrange, Act and Assert
    assertNull((new TaskManager()).getDefaultTaskProcessor());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    TaskManager actualTaskManager = new TaskManager(":type=");

    // Assert
    String actualTaskInfos = actualTaskManager.getTaskInfos();
    TaskProcessor actualDefaultTaskProcessor = actualTaskManager.getDefaultTaskProcessor();
    assertEquals("", actualTaskInfos);
    assertEquals(0, actualTaskManager.size());
    assertNull(actualDefaultTaskProcessor);
  }

  @Test
  public void getTaskInfosTest() {
    // Arrange, Act and Assert
    assertEquals("", (new TaskManager()).getTaskInfos());
  }

  @Test
  public void getTaskTest() {
    // Arrange, Act and Assert
    assertNull((new TaskManager()).getTask(":type="));
  }

  @Test
  public void sizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new TaskManager()).size());
  }

  @Test
  public void isEmptyTest() {
    // Arrange, Act and Assert
    assertTrue((new TaskManager()).isEmpty());
  }

  @Test
  public void removeTaskTest() {
    // Arrange
    TaskManager taskManager = new TaskManager();

    // Act
    taskManager.removeTask(":type=");

    // Assert
    assertEquals(0, taskManager.size());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    TaskManager actualTaskManager = new TaskManager();

    // Assert
    String actualTaskInfos = actualTaskManager.getTaskInfos();
    TaskProcessor actualDefaultTaskProcessor = actualTaskManager.getDefaultTaskProcessor();
    assertEquals("", actualTaskInfos);
    assertEquals(0, actualTaskManager.size());
    assertNull(actualDefaultTaskProcessor);
  }

  @Test
  public void awaitTest() throws InterruptedException {
    // Arrange, Act and Assert
    assertFalse((new TaskManager()).await(1L, TimeUnit.NANOSECONDS));
  }

  @Test
  public void removeProcessorTest() {
    // Arrange
    TaskManager taskManager = new TaskManager();

    // Act
    taskManager.removeProcessor(":type=");

    // Assert
    assertEquals("", taskManager.getTaskInfos());
  }
}

