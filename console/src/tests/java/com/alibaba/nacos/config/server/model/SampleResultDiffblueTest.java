package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SampleResultDiffblueTest {
  @Test(timeout=10000)
  public void getLisentersGroupkeyStatusTest() {
    // Arrange, Act and Assert
    assertNull((new SampleResult()).getLisentersGroupkeyStatus());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new SampleResult()).getLisentersGroupkeyStatus());
  }

  @Test(timeout=10000)
  public void setLisentersGroupkeyStatusTest() {
    // Arrange
    SampleResult sampleResult = new SampleResult();

    // Act
    sampleResult.setLisentersGroupkeyStatus(null);

    // Assert
    assertNull(sampleResult.getLisentersGroupkeyStatus());
  }
}

