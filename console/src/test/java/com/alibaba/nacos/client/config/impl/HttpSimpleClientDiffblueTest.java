package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.io.IOException;
import java.net.MalformedURLException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class HttpSimpleClientDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void constructorTest2() {
    // Arrange and Act
    HttpSimpleClient.HttpResult actualHttpResult = new HttpSimpleClient.HttpResult(1, "aaaaa");

    // Assert
    assertEquals("aaaaa", actualHttpResult.content);
    assertEquals(1, actualHttpResult.code);
    assertNull(actualHttpResult.headers);
  }
  @Test
  public void constructorTest() {
    // Arrange and Act
    HttpSimpleClient.HttpResult actualHttpResult = new HttpSimpleClient.HttpResult(1, null, "aaaaa");

    // Assert
    assertEquals("aaaaa", actualHttpResult.content);
    assertEquals(1, actualHttpResult.code);
    assertNull(actualHttpResult.headers);
  }
  @Test
  public void httpGetTest2() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(MalformedURLException.class);
    HttpSimpleClient.httpGet("", null, null, "", 1L, true);
  }
  @Test
  public void httpPostTest2() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(MalformedURLException.class);
    HttpSimpleClient.httpPost("", null, null, "", 1L, true);
  }
  @Test
  public void httpDeleteTest2() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(MalformedURLException.class);
    HttpSimpleClient.httpDelete("", null, null, "", 1L, true);
  }
  @Test
  public void httpPostTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(MalformedURLException.class);
    HttpSimpleClient.httpPost("", null, null, "", 1L);
  }
  @Test
  public void httpDeleteTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(MalformedURLException.class);
    HttpSimpleClient.httpDelete("", null, null, "", 1L);
  }
  @Test
  public void httpGetTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(MalformedURLException.class);
    HttpSimpleClient.httpGet("", null, null, "", 1L);
  }
}

