package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConfigHistoryInfoDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(-1L, (new ConfigHistoryInfo()).getLastId());
  }

  @Test
  public void testSetAppName() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setAppName("appName");

    // Assert
    assertEquals("appName", configHistoryInfo.getAppName());
  }

  @Test
  public void testSetContent() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setContent("content");

    // Assert
    assertEquals("content", configHistoryInfo.getContent());
  }

  @Test
  public void testSetDataId() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setDataId("123");

    // Assert
    assertEquals("123", configHistoryInfo.getDataId());
  }

  @Test
  public void testSetGroup() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setGroup("group");

    // Assert
    assertEquals("group", configHistoryInfo.getGroup());
  }

  @Test
  public void testSetId() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setId(123L);

    // Assert
    assertEquals(123L, configHistoryInfo.getId());
  }

  @Test
  public void testSetLastId() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setLastId(123L);

    // Assert
    assertEquals(123L, configHistoryInfo.getLastId());
  }

  @Test
  public void testSetMd5() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setMd5("md5");

    // Assert
    assertEquals("md5", configHistoryInfo.getMd5());
  }

  @Test
  public void testSetOpType() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setOpType("opType");

    // Assert
    assertEquals("opType", configHistoryInfo.getOpType());
  }

  @Test
  public void testSetSrcIp() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setSrcIp("srcIp");

    // Assert
    assertEquals("srcIp", configHistoryInfo.getSrcIp());
  }

  @Test
  public void testSetSrcUser() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setSrcUser("srcUser");

    // Assert
    assertEquals("srcUser", configHistoryInfo.getSrcUser());
  }

  @Test
  public void testSetTenant() {
    // Arrange
    ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();

    // Act
    configHistoryInfo.setTenant("tenant");

    // Assert
    assertEquals("tenant", configHistoryInfo.getTenant());
  }
}

