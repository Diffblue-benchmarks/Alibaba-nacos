package com.alibaba.nacos.core.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class PropertyUtilDiffblueTest {
  @Test(timeout=10000)
  public void getPropertyTest2() {
    // Arrange, Act and Assert
    assertEquals("foo", PropertyUtil.getProperty("foo", "foo"));
  }

  @Test(timeout=10000)
  public void getPropertyTest() {
    // Arrange, Act and Assert
    assertNull(PropertyUtil.getProperty("foo"));
  }

  @Test(timeout=10000)
  public void getPropertyListTest() {
    // Arrange, Act and Assert
    assertEquals(0, PropertyUtil.getPropertyList("foo").size());
  }
}

