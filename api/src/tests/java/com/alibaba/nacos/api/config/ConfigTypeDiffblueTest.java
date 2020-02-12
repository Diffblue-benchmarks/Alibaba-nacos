package com.alibaba.nacos.api.config;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConfigTypeDiffblueTest {
  @Test(timeout=10000)
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertEquals("properties", ConfigType.PROPERTIES.getType());
  }
}

