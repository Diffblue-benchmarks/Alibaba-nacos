package com.alibaba.nacos.client.config.filter.impl;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigContextDiffblueTest {
  @Test(timeout=10000)
  public void getParameterTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigContext()).getParameter("foo"));
  }
}

