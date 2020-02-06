package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GroupKey2DiffblueTest {
  @Test
  public void getKeyTest2() {
    // Arrange, Act and Assert
    assertEquals("%252B+%252B+%252B", GroupKey2.getKey("%2B", "%2B", "%2B"));
  }

  @Test
  public void parseKeyTest() {
    // Arrange, Act and Assert
    assertEquals(3, GroupKey2.parseKey("%2B").length);
  }

  @Test
  public void getKeyTest() {
    // Arrange, Act and Assert
    assertEquals("%252B+%252B", GroupKey2.getKey("%2B", "%2B"));
  }
}

