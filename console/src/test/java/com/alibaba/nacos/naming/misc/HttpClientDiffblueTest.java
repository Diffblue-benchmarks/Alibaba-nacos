package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import org.junit.Test;

public class HttpClientDiffblueTest {
  @Test
  public void testHttpGetWithEntityConstructor() {
    // Arrange and Act
    HttpClient.HttpGetWithEntity actualHttpGetWithEntity = new HttpClient.HttpGetWithEntity();

    // Assert
    assertNull(actualHttpGetWithEntity.getConfig());
    assertNull(actualHttpGetWithEntity.getURI());
    assertNull(actualHttpGetWithEntity.getEntity());
    assertEquals(0, actualHttpGetWithEntity.getAllHeaders().length);
    assertTrue(actualHttpGetWithEntity.getProtocolVersion() instanceof org.apache.http.HttpVersion);
    assertFalse(actualHttpGetWithEntity.isAborted());
    assertEquals("GET", actualHttpGetWithEntity.getMethod());
    assertEquals("GET null HTTP/1.1", actualHttpGetWithEntity.toString());
    assertTrue(actualHttpGetWithEntity.getParams() instanceof org.apache.http.params.BasicHttpParams);
    assertTrue(actualHttpGetWithEntity.getRequestLine() instanceof org.apache.http.message.BasicRequestLine);
  }

  @Test
  public void testHttpGetWithEntityGetMethod() {
    // Arrange, Act and Assert
    assertEquals("GET", (new HttpClient.HttpGetWithEntity()).getMethod());
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
}

