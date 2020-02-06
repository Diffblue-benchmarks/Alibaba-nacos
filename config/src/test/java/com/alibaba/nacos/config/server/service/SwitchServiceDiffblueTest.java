package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SwitchServiceDiffblueTest {
  @Test
  public void getSwitchIntegerTest() {
    // Arrange, Act and Assert
    assertEquals(1, SwitchService.getSwitchInteger("#", 1));
  }

  @Test
  public void getSwitchesTest() {
    // Arrange, Act and Assert
    assertEquals("", SwitchService.getSwitches());
  }

  @Test
  public void getSwitchBooleanTest() {
    // Arrange, Act and Assert
    assertTrue(SwitchService.getSwitchBoolean("#", true));
  }

  @Test
  public void getSwitchStringTest() {
    // Arrange, Act and Assert
    assertEquals("#", SwitchService.getSwitchString("#", "#"));
  }
}

