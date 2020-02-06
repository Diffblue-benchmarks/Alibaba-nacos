package com.alibaba.nacos.config.server.auth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class RoleInfoDiffblueTest {
  @Test
  public void getRoleTest() {
    // Arrange, Act and Assert
    assertNull((new RoleInfo()).getRole());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    RoleInfo actualRoleInfo = new RoleInfo();

    // Assert
    String actualUsername = actualRoleInfo.getUsername();
    assertNull(actualUsername);
    assertNull(actualRoleInfo.getRole());
  }

  @Test
  public void setUsernameTest() {
    // Arrange
    RoleInfo roleInfo = new RoleInfo();

    // Act
    roleInfo.setUsername("aaaaa");

    // Assert
    assertEquals("aaaaa", roleInfo.getUsername());
  }

  @Test
  public void getUsernameTest() {
    // Arrange, Act and Assert
    assertNull((new RoleInfo()).getUsername());
  }

  @Test
  public void setRoleTest() {
    // Arrange
    RoleInfo roleInfo = new RoleInfo();

    // Act
    roleInfo.setRole("aaaaa");

    // Assert
    assertEquals("aaaaa", roleInfo.getRole());
  }
}

