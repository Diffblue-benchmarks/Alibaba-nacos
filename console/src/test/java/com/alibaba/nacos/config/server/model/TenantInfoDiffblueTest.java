package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class TenantInfoDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    TenantInfo actualTenantInfo = new TenantInfo();

    // Assert
    assertNull(actualTenantInfo.getTenantName());
    assertNull(actualTenantInfo.getTenantDesc());
    assertNull(actualTenantInfo.getTenantId());
  }

  @Test
  public void testSetTenantDesc() {
    // Arrange
    TenantInfo tenantInfo = new TenantInfo();

    // Act
    tenantInfo.setTenantDesc("tenantDesc");

    // Assert
    assertEquals("tenantDesc", tenantInfo.getTenantDesc());
  }

  @Test
  public void testSetTenantId() {
    // Arrange
    TenantInfo tenantInfo = new TenantInfo();

    // Act
    tenantInfo.setTenantId("123");

    // Assert
    assertEquals("123", tenantInfo.getTenantId());
  }

  @Test
  public void testSetTenantName() {
    // Arrange
    TenantInfo tenantInfo = new TenantInfo();

    // Act
    tenantInfo.setTenantName("tenantName");

    // Assert
    assertEquals("tenantName", tenantInfo.getTenantName());
  }
}

