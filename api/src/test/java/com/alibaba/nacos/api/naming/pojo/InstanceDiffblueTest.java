package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class InstanceDiffblueTest {
  @Test
  public void getIpDeleteTimeoutTest() {
    // Arrange, Act and Assert
    assertEquals(30000L, (new Instance()).getIpDeleteTimeout());
  }

  @Test
  public void isEnabledTest() {
    // Arrange, Act and Assert
    assertTrue((new Instance()).isEnabled());
  }

  @Test
  public void getInstanceHeartBeatTimeOutTest() {
    // Arrange, Act and Assert
    assertEquals(15000L, (new Instance()).getInstanceHeartBeatTimeOut());
  }

  @Test
  public void addMetadataTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.addMetadata("foo", "value");

    // Assert
    assertNull(instance.getInstanceIdGenerator());
  }

  @Test
  public void setMetadataTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setMetadata(null);

    // Assert
    assertNull(instance.getMetadata());
  }

  @Test
  public void setEphemeralTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setEphemeral(true);

    // Assert
    assertTrue(instance.isEphemeral());
  }

  @Test
  public void isHealthyTest() {
    // Arrange, Act and Assert
    assertTrue((new Instance()).isHealthy());
  }

  @Test
  public void setServiceNameTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setServiceName("name");

    // Assert
    assertEquals("name", instance.getServiceName());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new Instance()).equals("foo"));
  }

  @Test
  public void getPortTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Instance()).getPort());
  }

  @Test
  public void isEphemeralTest() {
    // Arrange, Act and Assert
    assertTrue((new Instance()).isEphemeral());
  }

  @Test
  public void setInstanceIdTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setInstanceId("123");

    // Assert
    assertEquals("123", instance.getInstanceId());
  }

  @Test
  public void setEnabledTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setEnabled(true);

    // Assert
    assertTrue(instance.isEnabled());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Instance actualInstance = new Instance();

    // Assert
    String actualInstanceIdGenerator = actualInstance.getInstanceIdGenerator();
    boolean actualIsEphemeralResult = actualInstance.isEphemeral();
    boolean actualIsHealthyResult = actualInstance.isHealthy();
    double actualWeight = actualInstance.getWeight();
    assertTrue(actualInstance.isEnabled());
    assertEquals(1.0, actualWeight, 0.0);
    assertTrue(actualIsHealthyResult);
    assertTrue(actualIsEphemeralResult);
    assertEquals("simple", actualInstanceIdGenerator);
  }

  @Test
  public void toStringTest() {
    // Arrange
    Instance instance = new Instance();

    // Act and Assert
    assertEquals(
        "{\"enabled\":true,\"ephemeral\":true,\"healthy\":true," + "\"instanceHeartBeatInterval\":5000,\"instanceHeartB"
            + "eatTimeOut\":15000,\"instanceIdGenerator\":\"simple\""
            + ",\"ipDeleteTimeout\":30000,\"metadata\":{},\"port\":0," + "\"weight\":1.0}",
        instance.toString());
    assertEquals(
        "{\"enabled\":true,\"ephemeral\":true,\"healthy\":true," + "\"instanceHeartBeatInterval\":5000,\"instanceHeartB"
            + "eatTimeOut\":15000,\"instanceIdGenerator\":\"simple\""
            + ",\"ipDeleteTimeout\":30000,\"metadata\":{},\"port\":0," + "\"weight\":1.0}",
        instance.toString());
  }

  @Test
  public void setHealthyTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setHealthy(true);

    // Assert
    assertTrue(instance.isHealthy());
  }

  @Test
  public void setIpTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setIp("127.0.0.1");

    // Assert
    assertEquals("127.0.0.1", instance.getIp());
  }

  @Test
  public void getClusterNameTest() {
    // Arrange, Act and Assert
    assertNull((new Instance()).getClusterName());
  }

  @Test
  public void getServiceNameTest() {
    // Arrange, Act and Assert
    assertNull((new Instance()).getServiceName());
  }

  @Test
  public void getInstanceIdTest() {
    // Arrange, Act and Assert
    assertNull((new Instance()).getInstanceId());
  }

  @Test
  public void toInetAddrTest() {
    // Arrange, Act and Assert
    assertEquals("null:0", (new Instance()).toInetAddr());
  }

  @Test
  public void getMetadataTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Instance()).getMetadata().size());
  }

  @Test
  public void setWeightTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setWeight(10.0);

    // Assert
    assertEquals(10.0, instance.getWeight(), 0.0);
  }

  @Test
  public void getIpTest() {
    // Arrange, Act and Assert
    assertNull((new Instance()).getIp());
  }

  @Test
  public void setClusterNameTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setClusterName("name");

    // Assert
    assertEquals("name", instance.getClusterName());
  }

  @Test
  public void getWeightTest() {
    // Arrange, Act and Assert
    assertEquals(1.0, (new Instance()).getWeight(), 0.0);
  }

  @Test
  public void setPortTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setPort(8080);

    // Assert
    assertEquals(8080, instance.getPort());
  }

  @Test
  public void hashCodeTest() {
    // Arrange
    Instance instance = new Instance();

    // Act and Assert
    assertEquals(-432979976, instance.hashCode());
    assertEquals(
        "{\"enabled\":true,\"ephemeral\":true,\"healthy\":true," + "\"instanceHeartBeatInterval\":5000,\"instanceHeartB"
            + "eatTimeOut\":15000,\"instanceIdGenerator\":\"simple\""
            + ",\"ipDeleteTimeout\":30000,\"metadata\":{},\"port\":0," + "\"weight\":1.0}",
        instance.toString());
  }

  @Test
  public void getInstanceIdGeneratorTest() {
    // Arrange, Act and Assert
    assertEquals("simple", (new Instance()).getInstanceIdGenerator());
  }

  @Test
  public void getInstanceHeartBeatIntervalTest() {
    // Arrange, Act and Assert
    assertEquals(5000L, (new Instance()).getInstanceHeartBeatInterval());
  }
}

