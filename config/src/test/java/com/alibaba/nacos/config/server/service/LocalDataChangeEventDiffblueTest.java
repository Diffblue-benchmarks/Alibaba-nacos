package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LocalDataChangeEventDiffblueTest {
  @Test
  public void constructorTest3() {
    // Arrange and Act
    LocalDataChangeEvent actualLocalDataChangeEvent = new LocalDataChangeEvent("aaaaa", true, null, "aaaaa");

    // Assert
    assertNull(actualLocalDataChangeEvent.betaIps);
    assertEquals("aaaaa", actualLocalDataChangeEvent.groupKey);
    assertTrue(actualLocalDataChangeEvent.isBeta);
    assertEquals("aaaaa", actualLocalDataChangeEvent.tag);
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    LocalDataChangeEvent actualLocalDataChangeEvent = new LocalDataChangeEvent("aaaaa", true, null);

    // Assert
    assertNull(actualLocalDataChangeEvent.betaIps);
    assertEquals("aaaaa", actualLocalDataChangeEvent.groupKey);
    assertTrue(actualLocalDataChangeEvent.isBeta);
    assertNull(actualLocalDataChangeEvent.tag);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    LocalDataChangeEvent actualLocalDataChangeEvent = new LocalDataChangeEvent("aaaaa");

    // Assert
    assertNull(actualLocalDataChangeEvent.betaIps);
    assertEquals("aaaaa", actualLocalDataChangeEvent.groupKey);
    assertFalse(actualLocalDataChangeEvent.isBeta);
    assertNull(actualLocalDataChangeEvent.tag);
  }
}

