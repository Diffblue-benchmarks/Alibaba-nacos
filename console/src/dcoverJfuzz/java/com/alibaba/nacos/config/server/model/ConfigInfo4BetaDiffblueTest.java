package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfo4BetaDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfo4Beta()).equals("foo"));
  }

  @Test(timeout=10000)
  public void setBetaIpsTest() {
    // Arrange
    ConfigInfo4Beta configInfo4Beta = new ConfigInfo4Beta();

    // Act
    configInfo4Beta.setBetaIps("foo");

    // Assert
    assertEquals("foo", configInfo4Beta.getBetaIps());
  }

  @Test(timeout=10000)
  public void getBetaIpsTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfo4Beta()).getBetaIps());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfo4Beta()).hashCode());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    ConfigInfo4Beta actualConfigInfo4Beta = new ConfigInfo4Beta();

    // Assert
    String actualDataId = actualConfigInfo4Beta.getDataId();
    long actualId = actualConfigInfo4Beta.getId();
    String actualContent = actualConfigInfo4Beta.getContent();
    String actualToStringResult = actualConfigInfo4Beta.toString();
    String actualMd5 = actualConfigInfo4Beta.getMd5();
    String actualGroup = actualConfigInfo4Beta.getGroup();
    String actualTenant = actualConfigInfo4Beta.getTenant();
    String actualAppName = actualConfigInfo4Beta.getAppName();
    assertNull(actualDataId);
    assertNull(actualConfigInfo4Beta.getBetaIps());
    assertNull(actualAppName);
    assertNull(actualTenant);
    assertNull(actualGroup);
    assertNull(actualMd5);
    assertEquals("ConfigInfo{id=0, dataId='null', group='null'," + " tenant='null', appName='null', content='null',"
        + " md5='null'}", actualToStringResult);
    assertNull(actualContent);
    assertEquals(0L, actualId);
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ConfigInfo4Beta actualConfigInfo4Beta = new ConfigInfo4Beta("123", "foo", "name", "foo", "foo");

    // Assert
    String actualDataId = actualConfigInfo4Beta.getDataId();
    String actualContent = actualConfigInfo4Beta.getContent();
    String actualMd5 = actualConfigInfo4Beta.getMd5();
    String actualGroup = actualConfigInfo4Beta.getGroup();
    String actualAppName = actualConfigInfo4Beta.getAppName();
    assertEquals("123", actualDataId);
    assertEquals("foo", actualConfigInfo4Beta.getBetaIps());
    assertEquals("name", actualAppName);
    assertEquals("foo", actualGroup);
    assertEquals("acbd18db4cc2f85cedef654fccc4a4d8", actualMd5);
    assertEquals("foo", actualContent);
  }
}

