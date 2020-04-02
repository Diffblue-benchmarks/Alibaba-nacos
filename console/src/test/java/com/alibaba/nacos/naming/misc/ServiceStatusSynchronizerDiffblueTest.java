package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ServiceStatusSynchronizerDiffblueTest {
  @Test
  public void testGet() {
    // Arrange, Act and Assert
    assertNull((new ServiceStatusSynchronizer()).get("", ""));
  }

  @Test
  public void testGet2() {
    // Arrange, Act and Assert
    assertNull((new ServiceStatusSynchronizer()).get(null, ""));
  }

  @Test
  public void testGet3() {
    // Arrange, Act and Assert
    assertNull((new ServiceStatusSynchronizer()).get("/v1/ns", ""));
  }

  @Test
  public void testGet4() {
    // Arrange, Act and Assert
    assertNull((new ServiceStatusSynchronizer()).get("", "/v1/ns"));
  }
}

