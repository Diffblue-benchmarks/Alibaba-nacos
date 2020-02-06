package com.alibaba.nacos.api.cmdb.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class EntityEventDiffblueTest {
  @Test
  public void setEntityNameTest() {
    // Arrange
    EntityEvent entityEvent = new EntityEvent();

    // Act
    entityEvent.setEntityName("aaaaa");

    // Assert
    assertEquals("aaaaa", entityEvent.getEntityName());
  }

  @Test
  public void setTypeTest() {
    // Arrange
    EntityEvent entityEvent = new EntityEvent();

    // Act
    entityEvent.setType(EntityEventType.ENTITY_ADD_OR_UPDATE);

    // Assert
    assertEquals(EntityEventType.ENTITY_ADD_OR_UPDATE, entityEvent.getType());
  }

  @Test
  public void setEntityTypeTest() {
    // Arrange
    EntityEvent entityEvent = new EntityEvent();

    // Act
    entityEvent.setEntityType("aaaaa");

    // Assert
    assertEquals("aaaaa", entityEvent.getEntityType());
  }

  @Test
  public void getEntityNameTest() {
    // Arrange, Act and Assert
    assertNull((new EntityEvent()).getEntityName());
  }

  @Test
  public void getEntityTypeTest() {
    // Arrange, Act and Assert
    assertNull((new EntityEvent()).getEntityType());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    EntityEvent actualEntityEvent = new EntityEvent();

    // Assert
    EntityEventType actualType = actualEntityEvent.getType();
    String actualEntityType = actualEntityEvent.getEntityType();
    assertNull(actualType);
    assertNull(actualEntityEvent.getEntityName());
    assertNull(actualEntityType);
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new EntityEvent()).getType());
  }
}

