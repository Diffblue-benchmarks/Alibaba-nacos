package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SubInfoDiffblueTest {
  @Test
  public void setAppNameTest() {
    // Arrange
    SubInfo subInfo = new SubInfo();

    // Act
    subInfo.setAppName("aaaaa");

    // Assert
    assertEquals("aaaaa", subInfo.getAppName());
  }

  @Test
  public void setGroupTest() {
    // Arrange
    SubInfo subInfo = new SubInfo();

    // Act
    subInfo.setGroup("aaaaa");

    // Assert
    assertEquals("aaaaa", subInfo.getGroup());
  }

  @Test
  public void setDataIdTest() {
    // Arrange
    SubInfo subInfo = new SubInfo();

    // Act
    subInfo.setDataId("aaaaa");

    // Assert
    assertEquals("aaaaa", subInfo.getDataId());
  }

  @Test
  public void getAppNameTest() {
    // Arrange, Act and Assert
    assertNull((new SubInfo()).getAppName());
  }

  @Test
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertNull((new SubInfo()).getGroup());
  }

  @Test
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

  @Test
  public void getLocalIpTest() {
    // Arrange, Act and Assert
    assertNull((new SubInfo()).getLocalIp());
  }

  @Test
  public void setLocalIpTest() {
    // Arrange
    SubInfo subInfo = new SubInfo();

    // Act
    subInfo.setLocalIp("aaaaa");

    // Assert
    assertEquals("aaaaa", subInfo.getLocalIp());
  }

  @Test
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new SubInfo()).getDataId());
  }
}

