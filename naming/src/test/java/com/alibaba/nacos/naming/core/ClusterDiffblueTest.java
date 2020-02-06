package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.api.naming.pojo.AbstractHealthChecker;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ClusterDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void validateTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new Cluster()).validate();
  }

  @Test
  public void getHealthCheckTaskTest() {
    // Arrange, Act and Assert
    assertNull((new Cluster()).getHealthCheckTask());
  }

  @Test
  public void setDefCkportTest() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setDefCkport(8080);

    // Assert
    assertEquals(8080, cluster.getDefCkport());
  }

  @Test
  public void setServiceNameTest() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setServiceName("name");

    // Assert
    assertEquals("name", cluster.getServiceName());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new Cluster()).equals("foo"));
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    new Cluster("", new Service());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Cluster actualCluster = new Cluster();

    // Assert
    String actualSitegroup = actualCluster.getSitegroup();
    int actualDefaultCheckPort = actualCluster.getDefaultCheckPort();
    int actualDefaultPort = actualCluster.getDefaultPort();
    boolean actualIsUseIPPort4CheckResult = actualCluster.isUseIPPort4Check();
    AbstractHealthChecker healthChecker = actualCluster.getHealthChecker();
    int actualDefIPPort = actualCluster.getDefIPPort();
    assertEquals("", actualSitegroup);
    assertEquals(80, actualCluster.getDefCkport());
    assertEquals(80, actualDefIPPort);
    assertTrue(healthChecker instanceof AbstractHealthChecker.Tcp);
    assertTrue(actualIsUseIPPort4CheckResult);
    assertEquals(80, actualDefaultPort);
    assertEquals(80, actualDefaultCheckPort);
    assertEquals("TCP", healthChecker.getType());
  }

  @Test
  public void setDefIPPortTest2() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setDefIPPort(8080);

    // Assert
    assertEquals(8080, cluster.getDefIPPort());
  }

  @Test
  public void setDefIPPortTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new Cluster()).setDefIPPort(0);
  }

  @Test
  public void allIPsTest3() {
    // Arrange, Act and Assert
    assertEquals(0, (new Cluster()).allIPs(false).size());
  }

  @Test
  public void allIPsTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new Cluster()).allIPs(true).size());
  }

  @Test
  public void getServiceNameTest() {
    // Arrange, Act and Assert
    assertNull((new Cluster()).getServiceName());
  }

  @Test
  public void getDefIPPortTest() {
    // Arrange, Act and Assert
    assertEquals(80, (new Cluster()).getDefIPPort());
  }

  @Test
  public void cloneTest() throws CloneNotSupportedException {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new Cluster()).clone();
  }

  @Test
  public void getServiceTest() {
    // Arrange, Act and Assert
    assertNull((new Cluster()).getService());
  }

  @Test
  public void getSitegroupTest() {
    // Arrange, Act and Assert
    assertEquals("", (new Cluster()).getSitegroup());
  }

  @Test
  public void getDefCkportTest() {
    // Arrange, Act and Assert
    assertEquals(80, (new Cluster()).getDefCkport());
  }

  @Test
  public void allIPsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Cluster()).allIPs().size());
  }

  @Test
  public void setSitegroupTest() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setSitegroup("foo");

    // Assert
    assertEquals("foo", cluster.getSitegroup());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(31, (new Cluster()).hashCode());
  }

  @Test
  public void setServiceTest() {
    // Arrange
    Cluster cluster = new Cluster();

    // Act
    cluster.setService(new Service());

    // Assert
    assertNull(cluster.getServiceName());
  }
}

