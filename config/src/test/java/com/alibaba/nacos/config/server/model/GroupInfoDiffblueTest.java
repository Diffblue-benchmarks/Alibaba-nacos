package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class GroupInfoDiffblueTest {
  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new GroupInfo()).equals("foo"));
  }

  @Test
  public void setDataIdTest() {
    // Arrange
    GroupInfo groupInfo = new GroupInfo();

    // Act
    groupInfo.setDataId("123");

    // Assert
    assertEquals("123", groupInfo.getDataId());
  }

  @Test
  public void setGroupTest() {
    // Arrange
    GroupInfo groupInfo = new GroupInfo();

    // Act
    groupInfo.setGroup("foo");

    // Assert
    assertEquals("foo", groupInfo.getGroup());
  }

  @Test
  public void setAddressTest() {
    // Arrange
    GroupInfo groupInfo = new GroupInfo();

    // Act
    groupInfo.setAddress("foo");

    // Assert
    assertEquals("foo", groupInfo.getAddress());
  }

  @Test
  public void getAddressTest() {
    // Arrange, Act and Assert
    assertNull((new GroupInfo()).getAddress());
  }

  @Test
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertNull((new GroupInfo()).getGroup());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(29791, (new GroupInfo()).hashCode());
  }

  @Test
  public void setIdTest() {
    // Arrange
    GroupInfo groupInfo = new GroupInfo();

    // Act
    groupInfo.setId(123L);

    // Assert
    assertEquals(123L, groupInfo.getId());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    GroupInfo actualGroupInfo = new GroupInfo();

    // Assert
    String actualDataId = actualGroupInfo.getDataId();
    long actualId = actualGroupInfo.getId();
    String actualGroup = actualGroupInfo.getGroup();
    assertNull(actualDataId);
    assertNull(actualGroupInfo.getAddress());
    assertNull(actualGroup);
    assertEquals(0L, actualId);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    GroupInfo actualGroupInfo = new GroupInfo("foo", "123", "foo");

    // Assert
    String actualDataId = actualGroupInfo.getDataId();
    String actualGroup = actualGroupInfo.getGroup();
    assertEquals("123", actualDataId);
    assertEquals("foo", actualGroupInfo.getAddress());
    assertEquals("foo", actualGroup);
  }

  @Test
  public void getIdTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new GroupInfo()).getId());
  }

  @Test
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new GroupInfo()).getDataId());
  }
}

