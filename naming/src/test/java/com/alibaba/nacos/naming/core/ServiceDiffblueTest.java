package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.naming.selector.LabelSelector;
import com.alibaba.nacos.naming.selector.NoneSelector;
import com.alibaba.nacos.naming.selector.Selector;
import org.junit.Test;

public class ServiceDiffblueTest {
  @Test
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

  @Test
  public void getIpDeleteTimeoutTest() {
    // Arrange, Act and Assert
    assertEquals(30000L, (new Service()).getIpDeleteTimeout());
  }

  @Test
  public void setResetWeightTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setResetWeight(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), service.getResetWeight());
  }

  @Test
  public void triggerFlagTest() {
    // Arrange, Act and Assert
    assertFalse((new Service()).triggerFlag());
  }

  @Test
  public void setClusterMapTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setClusterMap(null);

    // Assert
    assertNull(service.getClusterMap());
  }

  @Test
  public void setSelectorTest() {
    // Arrange
    Service service = new Service();
    LabelSelector labelSelector = new LabelSelector();

    // Act
    service.setSelector(labelSelector);

    // Assert
    assertSame(labelSelector, service.getSelector());
  }

  @Test
  public void getSelectorTest() {
    // Arrange, Act and Assert
    assertTrue((new Service()).getSelector() instanceof com.alibaba.nacos.naming.selector.NoneSelector);
  }

  @Test
  public void getEnabledTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), (new Service()).getEnabled());
  }

  @Test
  public void getResetWeightTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(false), (new Service()).getResetWeight());
  }

  @Test
  public void srvIPsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Service()).srvIPs(null).size());
  }

  @Test
  public void healthyInstanceCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Service()).healthyInstanceCount());
  }

  @Test
  public void allIPsTest2() {
    // Arrange, Act and Assert
    assertEquals(0, (new Service()).allIPs(true).size());
  }

  @Test
  public void getNamespaceIdTest() {
    // Arrange, Act and Assert
    assertNull((new Service()).getNamespaceId());
  }

  @Test
  public void getServiceStringTest() {
    // Arrange
    Service service = new Service();

    // Act and Assert
    assertEquals("{\"invalidIPCount\":0,\"ipCount\":0,\"owners\":[]," + "\"protectThreshold\":0.0,\"clusters\":[]}",
        service.getServiceString());
    assertEquals("{\"invalidIPCount\":0,\"ipCount\":0,\"owners\":[]," + "\"protectThreshold\":0.0,\"clusters\":[]}",
        service.getServiceString());
  }

  @Test
  public void interestsTest() {
    // Arrange, Act and Assert
    assertFalse((new Service()).interests("foo"));
  }

  @Test
  public void setIpDeleteTimeoutTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setIpDeleteTimeout(1L);

    // Assert
    assertEquals(1L, service.getIpDeleteTimeout());
  }

  @Test
  public void setOwnersTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setOwners(null);

    // Assert
    assertNull(service.getOwners());
  }

  @Test
  public void getLastModifiedMillisTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new Service()).getLastModifiedMillis());
  }

  @Test
  public void getTokenTest() {
    // Arrange, Act and Assert
    assertNull((new Service()).getToken());
  }

  @Test
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

  @Test
  public void setEnabledTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setEnabled(Boolean.valueOf(true));

    // Assert
    assertEquals(Boolean.valueOf(true), service.getEnabled());
  }

  @Test
  public void allIPsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Service()).allIPs().size());
  }

  @Test
  public void setTokenTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setToken("ABC123");

    // Assert
    assertEquals("ABC123", service.getToken());
  }

  @Test
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

  @Test
  public void matchUnlistenKeyTest() {
    // Arrange, Act and Assert
    assertFalse((new Service()).matchUnlistenKey("foo"));
  }
}

