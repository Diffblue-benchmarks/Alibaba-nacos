package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfoBaseDiffblueTest {
  @Test(timeout=10000)
  public void setGroupTest() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();

    // Act
    configInfoBase.setGroup("foo");

    // Assert
    assertEquals("foo", configInfoBase.getGroup());
  }

  @Test(timeout=10000)
  public void compareToTest() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();

    // Act and Assert
    assertEquals(0, configInfoBase.compareTo(new ConfigInfoBase()));
  }

  @Test(timeout=10000)
  public void setContentTest() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();

    // Act
    configInfoBase.setContent("foo");

    // Assert
    assertEquals("foo", configInfoBase.getContent());
  }

  @Test(timeout=10000)
  public void getMd5Test() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoBase()).getMd5());
  }

  @Test(timeout=10000)
  public void getContentTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoBase()).getContent());
  }

  @Test(timeout=10000)
  public void getIdTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConfigInfoBase()).getId());
  }

  @Test(timeout=10000)
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoBase()).getDataId());
  }

  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfoBase()).equals("foo"));
  }

  @Test(timeout=10000)
  public void setDataIdTest() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();

    // Act
    configInfoBase.setDataId("123");

    // Assert
    assertEquals("123", configInfoBase.getDataId());
  }

  @Test(timeout=10000)
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoBase()).getGroup());
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfoBase()).hashCode());
  }

  @Test(timeout=10000)
  public void setIdTest() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();

    // Act
    configInfoBase.setId(123L);

    // Assert
    assertEquals(123L, configInfoBase.getId());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    ConfigInfoBase actualConfigInfoBase = new ConfigInfoBase();

    // Assert
    String actualDataId = actualConfigInfoBase.getDataId();
    long actualId = actualConfigInfoBase.getId();
    String actualContent = actualConfigInfoBase.getContent();
    String actualToStringResult = actualConfigInfoBase.toString();
    String actualMd5 = actualConfigInfoBase.getMd5();
    assertNull(actualDataId);
    assertNull(actualConfigInfoBase.getGroup());
    assertNull(actualMd5);
    assertEquals("ConfigInfoBase{id=0, dataId='null', group='null'," + " content='null', md5='null'}",
        actualToStringResult);
    assertNull(actualContent);
    assertEquals(0L, actualId);
  }

  @Test(timeout=10000)
  public void setMd5Test() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();

    // Act
    configInfoBase.setMd5("foo");

    // Assert
    assertEquals("foo", configInfoBase.getMd5());
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ConfigInfoBase{id=0, dataId='null', group='null'," + " content='null', md5='null'}",
        (new ConfigInfoBase()).toString());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    ConfigInfoBase actualConfigInfoBase = new ConfigInfoBase("123", "foo", "foo");

    // Assert
    String actualDataId = actualConfigInfoBase.getDataId();
    String actualContent = actualConfigInfoBase.getContent();
    String actualMd5 = actualConfigInfoBase.getMd5();
    assertEquals("123", actualDataId);
    assertEquals("foo", actualConfigInfoBase.getGroup());
    assertEquals("acbd18db4cc2f85cedef654fccc4a4d8", actualMd5);
    assertEquals("foo", actualContent);
  }
}

