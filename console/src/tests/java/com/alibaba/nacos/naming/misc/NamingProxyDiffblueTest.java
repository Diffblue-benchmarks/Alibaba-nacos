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

  @Test(timeout=10000)
  public void toUrlTest() {
    // Arrange, Act and Assert
    assertEquals("", (new NamingProxy.Request()).toUrl());
  }

  @Test(timeout=10000)
  public void appendParamTest() {
    // Arrange
    NamingProxy.Request request = new NamingProxy.Request();

    // Act and Assert
    assertSame(request, request.appendParam("foo", "value"));
  }

  @Test(timeout=10000)
  public void syncDataTest() throws Exception {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertFalse(NamingProxy.syncData(byteArray, "foo"));
  }

  @Test(timeout=10000)
  public void getAllDataTest() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);
    NamingProxy.getAllData("foo");
  }

  @Test(timeout=10000)
  public void getDataTest() throws Exception {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);
    NamingProxy.getData(null, "foo");
  }

  @Test(timeout=10000)
  public void reqAPITest2() throws Exception {
    // Arrange
    String actualReqAPIResult = NamingProxy.reqAPI("foo", null, "foo", true);
    String actualReqAPIResult1 = NamingProxy.reqAPI("foo", null, "Nacos-Server:1.0.1", true);

    // Act and Assert
    assertEquals("", actualReqAPIResult);
    assertEquals("", actualReqAPIResult1);
    assertEquals("", NamingProxy.reqAPI("foo", null, "foo", false));
  }

  @Test(timeout=10000)
  public void reqAPITest() throws Exception {
    // Arrange, Act and Assert
    assertEquals("", NamingProxy.reqAPI("foo", null, "foo"));
  }
}

