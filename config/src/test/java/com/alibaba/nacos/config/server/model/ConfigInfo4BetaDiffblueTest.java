package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfo4BetaDiffblueTest {
  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfo4Beta()).equals("aaaaa"));
  }

  @Test
  public void setBetaIpsTest() {
    // Arrange
    ConfigInfo4Beta configInfo4Beta = new ConfigInfo4Beta();

    // Act
    configInfo4Beta.setBetaIps("aaaaa");

    // Assert
    assertEquals("aaaaa", configInfo4Beta.getBetaIps());
  }

  @Test
  public void getBetaIpsTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfo4Beta()).getBetaIps());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfo4Beta()).hashCode());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    ConfigInfo4Beta actualConfigInfo4Beta = new ConfigInfo4Beta();

    // Assert
    String actualDataId = actualConfigInfo4Beta.getDataId();
    long actualId = actualConfigInfo4Beta.getId();
    String actualContent = actualConfigInfo4Beta.getContent();
    String actualToStringResult = actualConfigInfo4Beta.toString();
    String actualType = actualConfigInfo4Beta.getType();
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
    assertNull(actualType);
    assertEquals("ConfigInfo{id=0, dataId='null', group='null'," + " tenant='null', appName='null', content='null',"
        + " md5='null'}", actualToStringResult);
    assertNull(actualContent);
    assertEquals(0L, actualId);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ConfigInfo4Beta actualConfigInfo4Beta = new ConfigInfo4Beta("aaaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa");

    // Assert
    String actualDataId = actualConfigInfo4Beta.getDataId();
    String actualContent = actualConfigInfo4Beta.getContent();
    String actualMd5 = actualConfigInfo4Beta.getMd5();
    String actualGroup = actualConfigInfo4Beta.getGroup();
    String actualAppName = actualConfigInfo4Beta.getAppName();
    assertEquals("aaaaa", actualDataId);
    assertEquals("aaaaa", actualConfigInfo4Beta.getBetaIps());
    assertEquals("aaaaa", actualAppName);
    assertEquals("aaaaa", actualGroup);
    assertEquals("594f803b380a41396ed63dca39503542", actualMd5);
    assertEquals("aaaaa", actualContent);
  }
}

