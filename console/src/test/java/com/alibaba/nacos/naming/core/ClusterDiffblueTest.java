package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.api.naming.pojo.AbstractHealthChecker;
import org.junit.Test;

public class ClusterDiffblueTest {
  @Test
  public void testAllIPs() {
    // Arrange, Act and Assert
    assertEquals(0, (new Cluster()).allIPs().size());
  }

  @Test
  public void testAllIPs2() {
    // Arrange, Act and Assert
    assertEquals(0, (new Cluster()).allIPs(true).size());
  }

  @Test
  public void testAllIPs3() {
    // Arrange, Act and Assert
    assertEquals(0, (new Cluster()).allIPs(false).size());
  }

  @Test
  public void testClone() throws CloneNotSupportedException {
    // Arrange
    Cluster cluster = new Cluster();
    cluster.setService(new Service());
    cluster.setName("UUU");

    // Act
    Cluster actualCloneResult = cluster.clone();

    // Assert
    assertEquals("", actualCloneResult.getSitegroup());
    assertEquals(80, actualCloneResult.getDefCkport());
    assertNull(actualCloneResult.getServiceName());
    assertEquals(80, actualCloneResult.getDefIPPort());
    AbstractHealthChecker healthChecker = actualCloneResult.getHealthChecker();
    assertTrue(healthChecker instanceof AbstractHealthChecker.Tcp);
    assertTrue(actualCloneResult.isUseIPPort4Check());
    assertEquals(80, actualCloneResult.getDefaultCheckPort());
    assertNull(actualCloneResult.getHealthCheckTask());
    assertEquals("UUU", actualCloneResult.getName());
    assertEquals(80, actualCloneResult.getDefaultPort());
    assertEquals("TCP", healthChecker.getType());
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    Cluster actualCluster = new Cluster();

    // Assert
    assertEquals("", actualCluster.getSitegroup());
    assertEquals(80, actualCluster.getDefCkport());
    assertEquals(80, actualCluster.getDefIPPort());
    AbstractHealthChecker healthChecker = actualCluster.getHealthChecker();
    assertTrue(healthChecker instanceof AbstractHealthChecker.Tcp);
    assertTrue(actualCluster.isUseIPPort4Check());
    assertEquals(80, actualCluster.getDefaultPort());
    assertEquals(80, actualCluster.getDefaultCheckPort());
    assertEquals("TCP", healthChecker.getType());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new Cluster()).equals(null));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new Cluster()).equals(""));
  }

  @Test
  public void testGetDefIPPort() {
    // Arrange
    Cluster cluster = new Cluster();
    cluster.setDefIPPort(8080);

    // Act and Assert
    assertEquals(8080, cluster.getDefIPPort());
  }

  @Test
  public void testGetDefIPPort2() {
    // Arrange, Act and Assert
    assertEquals(80, (new Cluster()).getDefIPPort());
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(23273, (new Cluster()).hashCode());
  }

  @Test
  public void testSetDefCkport() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setDefCkport(8080);

    // Assert
    assertEquals(8080, cluster.getDefCkport());
  }

  @Test
  public void testSetDefIPPort() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setDefIPPort(8080);

    // Assert
    assertEquals(8080, cluster.getDefIPPort());
  }

  @Test
  public void testSetServiceName() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setServiceName("");

    // Assert
    assertEquals("", cluster.getServiceName());
  }

  @Test
  public void testSetSitegroup() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setSitegroup("");

    // Assert
    assertEquals("", cluster.getSitegroup());
  }

  @Test
  public void testUpdate() {
    // Arrange
    Cluster cluster = new Cluster();
    cluster.setService(new Service());

    // Act
    cluster.update(cluster);

    // Assert
    assertEquals(80, cluster.getDefIPPort());
  }
}

