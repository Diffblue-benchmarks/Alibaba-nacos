package com.alibaba.nacos.core.auth;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AccessExceptionDiffblueTest {
  @Test
  public void constructorTest3() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new AccessException("aaaaa")).getErrMsg());
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals(1, (new AccessException(1)).getErrCode());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    AccessException actualAccessException = new AccessException();

    // Assert
    String actualToStringResult = actualAccessException.toString();
    int actualErrCode = actualAccessException.getErrCode();
    assertEquals("ErrCode:0, ErrMsg:", actualToStringResult);
    assertEquals("", actualAccessException.getErrMsg());
    assertEquals(0, actualErrCode);
  }
}

