package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RestPageResultDiffblueTest {
  @Test
  public void getSerialversionuidTest() {
    // Arrange, Act and Assert
    assertEquals(-8048577763828650575L, RestPageResult.getSerialversionuid());
  }

  @Test
  public void getCurrentPageTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RestPageResult<Object>()).getCurrentPage());
  }

  @Test
  public void getPageSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RestPageResult<Object>()).getPageSize());
  }

  @Test
  public void setDataTest() {
    // Arrange
    RestPageResult<Object> restPageResult = new RestPageResult<Object>();

    // Act
    restPageResult.setData("aaaaa");

    // Assert
    assertTrue(restPageResult.getData() instanceof String);
  }

  @Test
  public void setCurrentPageTest() {
    // Arrange
    RestPageResult<Object> restPageResult = new RestPageResult<Object>();

    // Act
    restPageResult.setCurrentPage(1);

    // Assert
    assertEquals(1, restPageResult.getCurrentPage());
  }

  @Test
  public void setTotalTest() {
    // Arrange
    RestPageResult<Object> restPageResult = new RestPageResult<Object>();

    // Act
    restPageResult.setTotal(1);

    // Assert
    assertEquals(1, restPageResult.getTotal());
  }

  @Test
  public void setPageSizeTest() {
    // Arrange
    RestPageResult<Object> restPageResult = new RestPageResult<Object>();

    // Act
    restPageResult.setPageSize(1);

    // Assert
    assertEquals(1, restPageResult.getPageSize());
  }

  @Test
  public void getTotalTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RestPageResult<Object>()).getTotal());
  }

  @Test
  public void getDataTest() {
    // Arrange, Act and Assert
    assertNull((new RestPageResult<Object>()).getData());
  }

  @Test
  public void setCodeTest() {
    // Arrange
    RestPageResult<Object> restPageResult = new RestPageResult<Object>();

    // Act
    restPageResult.setCode(1);

    // Assert
    assertEquals(1, restPageResult.getCode());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    RestPageResult<Object> actualRestPageResult = new RestPageResult<Object>();

    // Assert
    int actualCode = actualRestPageResult.getCode();
    int actualCurrentPage = actualRestPageResult.getCurrentPage();
    String actualMessage = actualRestPageResult.getMessage();
    Object actualData = actualRestPageResult.getData();
    int actualTotal = actualRestPageResult.getTotal();
    assertEquals(0, actualCode);
    assertEquals(0, actualRestPageResult.getPageSize());
    assertEquals(0, actualTotal);
    assertNull(actualData);
    assertNull(actualMessage);
    assertEquals(0, actualCurrentPage);
  }

  @Test
  public void getMessageTest() {
    // Arrange, Act and Assert
    assertNull((new RestPageResult<Object>()).getMessage());
  }

  @Test
  public void getCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RestPageResult<Object>()).getCode());
  }

  @Test
  public void setMessageTest() {
    // Arrange
    RestPageResult<Object> restPageResult = new RestPageResult<Object>();

    // Act
    restPageResult.setMessage("aaaaa");

    // Assert
    assertEquals("aaaaa", restPageResult.getMessage());
  }
}

