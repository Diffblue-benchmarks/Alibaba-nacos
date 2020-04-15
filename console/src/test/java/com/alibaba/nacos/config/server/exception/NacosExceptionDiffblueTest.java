package com.alibaba.nacos.config.server.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class NacosExceptionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    NacosException actualNacosException = new NacosException(1, "errMsg");

    // Assert
    assertEquals("errMsg", actualNacosException.getErrMsg());
    assertEquals(1, actualNacosException.getErrCode());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    NacosException actualNacosException = new NacosException();

    // Assert
    assertEquals("ErrCode:0,ErrMsg:null", actualNacosException.toString());
    assertNull(actualNacosException.getLocalizedMessage());
    assertNull(actualNacosException.getErrMsg());
    assertEquals(0, actualNacosException.getErrCode());
    assertNull(actualNacosException.getCause());
    assertNull(actualNacosException.getMessage());
    assertEquals(0, actualNacosException.getSuppressed().length);
  }

  @Test
  public void testSetErrCode() {
    // Arrange
    NacosException nacosException = new NacosException();

    // Act
    nacosException.setErrCode(1);

    // Assert
    assertEquals(1, nacosException.getErrCode());
  }

  @Test
  public void testSetErrMsg() {
    // Arrange
    NacosException nacosException = new NacosException();

    // Act
    nacosException.setErrMsg("errMsg");

    // Assert
    assertEquals("ErrCode:0,ErrMsg:errMsg", nacosException.toString());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("ErrCode:0,ErrMsg:null", (new NacosException()).toString());
  }
}

