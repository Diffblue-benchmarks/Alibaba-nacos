package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.List;
import org.junit.Test;

public class ListViewDiffblueTest {
  @Test
  public void setDataTest() {
    // Arrange
    ListView<Object> listView = new ListView<Object>();

    // Act
    listView.setData(null);

    // Assert
    assertNull(listView.getData());
  }

  @Test
  public void getCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ListView<Object>()).getCount());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ListView<Object> actualListView = new ListView<Object>();

    // Assert
    List<Object> actualData = actualListView.getData();
    String actualToStringResult = actualListView.toString();
    assertNull(actualData);
    assertEquals(0, actualListView.getCount());
    assertEquals("{\"count\":0}", actualToStringResult);
  }

  @Test
  public void toStringTest() {
    // Arrange
    ListView<Object> listView = new ListView<Object>();

    // Act and Assert
    assertEquals("{\"count\":0}", listView.toString());
    assertEquals("{\"count\":0}", listView.toString());
  }

  @Test
  public void getDataTest() {
    // Arrange, Act and Assert
    assertNull((new ListView<Object>()).getData());
  }

  @Test
  public void setCountTest() {
    // Arrange
    ListView<Object> listView = new ListView<Object>();

    // Act
    listView.setCount(3);

    // Assert
    assertEquals(3, listView.getCount());
  }
}

