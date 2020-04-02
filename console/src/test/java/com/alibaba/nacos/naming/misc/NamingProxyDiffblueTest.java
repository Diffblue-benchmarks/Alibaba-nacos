package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.Arrays;
import java.util.HashMap;
import org.junit.Test;

public class NamingProxyDiffblueTest {
  @Test
  public void testReqAPI() throws Exception {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("", NamingProxy.reqAPI("", stringStringMap, ""));
  }

  @Test
  public void testReqAPI2() throws Exception {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("", NamingProxy.reqAPI("Nacos-Server:1.0.1", stringStringMap, "Nacos-Server:1.0.1"));
  }

  @Test
  public void testReqAPI3() throws Exception {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("", NamingProxy.reqAPI("", stringStringMap, "", true));
  }

  @Test
  public void testReqAPI4() throws Exception {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("", NamingProxy.reqAPI("Nacos-Server:1.0.1", stringStringMap, "Nacos-Server:1.0.1", true));
  }

  @Test
  public void testReqAPI5() throws Exception {
    // Arrange
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("", NamingProxy.reqAPI("", stringStringMap, "", false));
  }

  @Test
  public void testSyncData() throws Exception {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 88);

    // Act and Assert
    assertFalse(NamingProxy.syncData(byteArray, ""));
  }
}

