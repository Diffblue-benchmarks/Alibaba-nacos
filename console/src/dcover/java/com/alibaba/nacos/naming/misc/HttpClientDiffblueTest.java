package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import org.junit.Test;

public class HttpClientDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    HttpClient.HttpResult actualHttpResult = new HttpClient.HttpResult(1, "foo", null);

    // Assert
    assertEquals(1, actualHttpResult.code);
    assertEquals("foo", actualHttpResult.content);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    HttpClient.HttpGetWithEntity actualHttpGetWithEntity = new HttpClient.HttpGetWithEntity();

    // Assert
    String actualToStringResult = actualHttpGetWithEntity.toString();
    boolean actualIsAbortedResult = actualHttpGetWithEntity.isAborted();
    assertEquals(0, actualHttpGetWithEntity.getAllHeaders().length);
    assertFalse(actualIsAbortedResult);
    assertEquals("GET null HTTP/1.1", actualToStringResult);
  }

  @Test(timeout=10000)
  public void getMethodTest() {
    // Arrange, Act and Assert
    assertEquals("GET", (new HttpClient.HttpGetWithEntity()).getMethod());
  }

  @Test(timeout=10000)
  public void httpPostLargeTest() {
    // Arrange and Act
    HttpClient.HttpResult actualHttpPostLargeResult = HttpClient.httpPostLarge("https://www.diffblue.com", null, "foo");

    // Assert
    assertEquals(500, actualHttpPostLargeResult.code);
    assertEquals("java.lang.NullPointerException", actualHttpPostLargeResult.content);
  }

  @Test(timeout=10000)
  public void encodingParamsTest() throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertNull(HttpClient.encodingParams(null, "UTF-8"));
  }

  @Test(timeout=10000)
  public void httpPutLargeTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act
    HttpClient.HttpResult actualHttpPutLargeResult = HttpClient.httpPutLarge("https://www.diffblue.com", null,
        byteArray);

    // Assert
    assertEquals(500, actualHttpPutLargeResult.code);
    assertEquals("java.lang.NullPointerException", actualHttpPutLargeResult.content);
  }

  @Test(timeout=10000)
  public void httpPostTest2() {
    // Arrange and Act
    HttpClient.HttpResult actualHttpPostResult = HttpClient.httpPost("https://www.diffblue.com", null, null);

    // Assert
    assertEquals(500, actualHttpPostResult.code);
    assertEquals("java.lang.NullPointerException", actualHttpPostResult.content);
  }

  @Test(timeout=10000)
  public void requestTest() {
    // Arrange and Act
    HttpClient.HttpResult actualRequestResult = HttpClient.request("https://www.diffblue.com", null, null, 10, 10,
        "https://www.diffblue.com", "foo");

    // Assert
    assertEquals(500, actualRequestResult.code);
    assertEquals("java.net.ProtocolException: Invalid HTTP" + " method: foo", actualRequestResult.content);
  }

  @Test(timeout=10000)
  public void httpGetLargeTest() {
    // Arrange and Act
    HttpClient.HttpResult actualHttpGetLargeResult = HttpClient.httpGetLarge("https://www.diffblue.com", null, "foo");

    // Assert
    assertEquals(500, actualHttpGetLargeResult.code);
    assertEquals("java.lang.NullPointerException", actualHttpGetLargeResult.content);
  }

  @Test(timeout=10000)
  public void httpPostTest() {
    // Arrange and Act
    HttpClient.HttpResult actualHttpPostResult = HttpClient.httpPost("https://www.diffblue.com", null, null,
        "https://www.diffblue.com");

    // Assert
    assertEquals(500, actualHttpPostResult.code);
    assertEquals("java.lang.NullPointerException", actualHttpPostResult.content);
  }
}

