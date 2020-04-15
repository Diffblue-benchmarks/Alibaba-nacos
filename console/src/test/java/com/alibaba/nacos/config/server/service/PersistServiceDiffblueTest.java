package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class PersistServiceDiffblueTest {
  @Test
  public void testConfigInfoBetaWrapperConstructor() {
    // Arrange and Act
    PersistService.ConfigInfoBetaWrapper actualConfigInfoBetaWrapper = new PersistService.ConfigInfoBetaWrapper();

    // Assert
    assertNull(actualConfigInfoBetaWrapper.getDataId());
    assertNull(actualConfigInfoBetaWrapper.getBetaIps());
    assertNull(actualConfigInfoBetaWrapper.getAppName());
    assertEquals(0L, actualConfigInfoBetaWrapper.getLastModified());
    assertNull(actualConfigInfoBetaWrapper.getTenant());
    assertNull(actualConfigInfoBetaWrapper.getGroup());
    assertNull(actualConfigInfoBetaWrapper.getMd5());
    assertEquals("ConfigInfo{id=0, dataId='null', group='null'," + " tenant='null', appName='null', content='null',"
        + " md5='null'}", actualConfigInfoBetaWrapper.toString());
    assertNull(actualConfigInfoBetaWrapper.getContent());
    assertEquals(0L, actualConfigInfoBetaWrapper.getId());
  }

  @Test
  public void testConfigInfoBetaWrapperEquals() {
    // Arrange, Act and Assert
    assertFalse((new PersistService.ConfigInfoBetaWrapper()).equals("obj"));
  }

  @Test
  public void testConfigInfoBetaWrapperHashCode() {
    // Arrange, Act and Assert
    assertEquals(923521, (new PersistService.ConfigInfoBetaWrapper()).hashCode());
  }

  @Test
  public void testConfigInfoBetaWrapperSetLastModified() {
    // Arrange
    PersistService.ConfigInfoBetaWrapper configInfoBetaWrapper = new PersistService.ConfigInfoBetaWrapper();

    // Act
    configInfoBetaWrapper.setLastModified(1L);

    // Assert
    assertEquals(1L, configInfoBetaWrapper.getLastModified());
  }

  @Test
  public void testConfigInfoTagWrapperConstructor() {
    // Arrange and Act
    PersistService.ConfigInfoTagWrapper actualConfigInfoTagWrapper = new PersistService.ConfigInfoTagWrapper();

    // Assert
    assertNull(actualConfigInfoTagWrapper.getDataId());
    assertNull(actualConfigInfoTagWrapper.getTag());
    assertNull(actualConfigInfoTagWrapper.getAppName());
    assertEquals(0L, actualConfigInfoTagWrapper.getLastModified());
    assertNull(actualConfigInfoTagWrapper.getTenant());
    assertNull(actualConfigInfoTagWrapper.getGroup());
    assertNull(actualConfigInfoTagWrapper.getMd5());
    assertEquals("ConfigInfo{id=0, dataId='null', group='null'," + " tenant='null', appName='null', content='null',"
        + " md5='null'}", actualConfigInfoTagWrapper.toString());
    assertNull(actualConfigInfoTagWrapper.getContent());
    assertEquals(0L, actualConfigInfoTagWrapper.getId());
  }

  @Test
  public void testConfigInfoTagWrapperEquals() {
    // Arrange, Act and Assert
    assertFalse((new PersistService.ConfigInfoTagWrapper()).equals("obj"));
  }

  @Test
  public void testConfigInfoTagWrapperHashCode() {
    // Arrange, Act and Assert
    assertEquals(923521, (new PersistService.ConfigInfoTagWrapper()).hashCode());
  }

  @Test
  public void testConfigInfoTagWrapperSetLastModified() {
    // Arrange
    PersistService.ConfigInfoTagWrapper configInfoTagWrapper = new PersistService.ConfigInfoTagWrapper();

    // Act
    configInfoTagWrapper.setLastModified(1L);

    // Assert
    assertEquals(1L, configInfoTagWrapper.getLastModified());
  }

  @Test
  public void testConfigInfoWrapperConstructor() {
    // Arrange and Act
    PersistService.ConfigInfoWrapper actualConfigInfoWrapper = new PersistService.ConfigInfoWrapper();

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
  public void testConfigInfoWrapperEquals() {
    // Arrange, Act and Assert
    assertFalse((new PersistService.ConfigInfoWrapper()).equals("obj"));
  }

  @Test
  public void testConfigInfoWrapperHashCode() {
    // Arrange, Act and Assert
    assertEquals(923521, (new PersistService.ConfigInfoWrapper()).hashCode());
  }

  @Test
  public void testConfigInfoWrapperSetLastModified() {
    // Arrange
    PersistService.ConfigInfoWrapper configInfoWrapper = new PersistService.ConfigInfoWrapper();

    // Act
    configInfoWrapper.setLastModified(1L);

    // Assert
    assertEquals(1L, configInfoWrapper.getLastModified());
  }
}

