package com.alibaba.nacos.api.naming.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NamingUtilsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void getServiceNameTest2() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    NamingUtils.getServiceName("@@");
  }

  @Test
  public void getServiceNameTest() {
    // Arrange
    String actualServiceName = NamingUtils.getServiceName("foo");

    // Act and Assert
    assertEquals("foo", actualServiceName);
    assertEquals("", NamingUtils.getServiceName(""));
  }

  @Test
  public void getGroupNameTest2() {
    // Arrange
    String actualGroupName = NamingUtils.getGroupName("foo");

    // Act and Assert
    assertEquals("DEFAULT_GROUP", actualGroupName);
    assertEquals("", NamingUtils.getGroupName(""));
  }

  @Test
  public void getGroupNameTest() {
    // Arrange, Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    NamingUtils.getGroupName("@@");
  }

  @Test
  public void getGroupedNameTest() {
    // Arrange, Act and Assert
    assertEquals("name@@name", NamingUtils.getGroupedName("name", "name"));
  }
}

