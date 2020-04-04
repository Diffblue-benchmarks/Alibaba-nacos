package com.alibaba.nacos.naming.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class NacosExceptionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(-1, (new NacosException(-1, new Throwable())).getErrorCode());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    NacosException actualNacosException = new NacosException(-1, "An error occurred");

    // Assert
    assertEquals(-1, actualNacosException.getErrorCode());
    assertEquals("An error occurred", actualNacosException.getErrorMsg());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    NacosException actualNacosException = new NacosException(-1, "msg", new Throwable());

    // Assert
    assertEquals(-1, actualNacosException.getErrorCode());
    assertEquals("java.lang.Throwable", actualNacosException.getCause().toString());
  }

  @Test
  public void testConstructor4() {
    // Arrange and Act
    NacosException actualNacosException = new NacosException();

    // Assert
    assertEquals(0, actualNacosException.getErrorCode());
    assertNull(actualNacosException.getLocalizedMessage());
    assertNull(actualNacosException.getCause());
    assertNull(actualNacosException.getMessage());
    assertEquals(0, actualNacosException.getSuppressed().length);
    assertEquals("com.alibaba.nacos.naming.exception.NacosException", actualNacosException.toString());
    assertNull(actualNacosException.getErrorMsg());
  }

  @Test
  public void testConstructor5() {
    // Arrange, Act and Assert
    assertEquals(-1, (new NacosException(-1)).getErrorCode());
  }
}

