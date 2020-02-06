package com.alibaba.nacos.api.common;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConstantsDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange and Act
    new Constants();

    // Assert
    assertEquals(204, Constants.DATA_IN_BODY_VERSION);
  }
}

