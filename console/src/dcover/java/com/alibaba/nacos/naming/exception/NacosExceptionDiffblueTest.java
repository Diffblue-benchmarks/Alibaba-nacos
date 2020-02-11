package com.alibaba.nacos.naming.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class NacosExceptionDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest5() {
    // Arrange, Act and Assert
    assertEquals(-1, (new NacosException(-1)).getErrorCode());
  }

  @Test(timeout=10000)
  public void constructorTest4() {
    // Arrange and Act
    NacosException actualNacosException = new NacosException();

    // Assert
    int actualErrorCode = actualNacosException.getErrorCode();
    assertEquals(0, actualErrorCode);
    assertNull(actualNacosException.getErrorMsg());
  }

  @Test(timeout=10000)
  public void constructorTest3() {
    // Arrange, Act and Assert
    assertEquals(-1, (new NacosException(-1, "foo", null)).getErrorCode());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    NacosException actualNacosException = new NacosException(-1, "An error occurred");

    // Assert
    int actualErrorCode = actualNacosException.getErrorCode();
    assertEquals(-1, actualErrorCode);
    assertEquals("An error occurred", actualNacosException.getErrorMsg());
  }

  @Test(timeout=10000)
  public void getErrorMsgTest() {
    // Arrange, Act and Assert
    assertNull((new NacosException()).getErrorMsg());
  }

  @Test(timeout=10000)
  public void getErrorCodeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NacosException()).getErrorCode());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(-1, (new NacosException(-1, (Throwable) null)).getErrorCode());
  }
}

