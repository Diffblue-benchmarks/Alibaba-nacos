package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class ListViewDiffblueTest {
  @Test
  public void testSetCount() {
    // Arrange
    ListView<Object> listView = new ListView<Object>();

    // Act
    listView.setCount(3);

    // Assert
    assertEquals(3, listView.getCount());
  }

  @Test
  public void testSetData() {
    // Arrange
    ListView<Object> listView = new ListView<Object>();
    ArrayList<Object> objectList = new ArrayList<Object>();
    objectList.add("foo");

    // Act
    listView.setData(objectList);

    // Assert
    assertEquals("{\"count\":0,\"data\":[\"foo\"]}", listView.toString());
  }
}

