package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class PageDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Page<Object> actualPage = new Page<Object>();

    // Assert
    List<Object> pageItems = actualPage.getPageItems();
    assertTrue(pageItems instanceof java.util.ArrayList);
    assertEquals(0, actualPage.getPagesAvailable());
    assertEquals(0, pageItems.size());
    assertEquals(0, actualPage.getPageNumber());
    assertEquals(0, actualPage.getTotalCount());
  }

  @Test
  public void testSetPageItems() {
    // Arrange
    Page<Object> page = new Page<Object>();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act
    page.setPageItems(objectList);

    // Assert
    assertSame(objectList, page.getPageItems());
  }

  @Test
  public void testSetPageNumber() {
    // Arrange
    Page<Object> page = new Page<Object>();

    // Act
    page.setPageNumber(10);

    // Assert
    assertEquals(10, page.getPageNumber());
  }

  @Test
  public void testSetPagesAvailable() {
    // Arrange
    Page<Object> page = new Page<Object>();

    // Act
    page.setPagesAvailable(1);

    // Assert
    assertEquals(1, page.getPagesAvailable());
  }

  @Test
  public void testSetTotalCount() {
    // Arrange
    Page<Object> page = new Page<Object>();

    // Act
    page.setTotalCount(3);

    // Assert
    assertEquals(3, page.getTotalCount());
  }
}

