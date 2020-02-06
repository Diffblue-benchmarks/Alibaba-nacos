package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.List;
import org.junit.Test;

public class ZipUtilsDiffblueTest {
  @Test
  public void setItemNameTest() {
    // Arrange
    ZipUtils.ZipItem zipItem = new ZipUtils.ZipItem("aaaaa", "aaaaa");

    // Act
    zipItem.setItemName("aaaaa");

    // Assert
    assertEquals("aaaaa", zipItem.getItemName());
  }

  @Test
  public void getItemNameTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new ZipUtils.ZipItem("aaaaa", "aaaaa")).getItemName());
  }

  @Test
  public void setItemDataTest() {
    // Arrange
    ZipUtils.ZipItem zipItem = new ZipUtils.ZipItem("aaaaa", "aaaaa");

    // Act
    zipItem.setItemData("aaaaa");

    // Assert
    assertEquals("aaaaa", zipItem.getItemData());
  }

  @Test
  public void getItemDataTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new ZipUtils.ZipItem("aaaaa", "aaaaa")).getItemData());
  }

  @Test
  public void constructorTest2() {
    // Arrange and Act
    ZipUtils.ZipItem actualZipItem = new ZipUtils.ZipItem("aaaaa", "aaaaa");

    // Assert
    String actualItemData = actualZipItem.getItemData();
    assertEquals("aaaaa", actualItemData);
    assertEquals("aaaaa", actualZipItem.getItemName());
  }

  @Test
  public void constructorTest() {
    // Arrange
    ZipUtils.ZipItem zipItem = new ZipUtils.ZipItem("aaaaa", "aaaaa");

    // Act
    ZipUtils.UnZipResult actualUnZipResult = new ZipUtils.UnZipResult(null, zipItem);

    // Assert
    List<ZipUtils.ZipItem> actualZipItemList = actualUnZipResult.getZipItemList();
    assertNull(actualZipItemList);
    assertSame(zipItem, actualUnZipResult.getMetaDataItem());
  }

  @Test
  public void setMetaDataItemTest() {
    // Arrange
    ZipUtils.UnZipResult unZipResult = new ZipUtils.UnZipResult(null, new ZipUtils.ZipItem("aaaaa", "aaaaa"));
    ZipUtils.ZipItem zipItem = new ZipUtils.ZipItem("aaaaa", "aaaaa");

    // Act
    unZipResult.setMetaDataItem(zipItem);

    // Assert
    assertSame(zipItem, unZipResult.getMetaDataItem());
  }

  @Test
  public void getMetaDataItemTest() {
    // Arrange
    ZipUtils.ZipItem zipItem = new ZipUtils.ZipItem("aaaaa", "aaaaa");

    // Act and Assert
    assertSame(zipItem, (new ZipUtils.UnZipResult(null, zipItem)).getMetaDataItem());
  }

  @Test
  public void setZipItemListTest() {
    // Arrange
    ZipUtils.UnZipResult unZipResult = new ZipUtils.UnZipResult(null, new ZipUtils.ZipItem("aaaaa", "aaaaa"));

    // Act
    unZipResult.setZipItemList(null);

    // Assert
    assertNull(unZipResult.getZipItemList());
  }

  @Test
  public void getZipItemListTest() {
    // Arrange, Act and Assert
    assertNull((new ZipUtils.UnZipResult(null, new ZipUtils.ZipItem("aaaaa", "aaaaa"))).getZipItemList());
  }

  @Test
  public void unzipTest() {
    // Arrange, Act and Assert
    assertNull(ZipUtils.unzip(new byte[24]).getMetaDataItem());
  }
}

