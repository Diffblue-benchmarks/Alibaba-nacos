package com.alibaba.nacos.naming.misc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import java.io.IOException;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NamingProxyDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void toUrlTest() {
    // Arrange, Act and Assert
    assertEquals("", (new NamingProxy.Request()).toUrl());
  }

  @Test
  public void appendParamTest() {
    // Arrange
    NamingProxy.Request request = new NamingProxy.Request();

    // Act and Assert
    assertSame(request, request.appendParam("foo", "value"));
  }

  @Test
  public void syncDataTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertFalse(NamingProxy.syncData(byteArray, "foo"));
  }

  @Test
  public void getAllDataTest() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);
    NamingProxy.getAllData("foo");
  }

  @Test
  public void getDataTest() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);
    NamingProxy.getData(null, "foo");
  }

  @Test
  public void reqAPITest2() throws Exception {
    // Arrange
    String actualReqAPIResult = NamingProxy.reqAPI("foo", null, "foo", true);
    String actualReqAPIResult1 = NamingProxy.reqAPI("foo", null, ":", true);

    // Act and Assert
    assertEquals("", actualReqAPIResult);
    assertEquals("", actualReqAPIResult1);
    assertEquals("", NamingProxy.reqAPI("foo", null, "foo", false));
  }

  @Test
  public void reqAPITest() throws Exception {
    // Arrange
    String actualReqAPIResult = NamingProxy.reqAPI("foo", null, "foo");

    // Act and Assert
    assertEquals("", actualReqAPIResult);
    assertEquals("", NamingProxy.reqAPI("foo", null, ":"));
  }

  @Test
  public void reqCommonTest() throws Exception {
    // Arrange
    String actualReqCommonResult = NamingProxy.reqCommon("foo", null, "foo", true);
    String actualReqCommonResult1 = NamingProxy.reqCommon("foo", null, ":", true);

    // Act and Assert
    assertEquals("", actualReqCommonResult);
    assertEquals("", actualReqCommonResult1);
    assertEquals("", NamingProxy.reqCommon("foo", null, "foo", false));
  }
}

