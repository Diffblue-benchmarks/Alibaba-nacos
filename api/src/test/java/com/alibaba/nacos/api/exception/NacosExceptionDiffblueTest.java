package com.alibaba.nacos.api.exception;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NacosExceptionDiffblueTest {
  @Test
  public void getErrMsgTest() {
    // Arrange, Act and Assert
    assertEquals("", (new NacosException()).getErrMsg());
  }

  @Test
  public void setErrMsgTest() {
    // Arrange
    NacosException nacosException = new NacosException();

    // Act
    nacosException.setErrMsg("aaaaa");

    // Assert
    assertEquals("aaaaa", nacosException.getErrMsg());
  }

  @Test
  public void getErrCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosException()).getErrCode());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    NacosException actualNacosException = new NacosException();

    // Assert
    String actualToStringResult = actualNacosException.toString();
    int actualErrCode = actualNacosException.getErrCode();
    assertEquals("ErrCode:0, ErrMsg:", actualToStringResult);
    assertEquals("", actualNacosException.getErrMsg());
    assertEquals(0, actualErrCode);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    NacosException actualNacosException = new NacosException(1, "aaaaa");

    // Assert
    int actualErrCode = actualNacosException.getErrCode();
    assertEquals("aaaaa", actualNacosException.getErrMsg());
    assertEquals(1, actualErrCode);
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ErrCode:0, ErrMsg:", (new NacosException()).toString());
  }

  @Test
  public void setErrCodeTest() {
    // Arrange
    NacosException nacosException = new NacosException();

    // Act
    nacosException.setErrCode(1);

    // Assert
    assertEquals(1, nacosException.getErrCode());
  }
}

