package com.alibaba.nacos.api.cmdb.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class EntityEventDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    EntityEvent actualEntityEvent = new EntityEvent();

    // Assert
    assertNull(actualEntityEvent.getType());
    assertNull(actualEntityEvent.getEntityName());
    assertNull(actualEntityEvent.getEntityType());
  }

  @Test
  public void testSetEntityName() {
    // Arrange
    EntityEvent entityEvent = new EntityEvent();

    // Act
    entityEvent.setEntityName("entityName");

    // Assert
    assertEquals("entityName", entityEvent.getEntityName());
  }

  @Test
  public void testSetEntityType() {
    // Arrange
    EntityEvent entityEvent = new EntityEvent();

    // Act
    entityEvent.setEntityType("entityType");

    // Assert
    assertEquals("entityType", entityEvent.getEntityType());
  }

  @Test
  public void testSetType() {
    // Arrange
    EntityEvent entityEvent = new EntityEvent();

    // Act
    entityEvent.setType(EntityEventType.ENTITY_ADD_OR_UPDATE);

    // Assert
    assertEquals(EntityEventType.ENTITY_ADD_OR_UPDATE, entityEvent.getType());
  }
}

