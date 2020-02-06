package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigAdvanceInfoDiffblueTest {
  @Test
  public void setUseTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setUse("foo");

    // Assert
    assertEquals("foo", configAdvanceInfo.getUse());
  }

  @Test
  public void setTypeTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setType("foo");

    // Assert
    assertEquals("foo", configAdvanceInfo.getType());
  }

  @Test
  public void setDescTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setDesc("description");

    // Assert
    assertEquals("description", configAdvanceInfo.getDesc());
  }

  @Test
  public void getDescTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAdvanceInfo()).getDesc());
  }

  @Test
  public void getConfigTagsTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAdvanceInfo()).getConfigTags());
  }

  @Test
  public void getCreateIpTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAdvanceInfo()).getCreateIp());
  }

  @Test
  public void setConfigTagsTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setConfigTags("foo");

    // Assert
    assertEquals("foo", configAdvanceInfo.getConfigTags());
  }

  @Test
  public void getSchemaTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAdvanceInfo()).getSchema());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAdvanceInfo()).getType());
  }

  @Test
  public void setEffectTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setEffect("foo");

    // Assert
    assertEquals("foo", configAdvanceInfo.getEffect());
  }

  @Test
  public void getUseTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAdvanceInfo()).getUse());
  }

  @Test
  public void setSchemaTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setSchema("foo");

    // Assert
    assertEquals("foo", configAdvanceInfo.getSchema());
  }

  @Test
  public void getEffectTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAdvanceInfo()).getEffect());
  }

  @Test
  public void setCreateTimeTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setCreateTime(1L);

    // Assert
    assertEquals(1L, configAdvanceInfo.getCreateTime());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ConfigAdvanceInfo actualConfigAdvanceInfo = new ConfigAdvanceInfo();

    // Assert
    long actualCreateTime = actualConfigAdvanceInfo.getCreateTime();
    long actualModifyTime = actualConfigAdvanceInfo.getModifyTime();
    String actualCreateUser = actualConfigAdvanceInfo.getCreateUser();
    String actualType = actualConfigAdvanceInfo.getType();
    String actualSchema = actualConfigAdvanceInfo.getSchema();
    String actualCreateIp = actualConfigAdvanceInfo.getCreateIp();
    String actualConfigTags = actualConfigAdvanceInfo.getConfigTags();
    String actualDesc = actualConfigAdvanceInfo.getDesc();
    String actualEffect = actualConfigAdvanceInfo.getEffect();
    assertEquals(0L, actualCreateTime);
    assertNull(actualConfigAdvanceInfo.getUse());
    assertNull(actualEffect);
    assertNull(actualDesc);
    assertNull(actualConfigTags);
    assertNull(actualCreateIp);
    assertNull(actualSchema);
    assertNull(actualType);
    assertNull(actualCreateUser);
    assertEquals(0L, actualModifyTime);
  }

  @Test
  public void setCreateIpTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setCreateIp("foo");

    // Assert
    assertEquals("foo", configAdvanceInfo.getCreateIp());
  }

  @Test
  public void getCreateUserTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAdvanceInfo()).getCreateUser());
  }

  @Test
  public void setModifyTimeTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setModifyTime(1L);

    // Assert
    assertEquals(1L, configAdvanceInfo.getModifyTime());
  }

  @Test
  public void setCreateUserTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setCreateUser("foo");

    // Assert
    assertEquals("foo", configAdvanceInfo.getCreateUser());
  }

  @Test
  public void getModifyTimeTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConfigAdvanceInfo()).getModifyTime());
  }

  @Test
  public void getCreateTimeTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConfigAdvanceInfo()).getCreateTime());
  }
}

