package com.alibaba.nacos.client.config.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SnapShotSwitchDiffblueTest {
  @Test
  public void getIsSnapShotTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(true), SnapShotSwitch.getIsSnapShot());
  }
}

