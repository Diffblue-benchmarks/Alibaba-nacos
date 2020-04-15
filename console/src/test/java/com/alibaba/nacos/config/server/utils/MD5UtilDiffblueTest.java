package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.catalina.connector.Response;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

public class MD5UtilDiffblueTest {
  @Test
  public void testCompareMd5() {
    // Arrange
    MockHttpServletRequest request = new MockHttpServletRequest();
    Response response = new Response();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    List<String> actualCompareMd5Result = MD5Util.compareMd5(request, response, stringStringMap);

    // Assert
    assertEquals(1, actualCompareMd5Result.size());
    assertEquals("foo", actualCompareMd5Result.get(0));
  }

  @Test
  public void testCompareMd52() {
    // Arrange
    MockHttpServletRequest request = new MockHttpServletRequest();
    Response response = new Response();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "");

    // Act and Assert
    assertEquals(0, MD5Util.compareMd5(request, response, stringStringMap).size());
  }

  @Test
  public void testCompareMd5OldResult() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act and Assert
    assertEquals("null:foo;", MD5Util.compareMd5OldResult(stringList));
  }

  @Test
  public void testCompareMd5ResultString() throws IOException {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act and Assert
    assertEquals("null%02foo%01", MD5Util.compareMd5ResultString(stringList));
  }

  @Test
  public void testCompareMd5ResultString2() throws IOException {
    // Arrange, Act and Assert
    assertEquals("", MD5Util.compareMd5ResultString(null));
  }

  @Test
  public void testGetClientMd5Map() {
    // Arrange
    Map<String, String> clientMd5Map = MD5Util.getClientMd5Map("");

    // Act
    Map<String, String> actualClientMd5Map = MD5Util.getClientMd5Map("UTF-8");

    // Assert
    assertEquals(0, clientMd5Map.size());
    assertEquals(0, actualClientMd5Map.size());
  }

  @Test
  public void testToString() throws IOException {
    // Arrange, Act and Assert
    assertEquals("foo", MD5Util.toString(new StringReader("foo")));
  }

  @Test
  public void testToString2() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 88);

    // Act and Assert
    assertEquals("XXXXXXXXXXXXXXXXXXXXXXXX", MD5Util.toString(new ByteArrayInputStream(byteArray), "UTF-8"));
  }
}

