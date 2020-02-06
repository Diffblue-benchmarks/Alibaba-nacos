package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SwitchServiceDiffblueTest {
  @Test
  public void getSwitchIntegerTest() {
    // Arrange, Act and Assert
    assertEquals(42, SwitchService.getSwitchInteger("foo", 42));
  }

  @Test
  public void getSwitchesTest() {
    // Arrange, Act and Assert
    assertEquals("", SwitchService.getSwitches());
  }

  @Test
  public void getSwitchBooleanTest() {
    // Arrange, Act and Assert
    assertTrue(SwitchService.getSwitchBoolean("foo", true));
  }

  @Test
  public void getSwitchStringTest() {
    // Arrange, Act and Assert
    assertEquals("foo", SwitchService.getSwitchString("foo", "foo"));
  }
}

