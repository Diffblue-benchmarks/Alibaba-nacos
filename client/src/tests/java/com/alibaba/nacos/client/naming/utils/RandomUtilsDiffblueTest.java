package com.alibaba.nacos.client.naming.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RandomUtilsDiffblueTest {
  @Test(timeout=10000)
  public void nextIntTest() {
    // Arrange, Act and Assert
    assertEquals(0, RandomUtils.nextInt(1));
  }
}

