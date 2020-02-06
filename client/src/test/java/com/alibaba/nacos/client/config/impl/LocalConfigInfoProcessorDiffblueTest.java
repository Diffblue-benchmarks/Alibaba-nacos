package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LocalConfigInfoProcessorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void cleanEnvSnapshotTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    LocalConfigInfoProcessor.cleanEnvSnapshot("LOCAL_SNAPSHOT_PATH:{}");
  }

  @Test
  public void getSnapshotTest() {
    // Arrange, Act and Assert
    assertNull(LocalConfigInfoProcessor.getSnapshot("LOCAL_SNAPSHOT_PATH:{}", "LOCAL_SNAPSHOT_PATH:{}",
        "LOCAL_SNAPSHOT_PATH:{}", "LOCAL_SNAPSHOT_PATH:{}"));
  }

  @Test
  public void getFailoverTest() {
    // Arrange, Act and Assert
    assertNull(LocalConfigInfoProcessor.getFailover("LOCAL_SNAPSHOT_PATH:{}", "LOCAL_SNAPSHOT_PATH:{}",
        "LOCAL_SNAPSHOT_PATH:{}", "LOCAL_SNAPSHOT_PATH:{}"));
  }
}

