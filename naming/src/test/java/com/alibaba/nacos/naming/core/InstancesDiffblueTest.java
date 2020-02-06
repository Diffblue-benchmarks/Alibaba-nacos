package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class InstancesDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("d41d8cd98f00b204e9800998ecf8427e", (new Instances()).getChecksum());
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

