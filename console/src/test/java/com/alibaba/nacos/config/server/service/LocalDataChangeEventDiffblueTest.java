package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;

public class LocalDataChangeEventDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    LocalDataChangeEvent actualLocalDataChangeEvent = new LocalDataChangeEvent("groupKey");

    // Assert
    assertNull(actualLocalDataChangeEvent.betaIps);
    assertEquals("groupKey", actualLocalDataChangeEvent.groupKey);
    assertFalse(actualLocalDataChangeEvent.isBeta);
    assertNull(actualLocalDataChangeEvent.tag);
  }

  @Test
  public void testConstructor2() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    LocalDataChangeEvent actualLocalDataChangeEvent = new LocalDataChangeEvent("groupKey", true, stringList);

    // Assert
    assertEquals("groupKey", actualLocalDataChangeEvent.groupKey);
    assertTrue(actualLocalDataChangeEvent.isBeta);
    assertNull(actualLocalDataChangeEvent.tag);
  }

  @Test
  public void testConstructor3() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    LocalDataChangeEvent actualLocalDataChangeEvent = new LocalDataChangeEvent("groupKey", true, stringList, "tag");

    // Assert
    assertEquals("groupKey", actualLocalDataChangeEvent.groupKey);
    assertTrue(actualLocalDataChangeEvent.isBeta);
    assertEquals("tag", actualLocalDataChangeEvent.tag);
  }
}

