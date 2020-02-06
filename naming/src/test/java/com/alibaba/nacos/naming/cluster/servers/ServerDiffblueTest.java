package com.alibaba.nacos.naming.cluster.servers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ServerDiffblueTest {
  @Test
  public void setLastRefTimeStrTest() {
    // Arrange
    Server server = new Server();

    // Act
    server.setLastRefTimeStr("foo");

    // Assert
    assertEquals("foo", server.getLastRefTimeStr());
  }

  @Test
  public void getWeightTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new Server()).getWeight());
  }

  @Test
  public void setWeightTest() {
    // Arrange
    Server server = new Server();

    // Act
    server.setWeight(3);

    // Assert
    assertEquals(3, server.getWeight());
  }

  @Test
  public void getSiteTest() {
    // Arrange, Act and Assert
    assertEquals("unknown", (new Server()).getSite());
  }

  @Test
  public void setAliveTest() {
    // Arrange
    Server server = new Server();

    // Act
    server.setAlive(true);

    // Assert
    assertTrue(server.isAlive());
  }

  @Test
  public void getAdWeightTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Server()).getAdWeight());
  }

  @Test
  public void getIpTest() {
    // Arrange, Act and Assert
    assertNull((new Server()).getIp());
  }

  @Test
  public void getLastRefTimeTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new Server()).getLastRefTime());
  }

  @Test
  public void getServePortTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Server()).getServePort());
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
  public void setAdWeightTest() {
    // Arrange
    Server server = new Server();

    // Act
    server.setAdWeight(3);

    // Assert
    assertEquals(3, server.getAdWeight());
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
    server.setSite("foo");

    // Assert
    assertEquals("foo", server.getSite());
  }

  @Test
  public void setServePortTest() {
    // Arrange
    Server server = new Server();

    // Act
    server.setServePort(8080);

    // Assert
    assertEquals(8080, server.getServePort());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new Server()).equals("foo"));
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
  public void getLastRefTimeStrTest() {
    // Arrange, Act and Assert
    assertNull((new Server()).getLastRefTimeStr());
  }

  @Test
  public void setIpTest() {
    // Arrange
    Server server = new Server();

    // Act
    server.setIp("127.0.0.1");

    // Assert
    assertEquals("127.0.0.1", server.getIp());
  }

  @Test
  public void isAliveTest() {
    // Arrange, Act and Assert
    assertFalse((new Server()).isAlive());
  }
}

