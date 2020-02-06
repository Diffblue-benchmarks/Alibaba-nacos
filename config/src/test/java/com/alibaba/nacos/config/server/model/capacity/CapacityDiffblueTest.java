package com.alibaba.nacos.config.server.model.capacity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.sql.Timestamp;
import org.junit.Test;

public class CapacityDiffblueTest {
  @Test
  public void getMaxAggrCountTest() {
    // Arrange, Act and Assert
    assertNull((new Capacity()).getMaxAggrCount());
  }

  @Test
  public void getIdTest() {
    // Arrange, Act and Assert
    assertNull((new Capacity()).getId());
  }

  @Test
  public void getMaxAggrSizeTest() {
    // Arrange, Act and Assert
    assertNull((new Capacity()).getMaxAggrSize());
  }

  @Test
  public void setGmtCreateTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setGmtCreate(null);

    // Assert
    assertNull(capacity.getGmtCreate());
  }

  @Test
  public void setMaxAggrSizeTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setMaxAggrSize(Integer.valueOf(3));

    // Assert
    assertEquals(Integer.valueOf(3), capacity.getMaxAggrSize());
  }

  @Test
  public void setUsageTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setUsage(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), capacity.getUsage());
  }

  @Test
  public void setIdTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), capacity.getId());
  }

  @Test
  public void setMaxSizeTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setMaxSize(Integer.valueOf(3));

    // Assert
    assertEquals(Integer.valueOf(3), capacity.getMaxSize());
  }

  @Test
  public void setMaxAggrCountTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setMaxAggrCount(Integer.valueOf(3));

    // Assert
    assertEquals(Integer.valueOf(3), capacity.getMaxAggrCount());
  }

  @Test
  public void getGmtModifiedTest() {
    // Arrange, Act and Assert
    assertNull((new Capacity()).getGmtModified());
  }

  @Test
  public void setQuotaTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setQuota(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), capacity.getQuota());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Capacity actualCapacity = new Capacity();

    // Assert
    Integer actualMaxSize = actualCapacity.getMaxSize();
    Integer actualUsage = actualCapacity.getUsage();
    Integer actualQuota = actualCapacity.getQuota();
    Timestamp actualGmtCreate = actualCapacity.getGmtCreate();
    Integer actualMaxAggrSize = actualCapacity.getMaxAggrSize();
    Long actualId = actualCapacity.getId();
    Timestamp actualGmtModified = actualCapacity.getGmtModified();
    assertNull(actualMaxSize);
    assertNull(actualCapacity.getMaxAggrCount());
    assertNull(actualGmtModified);
    assertNull(actualId);
    assertNull(actualMaxAggrSize);
    assertNull(actualGmtCreate);
    assertNull(actualQuota);
    assertNull(actualUsage);
  }

  @Test
  public void getGmtCreateTest() {
    // Arrange, Act and Assert
    assertNull((new Capacity()).getGmtCreate());
  }

  @Test
  public void getQuotaTest() {
    // Arrange, Act and Assert
    assertNull((new Capacity()).getQuota());
  }

  @Test
  public void getUsageTest() {
    // Arrange, Act and Assert
    assertNull((new Capacity()).getUsage());
  }

  @Test
  public void setGmtModifiedTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setGmtModified(null);

    // Assert
    assertNull(capacity.getGmtModified());
  }

  @Test
  public void getMaxSizeTest() {
    // Arrange, Act and Assert
    assertNull((new Capacity()).getMaxSize());
  }
}

