package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfoWrapperDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfoWrapper()).equals("foo"));
  }

  @Test(timeout=10000)
  public void setLastModifiedTest() {
    // Arrange
    ConfigInfoWrapper configInfoWrapper = new ConfigInfoWrapper();

    // Act
    configInfoWrapper.setLastModified(1L);

    // Assert
    assertEquals(1L, configInfoWrapper.getLastModified());
  }

  @Test(timeout=10000)
  public void getLastModifiedTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConfigInfoWrapper()).getLastModified());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfoWrapper()).hashCode());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ConfigInfoWrapper actualConfigInfoWrapper = new ConfigInfoWrapper();

    // Assert
    String actualDataId = actualConfigInfoWrapper.getDataId();
    long actualId = actualConfigInfoWrapper.getId();
    String actualContent = actualConfigInfoWrapper.getContent();
    String actualToStringResult = actualConfigInfoWrapper.toString();
    String actualMd5 = actualConfigInfoWrapper.getMd5();
    String actualGroup = actualConfigInfoWrapper.getGroup();
    String actualTenant = actualConfigInfoWrapper.getTenant();
    long actualLastModified = actualConfigInfoWrapper.getLastModified();
    assertNull(actualDataId);
    assertNull(actualConfigInfoWrapper.getAppName());
    assertEquals(0L, actualLastModified);
    assertNull(actualTenant);
    assertNull(actualGroup);
    assertNull(actualMd5);
    assertEquals("ConfigInfo{id=0, dataId='null', group='null'," + " tenant='null', appName='null', content='null',"
        + " md5='null'}", actualToStringResult);
    assertNull(actualContent);
    assertEquals(0L, actualId);
  }
}

