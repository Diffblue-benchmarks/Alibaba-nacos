package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RestPageResultDiffblueTest {
  @Test(timeout=10000)
  public void getSerialversionuidTest() {
    // Arrange, Act and Assert
    assertEquals(-8048577763828650575L, RestPageResult.getSerialversionuid());
  }

  @Test(timeout=10000)
  public void getCurrentPageTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RestPageResult<Object>()).getCurrentPage());
  }

  @Test(timeout=10000)
  public void getPageSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RestPageResult<Object>()).getPageSize());
  }

  @Test(timeout=10000)
  public void setDataTest() {
    // Arrange
    RestPageResult<Object> restPageResult = new RestPageResult<Object>();

    // Act
    restPageResult.setData("foo");

    // Assert
    assertTrue(restPageResult.getData() instanceof String);
  }

  @Test(timeout=10000)
  public void setCurrentPageTest() {
    // Arrange
    RestPageResult<Object> restPageResult = new RestPageResult<Object>();

    // Act
    restPageResult.setCurrentPage(1);

    // Assert
    assertEquals(1, restPageResult.getCurrentPage());
  }

  @Test(timeout=10000)
  public void setTotalTest() {
    // Arrange
    RestPageResult<Object> restPageResult = new RestPageResult<Object>();

    // Act
    restPageResult.setTotal(1);

    // Assert
    assertEquals(1, restPageResult.getTotal());
  }

  @Test(timeout=10000)
  public void setPageSizeTest() {
    // Arrange
    RestPageResult<Object> restPageResult = new RestPageResult<Object>();

    // Act
    restPageResult.setPageSize(3);

    // Assert
    assertEquals(3, restPageResult.getPageSize());
  }

  @Test(timeout=10000)
  public void getTotalTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RestPageResult<Object>()).getTotal());
  }

  @Test(timeout=10000)
  public void getDataTest() {
    // Arrange, Act and Assert
    assertNull((new RestPageResult<Object>()).getData());
  }

  @Test(timeout=10000)
  public void setCodeTest() {
    // Arrange
    RestPageResult<Object> restPageResult = new RestPageResult<Object>();

    // Act
    restPageResult.setCode(1);

    // Assert
    assertEquals(1, restPageResult.getCode());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void getMessageTest() {
    // Arrange, Act and Assert
    assertNull((new RestPageResult<Object>()).getMessage());
  }

  @Test(timeout=10000)
  public void getCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RestPageResult<Object>()).getCode());
  }

  @Test(timeout=10000)
  public void setMessageTest() {
    // Arrange
    RestPageResult<Object> restPageResult = new RestPageResult<Object>();

    // Act
    restPageResult.setMessage("message");

    // Assert
    assertEquals("message", restPageResult.getMessage());
  }
}

