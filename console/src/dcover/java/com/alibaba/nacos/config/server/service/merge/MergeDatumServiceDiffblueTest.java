package com.alibaba.nacos.config.server.service.merge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.config.server.manager.TaskManager;
import com.alibaba.nacos.config.server.manager.TaskProcessor;
import com.alibaba.nacos.config.server.service.PersistService;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MergeDatumServiceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void mergeAllTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    (new MergeDatumService(new PersistService())).mergeAll();
  }

  @Test(timeout=10000)
  public void addMergeTaskTest2() {
    // Arrange
    MergeDatumService mergeDatumService = new MergeDatumService(new PersistService());

    // Act
    mergeDatumService.addMergeTask("123", "123", "foo", "foo", "foo");

    // Assert
    assertEquals(1, mergeDatumService.mergeTasks.size());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    TaskManager taskManager = (new MergeDatumService(new PersistService())).mergeTasks;
    String actualTaskInfos = taskManager.getTaskInfos();
    TaskProcessor defaultTaskProcessor = taskManager.getDefaultTaskProcessor();
    assertEquals("", actualTaskInfos);
    assertEquals(0, taskManager.size());
    assertTrue(defaultTaskProcessor instanceof MergeTaskProcessor);
    assertEquals(10000, ((MergeTaskProcessor) defaultTaskProcessor).PAGE_SIZE);
  }

  @Test(timeout=10000)
  public void addMergeTaskTest() {
    // Arrange
    MergeDatumService mergeDatumService = new MergeDatumService(new PersistService());

    // Act
    mergeDatumService.addMergeTask("123", "123", "foo", "foo");

    // Assert
    assertEquals(1, mergeDatumService.mergeTasks.size());
  }
}

