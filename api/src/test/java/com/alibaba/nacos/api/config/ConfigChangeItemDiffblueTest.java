package com.alibaba.nacos.api.config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigChangeItemDiffblueTest {
  @Test
  public void setNewValueTest() {
    // Arrange
    ConfigChangeItem configChangeItem = new ConfigChangeItem("foo", "foo", "foo");

    // Act
    configChangeItem.setNewValue("foo");

    // Assert
    assertEquals("foo", configChangeItem.getNewValue());
  }

  @Test
  public void getNewValueTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new ConfigChangeItem("foo", "foo", "foo")).getNewValue());
  }

  @Test
  public void setOldValueTest() {
    // Arrange
    ConfigChangeItem configChangeItem = new ConfigChangeItem("foo", "foo", "foo");

    // Act
    configChangeItem.setOldValue("foo");

    // Assert
    assertEquals("foo", configChangeItem.getOldValue());
  }

  @Test
  public void getOldValueTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new ConfigChangeItem("foo", "foo", "foo")).getOldValue());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigChangeItem("foo", "foo", "foo")).getType());
  }

  @Test
  public void setTypeTest() {
    // Arrange
    ConfigChangeItem configChangeItem = new ConfigChangeItem("foo", "foo", "foo");

    // Act
    configChangeItem.setType(PropertyChangeType.ADDED);

    // Assert
    assertEquals(PropertyChangeType.ADDED, configChangeItem.getType());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ConfigChangeItem{key='foo', oldValue='foo'," + " newValue='foo', type=null}",
        (new ConfigChangeItem("foo", "foo", "foo")).toString());
  }

  @Test
  public void setKeyTest() {
    // Arrange
    ConfigChangeItem configChangeItem = new ConfigChangeItem("foo", "foo", "foo");

    // Act
    configChangeItem.setKey("foo");

    // Assert
    assertEquals("foo", configChangeItem.getKey());
  }

  @Test
  public void getKeyTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new ConfigChangeItem("foo", "foo", "foo")).getKey());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ConfigChangeItem actualConfigChangeItem = new ConfigChangeItem("foo", "foo", "foo");

    // Assert
    String actualKey = actualConfigChangeItem.getKey();
    String actualOldValue = actualConfigChangeItem.getOldValue();
    assertEquals("foo", actualKey);
    assertEquals("foo", actualConfigChangeItem.getNewValue());
    assertEquals("foo", actualOldValue);
  }
}

