package com.alibaba.nacos.naming.core;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import org.junit.Test;

public class InstancesDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("d41d8cd98f00b204e9800998ecf8427e", (new Instances()).getChecksum());
  }

  @Test
  public void testConvertMap2String() {
    // Arrange
    Instances instances = new Instances();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act and Assert
    assertEquals("foo:foo,", instances.convertMap2String(stringStringMap));
  }

  @Test
  public void testConvertMap2String2() {
    // Arrange, Act and Assert
    assertEquals("", (new Instances()).convertMap2String(null));
  }

  @Test
  public void testGetChecksum() {
    // Arrange
    Instances instances = new Instances();

    // Act and Assert
    assertEquals("d41d8cd98f00b204e9800998ecf8427e", instances.getChecksum());
    assertEquals("d41d8cd98f00b204e9800998ecf8427e", instances.getChecksum());
    assertEquals("d41d8cd98f00b204e9800998ecf8427e", instances.getCachedChecksum());
  }
}

