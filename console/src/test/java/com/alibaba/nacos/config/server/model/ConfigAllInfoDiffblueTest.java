package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigAllInfoDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ConfigAllInfo actualConfigAllInfo = new ConfigAllInfo();

    // Assert
    assertEquals(0L, actualConfigAllInfo.getCreateTime());
    assertNull(actualConfigAllInfo.getAppName());
    assertNull(actualConfigAllInfo.getDesc());
    assertNull(actualConfigAllInfo.getConfigTags());
    assertNull(actualConfigAllInfo.getMd5());
    assertNull(actualConfigAllInfo.getCreateIp());
    assertNull(actualConfigAllInfo.getSchema());
    assertNull(actualConfigAllInfo.getType());
    assertNull(actualConfigAllInfo.getContent());
    assertEquals(0L, actualConfigAllInfo.getId());
    assertNull(actualConfigAllInfo.getDataId());
    assertNull(actualConfigAllInfo.getUse());
    assertNull(actualConfigAllInfo.getEffect());
    assertNull(actualConfigAllInfo.getTenant());
    assertNull(actualConfigAllInfo.getGroup());
    assertEquals("ConfigInfo{id=0, dataId='null', group='null'," + " tenant='null', appName='null', content='null',"
        + " md5='null'}", actualConfigAllInfo.toString());
    assertNull(actualConfigAllInfo.getCreateUser());
    assertEquals(0L, actualConfigAllInfo.getModifyTime());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new ConfigAllInfo()).equals("obj"));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigAllInfo()).hashCode());
  }

  @Test
  public void testSetConfigTags() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setConfigTags("configTags");

    // Assert
    assertEquals("configTags", configAllInfo.getConfigTags());
  }

  @Test
  public void testSetCreateIp() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setCreateIp("createIp");

    // Assert
    assertEquals("createIp", configAllInfo.getCreateIp());
  }

  @Test
  public void testSetCreateTime() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setCreateTime(1L);

    // Assert
    assertEquals(1L, configAllInfo.getCreateTime());
  }

  @Test
  public void testSetCreateUser() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setCreateUser("createUser");

    // Assert
    assertEquals("createUser", configAllInfo.getCreateUser());
  }

  @Test
  public void testSetDesc() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setDesc("description");

    // Assert
    assertEquals("description", configAllInfo.getDesc());
  }

  @Test
  public void testSetEffect() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setEffect("effect");

    // Assert
    assertEquals("effect", configAllInfo.getEffect());
  }

  @Test
  public void testSetModifyTime() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setModifyTime(1L);

    // Assert
    assertEquals(1L, configAllInfo.getModifyTime());
  }

  @Test
  public void testSetSchema() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setSchema("schema");

    // Assert
    assertEquals("schema", configAllInfo.getSchema());
  }

  @Test
  public void testSetType() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setType("type");

    // Assert
    assertEquals("type", configAllInfo.getType());
  }

  @Test
  public void testSetUse() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setUse("use");

    // Assert
    assertEquals("use", configAllInfo.getUse());
  }
}

