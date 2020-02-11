package com.alibaba.nacos.api.exception;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NacosExceptionDiffblueTest {
  @Test(timeout=10000)
  public void getErrMsgTest() {
    // Arrange, Act and Assert
    assertEquals("", (new NacosException()).getErrMsg());
  }

  @Test(timeout=10000)
  public void setErrMsgTest() {
    // Arrange
    NacosException nacosException = new NacosException();

    // Act
    nacosException.setErrMsg("foo");

    // Assert
    assertEquals("foo", nacosException.getErrMsg());
  }

  @Test(timeout=10000)
  public void getErrCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosException()).getErrCode());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    NacosException actualNacosException = new NacosException(1, "foo");

    // Assert
    int actualErrCode = actualNacosException.getErrCode();
    assertEquals("foo", actualNacosException.getErrMsg());
    assertEquals(1, actualErrCode);
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ErrCode:0, ErrMsg:", (new NacosException()).toString());
  }

  @Test(timeout=10000)
  public void setErrCodeTest() {
    // Arrange
    NacosException nacosException = new NacosException();

    // Act
    nacosException.setErrCode(1);

    // Assert
    assertEquals(1, nacosException.getErrCode());
  }
}

