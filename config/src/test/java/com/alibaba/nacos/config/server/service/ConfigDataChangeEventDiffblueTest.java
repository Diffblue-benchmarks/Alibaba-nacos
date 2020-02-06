package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ConfigDataChangeEventDiffblueTest {
  @Test
  public void constructorTest4() {
    // Arrange and Act
    ConfigDataChangeEvent actualConfigDataChangeEvent = new ConfigDataChangeEvent(true, "", "", 1L);

    // Assert
    assertEquals("", actualConfigDataChangeEvent.dataId);
    assertNull(actualConfigDataChangeEvent.tag);
    assertTrue(actualConfigDataChangeEvent.isBeta);
    assertEquals(1L, actualConfigDataChangeEvent.lastModifiedTs);
    assertEquals("", actualConfigDataChangeEvent.group);
    assertEquals("", actualConfigDataChangeEvent.tenant);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    ConfigDataChangeEvent actualConfigDataChangeEvent = new ConfigDataChangeEvent(true, "", "", "", 1L);

    // Assert
    assertEquals("", actualConfigDataChangeEvent.dataId);
    assertNull(actualConfigDataChangeEvent.tag);
    assertTrue(actualConfigDataChangeEvent.isBeta);
    assertEquals(1L, actualConfigDataChangeEvent.lastModifiedTs);
    assertEquals("", actualConfigDataChangeEvent.group);
    assertEquals("", actualConfigDataChangeEvent.tenant);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    ConfigDataChangeEvent actualConfigDataChangeEvent = new ConfigDataChangeEvent(true, "", "", "", "", 1L);

    // Assert
    assertEquals("", actualConfigDataChangeEvent.dataId);
    assertEquals("", actualConfigDataChangeEvent.tag);
    assertTrue(actualConfigDataChangeEvent.isBeta);
    assertEquals(1L, actualConfigDataChangeEvent.lastModifiedTs);
    assertEquals("", actualConfigDataChangeEvent.group);
    assertEquals("", actualConfigDataChangeEvent.tenant);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ConfigDataChangeEvent actualConfigDataChangeEvent = new ConfigDataChangeEvent("", "", 1L);

    // Assert
    assertEquals("", actualConfigDataChangeEvent.dataId);
    assertNull(actualConfigDataChangeEvent.tag);
    assertFalse(actualConfigDataChangeEvent.isBeta);
    assertEquals(1L, actualConfigDataChangeEvent.lastModifiedTs);
    assertEquals("", actualConfigDataChangeEvent.group);
    assertEquals("", actualConfigDataChangeEvent.tenant);
  }
}

