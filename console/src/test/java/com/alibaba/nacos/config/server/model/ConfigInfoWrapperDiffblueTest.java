package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfoWrapperDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    ConfigInfoWrapper actualConfigInfoWrapper = new ConfigInfoWrapper();

    // Assert
    assertNull(actualConfigInfoWrapper.getDataId());
    assertNull(actualConfigInfoWrapper.getAppName());
    assertEquals(0L, actualConfigInfoWrapper.getLastModified());
    assertNull(actualConfigInfoWrapper.getTenant());
    assertNull(actualConfigInfoWrapper.getGroup());
    assertNull(actualConfigInfoWrapper.getMd5());
    assertEquals("ConfigInfo{id=0, dataId='null', group='null'," + " tenant='null', appName='null', content='null',"
        + " md5='null'}", actualConfigInfoWrapper.toString());
    assertNull(actualConfigInfoWrapper.getContent());
    assertEquals(0L, actualConfigInfoWrapper.getId());
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfoWrapper()).equals("obj"));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfoWrapper()).hashCode());
  }

  @Test
  public void testSetLastModified() {
    // Arrange
    ConfigInfoWrapper configInfoWrapper = new ConfigInfoWrapper();

    // Act
    configInfoWrapper.setLastModified(1L);

    // Assert
    assertEquals(1L, configInfoWrapper.getLastModified());
  }
}

