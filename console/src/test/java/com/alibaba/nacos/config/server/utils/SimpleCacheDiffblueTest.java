package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SimpleCacheDiffblueTest {
  @Test
  public void testGet() {
    // Arrange, Act and Assert
    assertNull((new SimpleCache<Object>()).get("key"));
  }
}

