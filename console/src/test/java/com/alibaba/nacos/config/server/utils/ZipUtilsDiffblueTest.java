package com.alibaba.nacos.config.server.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

public class ZipUtilsDiffblueTest {
  @Test
  public void testUnZipResultConstructor() {
    // Arrange
    ZipUtils.ZipItem param0 = new ZipUtils.ZipItem("itemName", "itemData");
    ArrayList<ZipUtils.ZipItem> zipItemList = new ArrayList<ZipUtils.ZipItem>();
    zipItemList.add(param0);
    ZipUtils.ZipItem zipItem = new ZipUtils.ZipItem("itemName", "itemName");

    // Act
    ZipUtils.UnZipResult actualUnZipResult = new ZipUtils.UnZipResult(zipItemList, zipItem);

    // Assert
    assertSame(zipItemList, actualUnZipResult.getZipItemList());
    assertSame(zipItem, actualUnZipResult.getMetaDataItem());
  }

  @Test
  public void testUnZipResultSetMetaDataItem() {
    // Arrange
    ZipUtils.ZipItem zipItem = new ZipUtils.ZipItem("itemName", "itemData");
    ArrayList<ZipUtils.ZipItem> zipItemList = new ArrayList<ZipUtils.ZipItem>();
    zipItemList.add(zipItem);
    ZipUtils.UnZipResult unZipResult = new ZipUtils.UnZipResult(zipItemList,
        new ZipUtils.ZipItem("itemName", "itemName"));

    // Act
    unZipResult.setMetaDataItem(zipItem);

    // Assert
    assertSame(zipItem, unZipResult.getMetaDataItem());
  }

  @Test
  public void testUnZipResultSetZipItemList() {
    // Arrange
    ZipUtils.ZipItem param0 = new ZipUtils.ZipItem("itemName", "itemData");
    ArrayList<ZipUtils.ZipItem> zipItemList = new ArrayList<ZipUtils.ZipItem>();
    zipItemList.add(param0);
    ZipUtils.ZipItem zipItem = new ZipUtils.ZipItem("itemName", "itemName");
    ZipUtils.UnZipResult unZipResult = new ZipUtils.UnZipResult(zipItemList, zipItem);
    ArrayList<ZipUtils.ZipItem> zipItemList1 = new ArrayList<ZipUtils.ZipItem>();
    zipItemList1.add(zipItem);

    // Act
    unZipResult.setZipItemList(zipItemList1);

    // Assert
    assertSame(zipItemList1, unZipResult.getZipItemList());
  }

  @Test
  public void testUnzip() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 88);

    // Act and Assert
    assertNull(ZipUtils.unzip(byteArray).getMetaDataItem());
  }

  @Test
  public void testZip() {
    // Arrange
    ZipUtils.ZipItem param0 = new ZipUtils.ZipItem("itemName", "itemData");
    ArrayList<ZipUtils.ZipItem> zipItemList = new ArrayList<ZipUtils.ZipItem>();
    zipItemList.add(param0);

    // Act
    byte[] actualZipResult = ZipUtils.zip(zipItemList);

    // Assert
    assertEquals(140, actualZipResult.length);
    assertEquals((byte) 80, actualZipResult[0]);
    assertEquals((byte) 75, actualZipResult[1]);
    assertEquals((byte) 3, actualZipResult[2]);
    assertEquals((byte) 4, actualZipResult[3]);
    assertEquals((byte) 20, actualZipResult[4]);
    assertEquals((byte) 0, actualZipResult[5]);
    assertEquals((byte) 64, actualZipResult[134]);
    assertEquals((byte) 0, actualZipResult[135]);
    assertEquals((byte) 0, actualZipResult[136]);
    assertEquals((byte) 0, actualZipResult[137]);
    assertEquals((byte) 0, actualZipResult[138]);
    assertEquals((byte) 0, actualZipResult[139]);
  }

  @Test
  public void testZipItemConstructor() {
    // Arrange and Act
    ZipUtils.ZipItem actualZipItem = new ZipUtils.ZipItem("itemName", "itemData");

    // Assert
    assertEquals("itemData", actualZipItem.getItemData());
    assertEquals("itemName", actualZipItem.getItemName());
  }

  @Test
  public void testZipItemSetItemData() {
    // Arrange
    ZipUtils.ZipItem zipItem = new ZipUtils.ZipItem("itemName", "itemData");

    // Act
    zipItem.setItemData("itemData");

    // Assert
    assertEquals("itemData", zipItem.getItemData());
  }

  @Test
  public void testZipItemSetItemName() {
    // Arrange
    ZipUtils.ZipItem zipItem = new ZipUtils.ZipItem("itemName", "itemData");

    // Act
    zipItem.setItemName("itemName");

    // Assert
    assertEquals("itemName", zipItem.getItemName());
  }
}

