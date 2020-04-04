package com.alibaba.nacos.console.security;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.config.server.model.User;
import org.junit.Test;

public class CustomUserDetailsDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new CustomUserDetails(new User())).getPassword());
  }

  @Test
  public void testGetAuthorities() {
    // Arrange, Act and Assert
    assertEquals(0, (new CustomUserDetails(new User())).getAuthorities().size());
  }

  @Test
  public void testGetPassword() {
    // Arrange, Act and Assert
    assertNull((new CustomUserDetails(new User())).getPassword());
  }

  @Test
  public void testGetUsername() {
    // Arrange, Act and Assert
    assertNull((new CustomUserDetails(new User())).getUsername());
  }

  @Test
  public void testIsAccountNonExpired() {
    // Arrange, Act and Assert
    assertTrue((new CustomUserDetails(new User())).isAccountNonExpired());
  }

  @Test
  public void testIsAccountNonLocked() {
    // Arrange, Act and Assert
    assertTrue((new CustomUserDetails(new User())).isAccountNonLocked());
  }

  @Test
  public void testIsCredentialsNonExpired() {
    // Arrange, Act and Assert
    assertTrue((new CustomUserDetails(new User())).isCredentialsNonExpired());
  }

  @Test
  public void testIsEnabled() {
    // Arrange, Act and Assert
    assertTrue((new CustomUserDetails(new User())).isEnabled());
  }
}

