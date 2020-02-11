package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigKeyDiffblueTest {
  @Test(timeout=10000)
  public void setAppNameTest() {
    // Arrange
    ConfigKey configKey = new ConfigKey();

    // Act
    configKey.setAppName("name");

    // Assert
    assertEquals("name", configKey.getAppName());
  }

  @Test(timeout=10000)
  public void setGroupTest() {
    // Arrange
    ConfigKey configKey = new ConfigKey();

    // Act
    configKey.setGroup("foo");

    // Assert
    assertEquals("foo", configKey.getGroup());
  }

  @Test(timeout=10000)
  public void setDataIdTest() {
    // Arrange
    ConfigKey configKey = new ConfigKey();

    // Act
    configKey.setDataId("123");

    // Assert
    assertEquals("123", configKey.getDataId());
  }

  @Test(timeout=10000)
  public void getAppNameTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigKey()).getAppName());
  }

  @Test(timeout=10000)
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigKey()).getGroup());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    ConfigKey actualConfigKey = new ConfigKey();

    // Assert
    String actualDataId = actualConfigKey.getDataId();
    String actualGroup = actualConfigKey.getGroup();
    assertNull(actualDataId);
    assertNull(actualConfigKey.getAppName());
    assertNull(actualGroup);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ConfigKey actualConfigKey = new ConfigKey("name", "123", "foo");

    // Assert
    String actualDataId = actualConfigKey.getDataId();
    String actualGroup = actualConfigKey.getGroup();
    assertEquals("123", actualDataId);
    assertEquals("name", actualConfigKey.getAppName());
    assertEquals("foo", actualGroup);
  }

  @Test(timeout=10000)
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigKey()).getDataId());
  }
}

