package com.alibaba.nacos.naming.push;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.codehaus.jackson.Version;
import org.junit.Test;

public class ClientInfoDiffblueTest {
  @Test
  public void constructorTest() {
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
}

