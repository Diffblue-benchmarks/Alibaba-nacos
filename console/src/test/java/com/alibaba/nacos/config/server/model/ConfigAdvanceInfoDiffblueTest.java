package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigAdvanceInfoDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ConfigAdvanceInfo actualConfigAdvanceInfo = new ConfigAdvanceInfo();

    // Assert
    assertEquals(0L, actualConfigAdvanceInfo.getCreateTime());
    assertNull(actualConfigAdvanceInfo.getUse());
    assertNull(actualConfigAdvanceInfo.getEffect());
    assertNull(actualConfigAdvanceInfo.getDesc());
    assertNull(actualConfigAdvanceInfo.getConfigTags());
    assertNull(actualConfigAdvanceInfo.getCreateIp());
    assertNull(actualConfigAdvanceInfo.getSchema());
    assertNull(actualConfigAdvanceInfo.getType());
    assertNull(actualConfigAdvanceInfo.getCreateUser());
    assertEquals(0L, actualConfigAdvanceInfo.getModifyTime());
  }

  @Test
  public void testSetConfigTags() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setConfigTags("configTags");

    // Assert
    assertEquals("configTags", configAdvanceInfo.getConfigTags());
  }

  @Test
  public void testSetCreateIp() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setCreateIp("createIp");

    // Assert
    assertEquals("createIp", configAdvanceInfo.getCreateIp());
  }

  @Test
  public void testSetCreateTime() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setCreateTime(1L);

    // Assert
    assertEquals(1L, configAdvanceInfo.getCreateTime());
    assertNull(configAdvanceInfo.getCreateIp());
  }

  @Test
  public void testSetCreateUser() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setCreateUser("createUser");

    // Assert
    assertEquals("createUser", configAdvanceInfo.getCreateUser());
  }

  @Test
  public void testSetDesc() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setDesc("description");

    // Assert
    assertEquals("description", configAdvanceInfo.getDesc());
  }

  @Test
  public void testSetEffect() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setEffect("effect");

    // Assert
    assertEquals("effect", configAdvanceInfo.getEffect());
  }

  @Test
  public void testSetModifyTime() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setModifyTime(1L);

    // Assert
    assertEquals(1L, configAdvanceInfo.getModifyTime());
  }

  @Test
  public void testSetSchema() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setSchema("schema");

    // Assert
    assertEquals("schema", configAdvanceInfo.getSchema());
  }

  @Test
  public void testSetType() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setType("type");

    // Assert
    assertEquals("type", configAdvanceInfo.getType());
  }

  @Test
  public void testSetUse() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setUse("use");

    // Assert
    assertEquals("use", configAdvanceInfo.getUse());
  }
}

