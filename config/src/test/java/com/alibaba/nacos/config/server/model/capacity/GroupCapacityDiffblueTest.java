package com.alibaba.nacos.config.server.model.capacity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.sql.Timestamp;
import org.junit.Test;

public class GroupCapacityDiffblueTest {
  @Test
  public void setGroupTest() {
    // Arrange
    GroupCapacity groupCapacity = new GroupCapacity();

    // Act
    groupCapacity.setGroup("aaaaa");

    // Assert
    assertEquals("aaaaa", groupCapacity.getGroup());
  }

  @Test
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertNull((new GroupCapacity()).getGroup());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    GroupCapacity actualGroupCapacity = new GroupCapacity();

    // Assert
    Integer actualMaxSize = actualGroupCapacity.getMaxSize();
    Integer actualUsage = actualGroupCapacity.getUsage();
    Integer actualQuota = actualGroupCapacity.getQuota();
    Timestamp actualGmtCreate = actualGroupCapacity.getGmtCreate();
    String actualGroup = actualGroupCapacity.getGroup();
    Integer actualMaxAggrSize = actualGroupCapacity.getMaxAggrSize();
    Long actualId = actualGroupCapacity.getId();
    Timestamp actualGmtModified = actualGroupCapacity.getGmtModified();
    assertNull(actualMaxSize);
    assertNull(actualGroupCapacity.getMaxAggrCount());
    assertNull(actualGmtModified);
    assertNull(actualId);
    assertNull(actualMaxAggrSize);
    assertNull(actualGroup);
    assertNull(actualGmtCreate);
    assertNull(actualQuota);
    assertNull(actualUsage);
  }
}

