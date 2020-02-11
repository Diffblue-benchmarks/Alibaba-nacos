package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.naming.selector.NoneSelector;
import com.alibaba.nacos.naming.selector.Selector;
import org.junit.Test;

public class ServiceDiffblueTest {
  @Test(timeout=10000)
  public void getChecksumTest() {
    // Arrange
    Service service = new Service();

    // Act and Assert
    assertEquals("28db44891d718c6872a04bc11ec58ab0", service.getChecksum());
    String actualServiceString = service.getServiceString();
    assertEquals("{\"invalidIPCount\":0,\"ipCount\":0,\"owners\":[]," + "\"protectThreshold\":0.0,\"clusters\":[]}",
        actualServiceString);
    assertEquals("28db44891d718c6872a04bc11ec58ab0", service.getChecksum());
  }

  @Test(timeout=10000)
  public void updateTest() {
    // Arrange
    Service service = new Service();
    Service service1 = new Service();

    // Act
    service.update(service1);

    // Assert
    String actualServiceString = service1.getServiceString();
    assertEquals("{\"invalidIPCount\":0,\"ipCount\":0,\"owners\":[]," + "\"protectThreshold\":0.0,\"clusters\":[]}",
        actualServiceString);
    String actualToStringResult = service.toString();
    Selector actualSelector = service.getSelector();
    assertEquals("28db44891d718c6872a04bc11ec58ab0", service.getChecksum());
    assertSame(service1.getSelector(), actualSelector);
    assertEquals("Service{name='null', protectThreshold=0.0, appName='null'," + " groupName='null', metadata={}}",
        actualToStringResult);
  }

  @Test(timeout=10000)
  public void setLastModifiedMillisTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setLastModifiedMillis(1L);

    // Assert
    assertEquals(1L, service.getLastModifiedMillis());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Service actualService = new Service("name");

    // Assert
    String actualName = actualService.getName();
    String actualToStringResult = actualService.toString();
    Boolean actualResetWeight = actualService.getResetWeight();
    Boolean actualEnabled = actualService.getEnabled();
    Selector selector = actualService.getSelector();
    long actualLastModifiedMillis = actualService.getLastModifiedMillis();
    float actualProtectThreshold = actualService.getProtectThreshold();
    long actualIpDeleteTimeout = actualService.getIpDeleteTimeout();
    assertEquals("7e2d77f1eb017eca7c05e0ecc9fcbe81", actualService.getChecksum());
    assertEquals(30000L, actualIpDeleteTimeout);
    assertEquals(0.0f, actualProtectThreshold, 0.0f);
    assertEquals(0L, actualLastModifiedMillis);
    assertTrue(selector instanceof com.alibaba.nacos.naming.selector.NoneSelector);
    assertEquals(Boolean.valueOf(true), actualEnabled);
    assertEquals("name", actualName);
    assertEquals(Boolean.valueOf(false), actualResetWeight);
    assertEquals("Service{name='name', protectThreshold=0.0, appName='null'," + " groupName='null', metadata={}}",
        actualToStringResult);
    assertEquals("none", selector.getType());
  }

  @Test(timeout=10000)
  public void setClusterMapTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setClusterMap(null);

    // Assert
    assertNull(service.getClusterMap());
  }

  @Test(timeout=10000)
  public void getSelectorTest() {
    // Arrange, Act and Assert
    assertTrue((new Service()).getSelector() instanceof com.alibaba.nacos.naming.selector.NoneSelector);
  }

  @Test(timeout=10000)
  public void getEnabledTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new Service()).getEnabled());
  }

  @Test(timeout=10000)
  public void getOwnersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Service()).getOwners().size());
  }

  @Test(timeout=10000)
  public void getResetWeightTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(false), (new Service()).getResetWeight());
  }

  @Test(timeout=10000)
  public void getClusterMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Service()).getClusterMap().size());
  }

  @Test(timeout=10000)
  public void srvIPsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Service()).srvIPs(null).size());
  }

  @Test(timeout=10000)
  public void healthyInstanceCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Service()).healthyInstanceCount());
  }

  @Test(timeout=10000)
  public void getNamespaceIdTest() {
    // Arrange, Act and Assert
    assertNull((new Service()).getNamespaceId());
  }

  @Test(timeout=10000)
  public void getServiceStringTest() {
    // Arrange
    Service service = new Service();

    // Act and Assert
    assertEquals("{\"invalidIPCount\":0,\"ipCount\":0,\"owners\":[]," + "\"protectThreshold\":0.0,\"clusters\":[]}",
        service.getServiceString());
    assertEquals("{\"invalidIPCount\":0,\"ipCount\":0,\"owners\":[]," + "\"protectThreshold\":0.0,\"clusters\":[]}",
        service.getServiceString());
  }

  @Test(timeout=10000)
  public void setIpDeleteTimeoutTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setIpDeleteTimeout(1L);

    // Assert
    assertEquals(1L, service.getIpDeleteTimeout());
  }

  @Test(timeout=10000)
  public void getTokenTest() {
    // Arrange, Act and Assert
    assertNull((new Service()).getToken());
  }

  @Test(timeout=10000)
  public void toJSONTest() {
    // Arrange
    Service service = new Service();

    // Act and Assert
    assertEquals(
        "{\"checksum\":\"28db44891d718c6872a04bc11ec58ab0\"," + "\"clusterMap\":{},\"enabled\":true,\"ipDeleteTimeout\""
            + ":30000,\"lastModifiedMillis\":0,\"metadata\":{},\"owners"
            + "\":[],\"protectThreshold\":0.0,\"resetWeight\":false," + "\"selector\":{\"type\":\"none\"}}",
        service.toJSON());
    String actualServiceString = service.getServiceString();
    assertEquals("{\"invalidIPCount\":0,\"ipCount\":0,\"owners\":[]," + "\"protectThreshold\":0.0,\"clusters\":[]}",
        actualServiceString);
    assertEquals("28db44891d718c6872a04bc11ec58ab0", service.getChecksum());
  }

  @Test(timeout=10000)
  public void allIPsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Service()).allIPs().size());
  }

  @Test(timeout=10000)
  public void setTokenTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setToken("ABC123");

    // Assert
    assertEquals("ABC123", service.getToken());
  }

  @Test(timeout=10000)
  public void recalculateChecksumTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.recalculateChecksum();

    // Assert
    String actualServiceString = service.getServiceString();
    assertEquals("{\"invalidIPCount\":0,\"ipCount\":0,\"owners\":[]," + "\"protectThreshold\":0.0,\"clusters\":[]}",
        actualServiceString);
    assertEquals("28db44891d718c6872a04bc11ec58ab0", service.getChecksum());
  }

  @Test(timeout=10000)
  public void matchUnlistenKeyTest() {
    // Arrange, Act and Assert
    assertFalse((new Service()).matchUnlistenKey("foo"));
  }
}

