package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class TenantInfoDiffblueTest {
  @Test
  public void getTenantDescTest() {
    // Arrange, Act and Assert
    assertNull((new TenantInfo()).getTenantDesc());
  }

  @Test
  public void setTenantIdTest() {
    // Arrange
    TenantInfo tenantInfo = new TenantInfo();

    // Act
    tenantInfo.setTenantId("123");

    // Assert
    assertEquals("123", tenantInfo.getTenantId());
  }

  @Test
  public void getTenantIdTest() {
    // Arrange, Act and Assert
    assertNull((new TenantInfo()).getTenantId());
  }

  @Test
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

  @Test
  public void setTenantNameTest() {
    // Arrange
    TenantInfo tenantInfo = new TenantInfo();

    // Act
    tenantInfo.setTenantName("name");

    // Assert
    assertEquals("name", tenantInfo.getTenantName());
  }

  @Test
  public void getTenantNameTest() {
    // Arrange, Act and Assert
    assertNull((new TenantInfo()).getTenantName());
  }

  @Test
  public void setTenantDescTest() {
    // Arrange
    TenantInfo tenantInfo = new TenantInfo();

    // Act
    tenantInfo.setTenantDesc("foo");

    // Assert
    assertEquals("foo", tenantInfo.getTenantDesc());
  }
}

