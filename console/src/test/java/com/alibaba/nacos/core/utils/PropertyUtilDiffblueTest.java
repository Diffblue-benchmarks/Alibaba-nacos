package com.alibaba.nacos.core.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class PropertyUtilDiffblueTest {
  @Test
  public void testGetProperty() {
    // Arrange, Act and Assert
    assertNull(PropertyUtil.getProperty("/conf/application.properties"));
  }

  @Test
  public void testGetProperty2() {
    // Arrange, Act and Assert
    assertEquals("/conf/application.properties",
        PropertyUtil.getProperty("/conf/application.properties", "/conf/application.properties"));
  }

  @Test
  public void testGetPropertyList() {
    // Arrange, Act and Assert
    assertEquals(0, PropertyUtil.getPropertyList("/conf/application.properties").size());
  }
}

