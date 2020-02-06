package com.alibaba.nacos.naming.controllers;

import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.mock.web.MockHttpServletRequest;

public class CatalogControllerDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new CatalogController()).serviceManager);
  }
  @Test
  public void rt4ServiceTest() {
    // Arrange
    CatalogController catalogController = new CatalogController();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    catalogController.rt4Service(new MockHttpServletRequest());
  }
}

