package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GroupKey2DiffblueTest {
  @Test(timeout=10000)
  public void getKeyTest2() {
    // Arrange, Act and Assert
    assertEquals("123+foo+foo", GroupKey2.getKey("123", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void parseKeyTest() {
    // Arrange, Act and Assert
    assertEquals(3, GroupKey2.parseKey("foo").length);
  }

  @Test(timeout=10000)
  public void getKeyTest() {
    // Arrange, Act and Assert
    assertEquals("123+foo", GroupKey2.getKey("123", "foo"));
  }
}

