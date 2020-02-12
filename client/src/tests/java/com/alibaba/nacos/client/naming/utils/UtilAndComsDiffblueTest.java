package com.alibaba.nacos.client.naming.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UtilAndComsDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    new UtilAndComs();

    // Assert
    assertEquals("/nacos", UtilAndComs.WEB_CONTEXT);
  }
}

