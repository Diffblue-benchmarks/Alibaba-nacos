package com.alibaba.nacos.naming.cluster;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ServerStatusManagerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(ServerStatus.STARTING, (new ServerStatusManager()).getServerStatus());
  }
}

