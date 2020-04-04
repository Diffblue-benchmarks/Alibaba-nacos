package com.alibaba.nacos.common.util;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PairDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Pair actualPair = new Pair("", "");

    // Assert
    assertEquals("", actualPair.getKey());
    assertEquals("", actualPair.getValue());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    Pair actualPair = new Pair();

    // Assert
    assertEquals("", actualPair.getKey());
    assertEquals("", actualPair.getValue());
  }

  @Test
  public void testSetKey() {
    // Arrange
    Pair pair = new Pair();

    // Act
    pair.setKey("");

    // Assert
    assertEquals("", pair.getKey());
  }

  @Test
  public void testSetValue() {
    // Arrange
    Pair pair = new Pair();

    // Act
    pair.setValue("");

    // Assert
    assertEquals("", pair.getValue());
  }
}

