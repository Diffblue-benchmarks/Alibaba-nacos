package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SubInfoDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    SubInfo actualSubInfo = new SubInfo();

    // Assert
    assertNull(actualSubInfo.getDataId());
    assertNull(actualSubInfo.getAppName());
    assertNull(actualSubInfo.getGroup());
    assertNull(actualSubInfo.getLocalIp());
  }

  @Test
  public void testSetAppName() {
    // Arrange
    SubInfo subInfo = new SubInfo();

    // Act
    subInfo.setAppName("appName");

    // Assert
    assertEquals("appName", subInfo.getAppName());
  }

  @Test
  public void testSetDataId() {
    // Arrange
    SubInfo subInfo = new SubInfo();

    // Act
    subInfo.setDataId("123");

    // Assert
    assertEquals("123", subInfo.getDataId());
  }

  @Test
  public void testSetGroup() {
    // Arrange
    SubInfo subInfo = new SubInfo();

    // Act
    subInfo.setGroup("group");

    // Assert
    assertEquals("group", subInfo.getGroup());
  }

  @Test
  public void testSetLocalIp() {
    // Arrange
    SubInfo subInfo = new SubInfo();

    // Act
    subInfo.setLocalIp("localIp");

    // Assert
    assertEquals("localIp", subInfo.getLocalIp());
  }
}

