package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DataSyncerDiffblueTest {
  @Test
  public void buildKeyTest() {
    // Arrange, Act and Assert
    assertEquals("foo@@@@foo", (new DataSyncer()).buildKey("foo", "foo"));
  }
}

