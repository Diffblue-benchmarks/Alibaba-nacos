package com.alibaba.nacos.client.identify;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class STSConfigDiffblueTest {
  @Test
  public void setCacheSecurityCredentialsTest() {
    // Arrange
    STSConfig instance = STSConfig.getInstance();

    // Act
    instance.setCacheSecurityCredentials(true);

    // Assert
    assertTrue(instance.isCacheSecurityCredentials());
  }

  @Test
  public void getSecurityCredentialsTest() {
    // Arrange, Act and Assert
    assertNull(STSConfig.getInstance().getSecurityCredentials());
  }

  @Test
  public void setTimeToRefreshInMillisecondTest() {
    // Arrange
    STSConfig instance = STSConfig.getInstance();

    // Act
    instance.setTimeToRefreshInMillisecond(1);

    // Assert
    assertEquals(1, instance.getTimeToRefreshInMillisecond());
  }

  @Test
  public void isCacheSecurityCredentialsTest() {
    // Arrange, Act and Assert
    assertTrue(STSConfig.getInstance().isCacheSecurityCredentials());
  }

  @Test
  public void getSecurityCredentialsUrlTest() {
    // Arrange, Act and Assert
    assertNull(STSConfig.getInstance().getSecurityCredentialsUrl());
  }

  @Test
  public void setRamRoleNameTest() {
    // Arrange
    STSConfig instance = STSConfig.getInstance();

    // Act
    instance.setRamRoleName("cache.security.credentials");

    // Assert
    assertEquals("cache.security.credentials", instance.getRamRoleName());
  }

  @Test
  public void getRamRoleNameTest() {
    // Arrange, Act and Assert
    assertNull(STSConfig.getInstance().getRamRoleName());
  }

  @Test
  public void getTimeToRefreshInMillisecondTest() {
    // Arrange, Act and Assert
    assertEquals(180000, STSConfig.getInstance().getTimeToRefreshInMillisecond());
  }

  @Test
  public void setSecurityCredentialsTest() {
    // Arrange
    STSConfig instance = STSConfig.getInstance();

    // Act
    instance.setSecurityCredentials("cache.security.credentials");

    // Assert
    assertTrue(instance.isSTSOn());
  }

  @Test
  public void isSTSOnTest() {
    // Arrange, Act and Assert
    assertFalse(STSConfig.getInstance().isSTSOn());
  }
}

