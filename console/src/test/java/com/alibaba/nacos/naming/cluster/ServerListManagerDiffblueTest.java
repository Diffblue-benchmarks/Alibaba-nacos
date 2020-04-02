package com.alibaba.nacos.naming.cluster;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.naming.cluster.servers.Server;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.Test;

public class ServerListManagerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ServerListManager actualServerListManager = new ServerListManager();

    // Assert
    Map<String, List<Server>> distroConfig = actualServerListManager.getDistroConfig();
    assertTrue(distroConfig instanceof java.util.concurrent.ConcurrentHashMap);
    List<Server> healthyServers = actualServerListManager.getHealthyServers();
    assertTrue(healthyServers instanceof java.util.ArrayList);
    assertEquals(0, distroConfig.size());
    assertEquals(0, healthyServers.size());
    List<Server> servers = actualServerListManager.getServers();
    assertTrue(servers instanceof java.util.ArrayList);
    Set<String> liveSites = actualServerListManager.getLiveSites();
    assertTrue(liveSites instanceof java.util.HashSet);
    assertEquals(0, servers.size());
    assertEquals(0, liveSites.size());
  }
}

