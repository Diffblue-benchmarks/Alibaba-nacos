package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RaftCoreDiffblueTest {
  @Test
  public void testBuildURL() {
    // Arrange
    String actualBuildURLResult = RaftCore.buildURL(",", ",");

    // Act and Assert
    assertEquals("http://,:0/nacos,", actualBuildURLResult);
    assertEquals("http://:/nacos,", RaftCore.buildURL(":", ","));
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    RaftCore actualRaftCore = new RaftCore();

    // Assert
    int actualTaskSize = actualRaftCore.notifier.getTaskSize();
    assertEquals(0, actualRaftCore.getNotifyTaskCount());
    assertEquals(0, actualTaskSize);
  }
}

