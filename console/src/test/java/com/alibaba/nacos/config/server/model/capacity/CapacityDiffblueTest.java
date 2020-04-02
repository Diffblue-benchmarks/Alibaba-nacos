package com.alibaba.nacos.config.server.model.capacity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class CapacityDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    Capacity actualCapacity = new Capacity();

    // Assert
    assertNull(actualCapacity.getMaxSize());
    assertNull(actualCapacity.getMaxAggrCount());
    assertNull(actualCapacity.getGmtModified());
    assertNull(actualCapacity.getId());
    assertNull(actualCapacity.getMaxAggrSize());
    assertNull(actualCapacity.getGmtCreate());
    assertNull(actualCapacity.getQuota());
    assertNull(actualCapacity.getUsage());
  }

  @Test
  public void testGetGmtCreate() {
    // Arrange, Act and Assert
    assertNull((new Capacity()).getGmtCreate());
  }

  @Test
  public void testGetGmtModified() {
    // Arrange, Act and Assert
    assertNull((new Capacity()).getGmtModified());
  }

  @Test
  public void testSetGmtCreate() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setGmtCreate(null);

    // Assert
    assertNull(capacity.getGmtCreate());
  }

  @Test
  public void testSetGmtModified() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setGmtModified(null);

    // Assert
    assertNull(capacity.getGmtModified());
  }

  @Test
  public void testSetId() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setId(123L);

    // Assert
    assertEquals(123L, capacity.getId().longValue());
  }

  @Test
  public void testSetMaxAggrCount() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setMaxAggrCount(3);

    // Assert
    assertEquals(3, capacity.getMaxAggrCount().intValue());
  }

  @Test
  public void testSetMaxAggrSize() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setMaxAggrSize(3);

    // Assert
    assertEquals(3, capacity.getMaxAggrSize().intValue());
  }

  @Test
  public void testSetMaxSize() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setMaxSize(3);

    // Assert
    assertEquals(3, capacity.getMaxSize().intValue());
  }

  @Test
  public void testSetQuota() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setQuota(1);

    // Assert
    assertEquals(1, capacity.getQuota().intValue());
  }

  @Test
  public void testSetUsage() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setUsage(1);

    // Assert
    assertEquals(1, capacity.getUsage().intValue());
  }
}

