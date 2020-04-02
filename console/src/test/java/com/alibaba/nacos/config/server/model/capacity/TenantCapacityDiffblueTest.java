package com.alibaba.nacos.config.server.model.capacity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class TenantCapacityDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    TenantCapacity actualTenantCapacity = new TenantCapacity();

    // Assert
    assertNull(actualTenantCapacity.getMaxSize());
    assertNull(actualTenantCapacity.getMaxAggrCount());
    assertNull(actualTenantCapacity.getGmtModified());
    assertNull(actualTenantCapacity.getId());
    assertNull(actualTenantCapacity.getMaxAggrSize());
    assertNull(actualTenantCapacity.getTenant());
    assertNull(actualTenantCapacity.getGmtCreate());
    assertNull(actualTenantCapacity.getQuota());
    assertNull(actualTenantCapacity.getUsage());
  }

  @Test
  public void testSetTenant() {
    // Arrange
    TenantCapacity tenantCapacity = new TenantCapacity();

    // Act
    tenantCapacity.setTenant("tenant");

    // Assert
    assertEquals("tenant", tenantCapacity.getTenant());
  }
}

