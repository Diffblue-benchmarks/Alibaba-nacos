package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class UserDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    User actualUser = new User();

    // Assert
    assertNull(actualUser.getPassword());
    assertNull(actualUser.getUsername());
  }

  @Test
  public void testSetPassword() {
    // Arrange
    User user = new User();

    // Act
    user.setPassword("Password123");

    // Assert
    assertEquals("Password123", user.getPassword());
  }

  @Test
  public void testSetUsername() {
    // Arrange
    User user = new User();

    // Act
    user.setUsername("username");

    // Assert
    assertEquals("username", user.getUsername());
  }
}

