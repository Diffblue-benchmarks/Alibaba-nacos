package com.alibaba.nacos.console.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class NamespaceAllInfoDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    NamespaceAllInfo actualNamespaceAllInfo = new NamespaceAllInfo("foo", "name", 1, 3, 1, "foo");

    // Assert
    String actualNamespace = actualNamespaceAllInfo.getNamespace();
    String actualNamespaceDesc = actualNamespaceAllInfo.getNamespaceDesc();
    String actualNamespaceShowName = actualNamespaceAllInfo.getNamespaceShowName();
    int actualConfigCount = actualNamespaceAllInfo.getConfigCount();
    assertEquals("foo", actualNamespace);
    assertEquals(1, actualNamespaceAllInfo.getQuota());
    assertEquals(3, actualConfigCount);
    assertEquals("name", actualNamespaceShowName);
    assertEquals("foo", actualNamespaceDesc);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    NamespaceAllInfo actualNamespaceAllInfo = new NamespaceAllInfo();

    // Assert
    String actualNamespace = actualNamespaceAllInfo.getNamespace();
    int actualType = actualNamespaceAllInfo.getType();
    String actualNamespaceDesc = actualNamespaceAllInfo.getNamespaceDesc();
    String actualNamespaceShowName = actualNamespaceAllInfo.getNamespaceShowName();
    int actualConfigCount = actualNamespaceAllInfo.getConfigCount();
    assertNull(actualNamespace);
    assertEquals(0, actualNamespaceAllInfo.getQuota());
    assertEquals(0, actualConfigCount);
    assertNull(actualNamespaceShowName);
    assertNull(actualNamespaceDesc);
    assertEquals(0, actualType);
  }

  @Test(timeout=10000)
  public void setNamespaceDescTest() {
    // Arrange
    NamespaceAllInfo namespaceAllInfo = new NamespaceAllInfo();

    // Act
    namespaceAllInfo.setNamespaceDesc("foo");

    // Assert
    assertEquals("foo", namespaceAllInfo.getNamespaceDesc());
  }

  @Test(timeout=10000)
  public void getNamespaceDescTest() {
    // Arrange, Act and Assert
    assertNull((new NamespaceAllInfo()).getNamespaceDesc());
  }
}

