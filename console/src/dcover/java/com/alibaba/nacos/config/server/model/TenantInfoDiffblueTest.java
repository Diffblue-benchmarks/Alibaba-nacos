package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class TenantInfoDiffblueTest {
  @Test(timeout=10000)
  public void getTenantDescTest() {
    // Arrange, Act and Assert
    assertNull((new TenantInfo()).getTenantDesc());
  }

  @Test(timeout=10000)
  public void setTenantIdTest() {
    // Arrange
    TenantInfo tenantInfo = new TenantInfo();

    // Act
    tenantInfo.setTenantId("123");

    // Assert
    assertEquals("123", tenantInfo.getTenantId());
  }

  @Test(timeout=10000)
  public void getTenantIdTest() {
    // Arrange, Act and Assert
    assertNull((new TenantInfo()).getTenantId());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    TenantInfo actualTenantInfo = new TenantInfo();

    // Assert
    String actualTenantName = actualTenantInfo.getTenantName();
    String actualTenantId = actualTenantInfo.getTenantId();
    assertNull(actualTenantName);
    assertNull(actualTenantInfo.getTenantDesc());
    assertNull(actualTenantId);
  }

  @Test(timeout=10000)
  public void setTenantNameTest() {
    // Arrange
    TenantInfo tenantInfo = new TenantInfo();

    // Act
    tenantInfo.setTenantName("name");

    // Assert
    assertEquals("name", tenantInfo.getTenantName());
  }

  @Test(timeout=10000)
  public void getTenantNameTest() {
    // Arrange, Act and Assert
    assertNull((new TenantInfo()).getTenantName());
  }

  @Test(timeout=10000)
  public void setTenantDescTest() {
    // Arrange
    TenantInfo tenantInfo = new TenantInfo();

    // Act
    tenantInfo.setTenantDesc("foo");

    // Assert
    assertEquals("foo", tenantInfo.getTenantDesc());
  }
}

