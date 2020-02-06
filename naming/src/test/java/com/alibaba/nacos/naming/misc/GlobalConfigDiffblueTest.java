package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GlobalConfigDiffblueTest {
  @Test
  public void getSyncRetryDelayTest() {
    // Arrange, Act and Assert
    assertEquals(5000L, (new GlobalConfig()).getSyncRetryDelay());
  }

  @Test
  public void getTaskDispatchPeriodTest() {
    // Arrange, Act and Assert
    assertEquals(2000, (new GlobalConfig()).getTaskDispatchPeriod());
  }

  @Test
  public void isDataWarmupTest() {
    // Arrange, Act and Assert
    assertFalse((new GlobalConfig()).isDataWarmup());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    GlobalConfig actualGlobalConfig = new GlobalConfig();

    // Assert
    int actualBatchSyncKeyCount = actualGlobalConfig.getBatchSyncKeyCount();
    boolean actualIsExpireInstanceResult = actualGlobalConfig.isExpireInstance();
    boolean actualIsDataWarmupResult = actualGlobalConfig.isDataWarmup();
    int actualTaskDispatchPeriod = actualGlobalConfig.getTaskDispatchPeriod();
    assertEquals(1000, actualBatchSyncKeyCount);
    assertEquals(5000L, actualGlobalConfig.getSyncRetryDelay());
    assertEquals(2000, actualTaskDispatchPeriod);
    assertFalse(actualIsDataWarmupResult);
    assertTrue(actualIsExpireInstanceResult);
  }

  @Test
  public void isExpireInstanceTest() {
    // Arrange, Act and Assert
    assertTrue((new GlobalConfig()).isExpireInstance());
  }

  @Test
  public void getBatchSyncKeyCountTest() {
    // Arrange, Act and Assert
    assertEquals(1000, (new GlobalConfig()).getBatchSyncKeyCount());
  }
}

