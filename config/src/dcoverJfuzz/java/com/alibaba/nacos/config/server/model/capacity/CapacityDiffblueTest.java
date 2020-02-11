package com.alibaba.nacos.config.server.model.capacity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.sql.Timestamp;
import org.junit.Test;

public class CapacityDiffblueTest {
  @Test(timeout=10000)
  public void getMaxAggrCountTest() {
    // Arrange, Act and Assert
    assertNull((new Capacity()).getMaxAggrCount());
  }

  @Test(timeout=10000)
  public void getIdTest() {
    // Arrange, Act and Assert
    assertNull((new Capacity()).getId());
  }

  @Test(timeout=10000)
  public void getMaxAggrSizeTest() {
    // Arrange, Act and Assert
    assertNull((new Capacity()).getMaxAggrSize());
  }

  @Test(timeout=10000)
  public void setGmtCreateTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setGmtCreate(null);

    // Assert
    assertNull(capacity.getGmtCreate());
  }

  @Test(timeout=10000)
  public void setMaxAggrSizeTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setMaxAggrSize(Integer.valueOf(3));

    // Assert
    assertEquals(Integer.valueOf(3), capacity.getMaxAggrSize());
  }

  @Test(timeout=10000)
  public void setUsageTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setUsage(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), capacity.getUsage());
  }

  @Test(timeout=10000)
  public void setIdTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setId(Long.valueOf(123L));

    // Assert
    assertEquals(Long.valueOf(123L), capacity.getId());
  }

  @Test(timeout=10000)
  public void setMaxSizeTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setMaxSize(Integer.valueOf(3));

    // Assert
    assertEquals(Integer.valueOf(3), capacity.getMaxSize());
  }

  @Test(timeout=10000)
  public void setMaxAggrCountTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setMaxAggrCount(Integer.valueOf(3));

    // Assert
    assertEquals(Integer.valueOf(3), capacity.getMaxAggrCount());
  }

  @Test(timeout=10000)
  public void getGmtModifiedTest() {
    // Arrange, Act and Assert
    assertNull((new Capacity()).getGmtModified());
  }

  @Test(timeout=10000)
  public void setQuotaTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setQuota(Integer.valueOf(1));

    // Assert
    assertEquals(Integer.valueOf(1), capacity.getQuota());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void getGmtCreateTest() {
    // Arrange, Act and Assert
    assertNull((new Capacity()).getGmtCreate());
  }

  @Test(timeout=10000)
  public void getQuotaTest() {
    // Arrange, Act and Assert
    assertNull((new Capacity()).getQuota());
  }

  @Test(timeout=10000)
  public void getUsageTest() {
    // Arrange, Act and Assert
    assertNull((new Capacity()).getUsage());
  }

  @Test(timeout=10000)
  public void setGmtModifiedTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setGmtModified(null);

    // Assert
    assertNull(capacity.getGmtModified());
  }

  @Test(timeout=10000)
  public void getMaxSizeTest() {
    // Arrange, Act and Assert
    assertNull((new Capacity()).getMaxSize());
  }
}

