package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class InstanceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void compareToTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new Instance()).compareTo("foo");
  }

  @Test
  public void generateInstanceIdTest2() {
    // Arrange, Act and Assert
    assertEquals("null#0#null#null", (new Instance()).generateInstanceId(null));
  }

  @Test
  public void setLastBeatTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setLastBeat(1L);

    // Assert
    assertEquals(1L, instance.getLastBeat());
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    Instance actualInstance = new Instance("127.0.0.1", 8080);

    // Assert
    boolean actualIsMockValidResult = actualInstance.isMockValid();
    double actualWeight = actualInstance.getWeight();
    String actualIp = actualInstance.getIp();
    String actualClusterName = actualInstance.getClusterName();
    boolean actualIsEphemeralResult = actualInstance.isEphemeral();
    int actualPort = actualInstance.getPort();
    boolean actualIsHealthyResult = actualInstance.isHealthy();
    boolean actualIsMarkedResult = actualInstance.isMarked();
    boolean actualIsEnabledResult = actualInstance.isEnabled();
    assertEquals(30000L, actualInstance.getIpDeleteTimeout());
    assertTrue(actualIsEnabledResult);
    assertFalse(actualIsMarkedResult);
    assertTrue(actualIsHealthyResult);
    assertEquals(8080, actualPort);
    assertTrue(actualIsEphemeralResult);
    assertEquals("DEFAULT", actualClusterName);
    assertEquals("127.0.0.1", actualIp);
    assertEquals(1.0, actualWeight, 0.0);
    assertFalse(actualIsMockValidResult);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    Instance actualInstance = new Instance("127.0.0.1", 8080, "name");

    // Assert
    boolean actualIsMockValidResult = actualInstance.isMockValid();
    double actualWeight = actualInstance.getWeight();
    String actualIp = actualInstance.getIp();
    String actualClusterName = actualInstance.getClusterName();
    boolean actualIsEphemeralResult = actualInstance.isEphemeral();
    int actualPort = actualInstance.getPort();
    boolean actualIsHealthyResult = actualInstance.isHealthy();
    boolean actualIsMarkedResult = actualInstance.isMarked();
    boolean actualIsEnabledResult = actualInstance.isEnabled();
    assertEquals(30000L, actualInstance.getIpDeleteTimeout());
    assertTrue(actualIsEnabledResult);
    assertFalse(actualIsMarkedResult);
    assertTrue(actualIsHealthyResult);
    assertEquals(8080, actualPort);
    assertTrue(actualIsEphemeralResult);
    assertEquals("name", actualClusterName);
    assertEquals("127.0.0.1", actualIp);
    assertEquals(1.0, actualWeight, 0.0);
    assertFalse(actualIsMockValidResult);
  }

  @Test
  public void isMarkedTest() {
    // Arrange, Act and Assert
    assertFalse((new Instance()).isMarked());
  }

  @Test
  public void setMockValidTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setMockValid(true);

    // Assert
    assertTrue(instance.isMockValid());
  }

  @Test
  public void setTenantTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setTenant("foo");

    // Assert
    assertEquals("foo", instance.getTenant());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new Instance()).equals("foo"));
  }

  @Test
  public void getDefaultKeyTest() {
    // Arrange, Act and Assert
    assertEquals("null:unknown", (new Instance()).getDefaultKey());
  }

  @Test
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertNull((new Instance()).getTenant());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    Instance actualInstance = new Instance();

    // Assert
    boolean actualIsMockValidResult = actualInstance.isMockValid();
    double actualWeight = actualInstance.getWeight();
    boolean actualIsEphemeralResult = actualInstance.isEphemeral();
    boolean actualIsHealthyResult = actualInstance.isHealthy();
    boolean actualIsMarkedResult = actualInstance.isMarked();
    boolean actualIsEnabledResult = actualInstance.isEnabled();
    assertEquals(30000L, actualInstance.getIpDeleteTimeout());
    assertTrue(actualIsEnabledResult);
    assertFalse(actualIsMarkedResult);
    assertTrue(actualIsHealthyResult);
    assertTrue(actualIsEphemeralResult);
    assertEquals(1.0, actualWeight, 0.0);
    assertFalse(actualIsMockValidResult);
  }

  @Test
  public void getCheckRTTest() {
    // Arrange, Act and Assert
    assertEquals(-1L, (new Instance()).getCheckRT());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("null:unknown:null_1.0_true_false_null", (new Instance()).toString());
  }

  @Test
  public void toIPAddrTest() {
    // Arrange, Act and Assert
    assertEquals("null:0", (new Instance()).toIPAddr());
  }

  @Test
  public void getAppTest() {
    // Arrange, Act and Assert
    assertNull((new Instance()).getApp());
  }

  @Test
  public void setMarkedTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setMarked(true);

    // Assert
    assertTrue(instance.isMarked());
  }

  @Test
  public void fromJSONTest3() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Instance.fromJSON("_");
  }

  @Test
  public void fromJSONTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Instance.fromJSON("foo");
  }

  @Test
  public void fromJSONTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Instance.fromJSON("");
  }

  @Test
  public void fromStringTest() {
    // Arrange
    Instance actualFromStringResult = Instance.fromString("foo");

    // Act and Assert
    assertNull(actualFromStringResult);
    assertNull(Instance.fromString("_"));
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Instance actualInstance = new Instance("127.0.0.1", 8080, "name", "foo", "foo");

    // Assert
    boolean actualIsMockValidResult = actualInstance.isMockValid();
    String actualApp = actualInstance.getApp();
    double actualWeight = actualInstance.getWeight();
    String actualIp = actualInstance.getIp();
    String actualClusterName = actualInstance.getClusterName();
    String actualTenant = actualInstance.getTenant();
    boolean actualIsEphemeralResult = actualInstance.isEphemeral();
    int actualPort = actualInstance.getPort();
    boolean actualIsHealthyResult = actualInstance.isHealthy();
    boolean actualIsMarkedResult = actualInstance.isMarked();
    long actualInstanceHeartBeatTimeOut = actualInstance.getInstanceHeartBeatTimeOut();
    assertTrue(actualInstance.isEnabled());
    assertEquals(15000L, actualInstanceHeartBeatTimeOut);
    assertFalse(actualIsMarkedResult);
    assertTrue(actualIsHealthyResult);
    assertEquals(8080, actualPort);
    assertTrue(actualIsEphemeralResult);
    assertEquals("foo", actualTenant);
    assertEquals("name", actualClusterName);
    assertEquals("127.0.0.1", actualIp);
    assertEquals(1.0, actualWeight, 0.0);
    assertEquals("foo", actualApp);
    assertFalse(actualIsMockValidResult);
  }

  @Test
  public void isMockValidTest() {
    // Arrange, Act and Assert
    assertFalse((new Instance()).isMockValid());
  }

  @Test
  public void getDatumKeyTest() {
    // Arrange, Act and Assert
    assertEquals("null:unknown:null", (new Instance()).getDatumKey());
  }

  @Test
  public void generateInstanceIdTest() {
    // Arrange, Act and Assert
    assertEquals("null#0#null#null", (new Instance()).generateInstanceId());
  }
}

