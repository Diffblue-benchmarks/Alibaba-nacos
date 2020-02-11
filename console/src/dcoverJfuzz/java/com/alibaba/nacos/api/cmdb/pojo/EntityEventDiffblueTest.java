package com.alibaba.nacos.api.cmdb.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class EntityEventDiffblueTest {
  @Test(timeout=10000)
  public void setEntityNameTest() {
    // Arrange
    EntityEvent entityEvent = new EntityEvent();

    // Act
    entityEvent.setEntityName("name");

    // Assert
    assertEquals("name", entityEvent.getEntityName());
  }

  @Test(timeout=10000)
  public void setTypeTest() {
    // Arrange
    EntityEvent entityEvent = new EntityEvent();

    // Act
    entityEvent.setType(EntityEventType.ENTITY_ADD_OR_UPDATE);

    // Assert
    assertEquals(EntityEventType.ENTITY_ADD_OR_UPDATE, entityEvent.getType());
  }

  @Test(timeout=10000)
  public void setEntityTypeTest() {
    // Arrange
    EntityEvent entityEvent = new EntityEvent();

    // Act
    entityEvent.setEntityType("foo");

    // Assert
    assertEquals("foo", entityEvent.getEntityType());
  }

  @Test(timeout=10000)
  public void getEntityNameTest() {
    // Arrange, Act and Assert
    assertNull((new EntityEvent()).getEntityName());
  }

  @Test(timeout=10000)
  public void getEntityTypeTest() {
    // Arrange, Act and Assert
    assertNull((new EntityEvent()).getEntityType());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertNull((new EntityEvent()).getType());
  }
}

