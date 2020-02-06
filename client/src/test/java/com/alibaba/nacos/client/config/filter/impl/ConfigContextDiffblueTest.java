package com.alibaba.nacos.client.config.filter.impl;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigContextDiffblueTest {
  @Test
  public void getParameterTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigContext()).getParameter("aaaaa"));
  }
}

