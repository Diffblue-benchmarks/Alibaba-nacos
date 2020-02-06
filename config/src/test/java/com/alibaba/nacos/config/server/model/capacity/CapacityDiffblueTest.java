package com.alibaba.nacos.config.server.model.capacity;

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
    capacity.setMaxAggrSize(null);

    // Assert
    assertNull(capacity.getMaxAggrSize());
  }

  @Test
  public void setUsageTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setUsage(null);

    // Assert
    assertNull(capacity.getUsage());
  }

  @Test
  public void setIdTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setId(null);

    // Assert
    assertNull(capacity.getId());
  }

  @Test
  public void setMaxSizeTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setMaxSize(null);

    // Assert
    assertNull(capacity.getMaxSize());
  }

  @Test
  public void setMaxAggrCountTest() {
    // Arrange
    Capacity capacity = new Capacity();

    // Act
    capacity.setMaxAggrCount(null);

    // Assert
    assertNull(capacity.getMaxAggrCount());
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
    capacity.setQuota(null);

    // Assert
    assertNull(capacity.getQuota());
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

