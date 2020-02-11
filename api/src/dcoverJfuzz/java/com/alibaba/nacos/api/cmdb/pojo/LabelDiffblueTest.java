package com.alibaba.nacos.api.cmdb.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.Set;
import org.junit.Test;

public class LabelDiffblueTest {
  @Test(timeout=10000)
  public void setDescriptionTest() {
    // Arrange
    Label label = new Label();

    // Act
    label.setDescription("description");

    // Assert
    assertEquals("description", label.getDescription());
  }

  @Test(timeout=10000)
  public void getDescriptionTest() {
    // Arrange, Act and Assert
    assertNull((new Label()).getDescription());
  }

  @Test(timeout=10000)
  public void setNameTest() {
    // Arrange
    Label label = new Label();

    // Act
    label.setName("name");

    // Assert
    assertEquals("name", label.getName());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void getNameTest() {
    // Arrange, Act and Assert
    assertNull((new Label()).getName());
  }

  @Test(timeout=10000)
  public void setValuesTest() {
    // Arrange
    Label label = new Label();

    // Act
    label.setValues(null);

    // Assert
    assertNull(label.getValues());
  }

  @Test(timeout=10000)
  public void getValuesTest() {
    // Arrange, Act and Assert
    assertNull((new Label()).getValues());
  }
}

