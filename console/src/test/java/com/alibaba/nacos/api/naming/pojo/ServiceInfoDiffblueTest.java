package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;

public class ServiceInfoDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ServiceInfo actualServiceInfo = new ServiceInfo("", "");

    // Assert
    assertEquals("", actualServiceInfo.getChecksum());
    assertTrue(actualServiceInfo.isValid());
    assertEquals(0L, actualServiceInfo.getLastRefTime());
    assertEquals("", actualServiceInfo.getJsonFromServer());
    assertEquals(1000L, actualServiceInfo.getCacheMillis());
    assertFalse(actualServiceInfo.isAllIPs());
    assertEquals("", actualServiceInfo.getClusters());
    assertEquals("", actualServiceInfo.getName());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    ServiceInfo actualServiceInfo = new ServiceInfo();

    // Assert
    assertEquals("", actualServiceInfo.getChecksum());
    assertTrue(actualServiceInfo.isValid());
    assertEquals(0L, actualServiceInfo.getLastRefTime());
    assertEquals("", actualServiceInfo.getJsonFromServer());
    assertEquals(1000L, actualServiceInfo.getCacheMillis());
    assertFalse(actualServiceInfo.isAllIPs());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    ServiceInfo actualServiceInfo = new ServiceInfo("");

    // Assert
    assertEquals("", actualServiceInfo.getChecksum());
    assertTrue(actualServiceInfo.isValid());
    assertEquals(0L, actualServiceInfo.getLastRefTime());
    assertEquals("", actualServiceInfo.getJsonFromServer());
    assertEquals(1000L, actualServiceInfo.getCacheMillis());
    assertFalse(actualServiceInfo.isAllIPs());
    assertEquals("", actualServiceInfo.toString());
  }

  @Test
  public void testExpired() {
    // Arrange, Act and Assert
    assertTrue(ServiceInfo.fromKey("").expired());
  }

  @Test
  public void testFromKey() {
    // Arrange and Act
    ServiceInfo actualFromKeyResult = ServiceInfo.fromKey("");

    // Assert
    assertEquals("", actualFromKeyResult.getChecksum());
    assertTrue(actualFromKeyResult.isValid());
    assertEquals(0L, actualFromKeyResult.getLastRefTime());
    assertEquals("", actualFromKeyResult.getJsonFromServer());
    assertEquals(1000L, actualFromKeyResult.getCacheMillis());
    assertFalse(actualFromKeyResult.isAllIPs());
  }

  @Test
  public void testGetHosts() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceInfo.fromKey("").getHosts().size());
  }

  @Test
  public void testGetKey() {
    // Arrange
    String actualKey = ServiceInfo.getKey("", "");
    String actualKey1 = ServiceInfo.getKey("", null);

    // Act and Assert
    assertEquals("", actualKey);
    assertEquals("", actualKey1);
    assertEquals("@@@@", ServiceInfo.getKey("", "@@"));
  }

  @Test
  public void testGetKey2() {
    // Arrange, Act and Assert
    assertNull(ServiceInfo.fromKey("").getKey());
  }

  @Test
  public void testIpCount() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceInfo.fromKey("").ipCount());
  }

  @Test
  public void testIsValid() {
    // Arrange, Act and Assert
    assertTrue(ServiceInfo.fromKey("").isValid());
  }

  @Test
  public void testSetAllIPs() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");

    // Act
    fromKeyResult.setAllIPs(true);

    // Assert
    assertTrue(fromKeyResult.isAllIPs());
  }

  @Test
  public void testSetCacheMillis() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");

    // Act
    fromKeyResult.setCacheMillis(0L);

    // Assert
    assertEquals(0L, fromKeyResult.getCacheMillis());
  }

  @Test
  public void testSetChecksum() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");

    // Act
    fromKeyResult.setChecksum("");

    // Assert
    assertEquals("", fromKeyResult.getChecksum());
  }

  @Test
  public void testSetClusters() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");

    // Act
    fromKeyResult.setClusters("");

    // Assert
    assertEquals("", fromKeyResult.getClusters());
  }

  @Test
  public void testSetGroupName() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");

    // Act
    fromKeyResult.setGroupName("");

    // Assert
    assertEquals("", fromKeyResult.getGroupName());
  }

  @Test
  public void testSetHosts() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");
    ArrayList<Instance> instanceList = new ArrayList<Instance>();
    instanceList.add(new Instance());

    // Act
    fromKeyResult.setHosts(instanceList);

    // Assert
    assertTrue(fromKeyResult.isValid());
    assertNull(fromKeyResult.toString());
  }

  @Test
  public void testSetJsonFromServer() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");

    // Act
    fromKeyResult.setJsonFromServer("");

    // Assert
    assertEquals("", fromKeyResult.getJsonFromServer());
  }

  @Test
  public void testSetLastRefTime() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");

    // Act
    fromKeyResult.setLastRefTime(0L);

    // Assert
    assertEquals(0L, fromKeyResult.getLastRefTime());
  }

  @Test
  public void testSetName() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");

    // Act
    fromKeyResult.setName("");

    // Assert
    assertEquals("", fromKeyResult.getKey());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertNull(ServiceInfo.fromKey("").toString());
  }

  @Test
  public void testValidate() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");

    // Act and Assert
    assertTrue(fromKeyResult.validate());
    assertEquals(0L, fromKeyResult.getLastRefTime());
    assertFalse(fromKeyResult.isAllIPs());
  }
}

