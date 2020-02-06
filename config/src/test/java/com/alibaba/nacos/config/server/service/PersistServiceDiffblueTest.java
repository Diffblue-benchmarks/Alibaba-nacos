package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PersistServiceDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void equalsTest3() {
    // Arrange, Act and Assert
    assertFalse((new PersistService.ConfigInfoWrapper()).equals("foo"));
  }

  @Test
  public void setLastModifiedTest3() {
    // Arrange
    PersistService.ConfigInfoWrapper configInfoWrapper = new PersistService.ConfigInfoWrapper();

    // Act
    configInfoWrapper.setLastModified(1L);

    // Assert
    assertEquals(1L, configInfoWrapper.getLastModified());
  }

  @Test
  public void getLastModifiedTest3() {
    // Arrange, Act and Assert
    assertEquals(0L, (new PersistService.ConfigInfoWrapper()).getLastModified());
  }

  @Test
  public void hashCodeTest3() {
    // Arrange, Act and Assert
    assertEquals(923521, (new PersistService.ConfigInfoWrapper()).hashCode());
  }

  @Test
  public void constructorTest4() {
    // Arrange and Act
    PersistService.ConfigInfoWrapper actualConfigInfoWrapper = new PersistService.ConfigInfoWrapper();

    // Assert
    String actualDataId = actualConfigInfoWrapper.getDataId();
    long actualId = actualConfigInfoWrapper.getId();
    String actualContent = actualConfigInfoWrapper.getContent();
    String actualToStringResult = actualConfigInfoWrapper.toString();
    String actualType = actualConfigInfoWrapper.getType();
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
    assertNull(actualType);
    assertEquals("ConfigInfo{id=0, dataId='null', group='null'," + " tenant='null', appName='null', content='null',"
        + " md5='null'}", actualToStringResult);
    assertNull(actualContent);
    assertEquals(0L, actualId);
  }

  @Test
  public void equalsTest2() {
    // Arrange, Act and Assert
    assertFalse((new PersistService.ConfigInfoTagWrapper()).equals("foo"));
  }

  @Test
  public void setLastModifiedTest2() {
    // Arrange
    PersistService.ConfigInfoTagWrapper configInfoTagWrapper = new PersistService.ConfigInfoTagWrapper();

    // Act
    configInfoTagWrapper.setLastModified(1L);

    // Assert
    assertEquals(1L, configInfoTagWrapper.getLastModified());
  }

  @Test
  public void getLastModifiedTest2() {
    // Arrange, Act and Assert
    assertEquals(0L, (new PersistService.ConfigInfoTagWrapper()).getLastModified());
  }

  @Test
  public void hashCodeTest2() {
    // Arrange, Act and Assert
    assertEquals(923521, (new PersistService.ConfigInfoTagWrapper()).hashCode());
  }

  @Test
  public void constructorTest3() {
    // Arrange and Act
    PersistService.ConfigInfoTagWrapper actualConfigInfoTagWrapper = new PersistService.ConfigInfoTagWrapper();

    // Assert
    String actualDataId = actualConfigInfoTagWrapper.getDataId();
    long actualId = actualConfigInfoTagWrapper.getId();
    String actualContent = actualConfigInfoTagWrapper.getContent();
    String actualToStringResult = actualConfigInfoTagWrapper.toString();
    String actualType = actualConfigInfoTagWrapper.getType();
    String actualMd5 = actualConfigInfoTagWrapper.getMd5();
    String actualGroup = actualConfigInfoTagWrapper.getGroup();
    String actualTenant = actualConfigInfoTagWrapper.getTenant();
    long actualLastModified = actualConfigInfoTagWrapper.getLastModified();
    String actualAppName = actualConfigInfoTagWrapper.getAppName();
    assertNull(actualDataId);
    assertNull(actualConfigInfoTagWrapper.getTag());
    assertNull(actualAppName);
    assertEquals(0L, actualLastModified);
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
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new PersistService.ConfigInfoBetaWrapper()).equals("foo"));
  }

  @Test
  public void setLastModifiedTest() {
    // Arrange
    PersistService.ConfigInfoBetaWrapper configInfoBetaWrapper = new PersistService.ConfigInfoBetaWrapper();

    // Act
    configInfoBetaWrapper.setLastModified(1L);

    // Assert
    assertEquals(1L, configInfoBetaWrapper.getLastModified());
  }

  @Test
  public void getLastModifiedTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new PersistService.ConfigInfoBetaWrapper()).getLastModified());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(923521, (new PersistService.ConfigInfoBetaWrapper()).hashCode());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    PersistService.ConfigInfoBetaWrapper actualConfigInfoBetaWrapper = new PersistService.ConfigInfoBetaWrapper();

    // Assert
    String actualDataId = actualConfigInfoBetaWrapper.getDataId();
    long actualId = actualConfigInfoBetaWrapper.getId();
    String actualContent = actualConfigInfoBetaWrapper.getContent();
    String actualToStringResult = actualConfigInfoBetaWrapper.toString();
    String actualType = actualConfigInfoBetaWrapper.getType();
    String actualMd5 = actualConfigInfoBetaWrapper.getMd5();
    String actualGroup = actualConfigInfoBetaWrapper.getGroup();
    String actualTenant = actualConfigInfoBetaWrapper.getTenant();
    long actualLastModified = actualConfigInfoBetaWrapper.getLastModified();
    String actualAppName = actualConfigInfoBetaWrapper.getAppName();
    assertNull(actualDataId);
    assertNull(actualConfigInfoBetaWrapper.getBetaIps());
    assertNull(actualAppName);
    assertEquals(0L, actualLastModified);
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
  public void findTenantByKpTest2() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    (new PersistService()).findTenantByKp("foo", "123");
  }

  @Test
  public void findSingleConfigInfoAggrTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    (new PersistService()).findSingleConfigInfoAggr("123", "foo", "foo", "123");
  }

  @Test
  public void isExistTableTest() {
    // Arrange, Act and Assert
    assertFalse((new PersistService()).isExistTable("name"));
  }

  @Test
  public void findConfigInfoAggrTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    (new PersistService()).findConfigInfoAggr("123", "foo", "foo");
  }

  @Test
  public void findConfigInfoByBatchTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PersistService()).findConfigInfoByBatch(null, "foo", "foo", 1).size());
  }

  @Test
  public void aggrConfigInfoCountInTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PersistService()).aggrConfigInfoCountIn("123", "foo", "foo", null));
  }

  @Test
  public void removeConfigInfoByIdsTest() {
    // Arrange, Act and Assert
    assertNull((new PersistService()).removeConfigInfoByIds(null, "foo", "foo"));
  }

  @Test
  public void findAllDataIdAndGroupTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    (new PersistService()).findAllDataIdAndGroup();
  }

  @Test
  public void findConfigMaxIdTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new PersistService()).findConfigMaxId());
  }

  @Test
  public void aggrConfigInfoCountNotInTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new PersistService()).aggrConfigInfoCountNotIn("123", "foo", "foo", null));
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    PersistService actualPersistService = new PersistService();

    // Assert
    assertNull(actualPersistService.tjt);
    assertNull(actualPersistService.jt);
  }

  @Test
  public void findConfigInfosByIdsTest() {
    // Arrange, Act and Assert
    thrown.expect(NumberFormatException.class);
    (new PersistService()).findConfigInfosByIds("foo");
  }

  @Test
  public void findTenantByKpTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    (new PersistService()).findTenantByKp("foo");
  }

  @Test
  public void findAllAggrGroupTest() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    (new PersistService()).findAllAggrGroup();
  }

  @Test
  public void setBasicDataSourceServiceTest() {
    // Arrange
    PersistService persistService = new PersistService();

    // Act
    persistService.setBasicDataSourceService(new BasicDataSourceServiceImpl());

    // Assert
    assertNull(persistService.getJdbcTemplate());
  }
}

