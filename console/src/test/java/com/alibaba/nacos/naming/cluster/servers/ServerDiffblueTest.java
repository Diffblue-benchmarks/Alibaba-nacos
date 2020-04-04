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
    boolean actualIsAliveResult = actualServer.isAlive();
    long actualLastRefTime = actualServer.getLastRefTime();
    assertFalse(actualIsAliveResult);
    assertEquals(1, actualServer.getWeight());
    String expectedSite = System.getProperty("sun.os.patch.level");
    assertEquals(expectedSite, actualServer.getSite());
    assertEquals(0L, actualLastRefTime);
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new Server()).equals(null));
  }

  @Test
  public void testEquals2() {
    // Arrange
    String o = System.getProperty("sun.os.patch.level");

    // Act and Assert
    assertFalse((new Server()).equals(o));
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
    String ip = System.getProperty("sun.os.patch.level");
    Server server = new Server();

    // Act
    server.setIp(ip);

    // Assert
    String expectedIp = System.getProperty("sun.os.patch.level");
    assertEquals(expectedIp, server.getIp());
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
    String lastRefTimeStr = System.getProperty("sun.os.patch.level");
    Server server = new Server();

    // Act
    server.setLastRefTimeStr(lastRefTimeStr);

    // Assert
    String expectedLastRefTimeStr = System.getProperty("sun.os.patch.level");
    assertEquals(expectedLastRefTimeStr, server.getLastRefTimeStr());
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
    String site = System.getProperty("sun.os.patch.level");
    Server server = new Server();

    // Act
    server.setSite(site);

    // Assert
    String expectedSite = System.getProperty("sun.os.patch.level");
    assertEquals(expectedSite, server.getSite());
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

