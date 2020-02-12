package com.alibaba.nacos.console.security;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.config.server.model.User;
import org.junit.Test;

public class CustomUserDetailsDiffblueTest {
  @Test(timeout=10000)
  public void isAccountNonLockedTest() {
    // Arrange, Act and Assert
    assertTrue((new CustomUserDetails(new User())).isAccountNonLocked());
  }

  @Test(timeout=10000)
  public void isAccountNonExpiredTest() {
    // Arrange, Act and Assert
    assertTrue((new CustomUserDetails(new User())).isAccountNonExpired());
  }

  @Test(timeout=10000)
  public void isEnabledTest() {
    // Arrange, Act and Assert
    assertTrue((new CustomUserDetails(new User())).isEnabled());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new CustomUserDetails(new User())).getPassword());
  }

  @Test(timeout=10000)
  public void isCredentialsNonExpiredTest() {
    // Arrange, Act and Assert
    assertTrue((new CustomUserDetails(new User())).isCredentialsNonExpired());
  }

  @Test(timeout=10000)
  public void getUsernameTest() {
    // Arrange, Act and Assert
    assertNull((new CustomUserDetails(new User())).getUsername());
  }

  @Test(timeout=10000)
  public void getAuthoritiesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new CustomUserDetails(new User())).getAuthorities().size());
  }

  @Test(timeout=10000)
  public void getPasswordTest() {
    // Arrange, Act and Assert
    assertNull((new CustomUserDetails(new User())).getPassword());
  }
}

