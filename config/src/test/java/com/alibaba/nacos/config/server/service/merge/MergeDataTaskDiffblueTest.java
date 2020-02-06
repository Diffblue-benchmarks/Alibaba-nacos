package com.alibaba.nacos.config.server.service.merge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class MergeDataTaskDiffblueTest {
  @Test
  public void constructorTest2() {
    // Arrange and Act
    MergeDataTask actualMergeDataTask = new MergeDataTask("123", "123", "foo", "foo", "foo");

    // Assert
    long actualTaskInterval = actualMergeDataTask.getTaskInterval();
    assertEquals("123", actualMergeDataTask.dataId);
    assertEquals("123", actualMergeDataTask.groupId);
    assertEquals("foo", actualMergeDataTask.tag);
    assertEquals("foo", actualMergeDataTask.tenant);
    assertEquals("foo", actualMergeDataTask.getClientIp());
    assertEquals(0L, actualTaskInterval);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    MergeDataTask actualMergeDataTask = new MergeDataTask("123", "123", "foo", "foo");

    // Assert
    long actualTaskInterval = actualMergeDataTask.getTaskInterval();
    assertEquals("123", actualMergeDataTask.dataId);
    assertEquals("123", actualMergeDataTask.groupId);
    assertNull(actualMergeDataTask.tag);
    assertEquals("foo", actualMergeDataTask.tenant);
    assertEquals("foo", actualMergeDataTask.getClientIp());
    assertEquals(0L, actualTaskInterval);
  }
}

