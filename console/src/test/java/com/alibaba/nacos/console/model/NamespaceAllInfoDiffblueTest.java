package com.alibaba.nacos.console.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class NamespaceAllInfoDiffblueTest {
  @Test
  public void testSetNamespaceDesc() {
    // Arrange
    NamespaceAllInfo namespaceAllInfo = new NamespaceAllInfo();

    // Act
    namespaceAllInfo.setNamespaceDesc("namespaceDesc");

    // Assert
    assertEquals("namespaceDesc", namespaceAllInfo.getNamespaceDesc());
  }

  @Test
  public void testConstructor() {
    // Arrange and Act
    NamespaceAllInfo actualNamespaceAllInfo = new NamespaceAllInfo();

    // Assert
    assertNull(actualNamespaceAllInfo.getNamespace());
    assertEquals(0, actualNamespaceAllInfo.getQuota());
    assertEquals(0, actualNamespaceAllInfo.getConfigCount());
    assertNull(actualNamespaceAllInfo.getNamespaceShowName());
    assertNull(actualNamespaceAllInfo.getNamespaceDesc());
    assertEquals(0, actualNamespaceAllInfo.getType());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    NamespaceAllInfo actualNamespaceAllInfo = new NamespaceAllInfo("namespace", "namespaceShowName", 1, 3, 1,
        "namespaceDesc");

    // Assert
    assertEquals("namespace", actualNamespaceAllInfo.getNamespace());
    assertEquals(1, actualNamespaceAllInfo.getQuota());
    assertEquals(3, actualNamespaceAllInfo.getConfigCount());
    assertEquals("namespaceShowName", actualNamespaceAllInfo.getNamespaceShowName());
    assertEquals("namespaceDesc", actualNamespaceAllInfo.getNamespaceDesc());
    assertEquals(1, actualNamespaceAllInfo.getType());
  }
}

