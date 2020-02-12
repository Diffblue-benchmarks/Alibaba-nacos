package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SwitchManagerDiffblueTest {
  @Test(timeout=10000)
  public void interestsTest() {
    // Arrange, Act and Assert
    assertFalse((new SwitchManager()).interests("foo"));
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new SwitchManager()).getSwitchDomain());
  }

  @Test(timeout=10000)
  public void getSwitchDomainTest() {
    // Arrange, Act and Assert
    assertNull((new SwitchManager()).getSwitchDomain());
  }

  @Test(timeout=10000)
  public void matchUnlistenKeyTest() {
    // Arrange, Act and Assert
    assertFalse((new SwitchManager()).matchUnlistenKey("foo"));
  }
}

