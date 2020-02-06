package com.alibaba.nacos.api.cmdb.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.Set;
import org.junit.Test;

public class LabelDiffblueTest {
  @Test
  public void setDescriptionTest() {
    // Arrange
    Label label = new Label();

    // Act
    label.setDescription("aaaaa");

    // Assert
    assertEquals("aaaaa", label.getDescription());
  }

  @Test
  public void getDescriptionTest() {
    // Arrange, Act and Assert
    assertNull((new Label()).getDescription());
  }

  @Test
  public void setNameTest() {
    // Arrange
    Label label = new Label();

    // Act
    label.setName("aaaaa");

    // Assert
    assertEquals("aaaaa", label.getName());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Label actualLabel = new Label();

    // Assert
    Set<String> actualValues = actualLabel.getValues();
    String actualName = actualLabel.getName();
    assertNull(actualValues);
    assertNull(actualLabel.getDescription());
    assertNull(actualName);
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertNull((new Label()).getName());
  }

  @Test
  public void setValuesTest() {
    // Arrange
    Label label = new Label();

    // Act
    label.setValues(null);

    // Assert
    assertNull(label.getValues());
  }

  @Test
  public void getValuesTest() {
    // Arrange, Act and Assert
    assertNull((new Label()).getValues());
  }
}

