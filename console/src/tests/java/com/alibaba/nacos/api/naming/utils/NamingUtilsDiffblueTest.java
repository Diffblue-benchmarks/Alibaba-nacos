package com.alibaba.nacos.api.naming.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NamingUtilsDiffblueTest {
  @Test(timeout=10000)
  public void getServiceNameTest() {
    // Arrange, Act and Assert
    assertEquals("foo", NamingUtils.getServiceName("foo"));
  }

  @Test(timeout=10000)
  public void getGroupNameTest() {
    // Arrange, Act and Assert
    assertEquals("DEFAULT_GROUP", NamingUtils.getGroupName("foo"));
  }

  @Test(timeout=10000)
  public void getGroupedNameTest() {
    // Arrange, Act and Assert
    assertEquals("name@@name", NamingUtils.getGroupedName("name", "name"));
  }
}

