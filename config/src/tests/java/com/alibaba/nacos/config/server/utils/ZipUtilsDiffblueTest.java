package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ZipUtilsDiffblueTest {
  @Test(timeout=10000)
  public void setItemNameTest() {
    // Arrange
    ZipUtils.ZipItem zipItem = new ZipUtils.ZipItem("name", "foo");

    // Act
    zipItem.setItemName("name");

    // Assert
    assertEquals("name", zipItem.getItemName());
  }

  @Test(timeout=10000)
  public void getItemNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new ZipUtils.ZipItem("name", "foo")).getItemName());
  }

  @Test(timeout=10000)
  public void setItemDataTest() {
    // Arrange
    ZipUtils.ZipItem zipItem = new ZipUtils.ZipItem("name", "foo");

    // Act
    zipItem.setItemData("foo");

    // Assert
    assertEquals("foo", zipItem.getItemData());
  }

  @Test(timeout=10000)
  public void getItemDataTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new ZipUtils.ZipItem("name", "foo")).getItemData());
  }

  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange and Act
    ZipUtils.ZipItem actualZipItem = new ZipUtils.ZipItem("name", "foo");

    // Assert
    String actualItemData = actualZipItem.getItemData();
    assertEquals("foo", actualItemData);
    assertEquals("name", actualZipItem.getItemName());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    ZipUtils.ZipItem zipItem = new ZipUtils.ZipItem("name", "foo");

    // Act
    ZipUtils.UnZipResult actualUnZipResult = new ZipUtils.UnZipResult(null, zipItem);

    // Assert
    List<ZipUtils.ZipItem> actualZipItemList = actualUnZipResult.getZipItemList();
    assertNull(actualZipItemList);
    assertSame(zipItem, actualUnZipResult.getMetaDataItem());
  }

  @Test(timeout=10000)
  public void setMetaDataItemTest() {
    // Arrange
    ZipUtils.UnZipResult unZipResult = new ZipUtils.UnZipResult(null, new ZipUtils.ZipItem("name", "foo"));
    ZipUtils.ZipItem zipItem = new ZipUtils.ZipItem("name", "name");

    // Act
    unZipResult.setMetaDataItem(zipItem);

    // Assert
    assertSame(zipItem, unZipResult.getMetaDataItem());
  }

  @Test(timeout=10000)
  public void getMetaDataItemTest() {
    // Arrange
    ZipUtils.ZipItem zipItem = new ZipUtils.ZipItem("name", "foo");

    // Act and Assert
    assertSame(zipItem, (new ZipUtils.UnZipResult(null, zipItem)).getMetaDataItem());
  }

  @Test(timeout=10000)
  public void setZipItemListTest() {
    // Arrange
    ZipUtils.UnZipResult unZipResult = new ZipUtils.UnZipResult(null, new ZipUtils.ZipItem("name", "foo"));

    // Act
    unZipResult.setZipItemList(null);

    // Assert
    assertNull(unZipResult.getZipItemList());
  }

  @Test(timeout=10000)
  public void getZipItemListTest() {
    // Arrange, Act and Assert
    assertNull((new ZipUtils.UnZipResult(null, new ZipUtils.ZipItem("name", "foo"))).getZipItemList());
  }

  @Test(timeout=10000)
  public void unzipTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertNull(ZipUtils.unzip(byteArray).getMetaDataItem());
  }
}

