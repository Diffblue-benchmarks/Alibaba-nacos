package com.alibaba.nacos.config.server.service.merge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class MergeDataTaskDiffblueTest {
  @Test
  public void constructorTest2() {
    // Arrange and Act
    MergeDataTask actualMergeDataTask = new MergeDataTask("aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa");

    // Assert
    long actualTaskInterval = actualMergeDataTask.getTaskInterval();
    assertEquals("aaaaa", actualMergeDataTask.dataId);
    assertEquals("aaaaa", actualMergeDataTask.groupId);
    assertEquals("aaaaa", actualMergeDataTask.tag);
    assertEquals("aaaaa", actualMergeDataTask.tenant);
    assertEquals("aaaaa", actualMergeDataTask.getClientIp());
    assertEquals(0L, actualTaskInterval);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    MergeDataTask actualMergeDataTask = new MergeDataTask("aaaaa", "aaaaa", "aaaaa", "aaaaa");

    // Assert
    long actualTaskInterval = actualMergeDataTask.getTaskInterval();
    assertEquals("aaaaa", actualMergeDataTask.dataId);
    assertEquals("aaaaa", actualMergeDataTask.groupId);
    assertNull(actualMergeDataTask.tag);
    assertEquals("aaaaa", actualMergeDataTask.tenant);
    assertEquals("aaaaa", actualMergeDataTask.getClientIp());
    assertEquals(0L, actualTaskInterval);
  }
}

