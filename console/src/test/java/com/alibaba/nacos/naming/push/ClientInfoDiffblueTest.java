package com.alibaba.nacos.naming.push;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.codehaus.jackson.Version;
import org.junit.Test;

public class ClientInfoDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    ClientInfo clientInfo = new ClientInfo(":v");

    // Act and Assert
    assertEquals(ClientInfo.ClientType.UNKNOWN, clientInfo.type);
    assertEquals(ClientInfo.ClientType.UNKNOWN, (new ClientInfo("")).type);
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    ClientInfo actualClientInfo = new ClientInfo("Nacos-Java-Client");

    // Assert
    assertEquals(ClientInfo.ClientType.JAVA, actualClientInfo.type);
    Version version = actualClientInfo.version;
    assertFalse(version.isSnapshot());
    assertEquals(0, version.getPatchLevel());
    assertEquals(0, version.getMinorVersion());
    assertEquals(0, version.getMajorVersion());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    ClientInfo actualClientInfo = new ClientInfo("Nacos-DNS");

    // Assert
    assertEquals(ClientInfo.ClientType.DNS, actualClientInfo.type);
    Version version = actualClientInfo.version;
    assertFalse(version.isSnapshot());
    assertEquals(0, version.getPatchLevel());
    assertEquals(0, version.getMinorVersion());
    assertEquals(0, version.getMajorVersion());
  }

  @Test
  public void testConstructor4() {
    // Arrange and Act
    ClientInfo actualClientInfo = new ClientInfo("Nacos-SDK-Java");

    // Assert
    assertEquals(ClientInfo.ClientType.JAVA_SDK, actualClientInfo.type);
    Version version = actualClientInfo.version;
    assertFalse(version.isSnapshot());
    assertEquals(0, version.getPatchLevel());
    assertEquals(0, version.getMinorVersion());
    assertEquals(0, version.getMajorVersion());
  }

  @Test
  public void testConstructor5() {
    // Arrange and Act
    ClientInfo actualClientInfo = new ClientInfo("nacos-go-sdk");

    // Assert
    assertEquals(ClientInfo.ClientType.GO, actualClientInfo.type);
    Version version = actualClientInfo.version;
    assertFalse(version.isSnapshot());
    assertEquals(0, version.getPatchLevel());
    assertEquals(0, version.getMinorVersion());
    assertEquals(0, version.getMajorVersion());
  }

  @Test
  public void testConstructor6() {
    // Arrange and Act
    ClientInfo actualClientInfo = new ClientInfo("vip-client4cpp");

    // Assert
    assertEquals(ClientInfo.ClientType.C, actualClientInfo.type);
    Version version = actualClientInfo.version;
    assertFalse(version.isSnapshot());
    assertEquals(0, version.getPatchLevel());
    assertEquals(0, version.getMinorVersion());
    assertEquals(0, version.getMajorVersion());
  }

  @Test
  public void testConstructor7() {
    // Arrange and Act
    ClientInfo actualClientInfo = new ClientInfo("Nacos-Server");

    // Assert
    assertEquals(ClientInfo.ClientType.NACOS_SERVER, actualClientInfo.type);
    Version version = actualClientInfo.version;
    assertFalse(version.isSnapshot());
    assertEquals(0, version.getPatchLevel());
    assertEquals(0, version.getMinorVersion());
    assertEquals(0, version.getMajorVersion());
  }

  @Test
  public void testConstructor8() {
    // Arrange and Act
    ClientInfo actualClientInfo = new ClientInfo("unit-nginx");

    // Assert
    assertEquals(ClientInfo.ClientType.TENGINE, actualClientInfo.type);
    Version version = actualClientInfo.version;
    assertFalse(version.isSnapshot());
    assertEquals(0, version.getPatchLevel());
    assertEquals(0, version.getMinorVersion());
    assertEquals(0, version.getMajorVersion());
  }

  @Test
  public void testConstructor9() {
    // Arrange and Act
    ClientInfo actualClientInfo = new ClientInfo("Nacos-C-Client");

    // Assert
    assertEquals(ClientInfo.ClientType.C, actualClientInfo.type);
    Version version = actualClientInfo.version;
    assertFalse(version.isSnapshot());
    assertEquals(0, version.getPatchLevel());
    assertEquals(0, version.getMinorVersion());
    assertEquals(0, version.getMajorVersion());
  }
}

