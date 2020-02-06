package com.alibaba.nacos.config.server.model.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class GroupKeyDiffblueTest {
  @Test
  public void setGroupTest() {
    // Arrange
    GroupKey groupKey = new GroupKey("foo");

    // Act
    groupKey.setGroup("foo");

    // Assert
    assertEquals("foo", groupKey.getGroup());
  }

  @Test
  public void setDataIdTest() {
    // Arrange
    GroupKey groupKey = new GroupKey("foo");

    // Act
    groupKey.setDataId("123");

    // Assert
    assertEquals("123", groupKey.getDataId());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    GroupKey actualGroupKey = new GroupKey("foo");

    // Assert
    String actualDataId = actualGroupKey.getDataId();
    assertNull(actualDataId);
    assertEquals("foo", actualGroupKey.getGroup());
  }

  @Test
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new GroupKey("foo")).getGroup());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("null+foo", (new GroupKey("foo")).toString());
  }

  @Test
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new GroupKey("foo")).getDataId());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    GroupKey actualGroupKey = new GroupKey("123", "foo");

    // Assert
    String actualDataId = actualGroupKey.getDataId();
    assertEquals("123", actualDataId);
    assertEquals("foo", actualGroupKey.getGroup());
  }
}

