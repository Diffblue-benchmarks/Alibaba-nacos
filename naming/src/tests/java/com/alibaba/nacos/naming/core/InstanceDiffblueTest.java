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

  @Test(timeout=10000)
  public void compareToTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    (new Instance()).compareTo("foo");
  }

  @Test(timeout=10000)
  public void setLastBeatTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setLastBeat(1L);

    // Assert
    assertEquals(1L, instance.getLastBeat());
  }

  @Test(timeout=10000)
  public void constructorTest4() {
    // Arrange and Act
    Instance actualInstance = new Instance("127.0.0.1", 8080);

    // Assert
    long actualInstanceHeartBeatInterval = actualInstance.getInstanceHeartBeatInterval();
    boolean actualIsMockValidResult = actualInstance.isMockValid();
    double actualWeight = actualInstance.getWeight();
    String actualIp = actualInstance.getIp();
    String actualClusterName = actualInstance.getClusterName();
    boolean actualIsEphemeralResult = actualInstance.isEphemeral();
    int actualPort = actualInstance.getPort();
    boolean actualIsHealthyResult = actualInstance.isHealthy();
    boolean actualIsMarkedResult = actualInstance.isMarked();
    assertEquals(5000L, actualInstanceHeartBeatInterval);
    assertTrue(actualInstance.isEnabled());
    assertFalse(actualIsMarkedResult);
    assertTrue(actualIsHealthyResult);
    assertEquals(8080, actualPort);
    assertTrue(actualIsEphemeralResult);
    assertEquals("DEFAULT", actualClusterName);
    assertEquals("127.0.0.1", actualIp);
    assertEquals(1.0, actualWeight, 0.0);
    assertFalse(actualIsMockValidResult);
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void isMarkedTest() {
    // Arrange, Act and Assert
    assertFalse((new Instance()).isMarked());
  }

  @Test(timeout=10000)
  public void setMockValidTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setMockValid(true);

    // Assert
    assertTrue(instance.isMockValid());
  }

  @Test(timeout=10000)
  public void setTenantTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setTenant("foo");

    // Assert
    assertEquals("foo", instance.getTenant());
  }

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new Instance()).equals("foo"));
  }

  @Test(timeout=10000)
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertNull((new Instance()).getTenant());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void getCheckRTTest() {
    // Arrange, Act and Assert
    assertEquals(-1L, (new Instance()).getCheckRT());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("null:unknown:null_1.0_true_false_null", (new Instance()).toString());
  }

  @Test(timeout=10000)
  public void toIPAddrTest() {
    // Arrange, Act and Assert
    assertEquals("null:0", (new Instance()).toIPAddr());
  }

  @Test(timeout=10000)
  public void getAppTest() {
    // Arrange, Act and Assert
    assertNull((new Instance()).getApp());
  }

  @Test(timeout=10000)
  public void setMarkedTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setMarked(true);

    // Assert
    assertTrue(instance.isMarked());
  }

  @Test(timeout=10000)
  public void fromJSONTest3() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Instance.fromJSON("_");
  }

  @Test(timeout=10000)
  public void fromJSONTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Instance.fromJSON("foo");
  }

  @Test(timeout=10000)
  public void fromJSONTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Instance.fromJSON("");
  }

  @Test(timeout=10000)
  public void fromStringTest() {
    // Arrange
    Instance actualFromStringResult = Instance.fromString("foo");

    // Act and Assert
    assertNull(actualFromStringResult);
    assertNull(Instance.fromString("_"));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Instance actualInstance = new Instance("127.0.0.1", 8080, "name", "foo", "foo");

    // Assert
    long actualInstanceHeartBeatInterval = actualInstance.getInstanceHeartBeatInterval();
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
    assertEquals(5000L, actualInstanceHeartBeatInterval);
    assertTrue(actualInstance.isEnabled());
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

  @Test(timeout=10000)
  public void isMockValidTest() {
    // Arrange, Act and Assert
    assertFalse((new Instance()).isMockValid());
  }

  @Test(timeout=10000)
  public void generateInstanceIdTest() {
    // Arrange, Act and Assert
    assertEquals("null#0#null#null", (new Instance()).generateInstanceId());
  }
}

