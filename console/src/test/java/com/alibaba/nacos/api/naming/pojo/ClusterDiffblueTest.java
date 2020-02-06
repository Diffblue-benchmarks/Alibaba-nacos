package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ClusterDiffblueTest {
  @Test
  public void getServiceNameTest() {
    // Arrange, Act and Assert
    assertNull((new Cluster()).getServiceName());
  }

  @Test
  public void getHealthCheckerTest() {
    // Arrange, Act and Assert
    assertTrue((new Cluster()).getHealthChecker() instanceof AbstractHealthChecker.Tcp);
  }

  @Test
  public void isUseIPPort4CheckTest() {
    // Arrange, Act and Assert
    assertTrue((new Cluster()).isUseIPPort4Check());
  }

  @Test
  public void getMetadataTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Cluster()).getMetadata().size());
  }

  @Test
  public void setDefaultPortTest() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setDefaultPort(1);

    // Assert
    assertEquals(1, cluster.getDefaultPort());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    Cluster actualCluster = new Cluster("aaaaa");

    // Assert
    String actualName = actualCluster.getName();
    int actualDefaultCheckPort = actualCluster.getDefaultCheckPort();
    int actualDefaultPort = actualCluster.getDefaultPort();
    boolean actualIsUseIPPort4CheckResult = actualCluster.isUseIPPort4Check();
    AbstractHealthChecker healthChecker = actualCluster.getHealthChecker();
    assertEquals("aaaaa", actualName);
    assertTrue(healthChecker instanceof AbstractHealthChecker.Tcp);
    assertTrue(actualIsUseIPPort4CheckResult);
    assertEquals(80, actualDefaultCheckPort);
    assertEquals(80, actualDefaultPort);
    assertEquals("TCP", healthChecker.getType());
  }

  @Test
  public void setMetadataTest() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setMetadata(null);

    // Assert
    assertNull(cluster.getMetadata());
  }

  @Test
  public void getDefaultCheckPortTest() {
    // Arrange, Act and Assert
    assertEquals(80, (new Cluster()).getDefaultCheckPort());
  }

  @Test
  public void setServiceNameTest() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setServiceName("aaaaa");

    // Assert
    assertEquals("aaaaa", cluster.getServiceName());
  }

  @Test
  public void setNameTest() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setName("aaaaa");

    // Assert
    assertEquals("aaaaa", cluster.getName());
  }

  @Test
  public void setUseIPPort4CheckTest() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setUseIPPort4Check(true);

    // Assert
    assertTrue(cluster.isUseIPPort4Check());
  }

  @Test
  public void getDefaultPortTest() {
    // Arrange, Act and Assert
    assertEquals(80, (new Cluster()).getDefaultPort());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Cluster actualCluster = new Cluster();

    // Assert
    int actualDefaultCheckPort = actualCluster.getDefaultCheckPort();
    int actualDefaultPort = actualCluster.getDefaultPort();
    boolean actualIsUseIPPort4CheckResult = actualCluster.isUseIPPort4Check();
    AbstractHealthChecker healthChecker = actualCluster.getHealthChecker();
    assertTrue(healthChecker instanceof AbstractHealthChecker.Tcp);
    assertTrue(actualIsUseIPPort4CheckResult);
    assertEquals(80, actualDefaultCheckPort);
    assertEquals(80, actualDefaultPort);
    assertEquals("TCP", healthChecker.getType());
  }

  @Test
  public void setDefaultCheckPortTest() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setDefaultCheckPort(1);

    // Assert
    assertEquals(1, cluster.getDefaultCheckPort());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertNull((new Cluster()).getName());
  }
}

