package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class InstancesDiffblueTest {
  @Test
  public void getChecksumTest() {
    // Arrange
    Instances instances = new Instances();

    // Act and Assert
    assertEquals("d41d8cd98f00b204e9800998ecf8427e", instances.getChecksum());
    assertEquals("d41d8cd98f00b204e9800998ecf8427e", instances.getChecksum());
  }

  @Test
  public void setInstanceListTest() {
    // Arrange
    Instances instances = new Instances();

    // Act
    instances.setInstanceList(null);

    // Assert
    assertNull(instances.getInstanceList());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("d41d8cd98f00b204e9800998ecf8427e", (new Instances()).getChecksum());
  }

  @Test
  public void getInstanceListTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Instances()).getInstanceList().size());
  }

  @Test
  public void convertMap2StringTest() {
    // Arrange, Act and Assert
    assertEquals("", (new Instances()).convertMap2String(null));
  }

  @Test
  public void toStringTest() {
    // Arrange
    Instances instances = new Instances();

    // Act and Assert
    assertEquals("{\"instanceList\":[]}", instances.toString());
    assertEquals("{\"instanceList\":[]}", instances.toString());
  }
}

