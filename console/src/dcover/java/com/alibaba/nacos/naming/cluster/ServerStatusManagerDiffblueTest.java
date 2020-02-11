package com.alibaba.nacos.naming.cluster;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ServerStatusManagerDiffblueTest {
  @Test(timeout=10000)
  public void getServerStatusTest() {
    // Arrange, Act and Assert
    assertEquals(ServerStatus.STARTING, (new ServerStatusManager()).getServerStatus());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(ServerStatus.STARTING, (new ServerStatusManager()).getServerStatus());
  }
}

