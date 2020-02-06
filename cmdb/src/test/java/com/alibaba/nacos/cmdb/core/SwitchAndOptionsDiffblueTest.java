package com.alibaba.nacos.cmdb.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class SwitchAndOptionsDiffblueTest {
  @Test
  public void getEventTaskIntervalTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SwitchAndOptions()).getEventTaskInterval());
  }

  @Test
  public void getDumpTaskIntervalTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SwitchAndOptions()).getDumpTaskInterval());
  }

  @Test
  public void isLoadDataAtStartTest() {
    // Arrange, Act and Assert
    assertFalse((new SwitchAndOptions()).isLoadDataAtStart());
  }

  @Test
  public void getLabelTaskIntervalTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new SwitchAndOptions()).getLabelTaskInterval());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    SwitchAndOptions actualSwitchAndOptions = new SwitchAndOptions();

    // Assert
    int actualLabelTaskInterval = actualSwitchAndOptions.getLabelTaskInterval();
    boolean actualIsLoadDataAtStartResult = actualSwitchAndOptions.isLoadDataAtStart();
    int actualDumpTaskInterval = actualSwitchAndOptions.getDumpTaskInterval();
    assertEquals(0, actualLabelTaskInterval);
    assertEquals(0, actualSwitchAndOptions.getEventTaskInterval());
    assertEquals(0, actualDumpTaskInterval);
    assertFalse(actualIsLoadDataAtStartResult);
  }
}

