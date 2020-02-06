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
    NamingEvent namingEvent = new NamingEvent("aaaaa", null);

    // Act
    namingEvent.setInstances(null);

    // Assert
    assertNull(namingEvent.getInstances());
  }

  @Test
  public void setServiceNameTest() {
    // Arrange
    NamingEvent namingEvent = new NamingEvent("aaaaa", null);

    // Act
    namingEvent.setServiceName("aaaaa");

    // Assert
    assertEquals("aaaaa", namingEvent.getServiceName());
  }

  @Test
  public void getServiceNameTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new NamingEvent("aaaaa", null)).getServiceName());
  }

  @Test
  public void setGroupNameTest() {
    // Arrange
    NamingEvent namingEvent = new NamingEvent("aaaaa", null);

    // Act
    namingEvent.setGroupName("aaaaa");

    // Assert
    assertEquals("aaaaa", namingEvent.getGroupName());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    NamingEvent actualNamingEvent = new NamingEvent("aaaaa", null);

    // Assert
    List<Instance> actualInstances = actualNamingEvent.getInstances();
    assertEquals("aaaaa", actualNamingEvent.getServiceName());
    assertNull(actualInstances);
  }

  @Test
  public void setClustersTest() {
    // Arrange
    NamingEvent namingEvent = new NamingEvent("aaaaa", null);

    // Act
    namingEvent.setClusters("aaaaa");

    // Assert
    assertEquals("aaaaa", namingEvent.getClusters());
  }

  @Test
  public void getClustersTest() {
    // Arrange, Act and Assert
    assertNull((new NamingEvent("aaaaa", null)).getClusters());
  }

  @Test
  public void getInstancesTest() {
    // Arrange, Act and Assert
    assertNull((new NamingEvent("aaaaa", null)).getInstances());
  }

  @Test
  public void getGroupNameTest() {
    // Arrange, Act and Assert
    assertNull((new NamingEvent("aaaaa", null)).getGroupName());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    NamingEvent actualNamingEvent = new NamingEvent("aaaaa", "aaaaa", "aaaaa", null);

    // Assert
    String actualGroupName = actualNamingEvent.getGroupName();
    List<Instance> actualInstances = actualNamingEvent.getInstances();
    String actualClusters = actualNamingEvent.getClusters();
    assertEquals("aaaaa", actualGroupName);
    assertEquals("aaaaa", actualNamingEvent.getServiceName());
    assertEquals("aaaaa", actualClusters);
    assertNull(actualInstances);
  }
}

