package com.alibaba.nacos.client.naming.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PairDiffblueTest {
  @Test(timeout=10000)
  public void weightTest() {
    // Arrange, Act and Assert
    assertEquals(10.0, (new Pair<Object>("foo", 10.0)).weight(), 0.0);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Pair<Object> actualPair = new Pair<Object>("foo", 10.0);

    // Assert
    Object itemResult = actualPair.item();
    assertTrue(itemResult instanceof String);
    assertEquals(10.0, actualPair.weight(), 0.0);
  }

  @Test(timeout=10000)
  public void itemTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new Pair<Object>("foo", 10.0)).item());
  }
}

