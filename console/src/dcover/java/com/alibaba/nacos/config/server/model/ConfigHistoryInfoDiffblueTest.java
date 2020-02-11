package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigHistoryInfoDiffblueTest {
  @Test(timeout=10000)
  public void setAppNameTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setAppName("name");

    // Assert
    assertEquals("name", configHistoryInfo.getAppName());
  }

  @Test(timeout=10000)
  public void setOpTypeTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setOpType("foo");

    // Assert
    assertEquals("foo", configHistoryInfo.getOpType());
  }

  @Test(timeout=10000)
  public void setGroupTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setGroup("foo");

    // Assert
    assertEquals("foo", configHistoryInfo.getGroup());
  }

  @Test(timeout=10000)
  public void setLastIdTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setLastId(123L);

    // Assert
    assertEquals(123L, configHistoryInfo.getLastId());
  }

  @Test(timeout=10000)
  public void setContentTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setContent("foo");

    // Assert
    assertEquals("foo", configHistoryInfo.getContent());
  }

  @Test(timeout=10000)
  public void getLastIdTest() {
    // Arrange, Act and Assert
    assertEquals(-1L, (new ConfigHistoryInfo()).getLastId());
  }

  @Test(timeout=10000)
  public void getAppNameTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigHistoryInfo()).getAppName());
  }

  @Test(timeout=10000)
  public void getSrcUserTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigHistoryInfo()).getSrcUser());
  }

  @Test(timeout=10000)
  public void setSrcUserTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setSrcUser("foo");

    // Assert
    assertEquals("foo", configHistoryInfo.getSrcUser());
  }

  @Test(timeout=10000)
  public void getContentTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigHistoryInfo()).getContent());
  }

  @Test(timeout=10000)
  public void getIdTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConfigHistoryInfo()).getId());
  }

  @Test(timeout=10000)
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigHistoryInfo()).getDataId());
  }

  @Test(timeout=10000)
  public void getSrcIpTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigHistoryInfo()).getSrcIp());
  }

  @Test(timeout=10000)
  public void setTenantTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setTenant("foo");

    // Assert
    assertEquals("foo", configHistoryInfo.getTenant());
  }

  @Test(timeout=10000)
  public void setDataIdTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setDataId("123");

    // Assert
    assertEquals("123", configHistoryInfo.getDataId());
  }

  @Test(timeout=10000)
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigHistoryInfo()).getTenant());
  }

  @Test(timeout=10000)
  public void setSrcIpTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setSrcIp("foo");

    // Assert
    assertEquals("foo", configHistoryInfo.getSrcIp());
  }

  @Test(timeout=10000)
  public void setIdTest() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setId(123L);

    // Assert
    assertEquals(123L, configHistoryInfo.getId());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(-1L, (new ConfigHistoryInfo()).getLastId());
  }

  @Test(timeout=10000)
  public void setMd5Test() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setMd5("foo");

    // Assert
    assertEquals("foo", configHistoryInfo.getMd5());
  }

  @Test(timeout=10000)
  public void getOpTypeTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigHistoryInfo()).getOpType());
  }

  @Test(timeout=10000)
  public void getMd5Test() {
    // Arrange, Act and Assert
    assertNull((new ConfigHistoryInfo()).getMd5());
  }

  @Test(timeout=10000)
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigHistoryInfo()).getGroup());
  }
}

