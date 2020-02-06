package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PropertyUtilDiffblueTest {
  @Test
  public void isHealthCheckTest() {
    // Arrange, Act and Assert
    assertTrue(PropertyUtil.isHealthCheck());
  }

  @Test
  public void getDefaultMaxAggrSizeTest() {
    // Arrange, Act and Assert
    assertEquals(1024, PropertyUtil.getDefaultMaxAggrSize());
  }

  @Test
  public void getNotifySocketTimeoutTest() {
    // Arrange, Act and Assert
    assertEquals(200, PropertyUtil.getNotifySocketTimeout());
  }

  @Test
  public void getMaxContentTest() {
    // Arrange, Act and Assert
    assertEquals(10485760, PropertyUtil.getMaxContent());
  }

  @Test
  public void getDefaultMaxAggrCountTest() {
    // Arrange, Act and Assert
    assertEquals(10000, PropertyUtil.getDefaultMaxAggrCount());
  }

  @Test
  public void getDefaultClusterQuotaTest() {
    // Arrange, Act and Assert
    assertEquals(100000, PropertyUtil.getDefaultClusterQuota());
  }

  @Test
  public void getInitialExpansionPercentTest() {
    // Arrange, Act and Assert
    assertEquals(100, PropertyUtil.getInitialExpansionPercent());
  }

  @Test
  public void getCorrectUsageDelayTest() {
    // Arrange, Act and Assert
    assertEquals(600, PropertyUtil.getCorrectUsageDelay());
  }

  @Test
  public void isStandaloneUseMysqlTest() {
    // Arrange, Act and Assert
    assertFalse(PropertyUtil.isStandaloneUseMysql());
  }

  @Test
  public void isManageCapacityTest() {
    // Arrange, Act and Assert
    assertTrue(PropertyUtil.isManageCapacity());
  }

  @Test
  public void getNotifyConnectTimeoutTest() {
    // Arrange, Act and Assert
    assertEquals(100, PropertyUtil.getNotifyConnectTimeout());
  }

  @Test
  public void isStandaloneModeTest() {
    // Arrange, Act and Assert
    assertFalse(PropertyUtil.isStandaloneMode());
  }

  @Test
  public void getMaxHealthCheckFailCountTest() {
    // Arrange, Act and Assert
    assertEquals(12, PropertyUtil.getMaxHealthCheckFailCount());
  }

  @Test
  public void getDefaultGroupQuotaTest() {
    // Arrange, Act and Assert
    assertEquals(200, PropertyUtil.getDefaultGroupQuota());
  }

  @Test
  public void getDefaultMaxSizeTest() {
    // Arrange, Act and Assert
    assertEquals(102400, PropertyUtil.getDefaultMaxSize());
  }

  @Test
  public void getDefaultTenantQuotaTest() {
    // Arrange, Act and Assert
    assertEquals(200, PropertyUtil.getDefaultTenantQuota());
  }

  @Test
  public void isCapacityLimitCheckTest() {
    // Arrange, Act and Assert
    assertFalse(PropertyUtil.isCapacityLimitCheck());
  }
}

