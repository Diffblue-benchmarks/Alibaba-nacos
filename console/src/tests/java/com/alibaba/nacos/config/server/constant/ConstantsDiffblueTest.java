package com.alibaba.nacos.config.server.constant;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConstantsDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    new Constants();

    // Assert
    assertEquals(204, Constants.DATA_IN_BODY_VERSION);
  }
}

