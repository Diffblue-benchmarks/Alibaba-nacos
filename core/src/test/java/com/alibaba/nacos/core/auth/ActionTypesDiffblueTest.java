package com.alibaba.nacos.core.auth;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ActionTypesDiffblueTest {
  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("r", ActionTypes.READ.toString());
  }
}

