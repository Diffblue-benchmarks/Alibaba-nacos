package com.alibaba.nacos.api.naming.listener;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import com.alibaba.nacos.api.naming.pojo.Instance;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class NamingEventDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    String clusters = String.join("", System.getProperty("nacos.mode"), "s");
    ArrayList<Instance> instanceList = new ArrayList<Instance>();
    instanceList.add(new Instance());

    // Act
    NamingEvent actualNamingEvent = new NamingEvent("serviceName", "groupName", clusters, instanceList);

    // Assert
    String actualGroupName = actualNamingEvent.getGroupName();
    List<Instance> actualInstances = actualNamingEvent.getInstances();
    String actualClusters = actualNamingEvent.getClusters();
    assertEquals("groupName", actualGroupName);
    assertEquals("serviceName", actualNamingEvent.getServiceName());
    assertEquals(String.join("", System.getProperty("nacos.mode"), "s"), actualClusters);
    assertSame(instanceList, actualInstances);
  }

  @Test
  public void testConstructor2() {
    // Arrange
    ArrayList<Instance> instanceList = new ArrayList<Instance>();
    instanceList.add(new Instance());

    // Act
    NamingEvent actualNamingEvent = new NamingEvent("serviceName", instanceList);

    // Assert
    assertEquals("serviceName", actualNamingEvent.getServiceName());
    assertSame(instanceList, actualNamingEvent.getInstances());
  }

  @Test
  public void testSetClusters() {
    // Arrange
    ArrayList<Instance> instanceList = new ArrayList<Instance>();
    instanceList.add(new Instance());
    NamingEvent namingEvent = new NamingEvent("serviceName", instanceList);

    // Act
    namingEvent.setClusters("serviceName");

    // Assert
    assertEquals("serviceName", namingEvent.getClusters());
  }

  @Test
  public void testSetGroupName() {
    // Arrange
    ArrayList<Instance> instanceList = new ArrayList<Instance>();
    instanceList.add(new Instance());
    NamingEvent namingEvent = new NamingEvent("serviceName", instanceList);

    // Act
    namingEvent.setGroupName("serviceName");

    // Assert
    assertEquals("serviceName", namingEvent.getGroupName());
    assertSame(instanceList, namingEvent.getInstances());
  }

  @Test
  public void testSetInstances() {
    // Arrange
    ArrayList<Instance> instanceList = new ArrayList<Instance>();
    instanceList.add(new Instance());
    NamingEvent namingEvent = new NamingEvent("serviceName", instanceList);
    ArrayList<Instance> instanceList1 = new ArrayList<Instance>();
    instanceList1.add(new Instance());

    // Act
    namingEvent.setInstances(instanceList1);

    // Assert
    assertSame(instanceList1, namingEvent.getInstances());
  }

  @Test
  public void testSetServiceName() {
    // Arrange
    ArrayList<Instance> instanceList = new ArrayList<Instance>();
    instanceList.add(new Instance());
    NamingEvent namingEvent = new NamingEvent("serviceName", instanceList);

    // Act
    namingEvent.setServiceName("serviceName");

    // Assert
    assertEquals("serviceName", namingEvent.getServiceName());
  }
}

