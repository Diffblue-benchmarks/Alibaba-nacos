package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class InstancesDiffblueTest {
  @Test(timeout=10000)
  public void getChecksumTest() {
    // Arrange
    Instances instances = new Instances();

    // Act and Assert
    assertEquals("d41d8cd98f00b204e9800998ecf8427e", instances.getChecksum());
    String actualCachedChecksum = instances.getCachedChecksum();
    assertEquals("d41d8cd98f00b204e9800998ecf8427e", instances.getChecksum());
    assertEquals("d41d8cd98f00b204e9800998ecf8427e", actualCachedChecksum);
  }

  @Test(timeout=10000)
  public void getCachedChecksumTest() {
    // Arrange, Act and Assert
    assertNull((new Instances()).getCachedChecksum());
  }

  @Test(timeout=10000)
  public void setInstanceListTest() {
    // Arrange
    Instances instances = new Instances();

    // Act
    instances.setInstanceList(null);

    // Assert
    assertNull(instances.getInstanceList());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("d41d8cd98f00b204e9800998ecf8427e", (new Instances()).getChecksum());
  }

  @Test(timeout=10000)
  public void getInstanceListTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new Instances()).getInstanceList().size());
  }

  @Test(timeout=10000)
  public void convertMap2StringTest() {
    // Arrange, Act and Assert
    assertEquals("", (new Instances()).convertMap2String(null));
  }

  @Test(timeout=10000)
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("{\"instanceList\":[]}", (new Instances()).toString());
  }
}

