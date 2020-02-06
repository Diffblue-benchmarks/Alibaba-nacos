package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class UserDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    User actualUser = new User();

    // Assert
    String actualPassword = actualUser.getPassword();
    assertNull(actualPassword);
    assertNull(actualUser.getUsername());
  }

  @Test
  public void setUsernameTest() {
    // Arrange
    User user = new User();

    // Act
    user.setUsername("username");

    // Assert
    assertEquals("username", user.getUsername());
  }

  @Test
  public void getUsernameTest() {
    // Arrange, Act and Assert
    assertNull((new User()).getUsername());
  }

  @Test
  public void setPasswordTest() {
    // Arrange
    User user = new User();

    // Act
    user.setPassword("Password123");

    // Assert
    assertEquals("Password123", user.getPassword());
  }

  @Test
  public void getPasswordTest() {
    // Arrange, Act and Assert
    assertNull((new User()).getPassword());
  }
}

