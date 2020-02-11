package com.alibaba.nacos.client.identify;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CredentialsDiffblueTest {
  @Test(timeout=10000)
  public void getAccessKeyTest() {
    // Arrange, Act and Assert
    assertNull((new Credentials()).getAccessKey());
  }

  @Test(timeout=10000)
  public void setTenantIdTest() {
    // Arrange
    Credentials credentials = new Credentials();

    // Act
    credentials.setTenantId("123");

    // Assert
    assertEquals("123", credentials.getTenantId());
  }

  @Test(timeout=10000)
  public void getTenantIdTest() {
    // Arrange, Act and Assert
    assertNull((new Credentials()).getTenantId());
  }

  @Test(timeout=10000)
  public void validTest() {
    // Arrange, Act and Assert
    assertFalse((new Credentials()).valid());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void setAccessKeyTest() {
    // Arrange
    Credentials credentials = new Credentials();

    // Act
    credentials.setAccessKey("foo");

    // Assert
    assertEquals("foo", credentials.getAccessKey());
  }

  @Test(timeout=10000)
  public void identicalTest() {
    // Arrange
    Credentials credentials = new Credentials();

    // Act and Assert
    assertTrue(credentials.identical(new Credentials()));
  }

  @Test(timeout=10000)
  public void getSecretKeyTest() {
    // Arrange, Act and Assert
    assertNull((new Credentials()).getSecretKey());
  }

  @Test(timeout=10000)
  public void setSecretKeyTest() {
    // Arrange
    Credentials credentials = new Credentials();

    // Act
    credentials.setSecretKey("foo");

    // Assert
    assertEquals("foo", credentials.getSecretKey());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Credentials actualCredentials = new Credentials("foo", "foo", "123");

    // Assert
    String actualSecretKey = actualCredentials.getSecretKey();
    String actualTenantId = actualCredentials.getTenantId();
    assertEquals("foo", actualSecretKey);
    assertEquals("foo", actualCredentials.getAccessKey());
    assertEquals("123", actualTenantId);
  }
}

