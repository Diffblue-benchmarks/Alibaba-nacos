package com.alibaba.nacos.client.naming.net;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HttpClientDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    HttpClient.HttpResult actualHttpResult = new HttpClient.HttpResult(1, "foo", null);

    // Assert
    assertEquals(1, actualHttpResult.code);
    assertEquals("foo", actualHttpResult.content);
  }

  @Test(timeout=10000)
  public void requestTest2() {
    // Arrange and Act
    HttpClient.HttpResult actualRequestResult = HttpClient.request("", null, null, "", "foo");

    // Assert
    assertEquals(500, actualRequestResult.code);
    assertEquals("java.net.MalformedURLException: no protocol: ", actualRequestResult.content);
  }

  @Test(timeout=10000)
  public void requestTest() {
    // Arrange and Act
    HttpClient.HttpResult actualRequestResult = HttpClient.request("https://www.diffblue.com", null, null,
        "https://www.diffblue.com", "foo");

    // Assert
    assertEquals(500, actualRequestResult.code);
    assertEquals("java.net.ProtocolException: Invalid HTTP" + " method: foo", actualRequestResult.content);
  }

  @Test(timeout=10000)
  public void httpGetTest() {
    // Arrange and Act
    HttpClient.HttpResult actualHttpGetResult = HttpClient.httpGet("GET", null, null, "GET");

    // Assert
    assertEquals(500, actualHttpGetResult.code);
    assertEquals("java.net.MalformedURLException: no protocol: GET", actualHttpGetResult.content);
  }

  @Test(timeout=10000)
  public void getPrefixTest() {
    // Arrange, Act and Assert
    assertEquals("http://", HttpClient.getPrefix());
  }
}

