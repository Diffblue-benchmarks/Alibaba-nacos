package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ServerStatusSynchronizerDiffblueTest {
  @Test
  public void testGet() {
    // Arrange, Act and Assert
    assertNull((new ServerStatusSynchronizer()).get("/operator/server/status", "/operator/server/status"));
  }
}

