package com.alibaba.nacos.naming.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;

public class ResponseExceptionHandlerDiffblueTest {
  @Test
  public void handleMissingParamsTest() {
    // Arrange
    ResponseExceptionHandler responseExceptionHandler = new ResponseExceptionHandler();

    // Act
    ResponseEntity<String> actualHandleMissingParamsResult = responseExceptionHandler
        .handleMissingParams(new MissingServletRequestParameterException("name", "foo"));

    // Assert
    String actualToStringResult = actualHandleMissingParamsResult.toString();
    boolean actualHasBodyResult = actualHandleMissingParamsResult.hasBody();
    assertEquals("<400 BAD_REQUEST Bad Request,Parameter 'name' is" + " missing,{}>", actualToStringResult);
    assertEquals(HttpStatus.BAD_REQUEST, actualHandleMissingParamsResult.getStatusCode());
    assertTrue(actualHasBodyResult);
  }
}

