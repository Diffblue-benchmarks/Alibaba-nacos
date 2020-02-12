package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SimpleCacheDiffblueTest {
  @Test(timeout=10000)
  public void getTest() {
    // Arrange, Act and Assert
    assertNull((new SimpleCache<Object>()).get("foo"));
  }
}

