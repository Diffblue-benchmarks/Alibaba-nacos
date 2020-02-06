package com.alibaba.nacos.naming.cluster;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.naming.cluster.servers.Server;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.Test;

public class ServerListManagerDiffblueTest {
  @Test
  public void getHealthyServersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServerListManager()).getHealthyServers().size());
  }

  @Test
  public void getServersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServerListManager()).getServers().size());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ServerListManager actualServerListManager = new ServerListManager();

    // Assert
    Map<String, List<Server>> distroConfig = actualServerListManager.getDistroConfig();
    Set<String> liveSites = actualServerListManager.getLiveSites();
    List<Server> servers = actualServerListManager.getServers();
    List<Server> healthyServers = actualServerListManager.getHealthyServers();
    assertTrue(distroConfig instanceof java.util.concurrent.ConcurrentHashMap);
    assertTrue(healthyServers instanceof java.util.ArrayList);
    assertEquals(0, distroConfig.size());
    assertEquals(0, healthyServers.size());
    assertTrue(servers instanceof java.util.ArrayList);
    assertTrue(liveSites instanceof java.util.HashSet);
    assertEquals(0, servers.size());
    assertEquals(0, liveSites.size());
  }

  @Test
  public void getLiveSitesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServerListManager()).getLiveSites().size());
  }

  @Test
  public void getDistroConfigTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ServerListManager()).getDistroConfig().size());
  }

  @Test
  public void containsTest() {
    // Arrange, Act and Assert
    assertFalse((new ServerListManager()).contains("foo"));
  }
}

