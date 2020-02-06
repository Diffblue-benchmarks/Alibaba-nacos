package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ServiceInfoDiffblueTest {
  @Test
  public void getChecksumTest() {
    // Arrange, Act and Assert
    assertEquals("", ServiceInfo.fromKey("").getChecksum());
  }

  @Test
  public void setChecksumTest() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");

    // Act
    fromKeyResult.setChecksum("");

    // Assert
    assertEquals("", fromKeyResult.getChecksum());
  }

  @Test
  public void validateTest() {
    // Arrange, Act and Assert
    assertTrue(ServiceInfo.fromKey("").validate());
  }

  @Test
  public void ipCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceInfo.fromKey("").ipCount());
  }

  @Test
  public void setJsonFromServerTest() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");

    // Act
    fromKeyResult.setJsonFromServer("");

    // Assert
    assertEquals("", fromKeyResult.getJsonFromServer());
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    ServiceInfo actualServiceInfo = new ServiceInfo("");

    // Assert
    String actualName = actualServiceInfo.getName();
    boolean actualIsAllIPsResult = actualServiceInfo.isAllIPs();
    long actualCacheMillis = actualServiceInfo.getCacheMillis();
    String actualJsonFromServer = actualServiceInfo.getJsonFromServer();
    long actualLastRefTime = actualServiceInfo.getLastRefTime();
    boolean actualIsValidResult = actualServiceInfo.isValid();
    assertEquals("", actualServiceInfo.getChecksum());
    assertTrue(actualIsValidResult);
    assertEquals(0L, actualLastRefTime);
    assertEquals("", actualJsonFromServer);
    assertEquals(1000L, actualCacheMillis);
    assertFalse(actualIsAllIPsResult);
    assertEquals("", actualName);
  }

  @Test
  public void getLastRefTimeTest() {
    // Arrange, Act and Assert
    assertEquals(0L, ServiceInfo.fromKey("").getLastRefTime());
  }

  @Test
  public void getJsonFromServerTest() {
    // Arrange, Act and Assert
    assertEquals("", ServiceInfo.fromKey("").getJsonFromServer());
  }

  @Test
  public void setClustersTest() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");

    // Act
    fromKeyResult.setClusters("");

    // Assert
    assertEquals("", fromKeyResult.getClusters());
  }

  @Test
  public void setHostsTest() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");

    // Act
    fromKeyResult.setHosts(null);

    // Assert
    assertFalse(fromKeyResult.isValid());
  }

  @Test
  public void expiredTest() {
    // Arrange, Act and Assert
    assertTrue(ServiceInfo.fromKey("").expired());
  }

  @Test
  public void isAllIPsTest() {
    // Arrange, Act and Assert
    assertFalse(ServiceInfo.fromKey("").isAllIPs());
  }

  @Test
  public void setGroupNameTest() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");

    // Act
    fromKeyResult.setGroupName("");

    // Assert
    assertEquals("", fromKeyResult.getGroupName());
  }

  @Test
  public void setNameTest() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");

    // Act
    fromKeyResult.setName("");

    // Assert
    assertEquals("", fromKeyResult.getName());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    ServiceInfo actualServiceInfo = new ServiceInfo();

    // Assert
    boolean actualIsAllIPsResult = actualServiceInfo.isAllIPs();
    long actualCacheMillis = actualServiceInfo.getCacheMillis();
    String actualJsonFromServer = actualServiceInfo.getJsonFromServer();
    long actualLastRefTime = actualServiceInfo.getLastRefTime();
    boolean actualIsValidResult = actualServiceInfo.isValid();
    assertEquals("", actualServiceInfo.getChecksum());
    assertTrue(actualIsValidResult);
    assertEquals(0L, actualLastRefTime);
    assertEquals("", actualJsonFromServer);
    assertEquals(1000L, actualCacheMillis);
    assertFalse(actualIsAllIPsResult);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertNull(ServiceInfo.fromKey("").toString());
  }

  @Test
  public void setAllIPsTest() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");

    // Act
    fromKeyResult.setAllIPs(true);

    // Assert
    assertTrue(fromKeyResult.isAllIPs());
  }

  @Test
  public void isValidTest() {
    // Arrange, Act and Assert
    assertTrue(ServiceInfo.fromKey("").isValid());
  }

  @Test
  public void getHostsTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceInfo.fromKey("").getHosts().size());
  }

  @Test
  public void setLastRefTimeTest() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");

    // Act
    fromKeyResult.setLastRefTime(1L);

    // Assert
    assertEquals(1L, fromKeyResult.getLastRefTime());
  }

  @Test
  public void getKeyTest2() {
    // Arrange, Act and Assert
    assertNull(ServiceInfo.fromKey("").getKey());
  }

  @Test
  public void getCacheMillisTest() {
    // Arrange, Act and Assert
    assertEquals(1000L, ServiceInfo.fromKey("").getCacheMillis());
  }

  @Test
  public void getGroupNameTest() {
    // Arrange, Act and Assert
    assertNull(ServiceInfo.fromKey("").getGroupName());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ServiceInfo actualServiceInfo = new ServiceInfo("", "");

    // Assert
    String actualName = actualServiceInfo.getName();
    String actualClusters = actualServiceInfo.getClusters();
    boolean actualIsAllIPsResult = actualServiceInfo.isAllIPs();
    long actualCacheMillis = actualServiceInfo.getCacheMillis();
    String actualJsonFromServer = actualServiceInfo.getJsonFromServer();
    long actualLastRefTime = actualServiceInfo.getLastRefTime();
    boolean actualIsValidResult = actualServiceInfo.isValid();
    assertEquals("", actualServiceInfo.getChecksum());
    assertTrue(actualIsValidResult);
    assertEquals(0L, actualLastRefTime);
    assertEquals("", actualJsonFromServer);
    assertEquals(1000L, actualCacheMillis);
    assertFalse(actualIsAllIPsResult);
    assertEquals("", actualClusters);
    assertEquals("", actualName);
  }

  @Test
  public void setCacheMillisTest() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("");

    // Act
    fromKeyResult.setCacheMillis(1L);

    // Assert
    assertEquals(1L, fromKeyResult.getCacheMillis());
  }

  @Test
  public void fromKeyTest() {
    // Arrange and Act
    ServiceInfo actualFromKeyResult = ServiceInfo.fromKey("");

    // Assert
    boolean actualIsAllIPsResult = actualFromKeyResult.isAllIPs();
    long actualCacheMillis = actualFromKeyResult.getCacheMillis();
    String actualJsonFromServer = actualFromKeyResult.getJsonFromServer();
    long actualLastRefTime = actualFromKeyResult.getLastRefTime();
    boolean actualIsValidResult = actualFromKeyResult.isValid();
    assertEquals("", actualFromKeyResult.getChecksum());
    assertTrue(actualIsValidResult);
    assertEquals(0L, actualLastRefTime);
    assertEquals("", actualJsonFromServer);
    assertEquals(1000L, actualCacheMillis);
    assertFalse(actualIsAllIPsResult);
  }

  @Test
  public void getKeyTest() {
    // Arrange, Act and Assert
    assertEquals("", ServiceInfo.getKey("", ""));
  }

  @Test
  public void getClustersTest() {
    // Arrange, Act and Assert
    assertNull(ServiceInfo.fromKey("").getClusters());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertNull(ServiceInfo.fromKey("").getName());
  }
}

