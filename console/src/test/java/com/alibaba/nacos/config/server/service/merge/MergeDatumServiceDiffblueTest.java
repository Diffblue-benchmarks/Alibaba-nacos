package com.alibaba.nacos.config.server.service.merge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.config.server.manager.TaskManager;
import com.alibaba.nacos.config.server.manager.TaskProcessor;
import com.alibaba.nacos.config.server.model.ConfigInfoChanged;
import com.alibaba.nacos.config.server.service.PersistService;
import java.util.ArrayList;
import org.junit.Test;

public class MergeDatumServiceDiffblueTest {
  @Test
  public void testAddMergeTask() {
    // Arrange
    MergeDatumService mergeDatumService = new MergeDatumService(new PersistService());

    // Act
    mergeDatumService.addMergeTask("com.alibaba.nacos.MergeDatum", "com.alibaba.nacos.MergeDatum",
        "com.alibaba.nacos.MergeDatum", "com.alibaba.nacos.MergeDatum");

    // Assert
    assertEquals(1, mergeDatumService.mergeTasks.size());
  }

  @Test
  public void testAddMergeTask2() {
    // Arrange
    MergeDatumService mergeDatumService = new MergeDatumService(new PersistService());

    // Act
    mergeDatumService.addMergeTask("com.alibaba.nacos.MergeDatum", "com.alibaba.nacos.MergeDatum",
        "com.alibaba.nacos.MergeDatum", "com.alibaba.nacos.MergeDatum", "com.alibaba.nacos.MergeDatum");

    // Assert
    assertEquals(1, mergeDatumService.mergeTasks.size());
  }

  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    TaskManager taskManager = (new MergeDatumService(new PersistService())).mergeTasks;
    assertEquals("", taskManager.getTaskInfos());
    assertEquals(0, taskManager.size());
    TaskProcessor defaultTaskProcessor = taskManager.getDefaultTaskProcessor();
    assertTrue(defaultTaskProcessor instanceof MergeTaskProcessor);
    assertEquals(10000, ((MergeTaskProcessor) defaultTaskProcessor).PAGE_SIZE);
  }

  @Test
  public void testMergeAllDataWorkerConstructor() {
    // Arrange
    MergeDatumService mergeDatumService = new MergeDatumService(new PersistService());
    ArrayList<ConfigInfoChanged> configInfoChangedList = new ArrayList<ConfigInfoChanged>();
    configInfoChangedList.add(new ConfigInfoChanged());

    // Act and Assert
    assertEquals(5, (mergeDatumService.new MergeAllDataWorker(configInfoChangedList)).getPriority());
    assertTrue(mergeDatumService.mergeTasks.isEmpty());
  }

  @Test
  public void testSplitList() {
    // Arrange
    ArrayList<ConfigInfoChanged> configInfoChangedList = new ArrayList<ConfigInfoChanged>();
    configInfoChangedList.add(new ConfigInfoChanged());

    // Act and Assert
    assertEquals(3, MergeDatumService.splitList(configInfoChangedList, 3).size());
  }
}

