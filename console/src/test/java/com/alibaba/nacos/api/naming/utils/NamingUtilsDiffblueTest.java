package com.alibaba.nacos.api.naming.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NamingUtilsDiffblueTest {
  @Test
  public void testGetGroupName() {
    // Arrange, Act and Assert
    assertEquals("DEFAULT_GROUP", NamingUtils.getGroupName("serviceNameWithGroup"));
  }

  @Test
  public void testGetGroupedName() {
    // Arrange, Act and Assert
    assertEquals("@@@@@@", NamingUtils.getGroupedName("@@", "@@"));
  }

  @Test
  public void testGetServiceName() {
    // Arrange, Act and Assert
    assertEquals("serviceNameWithGroup", NamingUtils.getServiceName("serviceNameWithGroup"));
  }
}

