package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RestPageResultDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    RestPageResult<Object> actualRestPageResult = new RestPageResult<Object>();

    // Assert
    assertEquals(0, actualRestPageResult.getCode());
    assertEquals(0, actualRestPageResult.getPageSize());
    assertEquals(0, actualRestPageResult.getTotal());
    assertNull(actualRestPageResult.getData());
    assertNull(actualRestPageResult.getMessage());
    assertEquals(0, actualRestPageResult.getCurrentPage());
  }

  @Test
  public void testGetSerialversionuid() {
    // Arrange, Act and Assert
    assertEquals(-8048577763828650575L, RestPageResult.getSerialversionuid());
  }

  @Test
  public void testSetCode() {
    // Arrange
    RestPageResult<Object> restPageResult = new RestPageResult<Object>();

    // Act
    restPageResult.setCode(1);

    // Assert
    assertEquals(1, restPageResult.getCode());
  }

  @Test
  public void testSetCurrentPage() {
    // Arrange
    RestPageResult<Object> restPageResult = new RestPageResult<Object>();

    // Act
    restPageResult.setCurrentPage(1);

    // Assert
    assertEquals(1, restPageResult.getCurrentPage());
  }

  @Test
  public void testSetData() {
    // Arrange
    RestPageResult<Object> restPageResult = new RestPageResult<Object>();

    // Act
    restPageResult.setData("data");

    // Assert
    assertTrue(restPageResult.getData() instanceof String);
  }

  @Test
  public void testSetMessage() {
    // Arrange
    RestPageResult<Object> restPageResult = new RestPageResult<Object>();

    // Act
    restPageResult.setMessage("message");

    // Assert
    assertEquals("message", restPageResult.getMessage());
  }

  @Test
  public void testSetPageSize() {
    // Arrange
    RestPageResult<Object> restPageResult = new RestPageResult<Object>();

    // Act
    restPageResult.setPageSize(3);

    // Assert
    assertEquals(3, restPageResult.getPageSize());
  }

  @Test
  public void testSetTotal() {
    // Arrange
    RestPageResult<Object> restPageResult = new RestPageResult<Object>();

    // Act
    restPageResult.setTotal(1);

    // Assert
    assertEquals(1, restPageResult.getTotal());
  }
}

