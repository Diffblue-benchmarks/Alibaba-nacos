package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SwitchManagerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new SwitchManager()).getSwitchDomain());
  }
}

