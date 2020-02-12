package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GroupKeyDiffblueTest {
  @Test(timeout=10000)
  public void getKeyTest2() {
    // Arrange, Act and Assert
    assertEquals("123+foo+foo", GroupKey.getKey("123", "foo", "foo"));
  }

  @Test(timeout=10000)
  public void parseKeyTest() {
    // Arrange, Act and Assert
    assertEquals(3, GroupKey.parseKey("foo").length);
  }

  @Test(timeout=10000)
  public void getKeyTest() {
    // Arrange, Act and Assert
    assertEquals("123+foo", GroupKey.getKey("123", "foo"));
  }

  @Test(timeout=10000)
  public void getKeyTenantTest() {
    // Arrange, Act and Assert
    assertEquals("123+foo+foo", GroupKey.getKeyTenant("123", "foo", "foo"));
  }
}

