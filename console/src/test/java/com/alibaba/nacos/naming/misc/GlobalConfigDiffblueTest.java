package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GlobalConfigDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    GlobalConfig actualGlobalConfig = new GlobalConfig();

    // Assert
    assertEquals(1000, actualGlobalConfig.getBatchSyncKeyCount());
    assertEquals(5000L, actualGlobalConfig.getSyncRetryDelay());
    assertEquals(2000, actualGlobalConfig.getTaskDispatchPeriod());
    assertFalse(actualGlobalConfig.isDataWarmup());
    assertTrue(actualGlobalConfig.isExpireInstance());
  }
}

