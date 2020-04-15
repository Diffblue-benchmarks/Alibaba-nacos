package com.alibaba.nacos.naming.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class ResponseExceptionHandlerDiffblueTest {
  @Autowired
  private ResponseExceptionHandler responseExceptionHandler;
  @Test
  public void testHandleMissingParams() {
    // Arrange and Act
    ResponseEntity<String> actualHandleMissingParamsResult = this.responseExceptionHandler
        .handleMissingParams(new MissingServletRequestParameterException("", ""));

    // Assert
    assertEquals("<400 BAD_REQUEST Bad Request,Parameter '' is" + " missing,{}>",
        actualHandleMissingParamsResult.toString());
    assertEquals(HttpStatus.BAD_REQUEST, actualHandleMissingParamsResult.getStatusCode());
    assertTrue(actualHandleMissingParamsResult.hasBody());
  }
  @Test
  public void testHandleParameterError() {
    // Arrange and Act
    ResponseEntity<String> actualHandleParameterErrorResult = this.responseExceptionHandler
        .handleParameterError(new IllegalArgumentException());

    // Assert
    assertEquals("<400 BAD_REQUEST Bad Request,{}>", actualHandleParameterErrorResult.toString());
    assertEquals(HttpStatus.BAD_REQUEST, actualHandleParameterErrorResult.getStatusCode());
    assertFalse(actualHandleParameterErrorResult.hasBody());
  }
}

