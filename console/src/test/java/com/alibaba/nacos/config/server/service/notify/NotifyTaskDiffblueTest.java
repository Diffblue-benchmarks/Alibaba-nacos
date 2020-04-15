package com.alibaba.nacos.config.server.service.notify;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NotifyTaskDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    NotifyTask actualNotifyTask = new NotifyTask("123", "group", "tenant", 3000L);

    // Assert
    assertEquals("123", actualNotifyTask.getDataId());
    assertEquals(3000L, actualNotifyTask.getLastModified());
    assertEquals("tenant", actualNotifyTask.getTenant());
    assertEquals("group", actualNotifyTask.getGroup());
    assertEquals(3000L, actualNotifyTask.getTaskInterval());
  }

  @Test
  public void testSetDataId() {
    // Arrange
    NotifyTask notifyTask = new NotifyTask("123", "group", "tenant", 3000L);

    // Act
    notifyTask.setDataId("123");

    // Assert
    assertEquals("123", notifyTask.getDataId());
  }

  @Test
  public void testSetFailCount() {
    // Arrange
    NotifyTask notifyTask = new NotifyTask("123", "group", "tenant", 3000L);

    // Act
    notifyTask.setFailCount(3);

    // Assert
    assertEquals(3, notifyTask.getFailCount());
  }

  @Test
  public void testSetGroup() {
    // Arrange
    NotifyTask notifyTask = new NotifyTask("123", "group", "tenant", 3000L);

    // Act
    notifyTask.setGroup("group");

    // Assert
    assertEquals("group", notifyTask.getGroup());
  }

  @Test
  public void testSetLastModified() {
    // Arrange
    NotifyTask notifyTask = new NotifyTask("123", "group", "tenant", 3000L);

    // Act
    notifyTask.setLastModified(3000L);

    // Assert
    assertEquals(3000L, notifyTask.getLastModified());
  }

  @Test
  public void testSetTenant() {
    // Arrange
    NotifyTask notifyTask = new NotifyTask("123", "group", "tenant", 3000L);

    // Act
    notifyTask.setTenant("tenant");

    // Assert
    assertEquals("tenant", notifyTask.getTenant());
  }
}

