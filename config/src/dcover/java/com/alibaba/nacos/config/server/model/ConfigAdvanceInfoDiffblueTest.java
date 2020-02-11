package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigAdvanceInfoDiffblueTest {
  @Test(timeout=10000)
  public void setUseTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setUse("foo");

    // Assert
    assertEquals("foo", configAdvanceInfo.getUse());
  }

  @Test(timeout=10000)
  public void setTypeTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setType("foo");

    // Assert
    assertEquals("foo", configAdvanceInfo.getType());
  }

  @Test(timeout=10000)
  public void setDescTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setDesc("description");

    // Assert
    assertEquals("description", configAdvanceInfo.getDesc());
  }

  @Test(timeout=10000)
  public void getDescTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAdvanceInfo()).getDesc());
  }

  @Test(timeout=10000)
  public void getConfigTagsTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAdvanceInfo()).getConfigTags());
  }

  @Test(timeout=10000)
  public void getCreateIpTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAdvanceInfo()).getCreateIp());
  }

  @Test(timeout=10000)
  public void setConfigTagsTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setConfigTags("foo");

    // Assert
    assertEquals("foo", configAdvanceInfo.getConfigTags());
  }

  @Test(timeout=10000)
  public void getSchemaTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAdvanceInfo()).getSchema());
  }

  @Test(timeout=10000)
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAdvanceInfo()).getType());
  }

  @Test(timeout=10000)
  public void setEffectTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setEffect("foo");

    // Assert
    assertEquals("foo", configAdvanceInfo.getEffect());
  }

  @Test(timeout=10000)
  public void getUseTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAdvanceInfo()).getUse());
  }

  @Test(timeout=10000)
  public void setSchemaTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setSchema("foo");

    // Assert
    assertEquals("foo", configAdvanceInfo.getSchema());
  }

  @Test(timeout=10000)
  public void getEffectTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAdvanceInfo()).getEffect());
  }

  @Test(timeout=10000)
  public void setCreateTimeTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setCreateTime(1L);

    // Assert
    assertEquals(1L, configAdvanceInfo.getCreateTime());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void setCreateIpTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setCreateIp("foo");

    // Assert
    assertEquals("foo", configAdvanceInfo.getCreateIp());
  }

  @Test(timeout=10000)
  public void getCreateUserTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigAdvanceInfo()).getCreateUser());
  }

  @Test(timeout=10000)
  public void setModifyTimeTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setModifyTime(1L);

    // Assert
    assertEquals(1L, configAdvanceInfo.getModifyTime());
  }

  @Test(timeout=10000)
  public void setCreateUserTest() {
    // Arrange
    ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();

    // Act
    configAdvanceInfo.setCreateUser("foo");

    // Assert
    assertEquals("foo", configAdvanceInfo.getCreateUser());
  }

  @Test(timeout=10000)
  public void getModifyTimeTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConfigAdvanceInfo()).getModifyTime());
  }

  @Test(timeout=10000)
  public void getCreateTimeTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConfigAdvanceInfo()).getCreateTime());
  }
}

