package com.alibaba.nacos.config.server.auth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class PermissionInfoDiffblueTest {
  @Test
  public void getActionTest() {
    // Arrange, Act and Assert
    assertNull((new PermissionInfo()).getAction());
  }

  @Test
  public void setActionTest() {
    // Arrange
    PermissionInfo permissionInfo = new PermissionInfo();

    // Act
    permissionInfo.setAction("aaaaa");

    // Assert
    assertEquals("aaaaa", permissionInfo.getAction());
  }

  @Test
  public void getRoleTest() {
    // Arrange, Act and Assert
    assertNull((new PermissionInfo()).getRole());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    PermissionInfo actualPermissionInfo = new PermissionInfo();

    // Assert
    String actualResource = actualPermissionInfo.getResource();
    String actualRole = actualPermissionInfo.getRole();
    assertNull(actualResource);
    assertNull(actualPermissionInfo.getAction());
    assertNull(actualRole);
  }

  @Test
  public void setRoleTest() {
    // Arrange
    PermissionInfo permissionInfo = new PermissionInfo();

    // Act
    permissionInfo.setRole("aaaaa");

    // Assert
    assertEquals("aaaaa", permissionInfo.getRole());
  }

  @Test
  public void setResourceTest() {
    // Arrange
    PermissionInfo permissionInfo = new PermissionInfo();

    // Act
    permissionInfo.setResource("aaaaa");

    // Assert
    assertEquals("aaaaa", permissionInfo.getResource());
  }

  @Test
  public void getResourceTest() {
    // Arrange, Act and Assert
    assertNull((new PermissionInfo()).getResource());
  }
}

