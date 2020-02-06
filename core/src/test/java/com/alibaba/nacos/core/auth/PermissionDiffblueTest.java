package com.alibaba.nacos.core.auth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class PermissionDiffblueTest {
  @Test
  public void getActionTest() {
    // Arrange, Act and Assert
    assertNull((new Permission()).getAction());
  }

  @Test
  public void setActionTest() {
    // Arrange
    Permission permission = new Permission();

    // Act
    permission.setAction("aaaaa");

    // Assert
    assertEquals("aaaaa", permission.getAction());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    Permission actualPermission = new Permission();

    // Assert
    String actualResource = actualPermission.getResource();
    assertNull(actualResource);
    assertNull(actualPermission.getAction());
  }

  @Test
  public void setResourceTest() {
    // Arrange
    Permission permission = new Permission();

    // Act
    permission.setResource("aaaaa");

    // Assert
    assertEquals("aaaaa", permission.getResource());
  }

  @Test
  public void getResourceTest() {
    // Arrange, Act and Assert
    assertNull((new Permission()).getResource());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Permission actualPermission = new Permission("aaaaa", "aaaaa");

    // Assert
    String actualResource = actualPermission.getResource();
    assertEquals("aaaaa", actualResource);
    assertEquals("aaaaa", actualPermission.getAction());
  }
}

