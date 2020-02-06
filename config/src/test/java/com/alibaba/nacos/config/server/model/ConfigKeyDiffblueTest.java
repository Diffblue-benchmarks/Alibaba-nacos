package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigKeyDiffblueTest {
  @Test
  public void setAppNameTest() {
    // Arrange
    ConfigKey configKey = new ConfigKey();

    // Act
    configKey.setAppName("aaaaa");

    // Assert
    assertEquals("aaaaa", configKey.getAppName());
  }

  @Test
  public void setGroupTest() {
    // Arrange
    ConfigKey configKey = new ConfigKey();

    // Act
    configKey.setGroup("aaaaa");

    // Assert
    assertEquals("aaaaa", configKey.getGroup());
  }

  @Test
  public void setDataIdTest() {
    // Arrange
    ConfigKey configKey = new ConfigKey();

    // Act
    configKey.setDataId("aaaaa");

    // Assert
    assertEquals("aaaaa", configKey.getDataId());
  }

  @Test
  public void getAppNameTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigKey()).getAppName());
  }

  @Test
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigKey()).getGroup());
  }

  @Test
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

  @Test
  public void constructorTest() {
    // Arrange and Act
    ConfigKey actualConfigKey = new ConfigKey("aaaaa", "aaaaa", "aaaaa");

    // Assert
    String actualDataId = actualConfigKey.getDataId();
    String actualGroup = actualConfigKey.getGroup();
    assertEquals("aaaaa", actualDataId);
    assertEquals("aaaaa", actualConfigKey.getAppName());
    assertEquals("aaaaa", actualGroup);
  }

  @Test
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigKey()).getDataId());
  }
}

