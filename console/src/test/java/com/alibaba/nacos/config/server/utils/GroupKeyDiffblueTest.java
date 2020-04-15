package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GroupKeyDiffblueTest {
  @Test
  public void testGetKey() {
    // Arrange, Act and Assert
    assertEquals("123+%252B", GroupKey.getKey("123", "%2B"));
  }

  @Test
  public void testGetKey2() {
    // Arrange, Act and Assert
    assertEquals("123+%252B+%252B", GroupKey.getKey("123", "%2B", "%2B"));
  }

  @Test
  public void testGetKeyTenant() {
    // Arrange
    String actualKeyTenant = GroupKey.getKeyTenant("123", "%2B", "%2B");

    // Act and Assert
    assertEquals("123+%252B+%252B", actualKeyTenant);
    assertEquals("123+%252B", GroupKey.getKeyTenant("123", "%2B", ""));
  }

  @Test
  public void testParseKey() {
    // Arrange
    String[] parseKeyResult = GroupKey.parseKey("%2B");

    // Act and Assert
    assertEquals(3, parseKeyResult.length);
    assertEquals(3, GroupKey.parseKey("groupKey").length);
  }
}

