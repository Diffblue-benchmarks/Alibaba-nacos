package com.alibaba.nacos.common.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PairDiffblueTest {
  @Test
  public void getValueTest() {
    // Arrange, Act and Assert
    assertEquals("", (new Pair()).getValue());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    Pair actualPair = new Pair();

    // Assert
    String actualKey = actualPair.getKey();
    assertEquals("", actualKey);
    assertEquals("", actualPair.getValue());
  }

  @Test
  public void setValueTest() {
    // Arrange
    Pair pair = new Pair();

    // Act
    pair.setValue("");

    // Assert
    assertEquals("", pair.getValue());
  }

  @Test
  public void setKeyTest() {
    // Arrange
    Pair pair = new Pair();

    // Act
    pair.setKey("");

    // Assert
    assertEquals("", pair.getKey());
  }

  @Test
  public void getKeyTest() {
    // Arrange, Act and Assert
    assertEquals("", (new Pair()).getKey());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Pair actualPair = new Pair("", "");

    // Assert
    String actualKey = actualPair.getKey();
    assertEquals("", actualKey);
    assertEquals("", actualPair.getValue());
  }
}

