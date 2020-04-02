package com.alibaba.nacos.api.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class NacosExceptionDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    NacosException actualNacosException = new NacosException(1, new Throwable());

    // Assert
    assertNull(actualNacosException.getErrMsg());
    assertEquals(1, actualNacosException.getErrCode());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    NacosException actualNacosException = new NacosException(1, "errMsg");

    // Assert
    assertEquals("errMsg", actualNacosException.getErrMsg());
    assertEquals(1, actualNacosException.getErrCode());
  }

  @Test
  public void testConstructor3() {
    // Arrange and Act
    NacosException actualNacosException = new NacosException(1, "errMsg", new Throwable());

    // Assert
    assertEquals("errMsg", actualNacosException.getErrMsg());
    assertEquals(1, actualNacosException.getErrCode());
  }

  @Test
  public void testConstructor4() {
    // Arrange and Act
    NacosException actualNacosException = new NacosException();

    // Assert
    assertEquals("ErrCode:0, ErrMsg:", actualNacosException.toString());
    assertNull(actualNacosException.getLocalizedMessage());
    assertEquals("", actualNacosException.getErrMsg());
    assertEquals(0, actualNacosException.getErrCode());
    assertNull(actualNacosException.getCause());
    assertNull(actualNacosException.getMessage());
    assertEquals(0, actualNacosException.getSuppressed().length);
  }

  @Test
  public void testGetErrMsg() {
    // Arrange, Act and Assert
    assertEquals("", (new NacosException()).getErrMsg());
  }

  @Test
  public void testSetCauseThrowable() {
    // Arrange
    NacosException nacosException = new NacosException();

    // Act
    nacosException.setCauseThrowable(new Throwable());

    // Assert
    assertNull(nacosException.getErrMsg());
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
    assertEquals("errMsg", nacosException.getErrMsg());
  }

  @Test
  public void testToString() {
    // Arrange, Act and Assert
    assertEquals("ErrCode:0, ErrMsg:", (new NacosException()).toString());
  }

  @Test
  public void testToString2() {
    // Arrange
    NacosException nacosException = new NacosException();
    nacosException.setErrMsg("errMsg");

    // Act and Assert
    assertEquals("ErrCode:0, ErrMsg:errMsg", nacosException.toString());
  }
}

