package com.alibaba.nacos.api.cmdb.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.Map;
import org.junit.Test;

public class EntityDiffblueTest {
  @Test(timeout=10000)
  public void setTypeTest() {
    // Arrange
    Entity entity = new Entity();

    // Act
    entity.setType("foo");

    // Assert
    assertEquals("foo", entity.getType());
  }

  @Test(timeout=10000)
  public void setLabelsTest() {
    // Arrange
    Entity entity = new Entity();

    // Act
    entity.setLabels(null);

    // Assert
    assertNull(entity.getLabels());
  }

  @Test(timeout=10000)
  public void setNameTest() {
    // Arrange
    Entity entity = new Entity();

    // Act
    entity.setName("name");

    // Assert
    assertEquals("name", entity.getName());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    Entity actualEntity = new Entity();

    // Assert
    Map<String, String> actualLabels = actualEntity.getLabels();
    String actualName = actualEntity.getName();
    assertNull(actualLabels);
    assertNull(actualEntity.getType());
    assertNull(actualName);
  }

  @Test(timeout=10000)
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new Entity()).getType());
  }

  @Test(timeout=10000)
  public void getNameTest() {
    // Arrange, Act and Assert
    assertNull((new Entity()).getName());
  }

  @Test(timeout=10000)
  public void getLabelsTest() {
    // Arrange, Act and Assert
    assertNull((new Entity()).getLabels());
  }
}

