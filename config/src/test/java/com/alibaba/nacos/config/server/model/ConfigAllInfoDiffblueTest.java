package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigAllInfoDiffblueTest {
  @Test
  public void setUseTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setUse("aaaaa");

    // Assert
    assertEquals("aaaaa", configAllInfo.getUse());
  }

  @Test
  public void setTypeTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setType("aaaaa");

    // Assert
    assertEquals("aaaaa", configAllInfo.getType());
  }

  @Test
  public void setDescTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setDesc("aaaaa");

    // Assert
    assertEquals("aaaaa", configAllInfo.getDesc());
  }

  @Test
  public void getDescTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAllInfo()).getDesc());
  }

  @Test
  public void getConfigTagsTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAllInfo()).getConfigTags());
  }

  @Test
  public void getCreateIpTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAllInfo()).getCreateIp());
  }

  @Test
  public void setConfigTagsTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setConfigTags("aaaaa");

    // Assert
    assertEquals("aaaaa", configAllInfo.getConfigTags());
  }

  @Test
  public void getSchemaTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAllInfo()).getSchema());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAllInfo()).getType());
  }

  @Test
  public void setEffectTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setEffect("aaaaa");

    // Assert
    assertEquals("aaaaa", configAllInfo.getEffect());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ConfigAllInfo()).equals("aaaaa"));
  }

  @Test
  public void getUseTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAllInfo()).getUse());
  }

  @Test
  public void setSchemaTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setSchema("aaaaa");

    // Assert
    assertEquals("aaaaa", configAllInfo.getSchema());
  }

  @Test
  public void getEffectTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAllInfo()).getEffect());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigAllInfo()).hashCode());
  }

  @Test
  public void setCreateTimeTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setCreateTime(1L);

    // Assert
    assertEquals(1L, configAllInfo.getCreateTime());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ConfigAllInfo actualConfigAllInfo = new ConfigAllInfo();

    // Assert
    long actualCreateTime = actualConfigAllInfo.getCreateTime();
    long actualModifyTime = actualConfigAllInfo.getModifyTime();
    String actualCreateUser = actualConfigAllInfo.getCreateUser();
    String actualToStringResult = actualConfigAllInfo.toString();
    String actualGroup = actualConfigAllInfo.getGroup();
    String actualTenant = actualConfigAllInfo.getTenant();
    String actualEffect = actualConfigAllInfo.getEffect();
    String actualUse = actualConfigAllInfo.getUse();
    String actualDataId = actualConfigAllInfo.getDataId();
    long actualId = actualConfigAllInfo.getId();
    String actualContent = actualConfigAllInfo.getContent();
    String actualType = actualConfigAllInfo.getType();
    String actualSchema = actualConfigAllInfo.getSchema();
    String actualCreateIp = actualConfigAllInfo.getCreateIp();
    String actualMd5 = actualConfigAllInfo.getMd5();
    String actualConfigTags = actualConfigAllInfo.getConfigTags();
    String actualDesc = actualConfigAllInfo.getDesc();
    assertEquals(0L, actualCreateTime);
    assertNull(actualConfigAllInfo.getAppName());
    assertNull(actualDesc);
    assertNull(actualConfigTags);
    assertNull(actualMd5);
    assertNull(actualCreateIp);
    assertNull(actualSchema);
    assertNull(actualType);
    assertNull(actualContent);
    assertEquals(0L, actualId);
    assertNull(actualDataId);
    assertNull(actualUse);
    assertNull(actualEffect);
    assertNull(actualTenant);
    assertNull(actualGroup);
    assertEquals("ConfigInfo{id=0, dataId='null', group='null'," + " tenant='null', appName='null', content='null',"
        + " md5='null'}", actualToStringResult);
    assertNull(actualCreateUser);
    assertEquals(0L, actualModifyTime);
  }

  @Test
  public void setCreateIpTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setCreateIp("aaaaa");

    // Assert
    assertEquals("aaaaa", configAllInfo.getCreateIp());
  }

  @Test
  public void getCreateUserTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAllInfo()).getCreateUser());
  }

  @Test
  public void setModifyTimeTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setModifyTime(1L);

    // Assert
    assertEquals(1L, configAllInfo.getModifyTime());
  }

  @Test
  public void setCreateUserTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setCreateUser("aaaaa");

    // Assert
    assertEquals("aaaaa", configAllInfo.getCreateUser());
  }

  @Test
  public void getModifyTimeTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConfigAllInfo()).getModifyTime());
  }

  @Test
  public void getCreateTimeTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConfigAllInfo()).getCreateTime());
  }
}

