package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigAllInfoDiffblueTest {
  @Test(timeout=10000)
  public void setUseTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setUse("foo");

    // Assert
    assertEquals("foo", configAllInfo.getUse());
  }

  @Test(timeout=10000)
  public void setTypeTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setType("foo");

    // Assert
    assertEquals("foo", configAllInfo.getType());
  }

  @Test(timeout=10000)
  public void setDescTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setDesc("description");

    // Assert
    assertEquals("description", configAllInfo.getDesc());
  }

  @Test(timeout=10000)
  public void getDescTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAllInfo()).getDesc());
  }

  @Test(timeout=10000)
  public void getConfigTagsTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAllInfo()).getConfigTags());
  }

  @Test(timeout=10000)
  public void getCreateIpTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAllInfo()).getCreateIp());
  }

  @Test(timeout=10000)
  public void setConfigTagsTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setConfigTags("foo");

    // Assert
    assertEquals("foo", configAllInfo.getConfigTags());
  }

  @Test(timeout=10000)
  public void getSchemaTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAllInfo()).getSchema());
  }

  @Test(timeout=10000)
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAllInfo()).getType());
  }

  @Test(timeout=10000)
  public void setEffectTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setEffect("foo");

    // Assert
    assertEquals("foo", configAllInfo.getEffect());
  }

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ConfigAllInfo()).equals("foo"));
  }

  @Test(timeout=10000)
  public void getUseTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAllInfo()).getUse());
  }

  @Test(timeout=10000)
  public void setSchemaTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setSchema("foo");

    // Assert
    assertEquals("foo", configAllInfo.getSchema());
  }

  @Test(timeout=10000)
  public void getEffectTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAllInfo()).getEffect());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigAllInfo()).hashCode());
  }

  @Test(timeout=10000)
  public void setCreateTimeTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setCreateTime(1L);

    // Assert
    assertEquals(1L, configAllInfo.getCreateTime());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void setCreateIpTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setCreateIp("foo");

    // Assert
    assertEquals("foo", configAllInfo.getCreateIp());
  }

  @Test(timeout=10000)
  public void getCreateUserTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAllInfo()).getCreateUser());
  }

  @Test(timeout=10000)
  public void setModifyTimeTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setModifyTime(1L);

    // Assert
    assertEquals(1L, configAllInfo.getModifyTime());
  }

  @Test(timeout=10000)
  public void setCreateUserTest() {
    // Arrange
    ConfigAllInfo configAllInfo = new ConfigAllInfo();

    // Act
    configAllInfo.setCreateUser("foo");

    // Assert
    assertEquals("foo", configAllInfo.getCreateUser());
  }

  @Test(timeout=10000)
  public void getModifyTimeTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConfigAllInfo()).getModifyTime());
  }

  @Test(timeout=10000)
  public void getCreateTimeTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConfigAllInfo()).getCreateTime());
  }
}

