package com.alibaba.nacos.config.server.service.merge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.alibaba.nacos.config.server.service.dump.DumpTask;
import org.junit.Test;

public class MergeDataTaskDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    MergeDataTask actualMergeDataTask = new MergeDataTask("123", "123", "tenant", "clientIp");

    // Assert
    assertEquals("123", actualMergeDataTask.dataId);
    assertEquals("123", actualMergeDataTask.groupId);
    assertNull(actualMergeDataTask.tag);
    assertEquals("tenant", actualMergeDataTask.tenant);
    assertEquals("clientIp", actualMergeDataTask.getClientIp());
    assertEquals(0L, actualMergeDataTask.getTaskInterval());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    MergeDataTask actualMergeDataTask = new MergeDataTask("123", "123", "tenant", "tag", "clientIp");

    // Assert
    assertEquals("123", actualMergeDataTask.dataId);
    assertEquals("123", actualMergeDataTask.groupId);
    assertEquals("tag", actualMergeDataTask.tag);
    assertEquals("tenant", actualMergeDataTask.tenant);
    assertEquals("clientIp", actualMergeDataTask.getClientIp());
    assertEquals(0L, actualMergeDataTask.getTaskInterval());
  }

  @Test
  public void testGetId() {
    // Arrange, Act and Assert
    assertEquals("MergeTask[123, 123, tenant, clientIp]",
        (new MergeDataTask("123", "123", "tenant", "clientIp")).getId());
  }

  @Test
  public void testMerge() {
    // Arrange
    MergeDataTask mergeDataTask = new MergeDataTask("123", "123", "tenant", "clientIp");

    // Act
    mergeDataTask.merge(new DumpTask("123", 1000L, "tenant"));

    // Assert
    assertEquals("clientIp", mergeDataTask.getClientIp());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("MergeTask[123, 123, tenant, clientIp]",
        (new MergeDataTask("123", "123", "tenant", "clientIp")).toString());
  }

  @Test
  public void testToString2() {
    // Arrange, Act and Assert
    assertEquals("MergeTask[, 123, tenant, clientIp]", (new MergeDataTask("", "123", "tenant", "clientIp")).toString());
  }
}

