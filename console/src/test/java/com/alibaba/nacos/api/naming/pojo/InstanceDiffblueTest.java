package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import org.junit.Test;

public class InstanceDiffblueTest {
  @Test
  public void testAddMetadata() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.addMetadata("^\\d+$", "value");

    // Assert
    assertEquals(30000L, instance.getIpDeleteTimeout());
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    Instance actualInstance = new Instance();

    // Assert
    assertEquals(30000L, actualInstance.getIpDeleteTimeout());
    assertTrue(actualInstance.isEnabled());
    assertEquals(1.0, actualInstance.getWeight(), 0.0);
    assertTrue(actualInstance.isHealthy());
    assertTrue(actualInstance.isEphemeral());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new Instance()).equals("^\\d+$"));
  }

  @Test
  public void testGetInstanceHeartBeatInterval() {
    // Arrange
    Instance instance = new Instance();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    instance.setMetadata(stringStringMap);

    // Act and Assert
    assertEquals(5000L, instance.getInstanceHeartBeatInterval());
  }

  @Test
  public void testGetInstanceHeartBeatInterval2() {
    // Arrange
    Instance instance = new Instance();
    instance.setMetadata(null);

    // Act and Assert
    assertEquals(5000L, instance.getInstanceHeartBeatInterval());
  }

  @Test
  public void testGetInstanceHeartBeatInterval3() {
    // Arrange
    Instance instance = new Instance();
    instance.addMetadata("preserved.heart.beat.interval", "value");

    // Act and Assert
    assertEquals(5000L, instance.getInstanceHeartBeatInterval());
  }

  @Test
  public void testGetInstanceHeartBeatInterval4() {
    // Arrange
    Instance instance = new Instance();
    instance.addMetadata("preserved.heart.beat.interval", "999");

    // Act and Assert
    assertEquals(999L, instance.getInstanceHeartBeatInterval());
  }

  @Test
  public void testGetInstanceHeartBeatInterval5() {
    // Arrange, Act and Assert
    assertEquals(5000L, (new Instance()).getInstanceHeartBeatInterval());
  }

  @Test
  public void testGetInstanceHeartBeatTimeOut() {
    // Arrange, Act and Assert
    assertEquals(15000L, (new Instance()).getInstanceHeartBeatTimeOut());
  }

  @Test
  public void testGetIpDeleteTimeout() {
    // Arrange, Act and Assert
    assertEquals(30000L, (new Instance()).getIpDeleteTimeout());
  }

  @Test
  public void testSetClusterName() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setClusterName("^\\d+$");

    // Assert
    assertEquals("^\\d+$", instance.getClusterName());
  }

  @Test
  public void testSetEnabled() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setEnabled(true);

    // Assert
    assertTrue(instance.isEnabled());
  }

  @Test
  public void testSetEphemeral() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setEphemeral(true);

    // Assert
    assertTrue(instance.isEphemeral());
  }

  @Test
  public void testSetHealthy() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setHealthy(true);

    // Assert
    assertTrue(instance.isHealthy());
  }

  @Test
  public void testSetInstanceId() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setInstanceId("123");

    // Assert
    assertEquals("123", instance.getInstanceId());
  }

  @Test
  public void testSetIp() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setIp("127.0.0.1");

    // Assert
    assertEquals("127.0.0.1", instance.getIp());
  }

  @Test
  public void testSetMetadata() {
    // Arrange
    Instance instance = new Instance();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    instance.setMetadata(stringStringMap);

    // Assert
    assertEquals(30000L, instance.getIpDeleteTimeout());
  }

  @Test
  public void testSetPort() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setPort(8080);

    // Assert
    assertEquals(8080, instance.getPort());
  }

  @Test
  public void testSetServiceName() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setServiceName("^\\d+$");

    // Assert
    assertEquals("^\\d+$", instance.getServiceName());
  }

  @Test
  public void testSetWeight() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setWeight(2.0);

    // Assert
    assertEquals(2.0, instance.getWeight(), 0.0);
  }

  @Test
  public void testToInetAddr() {
    // Arrange, Act and Assert
    assertEquals("null:0", (new Instance()).toInetAddr());
  }
}

