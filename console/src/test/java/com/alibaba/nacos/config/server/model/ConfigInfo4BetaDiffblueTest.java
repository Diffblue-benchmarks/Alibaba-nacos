package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfo4BetaDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ConfigInfo4Beta actualConfigInfo4Beta = new ConfigInfo4Beta("123", "group", "appName", "content", "betaIps");

    // Assert
    assertEquals("123", actualConfigInfo4Beta.getDataId());
    assertEquals("betaIps", actualConfigInfo4Beta.getBetaIps());
    assertEquals("appName", actualConfigInfo4Beta.getAppName());
    assertEquals("group", actualConfigInfo4Beta.getGroup());
    assertEquals("9a0364b9e99bb480dd25e1f0284c8555", actualConfigInfo4Beta.getMd5());
    assertEquals("content", actualConfigInfo4Beta.getContent());
  }

  @Test
  public void testConstructor2() {
    // Arrange and Act
    ConfigInfo4Beta actualConfigInfo4Beta = new ConfigInfo4Beta();

    // Assert
    assertNull(actualConfigInfo4Beta.getDataId());
    assertNull(actualConfigInfo4Beta.getBetaIps());
    assertNull(actualConfigInfo4Beta.getAppName());
    assertNull(actualConfigInfo4Beta.getTenant());
    assertNull(actualConfigInfo4Beta.getGroup());
    assertNull(actualConfigInfo4Beta.getMd5());
    assertEquals("ConfigInfo{id=0, dataId='null', group='null'," + " tenant='null', appName='null', content='null',"
        + " md5='null'}", actualConfigInfo4Beta.toString());
    assertNull(actualConfigInfo4Beta.getContent());
    assertEquals(0L, actualConfigInfo4Beta.getId());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfo4Beta()).equals("obj"));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfo4Beta()).hashCode());
  }
}

