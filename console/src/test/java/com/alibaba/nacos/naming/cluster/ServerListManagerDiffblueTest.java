package com.alibaba.nacos.naming.cluster;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.naming.cluster.servers.Server;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class ServerListManagerDiffblueTest {
  @Autowired
  private ServerListManager serverListManager;
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
  @Test
  public void testContains() {
    // Arrange, Act and Assert
    assertFalse(this.serverListManager.contains("#"));
  }
}

