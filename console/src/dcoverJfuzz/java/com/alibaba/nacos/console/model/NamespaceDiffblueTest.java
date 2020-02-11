package com.alibaba.nacos.console.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class NamespaceDiffblueTest {
  @Test(timeout=10000)
  public void getQuotaTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Namespace()).getQuota());
  }

  @Test(timeout=10000)
  public void getConfigCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Namespace()).getConfigCount());
  }

  @Test(timeout=10000)
  public void setNamespaceShowNameTest() {
    // Arrange
    Namespace namespace = new Namespace();

    // Act
    namespace.setNamespaceShowName("name");

    // Assert
    assertEquals("name", namespace.getNamespaceShowName());
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange, Act and Assert
    assertEquals("foo", (new Namespace("foo", "name")).getNamespace());
  }

  @Test(timeout=10000)
  public void getNamespaceTest() {
    // Arrange, Act and Assert
    assertNull((new Namespace()).getNamespace());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    Namespace actualNamespace = new Namespace("foo", "name", 1, 3, 1);

    // Assert
    String actualNamespace1 = actualNamespace.getNamespace();
    int actualType = actualNamespace.getType();
    String actualNamespaceShowName = actualNamespace.getNamespaceShowName();
    int actualConfigCount = actualNamespace.getConfigCount();
    assertEquals("foo", actualNamespace1);
    assertEquals(1, actualNamespace.getQuota());
    assertEquals(3, actualConfigCount);
    assertEquals("name", actualNamespaceShowName);
    assertEquals(1, actualType);
  }

  @Test(timeout=10000)
  public void setTypeTest() {
    // Arrange
    Namespace namespace = new Namespace();

    // Act
    namespace.setType(1);

    // Assert
    assertEquals(1, namespace.getType());
  }

  @Test(timeout=10000)
  public void setConfigCountTest() {
    // Arrange
    Namespace namespace = new Namespace();

    // Act
    namespace.setConfigCount(3);

    // Assert
    assertEquals(3, namespace.getConfigCount());
  }

  @Test(timeout=10000)
  public void setNamespaceTest() {
    // Arrange
    Namespace namespace = new Namespace();

    // Act
    namespace.setNamespace("foo");

    // Assert
    assertEquals("foo", namespace.getNamespace());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Namespace actualNamespace = new Namespace();

    // Assert
    String actualNamespace1 = actualNamespace.getNamespace();
    int actualType = actualNamespace.getType();
    String actualNamespaceShowName = actualNamespace.getNamespaceShowName();
    int actualConfigCount = actualNamespace.getConfigCount();
    assertNull(actualNamespace1);
    assertEquals(0, actualNamespace.getQuota());
    assertEquals(0, actualConfigCount);
    assertNull(actualNamespaceShowName);
    assertEquals(0, actualType);
  }

  @Test(timeout=10000)
  public void getNamespaceShowNameTest() {
    // Arrange, Act and Assert
    assertNull((new Namespace()).getNamespaceShowName());
  }

  @Test(timeout=10000)
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Namespace()).getType());
  }
}

