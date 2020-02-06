package com.alibaba.nacos.core.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class PropertyUtilDiffblueTest {
  @Test
  public void getPropertyTest2() {
    // Arrange, Act and Assert
    assertEquals("foo", PropertyUtil.getProperty("foo", "foo"));
  }

  @Test
  public void getPropertyTest() {
    // Arrange, Act and Assert
    assertNull(PropertyUtil.getProperty("foo"));
  }

  @Test
  public void getPropertyListTest() {
    // Arrange, Act and Assert
    assertEquals(0, PropertyUtil.getPropertyList("foo").size());
  }
}

