package com.alibaba.nacos.core.auth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class UserDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new User()).getUserName());
  }

  @Test
  public void setUserNameTest() {
    // Arrange
    User user = new User();

    // Act
    user.setUserName("username");

    // Assert
    assertEquals("username", user.getUserName());
  }

  @Test
  public void getUserNameTest() {
    // Arrange, Act and Assert
    assertNull((new User()).getUserName());
  }
}

