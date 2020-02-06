package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SwitchManagerDiffblueTest {
  @Test
  public void interestsTest() {
    // Arrange, Act and Assert
    assertFalse((new SwitchManager()).interests(":"));
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new SwitchManager()).getSwitchDomain());
  }

  @Test
  public void getSwitchDomainTest() {
    // Arrange, Act and Assert
    assertNull((new SwitchManager()).getSwitchDomain());
  }

  @Test
  public void matchUnlistenKeyTest() {
    // Arrange, Act and Assert
    assertFalse((new SwitchManager()).matchUnlistenKey(":"));
  }
}

