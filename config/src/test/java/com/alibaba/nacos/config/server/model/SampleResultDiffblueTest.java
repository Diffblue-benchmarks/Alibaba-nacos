package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SampleResultDiffblueTest {
  @Test
  public void getLisentersGroupkeyStatusTest() {
    // Arrange, Act and Assert
    assertNull((new SampleResult()).getLisentersGroupkeyStatus());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new SampleResult()).getLisentersGroupkeyStatus());
  }

  @Test
  public void setLisentersGroupkeyStatusTest() {
    // Arrange
    SampleResult sampleResult = new SampleResult();

    // Act
    sampleResult.setLisentersGroupkeyStatus(null);

    // Assert
    assertNull(sampleResult.getLisentersGroupkeyStatus());
  }
}

