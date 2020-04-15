package com.alibaba.nacos.api.cmdb.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.HashSet;
import org.junit.Test;

public class LabelDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Label actualLabel = new Label();

    // Assert
    assertNull(actualLabel.getValues());
    assertNull(actualLabel.getDescription());
    assertNull(actualLabel.getName());
  }

  @Test
  public void testSetDescription() {
    // Arrange
    Label label = new Label();

    // Act
    label.setDescription("description");

    // Assert
    assertEquals("description", label.getDescription());
  }

  @Test
  public void testSetName() {
    // Arrange
    Label label = new Label();

    // Act
    label.setName("name");

    // Assert
    assertEquals("name", label.getName());
  }

  @Test
  public void testSetValues() {
    // Arrange
    Label label = new Label();
    HashSet<String> stringSet = new HashSet<String>();
    stringSet.add("foo");

    // Act
    label.setValues(stringSet);

    // Assert
    assertSame(stringSet, label.getValues());
  }
}

