package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PropertyUtilDiffblueTest {
  @Test(timeout=10000)
  public void isHealthCheckTest() {
    // Arrange, Act and Assert
    assertTrue(PropertyUtil.isHealthCheck());
  }

  @Test(timeout=10000)
  public void getDefaultMaxAggrSizeTest() {
    // Arrange, Act and Assert
    assertEquals(1024, PropertyUtil.getDefaultMaxAggrSize());
  }

  @Test(timeout=10000)
  public void getNotifySocketTimeoutTest() {
    // Arrange, Act and Assert
    assertEquals(200, PropertyUtil.getNotifySocketTimeout());
  }

  @Test(timeout=10000)
  public void getMaxContentTest() {
    // Arrange, Act and Assert
    assertEquals(10485760, PropertyUtil.getMaxContent());
  }

  @Test(timeout=10000)
  public void getDefaultMaxAggrCountTest() {
    // Arrange, Act and Assert
    assertEquals(10000, PropertyUtil.getDefaultMaxAggrCount());
  }

  @Test(timeout=10000)
  public void getDefaultClusterQuotaTest() {
    // Arrange, Act and Assert
    assertEquals(100000, PropertyUtil.getDefaultClusterQuota());
  }

  @Test(timeout=10000)
  public void getInitialExpansionPercentTest() {
    // Arrange, Act and Assert
    assertEquals(100, PropertyUtil.getInitialExpansionPercent());
  }

  @Test(timeout=10000)
  public void getCorrectUsageDelayTest() {
    // Arrange, Act and Assert
    assertEquals(600, PropertyUtil.getCorrectUsageDelay());
  }

  @Test(timeout=10000)
  public void isStandaloneUseMysqlTest() {
    // Arrange, Act and Assert
    assertFalse(PropertyUtil.isStandaloneUseMysql());
  }

  @Test(timeout=10000)
  public void isManageCapacityTest() {
    // Arrange, Act and Assert
    assertTrue(PropertyUtil.isManageCapacity());
  }

  @Test(timeout=10000)
  public void getNotifyConnectTimeoutTest() {
    // Arrange, Act and Assert
    assertEquals(100, PropertyUtil.getNotifyConnectTimeout());
  }

  @Test(timeout=10000)
  public void isStandaloneModeTest() {
    // Arrange, Act and Assert
    assertFalse(PropertyUtil.isStandaloneMode());
  }

  @Test(timeout=10000)
  public void getMaxHealthCheckFailCountTest() {
    // Arrange, Act and Assert
    assertEquals(12, PropertyUtil.getMaxHealthCheckFailCount());
  }

  @Test(timeout=10000)
  public void getDefaultGroupQuotaTest() {
    // Arrange, Act and Assert
    assertEquals(200, PropertyUtil.getDefaultGroupQuota());
  }

  @Test(timeout=10000)
  public void getDefaultMaxSizeTest() {
    // Arrange, Act and Assert
    assertEquals(102400, PropertyUtil.getDefaultMaxSize());
  }

  @Test(timeout=10000)
  public void getDefaultTenantQuotaTest() {
    // Arrange, Act and Assert
    assertEquals(200, PropertyUtil.getDefaultTenantQuota());
  }

  @Test(timeout=10000)
  public void isCapacityLimitCheckTest() {
    // Arrange, Act and Assert
    assertFalse(PropertyUtil.isCapacityLimitCheck());
  }
}

