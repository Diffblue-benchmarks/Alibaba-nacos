package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RestResultDiffblueTest {
  @Test
  public void setDataTest() {
    // Arrange
    RestResult<Object> restResult = new RestResult<Object>();

    // Act
    restResult.setData("aaaaa");

    // Assert
    assertTrue(restResult.getData() instanceof String);
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    RestResult<Object> actualRestResult = new RestResult<Object>(1, (Object) "aaaaa");

    // Assert
    int actualCode = actualRestResult.getCode();
    assertEquals(1, actualCode);
    assertTrue(actualRestResult.getData() instanceof String);
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    RestResult<Object> actualRestResult = new RestResult<Object>(1, "aaaaa", "aaaaa");

    // Assert
    int actualCode = actualRestResult.getCode();
    String actualMessage = actualRestResult.getMessage();
    assertEquals(1, actualCode);
    assertTrue(actualRestResult.getData() instanceof String);
    assertEquals("aaaaa", actualMessage);
  }

  @Test
  public void getDataTest() {
    // Arrange, Act and Assert
    assertNull((new RestResult<Object>()).getData());
  }

  @Test
  public void setCodeTest() {
    // Arrange
    RestResult<Object> restResult = new RestResult<Object>();

    // Act
    restResult.setCode(1);

    // Assert
    assertEquals(1, restResult.getCode());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    RestResult<Object> actualRestResult = new RestResult<Object>();

    // Assert
    int actualCode = actualRestResult.getCode();
    String actualMessage = actualRestResult.getMessage();
    assertEquals(0, actualCode);
    assertNull(actualRestResult.getData());
    assertNull(actualMessage);
  }

  @Test
  public void getMessageTest() {
    // Arrange, Act and Assert
    assertNull((new RestResult<Object>()).getMessage());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    RestResult<Object> actualRestResult = new RestResult<Object>(1, "aaaaa");

    // Assert
    int actualCode = actualRestResult.getCode();
    assertEquals(1, actualCode);
    assertEquals("aaaaa", actualRestResult.getMessage());
  }

  @Test
  public void getCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RestResult<Object>()).getCode());
  }

  @Test
  public void setMessageTest() {
    // Arrange
    RestResult<Object> restResult = new RestResult<Object>();

    // Act
    restResult.setMessage("aaaaa");

    // Assert
    assertEquals("aaaaa", restResult.getMessage());
  }
}

