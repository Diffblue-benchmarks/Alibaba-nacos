package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import com.ning.http.client.AsyncCompletionHandlerBase;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class HttpClientDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorTest2() {
    // Arrange and Act
    HttpClient.HttpResult actualHttpResult = new HttpClient.HttpResult(1, "foo", null);

    // Assert
    assertEquals(1, actualHttpResult.code);
    assertEquals("foo", actualHttpResult.content);
  }

  @Test
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

  @Test
  public void getMethodTest() {
    // Arrange, Act and Assert
    assertEquals("GET", (new HttpClient.HttpGetWithEntity()).getMethod());
  }

  @Test
  public void httpPostLargeTest() {
    // Arrange and Act
    HttpClient.HttpResult actualHttpPostLargeResult = HttpClient.httpPostLarge("https://www.diffblue.com", null, "foo");

    // Assert
    assertEquals(500, actualHttpPostLargeResult.code);
    assertEquals("java.lang.NullPointerException", actualHttpPostLargeResult.content);
  }

  @Test
  public void encodingParamsTest() throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertNull(HttpClient.encodingParams(null, "UTF-8"));
  }

  @Test
  public void asyncHttpRequestTest() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    HttpClient.asyncHttpRequest("https://www.diffblue.com", null, null, new AsyncCompletionHandlerBase(), "foo");
  }

  @Test
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

  @Test
  public void requestTest() {
    // Arrange and Act
    HttpClient.HttpResult actualRequestResult = HttpClient.request("https://www.diffblue.com", null, null,
        "https://www.diffblue.com", 10, 10, "UTF-8", "foo");

    // Assert
    assertEquals(500, actualRequestResult.code);
    assertEquals("java.net.ProtocolException: Invalid HTTP" + " method: foo", actualRequestResult.content);
  }

  @Test
  public void httpPostTest2() {
    // Arrange and Act
    HttpClient.HttpResult actualHttpPostResult = HttpClient.httpPost("https://www.diffblue.com", null, null);

    // Assert
    assertEquals(500, actualHttpPostResult.code);
    assertEquals("java.lang.NullPointerException", actualHttpPostResult.content);
  }

  @Test
  public void httpGetLargeTest() {
    // Arrange and Act
    HttpClient.HttpResult actualHttpGetLargeResult = HttpClient.httpGetLarge("https://www.diffblue.com", null, "foo");

    // Assert
    assertEquals(500, actualHttpGetLargeResult.code);
    assertEquals("java.lang.NullPointerException", actualHttpGetLargeResult.content);
  }

  @Test
  public void httpPostTest() {
    // Arrange and Act
    HttpClient.HttpResult actualHttpPostResult = HttpClient.httpPost("https://www.diffblue.com", null, null,
        "https://www.diffblue.com");

    // Assert
    assertEquals(500, actualHttpPostResult.code);
    assertEquals("java.lang.NullPointerException", actualHttpPostResult.content);
  }
}

