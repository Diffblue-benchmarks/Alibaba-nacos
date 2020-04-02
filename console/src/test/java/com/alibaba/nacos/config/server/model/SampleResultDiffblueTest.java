package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.HashMap;
import org.junit.Test;

public class SampleResultDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new SampleResult()).getLisentersGroupkeyStatus());
  }

  @Test
  public void testSetLisentersGroupkeyStatus() {
    // Arrange
    SampleResult sampleResult = new SampleResult();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    sampleResult.setLisentersGroupkeyStatus(stringStringMap);

    // Assert
    assertSame(stringStringMap, sampleResult.getLisentersGroupkeyStatus());
  }
}

