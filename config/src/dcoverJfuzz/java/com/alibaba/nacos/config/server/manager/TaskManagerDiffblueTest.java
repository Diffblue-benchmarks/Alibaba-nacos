package com.alibaba.nacos.config.server.manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class TaskManagerDiffblueTest {
  @Test(timeout=10000)
  public void getTaskProcessorTest() {
    // Arrange, Act and Assert
    assertNull((new TaskManager()).getTaskProcessor("foo"));
  }

  @Test(timeout=10000)
  public void getDefaultTaskProcessorTest() {
    // Arrange, Act and Assert
    assertNull((new TaskManager()).getDefaultTaskProcessor());
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange and Act
    TaskManager actualTaskManager = new TaskManager("");

    // Assert
    String actualTaskInfos = actualTaskManager.getTaskInfos();
    TaskProcessor actualDefaultTaskProcessor = actualTaskManager.getDefaultTaskProcessor();
    assertEquals("", actualTaskInfos);
    assertEquals(0, actualTaskManager.size());
    assertNull(actualDefaultTaskProcessor);
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    TaskManager actualTaskManager = new TaskManager("name");

    // Assert
    String actualTaskInfos = actualTaskManager.getTaskInfos();
    TaskProcessor actualDefaultTaskProcessor = actualTaskManager.getDefaultTaskProcessor();
    assertEquals("", actualTaskInfos);
    assertEquals(0, actualTaskManager.size());
    assertNull(actualDefaultTaskProcessor);
  }

  @Test(timeout=10000)
  public void getTaskInfosTest() {
    // Arrange, Act and Assert
    assertEquals("", (new TaskManager()).getTaskInfos());
  }

  @Test(timeout=10000)
  public void getTaskTest() {
    // Arrange, Act and Assert
    assertNull((new TaskManager()).getTask("foo"));
  }

  @Test(timeout=10000)
  public void sizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new TaskManager()).size());
  }

  @Test(timeout=10000)
  public void isEmptyTest() {
    // Arrange, Act and Assert
    assertTrue((new TaskManager()).isEmpty());
  }

  @Test(timeout=10000)
  public void removeTaskTest2() {
    // Arrange
    TaskManager taskManager = new TaskManager();

    // Act
    taskManager.removeTask("");

    // Assert
    assertEquals(0, taskManager.size());
  }

  @Test(timeout=10000)
  public void removeTaskTest() {
    // Arrange
    TaskManager taskManager = new TaskManager();

    // Act
    taskManager.removeTask("foo");

    // Assert
    assertEquals(0, taskManager.size());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void awaitTest2() throws InterruptedException {
    // Arrange, Act and Assert
    assertFalse((new TaskManager()).await(-9223372036854775808L, TimeUnit.NANOSECONDS));
  }

  @Test(timeout=10000)
  public void awaitTest() throws InterruptedException {
    // Arrange, Act and Assert
    assertFalse((new TaskManager()).await(10L, TimeUnit.NANOSECONDS));
  }

  @Test(timeout=10000)
  public void removeProcessorTest() {
    // Arrange
    TaskManager taskManager = new TaskManager();

    // Act
    taskManager.removeProcessor("foo");

    // Assert
    assertEquals("", taskManager.getTaskInfos());
  }
}

