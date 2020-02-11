package com.alibaba.nacos.config.server.model.capacity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.sql.Timestamp;
import org.junit.Test;

public class TenantCapacityDiffblueTest {
  @Test(timeout=10000)
  public void setTenantTest() {
    // Arrange
    TenantCapacity tenantCapacity = new TenantCapacity();

    // Act
    tenantCapacity.setTenant("foo");

    // Assert
    assertEquals("foo", tenantCapacity.getTenant());
  }

  @Test(timeout=10000)
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertNull((new TenantCapacity()).getTenant());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    TenantCapacity actualTenantCapacity = new TenantCapacity();

    // Assert
    Integer actualMaxSize = actualTenantCapacity.getMaxSize();
    Integer actualUsage = actualTenantCapacity.getUsage();
    Integer actualQuota = actualTenantCapacity.getQuota();
    Timestamp actualGmtCreate = actualTenantCapacity.getGmtCreate();
    String actualTenant = actualTenantCapacity.getTenant();
    Integer actualMaxAggrSize = actualTenantCapacity.getMaxAggrSize();
    Long actualId = actualTenantCapacity.getId();
    Timestamp actualGmtModified = actualTenantCapacity.getGmtModified();
    assertNull(actualMaxSize);
    assertNull(actualTenantCapacity.getMaxAggrCount());
    assertNull(actualGmtModified);
    assertNull(actualId);
    assertNull(actualMaxAggrSize);
    assertNull(actualTenant);
    assertNull(actualGmtCreate);
    assertNull(actualQuota);
    assertNull(actualUsage);
  }
}

