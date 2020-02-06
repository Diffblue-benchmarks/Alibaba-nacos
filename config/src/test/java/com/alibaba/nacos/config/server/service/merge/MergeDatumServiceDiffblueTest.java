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

  @Test
  public void mergeAllTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    (new MergeDatumService(new PersistService())).mergeAll();
  }

  @Test
  public void addMergeTaskTest2() {
    // Arrange
    MergeDatumService mergeDatumService = new MergeDatumService(new PersistService());

    // Act
    mergeDatumService.addMergeTask("com.alibaba.nacos.MergeDatum", "com.alibaba.nacos.MergeDatum",
        "com.alibaba.nacos.MergeDatum", "com.alibaba.nacos.MergeDatum", "com.alibaba.nacos.MergeDatum");

    // Assert
    assertEquals(1, mergeDatumService.mergeTasks.size());
  }

  @Test
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

  @Test
  public void addMergeTaskTest() {
    // Arrange
    MergeDatumService mergeDatumService = new MergeDatumService(new PersistService());

    // Act
    mergeDatumService.addMergeTask("com.alibaba.nacos.MergeDatum", "com.alibaba.nacos.MergeDatum",
        "com.alibaba.nacos.MergeDatum", "com.alibaba.nacos.MergeDatum");

    // Assert
    assertEquals(1, mergeDatumService.mergeTasks.size());
  }
}

