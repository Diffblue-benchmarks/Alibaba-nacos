package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SwitchServiceDiffblueTest {
  @Test
  public void testGetSwitchBoolean() {
    // Arrange, Act and Assert
    assertTrue(SwitchService.getSwitchBoolean("#", true));
  }

  @Test
  public void testGetSwitchInteger() {
    // Arrange, Act and Assert
    assertEquals(42, SwitchService.getSwitchInteger("#", 42));
  }

  @Test
  public void testGetSwitchString() {
    // Arrange, Act and Assert
    assertEquals("#", SwitchService.getSwitchString("#", "#"));
  }

  @Test
  public void testGetSwitches() {
    // Arrange, Act and Assert
    assertEquals("", SwitchService.getSwitches());
  }
}

