package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class GroupInfoDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    GroupInfo actualGroupInfo = new GroupInfo("42 Station Road", "123", "group");

    // Assert
    assertEquals("123", actualGroupInfo.getDataId());
    assertEquals("42 Station Road", actualGroupInfo.getAddress());
    assertEquals("group", actualGroupInfo.getGroup());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    GroupInfo actualGroupInfo = new GroupInfo();

    // Assert
    assertNull(actualGroupInfo.getDataId());
    assertNull(actualGroupInfo.getAddress());
    assertNull(actualGroupInfo.getGroup());
    assertEquals(0L, actualGroupInfo.getId());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new GroupInfo()).equals("obj"));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new GroupInfo()).equals(null));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(-1339589478, (new GroupInfo("42 Station Road", "123", "group")).hashCode());
  }

  @Test
  public void testHashCode2() {
    // Arrange, Act and Assert
    assertEquals(29791, (new GroupInfo()).hashCode());
  }

  @Test
  public void testSetAddress() {
    // Arrange
    GroupInfo groupInfo = new GroupInfo();

    // Act
    groupInfo.setAddress("42 Station Road");

    // Assert
    assertEquals("42 Station Road", groupInfo.getAddress());
  }

  @Test
  public void testSetDataId() {
    // Arrange
    GroupInfo groupInfo = new GroupInfo();

    // Act
    groupInfo.setDataId("123");

    // Assert
    assertEquals("123", groupInfo.getDataId());
  }

  @Test
  public void testSetGroup() {
    // Arrange
    GroupInfo groupInfo = new GroupInfo();

    // Act
    groupInfo.setGroup("group");

    // Assert
    assertEquals("group", groupInfo.getGroup());
  }

  @Test
  public void testSetId() {
    // Arrange
    GroupInfo groupInfo = new GroupInfo();

    // Act
    groupInfo.setId(123L);

    // Assert
    assertEquals(123L, groupInfo.getId());
  }
}

