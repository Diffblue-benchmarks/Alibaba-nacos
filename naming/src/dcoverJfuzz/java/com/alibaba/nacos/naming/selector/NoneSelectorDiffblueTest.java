package com.alibaba.nacos.naming.selector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class NoneSelectorDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("none", (new NoneSelector()).getType());
  }

  @Test(timeout=10000)
  public void selectTest() {
    // Arrange, Act and Assert
    assertNull((new NoneSelector()).select("foo", null));
  }
}

