package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SubInfoDiffblueTest {
  @Test(timeout=10000)
  public void setAppNameTest() {
    // Arrange
    SubInfo subInfo = new SubInfo();

    // Act
    subInfo.setAppName("name");

    // Assert
    assertEquals("name", subInfo.getAppName());
  }

  @Test(timeout=10000)
  public void setGroupTest() {
    // Arrange
    SubInfo subInfo = new SubInfo();

    // Act
    subInfo.setGroup("foo");

    // Assert
    assertEquals("foo", subInfo.getGroup());
  }

  @Test(timeout=10000)
  public void setDataIdTest() {
    // Arrange
    SubInfo subInfo = new SubInfo();

    // Act
    subInfo.setDataId("123");

    // Assert
    assertEquals("123", subInfo.getDataId());
  }

  @Test(timeout=10000)
  public void getAppNameTest() {
    // Arrange, Act and Assert
    assertNull((new SubInfo()).getAppName());
  }

  @Test(timeout=10000)
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertNull((new SubInfo()).getGroup());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    SubInfo actualSubInfo = new SubInfo();

    // Assert
    String actualDataId = actualSubInfo.getDataId();
    String actualLocalIp = actualSubInfo.getLocalIp();
    String actualGroup = actualSubInfo.getGroup();
    assertNull(actualDataId);
    assertNull(actualSubInfo.getAppName());
    assertNull(actualGroup);
    assertNull(actualLocalIp);
  }

  @Test(timeout=10000)
  public void getLocalIpTest() {
    // Arrange, Act and Assert
    assertNull((new SubInfo()).getLocalIp());
  }

  @Test(timeout=10000)
  public void setLocalIpTest() {
    // Arrange
    SubInfo subInfo = new SubInfo();

    // Act
    subInfo.setLocalIp("foo");

    // Assert
    assertEquals("foo", subInfo.getLocalIp());
  }

  @Test(timeout=10000)
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new SubInfo()).getDataId());
  }
}

