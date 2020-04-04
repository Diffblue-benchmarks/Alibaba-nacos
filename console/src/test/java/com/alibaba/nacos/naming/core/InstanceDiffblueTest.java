package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class InstanceDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Instance actualInstance = new Instance("(\\d|\\.)+", 8080, "(\\d|\\.)+", "(\\d|\\.)+", "(\\d|\\.)+");

    // Assert
    assertEquals(5000L, actualInstance.getInstanceHeartBeatInterval());
    assertTrue(actualInstance.isEnabled());
    assertFalse(actualInstance.isMarked());
    assertTrue(actualInstance.isHealthy());
    assertEquals(8080, actualInstance.getPort());
    assertTrue(actualInstance.isEphemeral());
    assertEquals(1.0, actualInstance.getWeight(), 0.0);
    assertEquals("(\\d|\\.)+", actualInstance.getTenant());
    assertEquals("(\\d|\\.)+", actualInstance.getClusterName());
    assertEquals("(\\d|\\.)+", actualInstance.getIp());
    assertFalse(actualInstance.isMockValid());
    assertEquals("(\\d|\\.)+", actualInstance.getApp());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    Instance actualInstance = new Instance();

    // Assert
    assertEquals(30000L, actualInstance.getIpDeleteTimeout());
    assertTrue(actualInstance.isEnabled());
    assertFalse(actualInstance.isMarked());
    assertTrue(actualInstance.isHealthy());
    assertTrue(actualInstance.isEphemeral());
    assertEquals(1.0, actualInstance.getWeight(), 0.0);
    assertFalse(actualInstance.isMockValid());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    Instance actualInstance = new Instance("(\\d|\\.)+", 8080, "(\\d|\\.)+");

    // Assert
    assertTrue(actualInstance.isEnabled());
    assertEquals(15000L, actualInstance.getInstanceHeartBeatTimeOut());
    assertFalse(actualInstance.isMarked());
    assertTrue(actualInstance.isHealthy());
    assertEquals(8080, actualInstance.getPort());
    assertTrue(actualInstance.isEphemeral());
    assertEquals(1.0, actualInstance.getWeight(), 0.0);
    assertEquals("(\\d|\\.)+", actualInstance.getClusterName());
    assertEquals("(\\d|\\.)+", actualInstance.getIp());
    assertFalse(actualInstance.isMockValid());
  }

  @Test
  public void testConstructor4() {
    // Arrange and Act
    Instance actualInstance = new Instance("(\\d|\\.)+", 8080);

    // Assert
    assertEquals(5000L, actualInstance.getInstanceHeartBeatInterval());
    assertTrue(actualInstance.isEnabled());
    assertFalse(actualInstance.isMarked());
    assertTrue(actualInstance.isHealthy());
    assertEquals(8080, actualInstance.getPort());
    assertTrue(actualInstance.isEphemeral());
    assertEquals(1.0, actualInstance.getWeight(), 0.0);
    assertEquals("DEFAULT", actualInstance.getClusterName());
    assertEquals("(\\d|\\.)+", actualInstance.getIp());
    assertFalse(actualInstance.isMockValid());
  }

  @Test
  public void testFromJSON() {
    // Arrange and Act
    Instance actualFromJSONResult = Instance.fromJSON("999.999.999.999999");

    // Assert
    assertEquals(5000L, actualFromJSONResult.getInstanceHeartBeatInterval());
    assertTrue(actualFromJSONResult.isEnabled());
    assertFalse(actualFromJSONResult.isMarked());
    assertTrue(actualFromJSONResult.isHealthy());
    assertEquals(999, actualFromJSONResult.getPort());
    assertTrue(actualFromJSONResult.isEphemeral());
    assertEquals(1.0, actualFromJSONResult.getWeight(), 0.0);
    assertEquals(-1L, actualFromJSONResult.getCheckRT());
    assertEquals("DEFAULT", actualFromJSONResult.getClusterName());
    assertEquals("999.999.999.999", actualFromJSONResult.getIp());
    assertFalse(actualFromJSONResult.isMockValid());
  }

  @Test
  public void testFromString() {
    // Arrange and Act
    Instance actualFromStringResult = Instance.fromString("999.999.999.999999");

    // Assert
    assertEquals(30000L, actualFromStringResult.getIpDeleteTimeout());
    assertTrue(actualFromStringResult.isEnabled());
    assertFalse(actualFromStringResult.isMarked());
    assertTrue(actualFromStringResult.isHealthy());
    assertEquals(999, actualFromStringResult.getPort());
    assertTrue(actualFromStringResult.isEphemeral());
    assertEquals(1.0, actualFromStringResult.getWeight(), 0.0);
    assertEquals("DEFAULT", actualFromStringResult.getClusterName());
    assertEquals("999.999.999.999", actualFromStringResult.getIp());
    assertFalse(actualFromStringResult.isMockValid());
  }

  @Test
  public void testFromString2() {
    // Arrange
    Instance actualFromStringResult = Instance.fromString("(\\d|\\.)+");

    // Act and Assert
    assertNull(actualFromStringResult);
    assertNull(Instance.fromString("_"));
  }

  @Test
  public void testGenerateInstanceId() {
    // Arrange, Act and Assert
    assertEquals("null#0#null#null", (new Instance()).generateInstanceId());
  }

  @Test
  public void testGetCheckRT() {
    // Arrange, Act and Assert
    assertEquals(-1L, (new Instance()).getCheckRT());
  }

  @Test
  public void testGetDatumKey() {
    // Arrange
    Instance instance = new Instance();
    instance.setPort(8080);

    // Act
    String actualDatumKey = instance.getDatumKey();

    // Assert
    assertEquals(String.join("", "null:8080:", System.getProperty("sun.os.patch.level"), ":null"), actualDatumKey);
  }

  @Test
  public void testGetDatumKey2() {
    // Arrange and Act
    String actualDatumKey = (new Instance()).getDatumKey();

    // Assert
    assertEquals(String.join("", "null:", System.getProperty("sun.os.patch.level"), ":null"), actualDatumKey);
  }

  @Test
  public void testGetDefaultKey() {
    // Arrange
    Instance instance = new Instance();
    instance.setPort(8080);

    // Act
    String actualDefaultKey = instance.getDefaultKey();

    // Assert
    assertEquals(String.join("", "null:8080:", System.getProperty("sun.os.patch.level")), actualDefaultKey);
  }

  @Test
  public void testGetDefaultKey2() {
    // Arrange and Act
    String actualDefaultKey = (new Instance()).getDefaultKey();

    // Assert
    assertEquals(String.join("", "null:", System.getProperty("sun.os.patch.level")), actualDefaultKey);
  }

  @Test
  public void testHashCode() {
    // Arrange
    Instance instance = new Instance();
    instance.setIp("127.0.0.1");

    // Act and Assert
    assertEquals(1505998205, instance.hashCode());
  }

  @Test
  public void testSetApp() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setApp("(\\d|\\.)+");

    // Assert
    assertEquals("(\\d|\\.)+", instance.getApp());
  }

  @Test
  public void testSetLastBeat() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setLastBeat(1L);

    // Assert
    assertEquals(1L, instance.getLastBeat());
  }

  @Test
  public void testSetMarked() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setMarked(true);

    // Assert
    assertTrue(instance.isMarked());
  }

  @Test
  public void testSetMockValid() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setMockValid(true);

    // Assert
    assertTrue(instance.isMockValid());
  }

  @Test
  public void testSetTenant() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setTenant("(\\d|\\.)+");

    // Assert
    assertEquals("(\\d|\\.)+", instance.getTenant());
  }

  @Test
  public void testToIPAddr() {
    // Arrange, Act and Assert
    assertEquals("null:0", (new Instance()).toIPAddr());
  }

  @Test
  public void testToString() {
    // Arrange and Act
    String actualToStringResult = (new Instance()).toString();

    // Assert
    assertEquals(String.join("", "null:", System.getProperty("sun.os.patch.level"), ":null_1.0_true_false_null"),
        actualToStringResult);
  }
}

