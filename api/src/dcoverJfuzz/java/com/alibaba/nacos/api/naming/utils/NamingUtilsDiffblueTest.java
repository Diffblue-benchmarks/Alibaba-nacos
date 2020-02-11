package com.alibaba.nacos.api.naming.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NamingUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test(timeout=10000)
  public void getServiceNameTest2() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    NamingUtils.getServiceName("@@");
  }

  @Test(timeout=10000)
  public void getServiceNameTest() {
    // Arrange, Act and Assert
    assertEquals("foo", NamingUtils.getServiceName("foo"));
  }

  @Test(timeout=10000)
  public void getGroupNameTest2() {
    // Arrange, Act and Assert
    assertEquals("DEFAULT_GROUP", NamingUtils.getGroupName("foo"));
  }

  @Test(timeout=10000)
  public void getGroupNameTest() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    NamingUtils.getGroupName("@@");
  }

  @Test(timeout=10000)
  public void getGroupedNameTest() {
    // Arrange, Act and Assert
    assertEquals("name@@name", NamingUtils.getGroupedName("name", "name"));
  }
}

