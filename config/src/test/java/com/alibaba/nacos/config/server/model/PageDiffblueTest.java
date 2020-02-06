package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;

public class PageDiffblueTest {
  @Test
  public void setPageNumberTest() {
    // Arrange
    Page<Object> page = new Page<Object>();

    // Act
    page.setPageNumber(1);

    // Assert
    assertEquals(1, page.getPageNumber());
  }

  @Test
  public void setPageItemsTest() {
    // Arrange
    Page<Object> page = new Page<Object>();

    // Act
    page.setPageItems(null);

    // Assert
    assertNull(page.getPageItems());
  }

  @Test
  public void getPagesAvailableTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Page<Object>()).getPagesAvailable());
  }

  @Test
  public void getPageNumberTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Page<Object>()).getPageNumber());
  }

  @Test
  public void setTotalCountTest() {
    // Arrange
    Page<Object> page = new Page<Object>();

    // Act
    page.setTotalCount(1);

    // Assert
    assertEquals(1, page.getTotalCount());
  }

  @Test
  public void setPagesAvailableTest() {
    // Arrange
    Page<Object> page = new Page<Object>();

    // Act
    page.setPagesAvailable(1);

    // Assert
    assertEquals(1, page.getPagesAvailable());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Page<Object> actualPage = new Page<Object>();

    // Assert
    List<Object> pageItems = actualPage.getPageItems();
    int actualTotalCount = actualPage.getTotalCount();
    int actualPageNumber = actualPage.getPageNumber();
    assertTrue(pageItems instanceof java.util.ArrayList);
    assertEquals(0, actualPage.getPagesAvailable());
    assertEquals(0, pageItems.size());
    assertEquals(0, actualPageNumber);
    assertEquals(0, actualTotalCount);
  }

  @Test
  public void getTotalCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Page<Object>()).getTotalCount());
  }

  @Test
  public void getPageItemsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Page<Object>()).getPageItems().size());
  }
}

