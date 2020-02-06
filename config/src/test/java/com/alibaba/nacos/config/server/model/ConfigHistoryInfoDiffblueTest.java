package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigHistoryInfoDiffblueTest {
  @Test
  public void setAppNameTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setAppName("aaaaa");

    // Assert
    assertEquals("aaaaa", configHistoryInfo.getAppName());
  }

  @Test
  public void setOpTypeTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setOpType("aaaaa");

    // Assert
    assertEquals("aaaaa", configHistoryInfo.getOpType());
  }

  @Test
  public void setGroupTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setGroup("aaaaa");

    // Assert
    assertEquals("aaaaa", configHistoryInfo.getGroup());
  }

  @Test
  public void setLastIdTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setLastId(1L);

    // Assert
    assertEquals(1L, configHistoryInfo.getLastId());
  }

  @Test
  public void setContentTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setContent("aaaaa");

    // Assert
    assertEquals("aaaaa", configHistoryInfo.getContent());
  }

  @Test
  public void getLastIdTest() {
    // Arrange, Act and Assert
    assertEquals(-1L, (new ConfigHistoryInfo()).getLastId());
  }

  @Test
  public void getAppNameTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigHistoryInfo()).getAppName());
  }

  @Test
  public void getSrcUserTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigHistoryInfo()).getSrcUser());
  }

  @Test
  public void setSrcUserTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setSrcUser("aaaaa");

    // Assert
    assertEquals("aaaaa", configHistoryInfo.getSrcUser());
  }

  @Test
  public void getContentTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigHistoryInfo()).getContent());
  }

  @Test
  public void getIdTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConfigHistoryInfo()).getId());
  }

  @Test
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigHistoryInfo()).getDataId());
  }

  @Test
  public void getSrcIpTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigHistoryInfo()).getSrcIp());
  }

  @Test
  public void setTenantTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setTenant("aaaaa");

    // Assert
    assertEquals("aaaaa", configHistoryInfo.getTenant());
  }

  @Test
  public void setDataIdTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setDataId("aaaaa");

    // Assert
    assertEquals("aaaaa", configHistoryInfo.getDataId());
  }

  @Test
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigHistoryInfo()).getTenant());
  }

  @Test
  public void setSrcIpTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setSrcIp("aaaaa");

    // Assert
    assertEquals("aaaaa", configHistoryInfo.getSrcIp());
  }

  @Test
  public void setIdTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setId(1L);

    // Assert
    assertEquals(1L, configHistoryInfo.getId());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(-1L, (new ConfigHistoryInfo()).getLastId());
  }

  @Test
  public void setMd5Test() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setMd5("aaaaa");

    // Assert
    assertEquals("aaaaa", configHistoryInfo.getMd5());
  }

  @Test
  public void getOpTypeTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigHistoryInfo()).getOpType());
  }

  @Test
  public void getMd5Test() {
    // Arrange, Act and Assert
    assertNull((new ConfigHistoryInfo()).getMd5());
  }

  @Test
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigHistoryInfo()).getGroup());
  }
}

