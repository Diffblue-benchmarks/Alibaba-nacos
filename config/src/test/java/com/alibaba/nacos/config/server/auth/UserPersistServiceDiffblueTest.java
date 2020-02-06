package com.alibaba.nacos.config.server.auth;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserPersistServiceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void findUserByUsernameTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    (new UserPersistService()).findUserByUsername("username");
  }
}

