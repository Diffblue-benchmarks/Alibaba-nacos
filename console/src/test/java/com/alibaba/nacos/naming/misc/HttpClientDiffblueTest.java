package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.junit.Test;

public class HttpClientDiffblueTest {
  @Test
  public void testHttpDelete() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    HttpClient.HttpResult actualHttpDeleteResult = HttpClient.httpDelete("", stringList, stringStringMap);

    // Assert
    assertEquals(500, actualHttpDeleteResult.code);
    assertEquals("java.net.MalformedURLException: no protocol:" + " ?nofix=1&foo=foo&encoding=UTF-8&",
        actualHttpDeleteResult.content);
  }

  @Test
  public void testHttpGet() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    HttpClient.HttpResult actualHttpGetResult = HttpClient.httpGet("", stringList, stringStringMap);

    // Assert
    assertEquals(500, actualHttpGetResult.code);
    assertEquals("java.net.MalformedURLException: no protocol:" + " ?nofix=1&foo=foo&encoding=UTF-8&",
        actualHttpGetResult.content);
  }

  @Test
  public void testHttpGetLarge() {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    HttpClient.HttpResult actualHttpGetLargeResult = HttpClient.httpGetLarge("", stringStringMap, "");

    // Assert
    assertEquals(500, actualHttpGetLargeResult.code);
    assertEquals("org.apache.http.client.ClientProtocolException", actualHttpGetLargeResult.content);
  }

  @Test
  public void testHttpGetWithEntityConstructor() {
    // Arrange and Act
    HttpClient.HttpGetWithEntity actualHttpGetWithEntity = new HttpClient.HttpGetWithEntity();

    // Assert
    assertEquals(0, actualHttpGetWithEntity.getAllHeaders().length);
    assertFalse(actualHttpGetWithEntity.isAborted());
    assertEquals("GET null HTTP/1.1", actualHttpGetWithEntity.toString());
  }

  @Test
  public void testHttpGetWithEntityGetMethod() {
    // Arrange, Act and Assert
    assertEquals("GET", (new HttpClient.HttpGetWithEntity()).getMethod());
  }

  @Test
  public void testHttpPost() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    HttpClient.HttpResult actualHttpPostResult = HttpClient.httpPost("", stringList, stringStringMap, "foo");

    // Assert
    assertEquals(500, actualHttpPostResult.code);
    assertEquals("java.nio.charset.UnsupportedCharsetException: foo", actualHttpPostResult.content);
  }

  @Test
  public void testHttpPost2() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("UTF-8");
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    HttpClient.HttpResult actualHttpPostResult = HttpClient.httpPost("", stringList, stringStringMap, "UTF-8");

    // Assert
    assertEquals(500, actualHttpPostResult.code);
    assertEquals("org.apache.http.client.ClientProtocolException", actualHttpPostResult.content);
  }

  @Test
  public void testHttpPost3() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    HttpClient.HttpResult actualHttpPostResult = HttpClient.httpPost("", stringList, stringStringMap);

    // Assert
    assertEquals(500, actualHttpPostResult.code);
    assertEquals("org.apache.http.client.ClientProtocolException", actualHttpPostResult.content);
  }

  @Test
  public void testHttpPostLarge() {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    HttpClient.HttpResult actualHttpPostLargeResult = HttpClient.httpPostLarge("", stringStringMap, "");

    // Assert
    assertEquals(500, actualHttpPostLargeResult.code);
    assertEquals("org.apache.http.client.ClientProtocolException", actualHttpPostLargeResult.content);
  }

  @Test
  public void testHttpPutLarge() {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 88);

    // Act
    HttpClient.HttpResult actualHttpPutLargeResult = HttpClient.httpPutLarge("", stringStringMap, byteArray);

    // Assert
    assertEquals(500, actualHttpPutLargeResult.code);
    assertEquals("org.apache.http.client.ClientProtocolException", actualHttpPutLargeResult.content);
  }

  @Test
  public void testHttpResultConstructor() {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    HttpClient.HttpResult actualHttpResult = new HttpClient.HttpResult(1, "content", stringStringMap);

    // Assert
    assertEquals(1, actualHttpResult.code);
    assertEquals("content", actualHttpResult.content);
  }

  @Test
  public void testHttpResultGetHeader() {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertNull((new HttpClient.HttpResult(1, "content", stringStringMap)).getHeader("content"));
  }

  @Test
  public void testRequest() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    HttpClient.HttpResult actualRequestResult = HttpClient.request("", stringList, stringStringMap, 10, 10, "foo", "");

    // Assert
    assertEquals(500, actualRequestResult.code);
    assertEquals("java.io.UnsupportedEncodingException: foo", actualRequestResult.content);
  }

  @Test
  public void testRequest2() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("UTF-8");
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    HttpClient.HttpResult actualRequestResult = HttpClient.request("", stringList, stringStringMap, 10, 10, "UTF-8",
        "");

    // Assert
    assertEquals(500, actualRequestResult.code);
    assertEquals("java.net.MalformedURLException: no protocol:" + " ?nofix=1&foo=foo&encoding=UTF-8&",
        actualRequestResult.content);
  }

  @Test
  public void testRequest3() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    HttpClient.HttpResult actualRequestResult = HttpClient.request("", stringList, null, 10, 10, "foo", "");

    // Assert
    assertEquals(500, actualRequestResult.code);
    assertEquals("java.net.MalformedURLException: no protocol: ", actualRequestResult.content);
  }

  @Test
  public void testRequest4() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("UTF-8");
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    HttpClient.HttpResult actualRequestResult = HttpClient.request("https://www.diffblue.com", stringList,
        stringStringMap, 10, 10, "UTF-8", "");

    // Assert
    assertEquals(500, actualRequestResult.code);
    assertEquals("java.net.ProtocolException: Invalid HTTP method: ", actualRequestResult.content);
  }

  @Test
  public void testRequest5() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("UTF-8");
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    HttpClient.HttpResult actualRequestResult = HttpClient.request("https://www.diffblue.com", stringList,
        stringStringMap, -1, 10, "UTF-8", "");

    // Assert
    assertEquals(500, actualRequestResult.code);
    assertEquals("java.lang.IllegalArgumentException: timeouts can't" + " be negative", actualRequestResult.content);
  }

  @Test
  public void testRequest6() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("UTF-8");
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    HttpClient.HttpResult actualRequestResult = HttpClient.request("https://www.diffblue.com", stringList,
        stringStringMap, 10, -1, "UTF-8", "");

    // Assert
    assertEquals(500, actualRequestResult.code);
    assertEquals("java.lang.IllegalArgumentException: timeouts can't" + " be negative", actualRequestResult.content);
  }

  @Test
  public void testRequest7() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("UTF-8");
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    HttpClient.HttpResult actualRequestResult = HttpClient.request("https://www.diffblue.com", stringList,
        stringStringMap, 10, 10, "UTF-8", "DELETE");

    // Assert
    assertEquals(500, actualRequestResult.code);
    assertEquals("java.util.NoSuchElementException", actualRequestResult.content);
  }

  @Test
  public void testRequest8() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add(null);
    stringList.add("UTF-8");
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    HttpClient.HttpResult actualRequestResult = HttpClient.request("https://www.diffblue.com", stringList,
        stringStringMap, 10, 10, "UTF-8", "DELETE");

    // Assert
    assertEquals(500, actualRequestResult.code);
    assertEquals("java.lang.NullPointerException: key is null", actualRequestResult.content);
  }

  @Test
  public void testTranslateParameterMap() {
    // Arrange
    HashMap<String, String[]> stringStringArrayMap = new HashMap<String, String[]>();
    stringStringArrayMap.put("foo", new String[]{"foo", "foo", "foo"});

    // Act and Assert
    assertEquals(1, HttpClient.translateParameterMap(stringStringArrayMap).size());
  }
}

