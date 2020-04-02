package com.alibaba.nacos.core.env;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NacosDefaultPropertySourceEnvironmentPostProcessorDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(2147483647, (new NacosDefaultPropertySourceEnvironmentPostProcessor()).getOrder());
  }

  @Test
  public void testGetOrder() {
    // Arrange, Act and Assert
    assertEquals(2147483647, (new NacosDefaultPropertySourceEnvironmentPostProcessor()).getOrder());
  }
}

