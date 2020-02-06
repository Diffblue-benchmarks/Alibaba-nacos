package com.alibaba.nacos.config.server.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ConfigInfoBaseDiffblueTest {
  @Test
  public void setGroupTest() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();

    // Act
    configInfoBase.setGroup("aaaaa");

    // Assert
    assertEquals("aaaaa", configInfoBase.getGroup());
  }

  @Test
  public void compareToTest() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();

    // Act and Assert
    assertEquals(0, configInfoBase.compareTo(new ConfigInfoBase()));
  }

  @Test
  public void setContentTest() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();

    // Act
    configInfoBase.setContent("aaaaa");

    // Assert
    assertEquals("aaaaa", configInfoBase.getContent());
  }

  @Test
  public void getMd5Test() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoBase()).getMd5());
  }

  @Test
  public void getContentTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoBase()).getContent());
  }

  @Test
  public void getIdTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ConfigInfoBase()).getId());
  }

  @Test
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoBase()).getDataId());
  }

  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new ConfigInfoBase()).equals("aaaaa"));
  }

  @Test
  public void setDataIdTest() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();

    // Act
    configInfoBase.setDataId("aaaaa");

    // Assert
    assertEquals("aaaaa", configInfoBase.getDataId());
  }

  @Test
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertNull((new ConfigInfoBase()).getGroup());
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(923521, (new ConfigInfoBase()).hashCode());
  }

  @Test
  public void setIdTest() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();

    // Act
    configInfoBase.setId(1L);

    // Assert
    assertEquals(1L, configInfoBase.getId());
  }

  @Test
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

  @Test
  public void setMd5Test() {
    // Arrange
    ConfigInfoBase configInfoBase = new ConfigInfoBase();

    // Act
    configInfoBase.setMd5("aaaaa");

    // Assert
    assertEquals("aaaaa", configInfoBase.getMd5());
  }

  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("ConfigInfoBase{id=0, dataId='null', group='null'," + " content='null', md5='null'}",
        (new ConfigInfoBase()).toString());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ConfigInfoBase actualConfigInfoBase = new ConfigInfoBase("aaaaa", "aaaaa", "aaaaa");

    // Assert
    String actualDataId = actualConfigInfoBase.getDataId();
    String actualContent = actualConfigInfoBase.getContent();
    String actualMd5 = actualConfigInfoBase.getMd5();
    assertEquals("aaaaa", actualDataId);
    assertEquals("aaaaa", actualConfigInfoBase.getGroup());
    assertEquals("594f803b380a41396ed63dca39503542", actualMd5);
    assertEquals("aaaaa", actualContent);
  }
}

