package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LocalDataChangeEventDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange and Act
    LocalDataChangeEvent actualLocalDataChangeEvent = new LocalDataChangeEvent("foo", true, null, "foo");

    // Assert
    assertNull(actualLocalDataChangeEvent.betaIps);
    assertEquals("foo", actualLocalDataChangeEvent.groupKey);
    assertTrue(actualLocalDataChangeEvent.isBeta);
    assertEquals("foo", actualLocalDataChangeEvent.tag);
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    LocalDataChangeEvent actualLocalDataChangeEvent = new LocalDataChangeEvent("foo", true, null);

    // Assert
    assertNull(actualLocalDataChangeEvent.betaIps);
    assertEquals("foo", actualLocalDataChangeEvent.groupKey);
    assertTrue(actualLocalDataChangeEvent.isBeta);
    assertNull(actualLocalDataChangeEvent.tag);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    LocalDataChangeEvent actualLocalDataChangeEvent = new LocalDataChangeEvent("foo");

    // Assert
    assertNull(actualLocalDataChangeEvent.betaIps);
    assertEquals("foo", actualLocalDataChangeEvent.groupKey);
    assertFalse(actualLocalDataChangeEvent.isBeta);
    assertNull(actualLocalDataChangeEvent.tag);
  }
}

