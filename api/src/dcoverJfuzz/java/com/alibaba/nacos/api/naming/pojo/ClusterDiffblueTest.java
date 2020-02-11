package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ClusterDiffblueTest {
  @Test(timeout=10000)
  public void getServiceNameTest() {
    // Arrange, Act and Assert
    assertNull((new Cluster()).getServiceName());
  }

  @Test(timeout=10000)
  public void getHealthCheckerTest() {
    // Arrange, Act and Assert
    assertTrue((new Cluster()).getHealthChecker() instanceof AbstractHealthChecker.Tcp);
  }

  @Test(timeout=10000)
  public void isUseIPPort4CheckTest() {
    // Arrange, Act and Assert
    assertTrue((new Cluster()).isUseIPPort4Check());
  }

  @Test(timeout=10000)
  public void getMetadataTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Cluster()).getMetadata().size());
  }

  @Test(timeout=10000)
  public void setDefaultPortTest() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setDefaultPort(8080);

    // Assert
    assertEquals(8080, cluster.getDefaultPort());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    Cluster actualCluster = new Cluster("name");

    // Assert
    String actualName = actualCluster.getName();
    int actualDefaultCheckPort = actualCluster.getDefaultCheckPort();
    int actualDefaultPort = actualCluster.getDefaultPort();
    boolean actualIsUseIPPort4CheckResult = actualCluster.isUseIPPort4Check();
    AbstractHealthChecker healthChecker = actualCluster.getHealthChecker();
    assertEquals("name", actualName);
    assertTrue(healthChecker instanceof AbstractHealthChecker.Tcp);
    assertTrue(actualIsUseIPPort4CheckResult);
    assertEquals(80, actualDefaultCheckPort);
    assertEquals(80, actualDefaultPort);
    assertEquals("TCP", healthChecker.getType());
  }

  @Test(timeout=10000)
  public void setMetadataTest() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setMetadata(null);

    // Assert
    assertNull(cluster.getMetadata());
  }

  @Test(timeout=10000)
  public void getDefaultCheckPortTest() {
    // Arrange, Act and Assert
    assertEquals(80, (new Cluster()).getDefaultCheckPort());
  }

  @Test(timeout=10000)
  public void setServiceNameTest() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setServiceName("name");

    // Assert
    assertEquals("name", cluster.getServiceName());
  }

  @Test(timeout=10000)
  public void setNameTest() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setName("name");

    // Assert
    assertEquals("name", cluster.getName());
  }

  @Test(timeout=10000)
  public void setUseIPPort4CheckTest() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setUseIPPort4Check(true);

    // Assert
    assertTrue(cluster.isUseIPPort4Check());
  }

  @Test(timeout=10000)
  public void getDefaultPortTest() {
    // Arrange, Act and Assert
    assertEquals(80, (new Cluster()).getDefaultPort());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void setHealthCheckerTest() {
    // Arrange
    Cluster cluster = new Cluster();
    AbstractHealthChecker.Http http = new AbstractHealthChecker.Http();

    // Act
    cluster.setHealthChecker(http);

    // Assert
    assertSame(http, cluster.getHealthChecker());
  }

  @Test(timeout=10000)
  public void setDefaultCheckPortTest() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setDefaultCheckPort(8080);

    // Assert
    assertEquals(8080, cluster.getDefaultCheckPort());
  }

  @Test(timeout=10000)
  public void getNameTest() {
    // Arrange, Act and Assert
    assertNull((new Cluster()).getName());
  }
}

