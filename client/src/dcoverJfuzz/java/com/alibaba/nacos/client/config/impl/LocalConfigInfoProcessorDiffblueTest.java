package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LocalConfigInfoProcessorDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void cleanEnvSnapshotTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    LocalConfigInfoProcessor.cleanEnvSnapshot("name");
  }

  @Test(timeout=10000)
  public void getSnapshotTest() {
    // Arrange
    String actualSnapshot = LocalConfigInfoProcessor.getSnapshot("name", "123", "foo", "foo");

    // Act and Assert
    assertNull(actualSnapshot);
    assertNull(LocalConfigInfoProcessor.getSnapshot("name", "123", "foo", ""));
  }

  @Test(timeout=10000)
  public void getFailoverTest() {
    // Arrange
    String actualFailover = LocalConfigInfoProcessor.getFailover("name", "123", "foo", "foo");

    // Act and Assert
    assertNull(actualFailover);
    assertNull(LocalConfigInfoProcessor.getFailover("name", "123", "foo", ""));
  }
}

