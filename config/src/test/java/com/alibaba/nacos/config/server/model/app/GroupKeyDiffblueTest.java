package com.alibaba.nacos.config.server.model.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class GroupKeyDiffblueTest {
  @Test
  public void setGroupTest() {
    // Arrange
    GroupKey groupKey = new GroupKey("aaaaa");

    // Act
    groupKey.setGroup("aaaaa");

    // Assert
    assertEquals("aaaaa", groupKey.getGroup());
  }

  @Test
  public void setDataIdTest() {
    // Arrange
    GroupKey groupKey = new GroupKey("aaaaa");

    // Act
    groupKey.setDataId("aaaaa");

    // Assert
    assertEquals("aaaaa", groupKey.getDataId());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    GroupKey actualGroupKey = new GroupKey("aaaaa");

    // Assert
    String actualDataId = actualGroupKey.getDataId();
    assertNull(actualDataId);
    assertEquals("aaaaa", actualGroupKey.getGroup());
  }

  @Test
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new GroupKey("aaaaa")).getGroup());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("null+aaaaa", (new GroupKey("aaaaa")).toString());
  }

  @Test
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new GroupKey("aaaaa")).getDataId());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    GroupKey actualGroupKey = new GroupKey("aaaaa", "aaaaa");

    // Assert
    String actualDataId = actualGroupKey.getDataId();
    assertEquals("aaaaa", actualDataId);
    assertEquals("aaaaa", actualGroupKey.getGroup());
  }
}

