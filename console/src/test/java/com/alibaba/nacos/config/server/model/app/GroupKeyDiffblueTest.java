package com.alibaba.nacos.config.server.model.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class GroupKeyDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    GroupKey actualGroupKey = new GroupKey("123", "group");

    // Assert
    assertEquals("123", actualGroupKey.getDataId());
    assertEquals("group", actualGroupKey.getGroup());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    GroupKey actualGroupKey = new GroupKey("groupKeyString");

    // Assert
    assertNull(actualGroupKey.getDataId());
    assertEquals("groupKeyString", actualGroupKey.getGroup());
  }

  @Test
  public void testGetGroupkeyString() {
    // Arrange, Act and Assert
    assertEquals("123+group", (new GroupKey("123", "group")).getGroupkeyString());
  }

  @Test
  public void testSetDataId() {
    // Arrange
    GroupKey groupKey = new GroupKey("groupKeyString");

    // Act
    groupKey.setDataId("123");

    // Assert
    assertEquals("123", groupKey.getDataId());
  }

  @Test
  public void testSetGroup() {
    // Arrange
    GroupKey groupKey = new GroupKey("groupKeyString");

    // Act
    groupKey.setGroup("group");

    // Assert
    assertEquals("group", groupKey.getGroup());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("null+groupKeyString", (new GroupKey("groupKeyString")).toString());
  }
}

