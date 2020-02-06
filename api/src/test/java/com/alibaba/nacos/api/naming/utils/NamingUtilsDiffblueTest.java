package com.alibaba.nacos.api.naming.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NamingUtilsDiffblueTest {
  @Test
  public void getServiceNameTest() {
    // Arrange, Act and Assert
    assertEquals("", NamingUtils.getServiceName(""));
  }

  @Test
  public void getGroupNameTest() {
    // Arrange, Act and Assert
    assertEquals("", NamingUtils.getGroupName(""));
  }

  @Test
  public void getGroupedNameTest() {
    // Arrange, Act and Assert
    assertEquals("@@", NamingUtils.getGroupedName("", ""));
  }
}

