package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GroupKeyDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getKeyTest2() {
    // Arrange, Act and Assert
    assertEquals("123+foo+foo", GroupKey.getKey("123", "foo", "foo"));
  }

  @Test
  public void parseKeyTest2() {
    // Arrange, Act and Assert
    assertEquals(3, GroupKey.parseKey("foo").length);
  }

  @Test
  public void parseKeyTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    GroupKey.parseKey("");
  }

  @Test
  public void getKeyTest() {
    // Arrange, Act and Assert
    assertEquals("123+foo", GroupKey.getKey("123", "foo"));
  }

  @Test
  public void getKeyTenantTest() {
    // Arrange, Act and Assert
    assertEquals("123+foo+foo", GroupKey.getKeyTenant("123", "foo", "foo"));
  }
}

