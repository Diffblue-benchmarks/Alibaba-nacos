package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;

public class ServiceDiffblueTest {
  @Test
  public void testAllIPs() {
    // Arrange
    Service service = new Service();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act and Assert
    assertEquals(0, service.allIPs(stringList).size());
  }

  @Test
  public void testAllIPs2() {
    // Arrange, Act and Assert
    assertEquals(0, (new Service()).allIPs().size());
  }

  @Test
  public void testAllIPs3() {
    // Arrange, Act and Assert
    assertEquals(0, (new Service()).allIPs(true).size());
  }

  @Test
  public void testHealthyInstanceCount() {
    // Arrange, Act and Assert
    assertEquals(0, (new Service()).healthyInstanceCount());
  }

  @Test
  public void testInterests() {
    // Arrange, Act and Assert
    assertFalse((new Service()).interests("DEFAULT"));
  }

  @Test
  public void testMatchUnlistenKey() {
    // Arrange, Act and Assert
    assertFalse((new Service()).matchUnlistenKey("DEFAULT"));
  }

  @Test
  public void testMeetProtectThreshold() {
    // Arrange, Act and Assert
    assertFalse((new Service()).meetProtectThreshold());
  }

  @Test
  public void testSetEnabled() {
    // Arrange
    Service service = new Service();

    // Act
    service.setEnabled(true);

    // Assert
    assertTrue(service.getEnabled());
  }

  @Test
  public void testSetIpDeleteTimeout() {
    // Arrange
    Service service = new Service();

    // Act
    service.setIpDeleteTimeout(0L);

    // Assert
    assertEquals(0L, service.getIpDeleteTimeout());
  }

  @Test
  public void testSetLastModifiedMillis() {
    // Arrange
    Service service = new Service();

    // Act
    service.setLastModifiedMillis(0L);

    // Assert
    assertEquals(0L, service.getLastModifiedMillis());
  }

  @Test
  public void testSetNamespaceId() {
    // Arrange
    Service service = new Service();

    // Act
    service.setNamespaceId("DEFAULT");

    // Assert
    assertEquals("DEFAULT", service.getNamespaceId());
  }

  @Test
  public void testSetResetWeight() {
    // Arrange
    Service service = new Service();

    // Act
    service.setResetWeight(true);

    // Assert
    assertTrue(service.getResetWeight());
  }

  @Test
  public void testSetToken() {
    // Arrange
    Service service = new Service();

    // Act
    service.setToken("DEFAULT");

    // Assert
    assertEquals("DEFAULT", service.getToken());
  }

  @Test
  public void testSrvIPs() {
    // Arrange
    Service service = new Service();
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act and Assert
    assertEquals(0, service.srvIPs(stringList).size());
  }

  @Test
  public void testSrvIPs2() {
    // Arrange, Act and Assert
    assertEquals(0, (new Service()).srvIPs(null).size());
  }
}

