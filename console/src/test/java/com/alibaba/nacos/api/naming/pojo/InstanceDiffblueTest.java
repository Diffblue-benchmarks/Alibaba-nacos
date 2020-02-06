package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class InstanceDiffblueTest {
  @Test
  public void isEnabledTest() {
    // Arrange, Act and Assert
    assertTrue((new Instance()).isEnabled());
  }

  @Test
  public void isHealthyTest() {
    // Arrange, Act and Assert
    assertTrue((new Instance()).isHealthy());
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
    instance.setIp("^\\d+$");

    // Assert
    assertEquals("^\\d+$", instance.getIp());
  }

  @Test
  public void toInetAddrTest() {
    // Arrange, Act and Assert
    assertEquals("null:0", (new Instance()).toInetAddr());
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
  public void getInstanceHeartBeatIntervalTest() {
    // Arrange, Act and Assert
    assertEquals(5000L, (new Instance()).getInstanceHeartBeatInterval());
  }
}

