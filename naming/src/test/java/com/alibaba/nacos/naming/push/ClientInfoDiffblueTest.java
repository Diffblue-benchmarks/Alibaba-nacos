package com.alibaba.nacos.naming.push;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.codehaus.jackson.Version;
import org.junit.Test;

public class ClientInfoDiffblueTest {
  @Test
  public void constructorTest9() {
    // Arrange and Act
    ClientInfo actualClientInfo = new ClientInfo("Nacos-Server");

    // Assert
    Version version = actualClientInfo.version;
    assertEquals(ClientInfo.ClientType.NACOS_SERVER, actualClientInfo.type);
    boolean actualIsSnapshotResult = version.isSnapshot();
    int actualMajorVersion = version.getMajorVersion();
    int actualMinorVersion = version.getMinorVersion();
    assertFalse(actualIsSnapshotResult);
    assertEquals(0, version.getPatchLevel());
    assertEquals(0, actualMinorVersion);
    assertEquals(0, actualMajorVersion);
  }

  @Test
  public void constructorTest8() {
    // Arrange
    ClientInfo clientInfo = new ClientInfo("foo");

    // Act and Assert
    assertEquals(ClientInfo.ClientType.UNKNOWN, clientInfo.type);
    assertEquals(ClientInfo.ClientType.UNKNOWN, (new ClientInfo("")).type);
  }

  @Test
  public void constructorTest7() {
    // Arrange and Act
    ClientInfo actualClientInfo = new ClientInfo("unit-nginx");

    // Assert
    Version version = actualClientInfo.version;
    assertEquals(ClientInfo.ClientType.TENGINE, actualClientInfo.type);
    boolean actualIsSnapshotResult = version.isSnapshot();
    int actualMajorVersion = version.getMajorVersion();
    int actualMinorVersion = version.getMinorVersion();
    assertFalse(actualIsSnapshotResult);
    assertEquals(0, version.getPatchLevel());
    assertEquals(0, actualMinorVersion);
    assertEquals(0, actualMajorVersion);
  }

  @Test
  public void constructorTest6() {
    // Arrange and Act
    ClientInfo actualClientInfo = new ClientInfo("Nacos-C-Client");

    // Assert
    Version version = actualClientInfo.version;
    assertEquals(ClientInfo.ClientType.C, actualClientInfo.type);
    boolean actualIsSnapshotResult = version.isSnapshot();
    int actualMajorVersion = version.getMajorVersion();
    int actualMinorVersion = version.getMinorVersion();
    assertFalse(actualIsSnapshotResult);
    assertEquals(0, version.getPatchLevel());
    assertEquals(0, actualMinorVersion);
    assertEquals(0, actualMajorVersion);
  }

  @Test
  public void constructorTest5() {
    // Arrange and Act
    ClientInfo actualClientInfo = new ClientInfo("Nacos-SDK-Java");

    // Assert
    Version version = actualClientInfo.version;
    assertEquals(ClientInfo.ClientType.JAVA_SDK, actualClientInfo.type);
    boolean actualIsSnapshotResult = version.isSnapshot();
    int actualMajorVersion = version.getMajorVersion();
    int actualMinorVersion = version.getMinorVersion();
    assertFalse(actualIsSnapshotResult);
    assertEquals(0, version.getPatchLevel());
    assertEquals(0, actualMinorVersion);
    assertEquals(0, actualMajorVersion);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    ClientInfo actualClientInfo = new ClientInfo("Nacos-Java-Client");

    // Assert
    Version version = actualClientInfo.version;
    assertEquals(ClientInfo.ClientType.JAVA, actualClientInfo.type);
    boolean actualIsSnapshotResult = version.isSnapshot();
    int actualMajorVersion = version.getMajorVersion();
    int actualMinorVersion = version.getMinorVersion();
    assertFalse(actualIsSnapshotResult);
    assertEquals(0, version.getPatchLevel());
    assertEquals(0, actualMinorVersion);
    assertEquals(0, actualMajorVersion);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    ClientInfo actualClientInfo = new ClientInfo("Nacos-DNS");

    // Assert
    Version version = actualClientInfo.version;
    assertEquals(ClientInfo.ClientType.DNS, actualClientInfo.type);
    boolean actualIsSnapshotResult = version.isSnapshot();
    int actualMajorVersion = version.getMajorVersion();
    int actualMinorVersion = version.getMinorVersion();
    assertFalse(actualIsSnapshotResult);
    assertEquals(0, version.getPatchLevel());
    assertEquals(0, actualMinorVersion);
    assertEquals(0, actualMajorVersion);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    ClientInfo actualClientInfo = new ClientInfo("vip-client4cpp");

    // Assert
    Version version = actualClientInfo.version;
    assertEquals(ClientInfo.ClientType.C, actualClientInfo.type);
    boolean actualIsSnapshotResult = version.isSnapshot();
    int actualMajorVersion = version.getMajorVersion();
    int actualMinorVersion = version.getMinorVersion();
    assertFalse(actualIsSnapshotResult);
    assertEquals(0, version.getPatchLevel());
    assertEquals(0, actualMinorVersion);
    assertEquals(0, actualMajorVersion);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ClientInfo actualClientInfo = new ClientInfo("nacos-go-sdk");

    // Assert
    Version version = actualClientInfo.version;
    assertEquals(ClientInfo.ClientType.GO, actualClientInfo.type);
    boolean actualIsSnapshotResult = version.isSnapshot();
    int actualMajorVersion = version.getMajorVersion();
    int actualMinorVersion = version.getMinorVersion();
    assertFalse(actualIsSnapshotResult);
    assertEquals(0, version.getPatchLevel());
    assertEquals(0, actualMinorVersion);
    assertEquals(0, actualMajorVersion);
  }
}

