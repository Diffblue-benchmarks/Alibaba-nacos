package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import org.junit.Test;

public class ClusterDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Cluster actualCluster = new Cluster();

    // Assert
    AbstractHealthChecker healthChecker = actualCluster.getHealthChecker();
    assertTrue(healthChecker instanceof AbstractHealthChecker.Tcp);
    assertTrue(actualCluster.isUseIPPort4Check());
    assertEquals(80, actualCluster.getDefaultCheckPort());
    assertEquals(80, actualCluster.getDefaultPort());
    assertEquals("TCP", healthChecker.getType());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    Cluster actualCluster = new Cluster(String.join("", System.getProperty("nacos.mode"), "Name"));

    // Assert
    String actualName = actualCluster.getName();
    int actualDefaultCheckPort = actualCluster.getDefaultCheckPort();
    int actualDefaultPort = actualCluster.getDefaultPort();
    boolean actualIsUseIPPort4CheckResult = actualCluster.isUseIPPort4Check();
    AbstractHealthChecker healthChecker = actualCluster.getHealthChecker();
    assertEquals(String.join("", System.getProperty("nacos.mode"), "Name"), actualName);
    assertTrue(healthChecker instanceof AbstractHealthChecker.Tcp);
    assertTrue(actualIsUseIPPort4CheckResult);
    assertEquals(80, actualDefaultCheckPort);
    assertEquals(80, actualDefaultPort);
    assertEquals("TCP", healthChecker.getType());
  }

  @Test
  public void testSetDefaultCheckPort() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setDefaultCheckPort(8080);

    // Assert
    assertEquals(8080, cluster.getDefaultCheckPort());
  }

  @Test
  public void testSetDefaultPort() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setDefaultPort(8080);

    // Assert
    assertEquals(8080, cluster.getDefaultPort());
  }

  @Test
  public void testSetHealthChecker() {
    // Arrange
    Cluster cluster = new Cluster();
    AbstractHealthChecker.Http http = new AbstractHealthChecker.Http();

    // Act
    cluster.setHealthChecker(http);

    // Assert
    assertSame(http, cluster.getHealthChecker());
  }

  @Test
  public void testSetMetadata() {
    // Arrange
    Cluster cluster = new Cluster();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    cluster.setMetadata(stringStringMap);

    // Assert
    assertSame(stringStringMap, cluster.getMetadata());
  }

  @Test
  public void testSetName() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setName("name");

    // Assert
    assertEquals("name", cluster.getName());
  }

  @Test
  public void testSetServiceName() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setServiceName("serviceName");

    // Assert
    assertEquals("serviceName", cluster.getServiceName());
  }

  @Test
  public void testSetUseIPPort4Check() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setUseIPPort4Check(true);

    // Assert
    assertTrue(cluster.isUseIPPort4Check());
  }
}

