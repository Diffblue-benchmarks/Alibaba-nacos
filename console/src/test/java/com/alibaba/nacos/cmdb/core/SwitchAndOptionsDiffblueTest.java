package com.alibaba.nacos.cmdb.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class SwitchAndOptionsDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    SwitchAndOptions actualSwitchAndOptions = new SwitchAndOptions();

    // Assert
    assertEquals(0, actualSwitchAndOptions.getLabelTaskInterval());
    assertEquals(0, actualSwitchAndOptions.getEventTaskInterval());
    assertEquals(0, actualSwitchAndOptions.getDumpTaskInterval());
    assertFalse(actualSwitchAndOptions.isLoadDataAtStart());
  }
}

