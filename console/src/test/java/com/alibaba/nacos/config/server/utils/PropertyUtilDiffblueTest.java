package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PropertyUtilDiffblueTest {
  @Test
  public void testGetDefaultGroupQuota() {
    // Arrange, Act and Assert
    assertEquals(200, PropertyUtil.getDefaultGroupQuota());
  }

  @Test
  public void testGetDefaultMaxSize() {
    // Arrange, Act and Assert
    assertEquals(102400, PropertyUtil.getDefaultMaxSize());
  }

  @Test
  public void testGetDefaultTenantQuota() {
    // Arrange, Act and Assert
    assertEquals(200, PropertyUtil.getDefaultTenantQuota());
  }

  @Test
  public void testGetInitialExpansionPercent() {
    // Arrange, Act and Assert
    assertEquals(100, PropertyUtil.getInitialExpansionPercent());
  }

  @Test
  public void testGetMaxContent() {
    // Arrange, Act and Assert
    assertEquals(10485760, PropertyUtil.getMaxContent());
  }

  @Test
  public void testIsCapacityLimitCheck() {
    // Arrange, Act and Assert
    assertFalse(PropertyUtil.isCapacityLimitCheck());
  }

  @Test
  public void testIsHealthCheck() {
    // Arrange, Act and Assert
    assertTrue(PropertyUtil.isHealthCheck());
  }

  @Test
  public void testIsManageCapacity() {
    // Arrange, Act and Assert
    assertTrue(PropertyUtil.isManageCapacity());
  }

  @Test
  public void testIsStandaloneMode() {
    // Arrange, Act and Assert
    assertFalse(PropertyUtil.isStandaloneMode());
  }
}

