package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ConfigDataChangeEventDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest4() {
    // Arrange and Act
    ConfigDataChangeEvent actualConfigDataChangeEvent = new ConfigDataChangeEvent(true, "123", "foo", 1L);

    // Assert
    assertEquals("123", actualConfigDataChangeEvent.dataId);
    assertNull(actualConfigDataChangeEvent.tag);
    assertTrue(actualConfigDataChangeEvent.isBeta);
    assertEquals(1L, actualConfigDataChangeEvent.lastModifiedTs);
    assertEquals("foo", actualConfigDataChangeEvent.group);
    assertEquals("", actualConfigDataChangeEvent.tenant);
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange and Act
    ConfigDataChangeEvent actualConfigDataChangeEvent = new ConfigDataChangeEvent(true, "123", "foo", "foo", 1L);

    // Assert
    assertEquals("123", actualConfigDataChangeEvent.dataId);
    assertNull(actualConfigDataChangeEvent.tag);
    assertTrue(actualConfigDataChangeEvent.isBeta);
    assertEquals(1L, actualConfigDataChangeEvent.lastModifiedTs);
    assertEquals("foo", actualConfigDataChangeEvent.group);
    assertEquals("foo", actualConfigDataChangeEvent.tenant);
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    ConfigDataChangeEvent actualConfigDataChangeEvent = new ConfigDataChangeEvent(true, "123", "foo", "foo", "foo", 1L);

    // Assert
    assertEquals("123", actualConfigDataChangeEvent.dataId);
    assertEquals("foo", actualConfigDataChangeEvent.tag);
    assertTrue(actualConfigDataChangeEvent.isBeta);
    assertEquals(1L, actualConfigDataChangeEvent.lastModifiedTs);
    assertEquals("foo", actualConfigDataChangeEvent.group);
    assertEquals("foo", actualConfigDataChangeEvent.tenant);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ConfigDataChangeEvent actualConfigDataChangeEvent = new ConfigDataChangeEvent("123", "foo", 1L);

    // Assert
    assertEquals("123", actualConfigDataChangeEvent.dataId);
    assertNull(actualConfigDataChangeEvent.tag);
    assertFalse(actualConfigDataChangeEvent.isBeta);
    assertEquals(1L, actualConfigDataChangeEvent.lastModifiedTs);
    assertEquals("foo", actualConfigDataChangeEvent.group);
    assertEquals("", actualConfigDataChangeEvent.tenant);
  }
}

