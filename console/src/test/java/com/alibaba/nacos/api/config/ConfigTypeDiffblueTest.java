package com.alibaba.nacos.api.config;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConfigTypeDiffblueTest {
  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertEquals("properties", ConfigType.PROPERTIES.getType());
  }
}

