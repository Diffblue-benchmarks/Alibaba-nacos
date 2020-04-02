package com.alibaba.nacos.api.cmdb.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.HashMap;
import org.junit.Test;

public class EntityDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Entity actualEntity = new Entity();

    // Assert
    assertNull(actualEntity.getLabels());
    assertNull(actualEntity.getType());
    assertNull(actualEntity.getName());
  }

  @Test
  public void testSetLabels() {
    // Arrange
    Entity entity = new Entity();
    HashMap<String, String> stringStringMap = new HashMap<String, String>();
    stringStringMap.put("foo", "foo");

    // Act
    entity.setLabels(stringStringMap);

    // Assert
    assertSame(stringStringMap, entity.getLabels());
  }

  @Test
  public void testSetName() {
    // Arrange
    Entity entity = new Entity();

    // Act
    entity.setName("name");

    // Assert
    assertEquals("name", entity.getName());
  }

  @Test
  public void testSetType() {
    // Arrange
    Entity entity = new Entity();

    // Act
    entity.setType("type");

    // Assert
    assertEquals("type", entity.getType());
  }
}

