package com.alibaba.nacos.api.config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigChangeItemDiffblueTest {
  @Test
  public void setNewValueTest() {
    // Arrange
    ConfigChangeItem configChangeItem = new ConfigChangeItem("aaaaa", "aaaaa", "aaaaa");

    // Act
    configChangeItem.setNewValue("aaaaa");

    // Assert
    assertEquals("aaaaa", configChangeItem.getNewValue());
  }

  @Test
  public void getNewValueTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new ConfigChangeItem("aaaaa", "aaaaa", "aaaaa")).getNewValue());
  }

  @Test
  public void setOldValueTest() {
    // Arrange
    ConfigChangeItem configChangeItem = new ConfigChangeItem("aaaaa", "aaaaa", "aaaaa");

    // Act
    configChangeItem.setOldValue("aaaaa");

    // Assert
    assertEquals("aaaaa", configChangeItem.getOldValue());
  }

  @Test
  public void getOldValueTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new ConfigChangeItem("aaaaa", "aaaaa", "aaaaa")).getOldValue());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigChangeItem("aaaaa", "aaaaa", "aaaaa")).getType());
  }

  @Test
  public void setTypeTest() {
    // Arrange
    ConfigChangeItem configChangeItem = new ConfigChangeItem("aaaaa", "aaaaa", "aaaaa");

    // Act
    configChangeItem.setType(PropertyChangeType.ADDED);

    // Assert
    assertEquals(PropertyChangeType.ADDED, configChangeItem.getType());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ConfigChangeItem{key='aaaaa', oldValue='aaaaa'," + " newValue='aaaaa', type=null}",
        (new ConfigChangeItem("aaaaa", "aaaaa", "aaaaa")).toString());
  }

  @Test
  public void setKeyTest() {
    // Arrange
    ConfigChangeItem configChangeItem = new ConfigChangeItem("aaaaa", "aaaaa", "aaaaa");

    // Act
    configChangeItem.setKey("aaaaa");

    // Assert
    assertEquals("aaaaa", configChangeItem.getKey());
  }

  @Test
  public void getKeyTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new ConfigChangeItem("aaaaa", "aaaaa", "aaaaa")).getKey());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ConfigChangeItem actualConfigChangeItem = new ConfigChangeItem("aaaaa", "aaaaa", "aaaaa");

    // Assert
    String actualKey = actualConfigChangeItem.getKey();
    String actualOldValue = actualConfigChangeItem.getOldValue();
    assertEquals("aaaaa", actualKey);
    assertEquals("aaaaa", actualConfigChangeItem.getNewValue());
    assertEquals("aaaaa", actualOldValue);
  }
}

