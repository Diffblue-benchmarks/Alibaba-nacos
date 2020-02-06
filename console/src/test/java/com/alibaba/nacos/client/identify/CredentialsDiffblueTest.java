package com.alibaba.nacos.client.identify;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CredentialsDiffblueTest {
  @Test
  public void getAccessKeyTest() {
    // Arrange, Act and Assert
    assertNull((new Credentials()).getAccessKey());
  }

  @Test
  public void setTenantIdTest() {
    // Arrange
    Credentials credentials = new Credentials();

    // Act
    credentials.setTenantId("aaaaa");

    // Assert
    assertEquals("aaaaa", credentials.getTenantId());
  }

  @Test
  public void getTenantIdTest() {
    // Arrange, Act and Assert
    assertNull((new Credentials()).getTenantId());
  }

  @Test
  public void validTest() {
    // Arrange, Act and Assert
    assertFalse((new Credentials()).valid());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    Credentials actualCredentials = new Credentials();

    // Assert
    String actualSecretKey = actualCredentials.getSecretKey();
    String actualTenantId = actualCredentials.getTenantId();
    assertNull(actualSecretKey);
    assertNull(actualCredentials.getAccessKey());
    assertNull(actualTenantId);
  }

  @Test
  public void setAccessKeyTest() {
    // Arrange
    Credentials credentials = new Credentials();

    // Act
    credentials.setAccessKey("aaaaa");

    // Assert
    assertEquals("aaaaa", credentials.getAccessKey());
  }

  @Test
  public void identicalTest() {
    // Arrange
    Credentials credentials = new Credentials();

    // Act and Assert
    assertTrue(credentials.identical(new Credentials()));
  }

  @Test
  public void getSecretKeyTest() {
    // Arrange, Act and Assert
    assertNull((new Credentials()).getSecretKey());
  }

  @Test
  public void setSecretKeyTest() {
    // Arrange
    Credentials credentials = new Credentials();

    // Act
    credentials.setSecretKey("aaaaa");

    // Assert
    assertEquals("aaaaa", credentials.getSecretKey());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Credentials actualCredentials = new Credentials("aaaaa", "aaaaa", "aaaaa");

    // Assert
    String actualSecretKey = actualCredentials.getSecretKey();
    String actualTenantId = actualCredentials.getTenantId();
    assertEquals("aaaaa", actualSecretKey);
    assertEquals("aaaaa", actualCredentials.getAccessKey());
    assertEquals("aaaaa", actualTenantId);
  }
}

