package com.alibaba.nacos.api.selector;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NoneSelectorDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("none", (new NoneSelector()).getType());
  }
}

