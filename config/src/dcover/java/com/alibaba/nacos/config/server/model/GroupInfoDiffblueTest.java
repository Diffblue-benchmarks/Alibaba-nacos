package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class GroupInfoDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new GroupInfo()).equals("foo"));
  }

  @Test(timeout=10000)
  public void setDataIdTest() {
    // Arrange
    GroupInfo groupInfo = new GroupInfo();

    // Act
    groupInfo.setDataId("123");

    // Assert
    assertEquals("123", groupInfo.getDataId());
  }

  @Test(timeout=10000)
  public void setGroupTest() {
    // Arrange
    GroupInfo groupInfo = new GroupInfo();

    // Act
    groupInfo.setGroup("foo");

    // Assert
    assertEquals("foo", groupInfo.getGroup());
  }

  @Test(timeout=10000)
  public void setAddressTest() {
    // Arrange
    GroupInfo groupInfo = new GroupInfo();

    // Act
    groupInfo.setAddress("foo");

    // Assert
    assertEquals("foo", groupInfo.getAddress());
  }

  @Test(timeout=10000)
  public void getAddressTest() {
    // Arrange, Act and Assert
    assertNull((new GroupInfo()).getAddress());
  }

  @Test(timeout=10000)
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertNull((new GroupInfo()).getGroup());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(29791, (new GroupInfo()).hashCode());
  }

  @Test(timeout=10000)
  public void setIdTest() {
    // Arrange
    GroupInfo groupInfo = new GroupInfo();

    // Act
    groupInfo.setId(123L);

    // Assert
    assertEquals(123L, groupInfo.getId());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void getIdTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new GroupInfo()).getId());
  }

  @Test(timeout=10000)
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new GroupInfo()).getDataId());
  }
}

