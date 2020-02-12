package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GlobalConfigDiffblueTest {
  @Test(timeout=10000)
  public void getSyncRetryDelayTest() {
    // Arrange, Act and Assert
    assertEquals(5000L, (new GlobalConfig()).getSyncRetryDelay());
  }

  @Test(timeout=10000)
  public void getTaskDispatchPeriodTest() {
    // Arrange, Act and Assert
    assertEquals(2000, (new GlobalConfig()).getTaskDispatchPeriod());
  }

  @Test(timeout=10000)
  public void isDataWarmupTest() {
    // Arrange, Act and Assert
    assertFalse((new GlobalConfig()).isDataWarmup());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    GlobalConfig actualGlobalConfig = new GlobalConfig();

    // Assert
    boolean actualIsDataWarmupResult = actualGlobalConfig.isDataWarmup();
    int actualTaskDispatchPeriod = actualGlobalConfig.getTaskDispatchPeriod();
    assertEquals(5000L, actualGlobalConfig.getSyncRetryDelay());
    assertEquals(2000, actualTaskDispatchPeriod);
    assertFalse(actualIsDataWarmupResult);
  }

  @Test(timeout=10000)
  public void isExpireInstanceTest() {
    // Arrange, Act and Assert
    assertTrue((new GlobalConfig()).isExpireInstance());
  }

  @Test(timeout=10000)
  public void getBatchSyncKeyCountTest() {
    // Arrange, Act and Assert
    assertEquals(1000, (new GlobalConfig()).getBatchSyncKeyCount());
  }
}

