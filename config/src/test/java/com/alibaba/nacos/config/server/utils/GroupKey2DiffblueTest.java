package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GroupKey2DiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getKeyTest2() {
    // Arrange, Act and Assert
    assertEquals("123+foo+foo", GroupKey2.getKey("123", "foo", "foo"));
  }

  @Test
  public void parseKeyTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    GroupKey2.parseKey("");
  }

  @Test
  public void parseKeyTest() {
    // Arrange, Act and Assert
    assertEquals(3, GroupKey2.parseKey("foo").length);
  }

  @Test
  public void getKeyTest() {
    // Arrange, Act and Assert
    assertEquals("123+foo", GroupKey2.getKey("123", "foo"));
  }
}

