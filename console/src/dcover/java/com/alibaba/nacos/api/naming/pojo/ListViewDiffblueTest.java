package com.alibaba.nacos.api.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.List;
import org.junit.Test;

public class ListViewDiffblueTest {
  @Test(timeout=10000)
  public void setDataTest() {
    // Arrange
    ListView<Object> listView = new ListView<Object>();

    // Act
    listView.setData(null);

    // Assert
    assertNull(listView.getData());
  }

  @Test(timeout=10000)
  public void getCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ListView<Object>()).getCount());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange
    ListView<Object> listView = new ListView<Object>();

    // Act and Assert
    assertEquals("{\"count\":0}", listView.toString());
    assertEquals("{\"count\":0}", listView.toString());
  }

  @Test(timeout=10000)
  public void getDataTest() {
    // Arrange, Act and Assert
    assertNull((new ListView<Object>()).getData());
  }

  @Test(timeout=10000)
  public void setCountTest() {
    // Arrange
    ListView<Object> listView = new ListView<Object>();

    // Act
    listView.setCount(3);

    // Assert
    assertEquals(3, listView.getCount());
  }
}

