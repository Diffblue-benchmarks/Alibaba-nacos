package com.alibaba.nacos.api.naming.listener;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.alibaba.nacos.api.naming.pojo.Instance;
import java.util.List;
import org.junit.Test;

public class NamingEventDiffblueTest {
  @Test
  public void setInstancesTest() {
    // Arrange
    NamingEvent namingEvent = new NamingEvent("name", null);

    // Act
    namingEvent.setInstances(null);

    // Assert
    assertNull(namingEvent.getInstances());
  }

  @Test
  public void setServiceNameTest() {
    // Arrange
    NamingEvent namingEvent = new NamingEvent("name", null);

    // Act
    namingEvent.setServiceName("name");

    // Assert
    assertEquals("name", namingEvent.getServiceName());
  }

  @Test
  public void getServiceNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new NamingEvent("name", null)).getServiceName());
  }

  @Test
  public void setGroupNameTest() {
    // Arrange
    NamingEvent namingEvent = new NamingEvent("name", null);

    // Act
    namingEvent.setGroupName("name");

    // Assert
    assertEquals("name", namingEvent.getGroupName());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    NamingEvent actualNamingEvent = new NamingEvent("name", null);

    // Assert
    List<Instance> actualInstances = actualNamingEvent.getInstances();
    assertEquals("name", actualNamingEvent.getServiceName());
    assertNull(actualInstances);
  }

  @Test
  public void setClustersTest() {
    // Arrange
    NamingEvent namingEvent = new NamingEvent("name", null);

    // Act
    namingEvent.setClusters("foo");

    // Assert
    assertEquals("foo", namingEvent.getClusters());
  }

  @Test
  public void getClustersTest() {
    // Arrange, Act and Assert
    assertNull((new NamingEvent("name", null)).getClusters());
  }

  @Test
  public void getInstancesTest() {
    // Arrange, Act and Assert
    assertNull((new NamingEvent("name", null)).getInstances());
  }

  @Test
  public void getGroupNameTest() {
    // Arrange, Act and Assert
    assertNull((new NamingEvent("name", null)).getGroupName());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    NamingEvent actualNamingEvent = new NamingEvent("name", "name", "foo", null);

    // Assert
    String actualGroupName = actualNamingEvent.getGroupName();
    List<Instance> actualInstances = actualNamingEvent.getInstances();
    String actualClusters = actualNamingEvent.getClusters();
    assertEquals("name", actualGroupName);
    assertEquals("name", actualNamingEvent.getServiceName());
    assertEquals("foo", actualClusters);
    assertNull(actualInstances);
  }
}

