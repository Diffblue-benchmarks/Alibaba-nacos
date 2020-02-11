package com.alibaba.nacos.client.identify;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class STSConfigDiffblueTest {
  @Test(timeout=10000)
  public void setCacheSecurityCredentialsTest() {
    // Arrange
    STSConfig instance = STSConfig.getInstance();

    // Act
    instance.setCacheSecurityCredentials(true);

    // Assert
    assertTrue(instance.isCacheSecurityCredentials());
  }

  @Test(timeout=10000)
  public void getSecurityCredentialsTest() {
    // Arrange, Act and Assert
    assertNull(STSConfig.getInstance().getSecurityCredentials());
  }

  @Test(timeout=10000)
  public void setTimeToRefreshInMillisecondTest() {
    // Arrange
    STSConfig instance = STSConfig.getInstance();

    // Act
    instance.setTimeToRefreshInMillisecond(1);

    // Assert
    assertEquals(1, instance.getTimeToRefreshInMillisecond());
  }

  @Test(timeout=10000)
  public void isCacheSecurityCredentialsTest() {
    // Arrange, Act and Assert
    assertTrue(STSConfig.getInstance().isCacheSecurityCredentials());
  }

  @Test(timeout=10000)
  public void getSecurityCredentialsUrlTest() {
    // Arrange, Act and Assert
    assertNull(STSConfig.getInstance().getSecurityCredentialsUrl());
  }

  @Test(timeout=10000)
  public void setRamRoleNameTest() {
    // Arrange
    STSConfig instance = STSConfig.getInstance();

    // Act
    instance.setRamRoleName("name");

    // Assert
    assertEquals("name", instance.getRamRoleName());
  }

  @Test(timeout=10000)
  public void getRamRoleNameTest() {
    // Arrange, Act and Assert
    assertNull(STSConfig.getInstance().getRamRoleName());
  }

  @Test(timeout=10000)
  public void getTimeToRefreshInMillisecondTest() {
    // Arrange, Act and Assert
    assertEquals(180000, STSConfig.getInstance().getTimeToRefreshInMillisecond());
  }

  @Test(timeout=10000)
  public void setSecurityCredentialsTest() {
    // Arrange
    STSConfig instance = STSConfig.getInstance();

    // Act
    instance.setSecurityCredentials("foo");

    // Assert
    assertTrue(instance.isSTSOn());
  }

  @Test(timeout=10000)
  public void isSTSOnTest() {
    // Arrange, Act and Assert
    assertFalse(STSConfig.getInstance().isSTSOn());
  }
}

