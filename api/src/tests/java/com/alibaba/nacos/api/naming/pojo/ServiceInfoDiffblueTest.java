package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ServiceInfoDiffblueTest {
  @Test(timeout=10000)
  public void getChecksumTest() {
    // Arrange, Act and Assert
    assertEquals("", ServiceInfo.fromKey("foo").getChecksum());
  }

  @Test(timeout=10000)
  public void setChecksumTest() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("foo");

    // Act
    fromKeyResult.setChecksum("foo");

    // Assert
    assertEquals("foo", fromKeyResult.getChecksum());
  }

  @Test(timeout=10000)
  public void validateTest() {
    // Arrange, Act and Assert
    assertTrue(ServiceInfo.fromKey("foo").validate());
  }

  @Test(timeout=10000)
  public void ipCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceInfo.fromKey("foo").ipCount());
  }

  @Test(timeout=10000)
  public void setJsonFromServerTest() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("foo");

    // Act
    fromKeyResult.setJsonFromServer("foo");

    // Assert
    assertEquals("foo", fromKeyResult.getJsonFromServer());
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange and Act
    ServiceInfo actualServiceInfo = new ServiceInfo("foo");

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
    assertEquals("foo", actualName);
  }

  @Test(timeout=10000)
  public void getLastRefTimeTest() {
    // Arrange, Act and Assert
    assertEquals(0L, ServiceInfo.fromKey("foo").getLastRefTime());
  }

  @Test(timeout=10000)
  public void getJsonFromServerTest() {
    // Arrange, Act and Assert
    assertEquals("", ServiceInfo.fromKey("foo").getJsonFromServer());
  }

  @Test(timeout=10000)
  public void setClustersTest() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("foo");

    // Act
    fromKeyResult.setClusters("foo");

    // Assert
    assertEquals("foo", fromKeyResult.getClusters());
  }

  @Test(timeout=10000)
  public void setHostsTest() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("foo");

    // Act
    fromKeyResult.setHosts(null);

    // Assert
    assertFalse(fromKeyResult.isValid());
  }

  @Test(timeout=10000)
  public void expiredTest() {
    // Arrange, Act and Assert
    assertTrue(ServiceInfo.fromKey("foo").expired());
  }

  @Test(timeout=10000)
  public void isAllIPsTest() {
    // Arrange, Act and Assert
    assertFalse(ServiceInfo.fromKey("foo").isAllIPs());
  }

  @Test(timeout=10000)
  public void setGroupNameTest() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("foo");

    // Act
    fromKeyResult.setGroupName("name");

    // Assert
    assertEquals("name", fromKeyResult.getGroupName());
  }

  @Test(timeout=10000)
  public void setNameTest() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("foo");

    // Act
    fromKeyResult.setName("name");

    // Assert
    assertEquals("name", fromKeyResult.getName());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertNull(ServiceInfo.fromKey("foo").toString());
  }

  @Test(timeout=10000)
  public void setAllIPsTest() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("foo");

    // Act
    fromKeyResult.setAllIPs(true);

    // Assert
    assertTrue(fromKeyResult.isAllIPs());
  }

  @Test(timeout=10000)
  public void isValidTest() {
    // Arrange, Act and Assert
    assertTrue(ServiceInfo.fromKey("foo").isValid());
  }

  @Test(timeout=10000)
  public void getHostsTest() {
    // Arrange, Act and Assert
    assertEquals(0, ServiceInfo.fromKey("foo").getHosts().size());
  }

  @Test(timeout=10000)
  public void setLastRefTimeTest() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("foo");

    // Act
    fromKeyResult.setLastRefTime(1L);

    // Assert
    assertEquals(1L, fromKeyResult.getLastRefTime());
  }

  @Test(timeout=10000)
  public void getKeyTest2() {
    // Arrange, Act and Assert
    assertNull(ServiceInfo.fromKey("foo").getKey());
  }

  @Test(timeout=10000)
  public void getCacheMillisTest() {
    // Arrange, Act and Assert
    assertEquals(1000L, ServiceInfo.fromKey("foo").getCacheMillis());
  }

  @Test(timeout=10000)
  public void getGroupNameTest() {
    // Arrange, Act and Assert
    assertNull(ServiceInfo.fromKey("foo").getGroupName());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ServiceInfo actualServiceInfo = new ServiceInfo("name", "foo");

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
    assertEquals("foo", actualClusters);
    assertEquals("name", actualName);
  }

  @Test(timeout=10000)
  public void setCacheMillisTest() {
    // Arrange
    ServiceInfo fromKeyResult = ServiceInfo.fromKey("foo");

    // Act
    fromKeyResult.setCacheMillis(1L);

    // Assert
    assertEquals(1L, fromKeyResult.getCacheMillis());
  }

  @Test(timeout=10000)
  public void fromKeyTest() {
    // Arrange and Act
    ServiceInfo actualFromKeyResult = ServiceInfo.fromKey("foo");

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

  @Test(timeout=10000)
  public void getKeyTest() {
    // Arrange
    String actualKey = ServiceInfo.getKey("name", "foo");

    // Act and Assert
    assertEquals("name@@foo", actualKey);
    assertEquals("name", ServiceInfo.getKey("name", ""));
  }

  @Test(timeout=10000)
  public void getClustersTest() {
    // Arrange, Act and Assert
    assertNull(ServiceInfo.fromKey("foo").getClusters());
  }

  @Test(timeout=10000)
  public void getNameTest() {
    // Arrange, Act and Assert
    assertNull(ServiceInfo.fromKey("foo").getName());
  }
}

