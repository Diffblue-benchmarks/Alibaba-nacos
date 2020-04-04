package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigKeyDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ConfigKey actualConfigKey = new ConfigKey("appName", "123", "group");

    // Assert
    assertEquals("123", actualConfigKey.getDataId());
    assertEquals("appName", actualConfigKey.getAppName());
    assertEquals("group", actualConfigKey.getGroup());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    ConfigKey actualConfigKey = new ConfigKey();

    // Assert
    assertNull(actualConfigKey.getDataId());
    assertNull(actualConfigKey.getAppName());
    assertNull(actualConfigKey.getGroup());
  }

  @Test
  public void testSetAppName() {
    // Arrange
    ConfigKey configKey = new ConfigKey();

    // Act
    configKey.setAppName("appName");

    // Assert
    assertEquals("appName", configKey.getAppName());
  }

  @Test
  public void testSetDataId() {
    // Arrange
    ConfigKey configKey = new ConfigKey();

    // Act
    configKey.setDataId("123");

    // Assert
    assertEquals("123", configKey.getDataId());
  }

  @Test
  public void testSetGroup() {
    // Arrange
    ConfigKey configKey = new ConfigKey();

    // Act
    configKey.setGroup("group");

    // Assert
    assertEquals("group", configKey.getGroup());
  }
}

