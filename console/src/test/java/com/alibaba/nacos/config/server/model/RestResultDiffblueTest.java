package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RestResultDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    RestResult<Object> actualRestResult = new RestResult<Object>(1, "message");

    // Assert
    assertEquals(1, actualRestResult.getCode());
    assertEquals("message", actualRestResult.getMessage());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    RestResult<Object> actualRestResult = new RestResult<Object>();

    // Assert
    assertEquals(0, actualRestResult.getCode());
    assertNull(actualRestResult.getData());
    assertNull(actualRestResult.getMessage());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    RestResult<Object> actualRestResult = new RestResult<Object>(1, "message", "data");

    // Assert
    assertEquals(1, actualRestResult.getCode());
    assertTrue(actualRestResult.getData() instanceof String);
    assertEquals("message", actualRestResult.getMessage());
  }

  @Test
  public void testConstructor4() {
    // Arrange and Act
    RestResult<Object> actualRestResult = new RestResult<Object>(1, (Object) "data");

    // Assert
    assertEquals(1, actualRestResult.getCode());
    assertTrue(actualRestResult.getData() instanceof String);
  }

  @Test
  public void testSetCode() {
    // Arrange
    RestResult<Object> restResult = new RestResult<Object>();

    // Act
    restResult.setCode(1);

    // Assert
    assertEquals(1, restResult.getCode());
  }

  @Test
  public void testSetData() {
    // Arrange
    RestResult<Object> restResult = new RestResult<Object>();

    // Act
    restResult.setData("data");

    // Assert
    assertTrue(restResult.getData() instanceof String);
  }

  @Test
  public void testSetMessage() {
    // Arrange
    RestResult<Object> restResult = new RestResult<Object>();

    // Act
    restResult.setMessage("message");

    // Assert
    assertEquals("message", restResult.getMessage());
  }
}

