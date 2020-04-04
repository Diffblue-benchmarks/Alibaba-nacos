package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GroupKey2DiffblueTest {
  @Test
  public void testGetKey() {
    // Arrange, Act and Assert
    assertEquals("%252B+%252B", GroupKey2.getKey("%2B", "%2B"));
  }

  @Test
  public void testGetKey2() {
    // Arrange
    String actualKey = GroupKey2.getKey("%2B", "%2B", "%2B");

    // Act and Assert
    assertEquals("%252B+%252B+%252B", actualKey);
    assertEquals("%252B+%252B", GroupKey2.getKey("%2B", "%2B", ""));
  }

  @Test
  public void testParseKey() {
    // Arrange
    String[] parseKeyResult = GroupKey2.parseKey("%2B");

    // Act and Assert
    assertEquals(3, parseKeyResult.length);
    assertEquals(3, GroupKey2.parseKey("java/lang/StringBuilder").length);
  }
}

