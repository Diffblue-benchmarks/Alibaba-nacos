package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HttpClientDiffblueTest {
  @Test
  public void constructorTest2() {
    // Arrange and Act
    HttpClient.HttpResult actualHttpResult = new HttpClient.HttpResult(1, "aaaaa", null);

    // Assert
    assertEquals(1, actualHttpResult.code);
    assertEquals("aaaaa", actualHttpResult.content);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    HttpClient.HttpGetWithEntity actualHttpGetWithEntity = new HttpClient.HttpGetWithEntity();

    // Assert
    String actualToStringResult = actualHttpGetWithEntity.toString();
    assertEquals("GET null HTTP/1.1", actualToStringResult);
    assertEquals(0, actualHttpGetWithEntity.getAllHeaders().length);
  }

  @Test
  public void getMethodTest() {
    // Arrange, Act and Assert
    assertEquals("GET", (new HttpClient.HttpGetWithEntity()).getMethod());
  }
}

