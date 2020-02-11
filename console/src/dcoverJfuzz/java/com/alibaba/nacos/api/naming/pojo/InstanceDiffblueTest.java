package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class InstanceDiffblueTest {
  @Test(timeout=10000)
  public void getIpDeleteTimeoutTest() {
    // Arrange, Act and Assert
    assertEquals(30000L, (new Instance()).getIpDeleteTimeout());
  }

  @Test(timeout=10000)
  public void isEnabledTest() {
    // Arrange, Act and Assert
    assertTrue((new Instance()).isEnabled());
  }

  @Test(timeout=10000)
  public void getInstanceHeartBeatTimeOutTest() {
    // Arrange, Act and Assert
    assertEquals(15000L, (new Instance()).getInstanceHeartBeatTimeOut());
  }

  @Test(timeout=10000)
  public void addMetadataTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.addMetadata("foo", "value");

    // Assert
    assertEquals(15000L, instance.getInstanceHeartBeatTimeOut());
  }

  @Test(timeout=10000)
  public void setMetadataTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setMetadata(null);

    // Assert
    assertNull(instance.getMetadata());
  }

  @Test(timeout=10000)
  public void setEphemeralTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setEphemeral(true);

    // Assert
    assertTrue(instance.isEphemeral());
  }

  @Test(timeout=10000)
  public void isHealthyTest() {
    // Arrange, Act and Assert
    assertTrue((new Instance()).isHealthy());
  }

  @Test(timeout=10000)
  public void setServiceNameTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setServiceName("name");

    // Assert
    assertEquals("name", instance.getServiceName());
  }

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new Instance()).equals("foo"));
  }

  @Test(timeout=10000)
  public void getPortTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Instance()).getPort());
  }

  @Test(timeout=10000)
  public void setInstanceIdTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setInstanceId("123");

    // Assert
    assertEquals("123", instance.getInstanceId());
  }

  @Test(timeout=10000)
  public void setEnabledTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setEnabled(true);

    // Assert
    assertTrue(instance.isEnabled());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Instance actualInstance = new Instance();

    // Assert
    boolean actualIsEphemeralResult = actualInstance.isEphemeral();
    boolean actualIsHealthyResult = actualInstance.isHealthy();
    double actualWeight = actualInstance.getWeight();
    boolean actualIsEnabledResult = actualInstance.isEnabled();
    assertEquals(30000L, actualInstance.getIpDeleteTimeout());
    assertTrue(actualIsEnabledResult);
    assertEquals(1.0, actualWeight, 0.0);
    assertTrue(actualIsHealthyResult);
    assertTrue(actualIsEphemeralResult);
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    Instance instance = new Instance();

    // Act and Assert
    assertEquals(
        "{\"enabled\":true,\"ephemeral\":true,\"healthy\":true,"
            + "\"instanceHeartBeatInterval\":5000,\"instanceHeartBeatTimeOut"
            + "\":15000,\"ipDeleteTimeout\":30000,\"metadata\":{},\"port" + "\":0,\"weight\":1.0}",
        instance.toString());
    assertEquals(
        "{\"enabled\":true,\"ephemeral\":true,\"healthy\":true,"
            + "\"instanceHeartBeatInterval\":5000,\"instanceHeartBeatTimeOut"
            + "\":15000,\"ipDeleteTimeout\":30000,\"metadata\":{},\"port" + "\":0,\"weight\":1.0}",
        instance.toString());
  }

  @Test(timeout=10000)
  public void setHealthyTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setHealthy(true);

    // Assert
    assertTrue(instance.isHealthy());
  }

  @Test(timeout=10000)
  public void setIpTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setIp("127.0.0.1");

    // Assert
    assertEquals("127.0.0.1", instance.getIp());
  }

  @Test(timeout=10000)
  public void getClusterNameTest() {
    // Arrange, Act and Assert
    assertNull((new Instance()).getClusterName());
  }

  @Test(timeout=10000)
  public void getServiceNameTest() {
    // Arrange, Act and Assert
    assertNull((new Instance()).getServiceName());
  }

  @Test(timeout=10000)
  public void getInstanceIdTest() {
    // Arrange, Act and Assert
    assertNull((new Instance()).getInstanceId());
  }

  @Test(timeout=10000)
  public void toInetAddrTest() {
    // Arrange, Act and Assert
    assertEquals("null:0", (new Instance()).toInetAddr());
  }

  @Test(timeout=10000)
  public void getMetadataTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Instance()).getMetadata().size());
  }

  @Test(timeout=10000)
  public void setWeightTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setWeight(10.0);

    // Assert
    assertEquals(10.0, instance.getWeight(), 0.0);
  }

  @Test(timeout=10000)
  public void getIpTest() {
    // Arrange, Act and Assert
    assertNull((new Instance()).getIp());
  }

  @Test(timeout=10000)
  public void setClusterNameTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setClusterName("name");

    // Assert
    assertEquals("name", instance.getClusterName());
  }

  @Test(timeout=10000)
  public void getWeightTest() {
    // Arrange, Act and Assert
    assertEquals(1.0, (new Instance()).getWeight(), 0.0);
  }

  @Test(timeout=10000)
  public void setPortTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setPort(8080);

    // Assert
    assertEquals(8080, instance.getPort());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange
    Instance instance = new Instance();

    // Act and Assert
    assertEquals(-89776619, instance.hashCode());
    assertEquals(
        "{\"enabled\":true,\"ephemeral\":true,\"healthy\":true,"
            + "\"instanceHeartBeatInterval\":5000,\"instanceHeartBeatTimeOut"
            + "\":15000,\"ipDeleteTimeout\":30000,\"metadata\":{},\"port" + "\":0,\"weight\":1.0}",
        instance.toString());
  }

  @Test(timeout=10000)
  public void getInstanceHeartBeatIntervalTest() {
    // Arrange, Act and Assert
    assertEquals(5000L, (new Instance()).getInstanceHeartBeatInterval());
  }
}

