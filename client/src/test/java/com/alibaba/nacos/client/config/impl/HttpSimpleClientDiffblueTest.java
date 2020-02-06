package com.alibaba.nacos.client.config.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class HttpSimpleClientDiffblueTest {
  @Test
  public void constructorTest2() {
    // Arrange and Act
    HttpSimpleClient.HttpResult actualHttpResult = new HttpSimpleClient.HttpResult(1, "foo");

    // Assert
    assertEquals("foo", actualHttpResult.content);
    assertEquals(1, actualHttpResult.code);
    assertNull(actualHttpResult.headers);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    HttpSimpleClient.HttpResult actualHttpResult = new HttpSimpleClient.HttpResult(1, null, "foo");

    // Assert
    assertEquals("foo", actualHttpResult.content);
    assertEquals(1, actualHttpResult.code);
    assertNull(actualHttpResult.headers);
  }
}

