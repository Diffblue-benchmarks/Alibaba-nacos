package com.alibaba.nacos.naming.controllers;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class CatalogControllerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new CatalogController()).serviceManager);
  }
}

