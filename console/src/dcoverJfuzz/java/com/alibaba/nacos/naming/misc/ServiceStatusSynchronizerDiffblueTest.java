package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ServiceStatusSynchronizerDiffblueTest {
  @Test(timeout=10000)
  public void getTest() {
    // Arrange, Act and Assert
    assertNull((new ServiceStatusSynchronizer()).get("foo", "foo"));
  }
}

