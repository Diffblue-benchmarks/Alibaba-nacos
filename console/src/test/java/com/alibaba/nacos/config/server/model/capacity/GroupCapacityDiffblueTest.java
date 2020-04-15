package com.alibaba.nacos.config.server.model.capacity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class GroupCapacityDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    GroupCapacity actualGroupCapacity = new GroupCapacity();

    // Assert
    assertNull(actualGroupCapacity.getMaxSize());
    assertNull(actualGroupCapacity.getMaxAggrCount());
    assertNull(actualGroupCapacity.getGmtModified());
    assertNull(actualGroupCapacity.getId());
    assertNull(actualGroupCapacity.getMaxAggrSize());
    assertNull(actualGroupCapacity.getGroup());
    assertNull(actualGroupCapacity.getGmtCreate());
    assertNull(actualGroupCapacity.getQuota());
    assertNull(actualGroupCapacity.getUsage());
  }

  @Test
  public void testSetGroup() {
    // Arrange
    GroupCapacity groupCapacity = new GroupCapacity();

    // Act
    groupCapacity.setGroup("group");

    // Assert
    assertEquals("group", groupCapacity.getGroup());
  }
}

