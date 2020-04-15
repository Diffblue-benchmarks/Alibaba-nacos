package com.alibaba.nacos.console.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class NamespaceDiffblueTest {
  @Test
  public void testSetNamespaceShowName() {
    // Arrange
    Namespace namespace = new Namespace();

    // Act
    namespace.setNamespaceShowName("namespaceShowName");

    // Assert
    assertEquals("namespaceShowName", namespace.getNamespaceShowName());
  }

  @Test
  public void testSetNamespace() {
    // Arrange
    Namespace namespace = new Namespace();

    // Act
    namespace.setNamespace("namespace");

    // Assert
    assertEquals("namespace", namespace.getNamespace());
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    Namespace actualNamespace = new Namespace();

    // Assert
    assertNull(actualNamespace.getNamespace());
    assertEquals(0, actualNamespace.getQuota());
    assertEquals(0, actualNamespace.getConfigCount());
    assertNull(actualNamespace.getNamespaceShowName());
    assertEquals(0, actualNamespace.getType());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    Namespace actualNamespace = new Namespace("namespace", "namespaceShowName", 1, 3, 1);

    // Assert
    assertEquals("namespace", actualNamespace.getNamespace());
    assertEquals(1, actualNamespace.getQuota());
    assertEquals(3, actualNamespace.getConfigCount());
    assertEquals("namespaceShowName", actualNamespace.getNamespaceShowName());
    assertEquals(1, actualNamespace.getType());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    Namespace actualNamespace = new Namespace("namespace", "namespaceShowName");

    // Assert
    assertEquals("namespace", actualNamespace.getNamespace());
    assertEquals("namespaceShowName", actualNamespace.getNamespaceShowName());
  }

  @Test
  public void testSetQuota() {
    // Arrange
    Namespace namespace = new Namespace();

    // Act
    namespace.setQuota(1);

    // Assert
    assertEquals(1, namespace.getQuota());
  }

  @Test
  public void testSetConfigCount() {
    // Arrange
    Namespace namespace = new Namespace();

    // Act
    namespace.setConfigCount(3);

    // Assert
    assertEquals(3, namespace.getConfigCount());
  }

  @Test
  public void testSetType() {
    // Arrange
    Namespace namespace = new Namespace();

    // Act
    namespace.setType(1);

    // Assert
    assertEquals(1, namespace.getType());
  }
}

