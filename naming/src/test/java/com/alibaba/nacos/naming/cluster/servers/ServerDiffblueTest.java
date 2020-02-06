package com.alibaba.nacos.naming.cluster.servers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ServerDiffblueTest {
  @Test
  public void getIpTest() {
    // Arrange, Act and Assert
    assertNull((new Server()).getIp());
  }

  @Test
  public void setLastRefTimeTest() {
    // Arrange
    Server server = new Server();

    // Act
    server.setLastRefTime(1L);

    // Assert
    assertEquals(1L, server.getLastRefTime());
  }

  @Test
  public void getKeyTest() {
    // Arrange, Act and Assert
    assertEquals("null:0", (new Server()).getKey());
  }

  @Test
  public void setSiteTest() {
    // Arrange
    Server server = new Server();

    // Act
    server.setSite("unknown");

    // Assert
    assertEquals("unknown", server.getSite());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Server actualServer = new Server();

    // Assert
    boolean actualIsAliveResult = actualServer.isAlive();
    long actualLastRefTime = actualServer.getLastRefTime();
    String actualSite = actualServer.getSite();
    assertFalse(actualIsAliveResult);
    assertEquals(1, actualServer.getWeight());
    assertEquals("unknown", actualSite);
    assertEquals(0L, actualLastRefTime);
  }

  @Test
  public void toStringTest() {
    // Arrange
    Server server = new Server();

    // Act and Assert
    assertEquals("{\"adWeight\":0,\"alive\":false,\"key\":\"null:0\","
        + "\"lastRefTime\":0,\"servePort\":0,\"site\":\"unknown" + "\",\"weight\":1}", server.toString());
    assertEquals("{\"adWeight\":0,\"alive\":false,\"key\":\"null:0\","
        + "\"lastRefTime\":0,\"servePort\":0,\"site\":\"unknown" + "\",\"weight\":1}", server.toString());
  }

  @Test
  public void isAliveTest() {
    // Arrange, Act and Assert
    assertFalse((new Server()).isAlive());
  }
}

