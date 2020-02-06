package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.naming.selector.LabelSelector;
import com.alibaba.nacos.naming.selector.Selector;
import org.junit.Test;

public class ServiceDiffblueTest {
  @Test
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

  @Test
  public void updateTest() {
    // Arrange
    Service service = new Service();
    Service service1 = new Service();

    // Act
    service.update(service1);

    // Assert
    assertEquals("{\"invalidIPCount\":0,\"ipCount\":0,\"owners\":[]," + "\"protectThreshold\":0.0,\"clusters\":[]}",
        service1.getServiceString());
    String actualToStringResult = service.toString();
    String actualToJSONResult = service.toJSON();
    assertEquals("28db44891d718c6872a04bc11ec58ab0", service.getChecksum());
    assertEquals(
        "{\"checksum\":\"28db44891d718c6872a04bc11ec58ab0\"," + "\"clusterMap\":{},\"enabled\":true,\"ipDeleteTimeout\""
            + ":30000,\"lastModifiedMillis\":0,\"metadata\":{},\"owners"
            + "\":[],\"protectThreshold\":0.0,\"resetWeight\":false," + "\"selector\":{\"type\":\"none\"}}",
        actualToJSONResult);
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
    service.setResetWeight(null);

    // Assert
    assertNull(service.getResetWeight());
  }

  @Test
  public void setLastModifiedMillisTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setLastModifiedMillis(1L);

    // Assert
    assertEquals(1L, service.getLastModifiedMillis());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    Service actualService = new Service("DEFAULT");

    // Assert
    String actualServiceString = actualService.getServiceString();
    String actualName = actualService.getName();
    String actualToStringResult = actualService.toString();
    Boolean actualResetWeight = actualService.getResetWeight();
    Boolean actualEnabled = actualService.getEnabled();
    Selector selector = actualService.getSelector();
    long actualLastModifiedMillis = actualService.getLastModifiedMillis();
    float actualProtectThreshold = actualService.getProtectThreshold();
    assertEquals("{\"invalidIPCount\":0,\"name\":\"DEFAULT\",\"ipCount\":0,"
        + "\"owners\":[],\"protectThreshold\":0.0,\"clusters\":[]}", actualServiceString);
    assertEquals(30000L, actualService.getIpDeleteTimeout());
    assertEquals(0.0f, actualProtectThreshold, 0.0f);
    assertEquals(0L, actualLastModifiedMillis);
    assertTrue(selector instanceof com.alibaba.nacos.naming.selector.NoneSelector);
    assertEquals(Boolean.valueOf(true), actualEnabled);
    assertEquals(Boolean.valueOf(false), actualResetWeight);
    assertEquals("Service{name='DEFAULT', protectThreshold=0.0," + " appName='null', groupName='null', metadata={}}",
        actualToStringResult);
    assertEquals("DEFAULT", actualName);
    assertEquals("none", selector.getType());
  }

  @Test
  public void setNamespaceIdTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.setNamespaceId("DEFAULT");

    // Assert
    assertEquals("DEFAULT", service.getNamespaceId());
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

    // Act
    service.setSelector(new LabelSelector());

    // Assert
    assertEquals(
        "{\"checksum\":\"28db44891d718c6872a04bc11ec58ab0\"," + "\"clusterMap\":{},\"enabled\":true,\"ipDeleteTimeout\""
            + ":30000,\"lastModifiedMillis\":0,\"metadata\":{},\"owners"
            + "\":[],\"protectThreshold\":0.0,\"resetWeight\":false," + "\"selector\":{\"type\":\"label\"}}",
        service.toJSON());
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
  public void getOwnersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Service()).getOwners().size());
  }

  @Test
  public void getResetWeightTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(false), (new Service()).getResetWeight());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Service actualService = new Service();

    // Assert
    String actualServiceString = actualService.getServiceString();
    String actualToStringResult = actualService.toString();
    Boolean actualResetWeight = actualService.getResetWeight();
    Boolean actualEnabled = actualService.getEnabled();
    Selector selector = actualService.getSelector();
    String actualToJSONResult = actualService.toJSON();
    long actualLastModifiedMillis = actualService.getLastModifiedMillis();
    float actualProtectThreshold = actualService.getProtectThreshold();
    assertEquals("{\"invalidIPCount\":0,\"ipCount\":0,\"owners\":[]," + "\"protectThreshold\":0.0,\"clusters\":[]}",
        actualServiceString);
    assertEquals(30000L, actualService.getIpDeleteTimeout());
    assertEquals(0.0f, actualProtectThreshold, 0.0f);
    assertEquals(0L, actualLastModifiedMillis);
    assertEquals(
        "{\"checksum\":\"28db44891d718c6872a04bc11ec58ab0\"," + "\"clusterMap\":{},\"enabled\":true,\"ipDeleteTimeout\""
            + ":30000,\"lastModifiedMillis\":0,\"metadata\":{},\"owners"
            + "\":[],\"protectThreshold\":0.0,\"resetWeight\":false," + "\"selector\":{\"type\":\"none\"}}",
        actualToJSONResult);
    assertEquals(Boolean.valueOf(true), actualEnabled);
    assertEquals(Boolean.valueOf(false), actualResetWeight);
    assertEquals("Service{name='null', protectThreshold=0.0, appName='null'," + " groupName='null', metadata={}}",
        actualToStringResult);
    assertEquals("none", selector.getType());
  }

  @Test
  public void getClusterMapTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Service()).getClusterMap().size());
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
    assertFalse((new Service()).interests("DEFAULT"));
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
    service.setEnabled(null);

    // Assert
    assertNull(service.getEnabled());
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
    service.setToken("DEFAULT");

    // Assert
    assertEquals("DEFAULT", service.getToken());
  }

  @Test
  public void addClusterTest() {
    // Arrange
    Service service = new Service();

    // Act
    service.addCluster(new Cluster());

    // Assert
    assertEquals("{\"invalidIPCount\":0,\"ipCount\":0,\"owners\":[],"
        + "\"protectThreshold\":0.0,\"clusters\":[{\"healthChecker"
        + "\":{\"type\":\"TCP\"},\"defIPPort\":80,\"defCkport\":80," + "\"useIPPort4Check\":true,\"sitegroup\":\"\"}]}",
        service.getServiceString());
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
    assertFalse((new Service()).matchUnlistenKey("DEFAULT"));
  }
}

