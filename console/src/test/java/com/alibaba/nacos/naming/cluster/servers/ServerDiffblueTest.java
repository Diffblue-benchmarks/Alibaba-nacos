package com.alibaba.nacos.naming.cluster.servers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ServerDiffblueTest {
  @Test
  public void testCompareTo() {
    // Arrange, Act and Assert
    assertEquals(0, (new Server()).compareTo(new Server()));
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    Server actualServer = new Server();

    // Assert
    assertFalse(actualServer.isAlive());
    assertEquals(1, actualServer.getWeight());
    assertEquals("unknown", actualServer.getSite());
    assertEquals(0L, actualServer.getLastRefTime());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new Server()).equals("unknown"));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new Server()).equals(null));
  }

  @Test
  public void testGetKey() {
    // Arrange, Act and Assert
    assertEquals("null:0", (new Server()).getKey());
  }

  @Test
  public void testHashCode() {
    // Arrange
    Server server = new Server();
    server.setIp("127.0.0.1");

    // Act and Assert
    assertEquals(-558695901, server.hashCode());
  }

  @Test
  public void testSetAdWeight() {
    // Arrange
    Server server = new Server();

    // Act
    server.setAdWeight(3);

    // Assert
    assertEquals(3, server.getAdWeight());
  }

  @Test
  public void testSetAlive() {
    // Arrange
    Server server = new Server();

    // Act
    server.setAlive(true);

    // Assert
    assertTrue(server.isAlive());
  }

  @Test
  public void testSetIp() {
    // Arrange
    Server server = new Server();

    // Act
    server.setIp("unknown");

    // Assert
    assertEquals("unknown", server.getIp());
  }

  @Test
  public void testSetLastRefTime() {
    // Arrange
    Server server = new Server();

    // Act
    server.setLastRefTime(0L);

    // Assert
    assertEquals(0L, server.getLastRefTime());
  }

  @Test
  public void testSetLastRefTimeStr() {
    // Arrange
    Server server = new Server();

    // Act
    server.setLastRefTimeStr("unknown");

    // Assert
    assertEquals("unknown", server.getLastRefTimeStr());
  }

  @Test
  public void testSetServePort() {
    // Arrange
    Server server = new Server();

    // Act
    server.setServePort(8080);

    // Assert
    assertEquals(8080, server.getServePort());
  }

  @Test
  public void testSetSite() {
    // Arrange
    Server server = new Server();

    // Act
    server.setSite("unknown");

    // Assert
    assertEquals("unknown", server.getSite());
  }

  @Test
  public void testSetWeight() {
    // Arrange
    Server server = new Server();

    // Act
    server.setWeight(3);

    // Assert
    assertEquals(3, server.getWeight());
  }
}

