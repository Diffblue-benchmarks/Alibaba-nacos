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
    (new Instance()).compareTo("(\\d|\\.)+");
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
    instance.setTenant("(\\d|\\.)+");

    // Assert
    assertEquals("(\\d|\\.)+", instance.getTenant());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new Instance()).equals("(\\d|\\.)+"));
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
  public void setAppTest() {
    // Arrange
    Instance instance = new Instance();

    // Act
    instance.setApp("(\\d|\\.)+");

    // Assert
    assertEquals("(\\d|\\.)+", instance.getApp());
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
  public void fromJSONTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    Instance.fromJSON("(\\d|\\.)+");
  }

  @Test
  public void fromStringTest() {
    // Arrange, Act and Assert
    assertNull(Instance.fromString("(\\d|\\.)+"));
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Instance actualInstance = new Instance("(\\d|\\.)+", 1, "(\\d|\\.)+", "(\\d|\\.)+", "(\\d|\\.)+");

    // Assert
    String actualInstanceIdGenerator = actualInstance.getInstanceIdGenerator();
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
    assertTrue(actualInstance.isEnabled());
    assertFalse(actualIsMarkedResult);
    assertTrue(actualIsHealthyResult);
    assertEquals(1, actualPort);
    assertTrue(actualIsEphemeralResult);
    assertEquals("(\\d|\\.)+", actualTenant);
    assertEquals("(\\d|\\.)+", actualClusterName);
    assertEquals("(\\d|\\.)+", actualIp);
    assertEquals(1.0, actualWeight, 0.0);
    assertEquals("(\\d|\\.)+", actualApp);
    assertFalse(actualIsMockValidResult);
    assertEquals("simple", actualInstanceIdGenerator);
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

