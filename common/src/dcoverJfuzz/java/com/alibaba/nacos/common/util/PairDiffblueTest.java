package com.alibaba.nacos.common.util;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PairDiffblueTest {
  @Test(timeout=10000)
  public void getValueTest() {
    // Arrange, Act and Assert
    assertEquals("", (new Pair()).getValue());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    Pair actualPair = new Pair();

    // Assert
    String actualKey = actualPair.getKey();
    assertEquals("", actualKey);
    assertEquals("", actualPair.getValue());
  }

  @Test(timeout=10000)
  public void setValueTest() {
    // Arrange
    Pair pair = new Pair();

    // Act
    pair.setValue("value");

    // Assert
    assertEquals("value", pair.getValue());
  }

  @Test(timeout=10000)
  public void setKeyTest() {
    // Arrange
    Pair pair = new Pair();

    // Act
    pair.setKey("foo");

    // Assert
    assertEquals("foo", pair.getKey());
  }

  @Test(timeout=10000)
  public void getKeyTest() {
    // Arrange, Act and Assert
    assertEquals("", (new Pair()).getKey());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Pair actualPair = new Pair("foo", "value");

    // Assert
    String actualKey = actualPair.getKey();
    assertEquals("foo", actualKey);
    assertEquals("value", actualPair.getValue());
  }
}

