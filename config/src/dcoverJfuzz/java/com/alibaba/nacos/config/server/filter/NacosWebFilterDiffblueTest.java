package com.alibaba.nacos.config.server.filter;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class NacosWebFilterDiffblueTest {
  @Test(timeout=10000)
  public void rootPathTest() {
    // Arrange, Act and Assert
    assertNull(NacosWebFilter.rootPath());
  }
}

