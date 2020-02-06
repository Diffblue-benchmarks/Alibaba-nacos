package com.alibaba.nacos.config.server.service.notify;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NotifyTaskDiffblueTest {
  @Test
  public void setTenantTest() {
    // Arrange
    NotifyTask notifyTask = new NotifyTask("aaaaa", "aaaaa", "aaaaa", 1L);

    // Act
    notifyTask.setTenant("aaaaa");

    // Assert
    assertEquals("aaaaa", notifyTask.getTenant());
  }

  @Test
  public void setGroupTest() {
    // Arrange
    NotifyTask notifyTask = new NotifyTask("aaaaa", "aaaaa", "aaaaa", 1L);

    // Act
    notifyTask.setGroup("aaaaa");

    // Assert
    assertEquals("aaaaa", notifyTask.getGroup());
  }

  @Test
  public void setDataIdTest() {
    // Arrange
    NotifyTask notifyTask = new NotifyTask("aaaaa", "aaaaa", "aaaaa", 1L);

    // Act
    notifyTask.setDataId("aaaaa");

    // Assert
    assertEquals("aaaaa", notifyTask.getDataId());
  }

  @Test
  public void setFailCountTest() {
    // Arrange
    NotifyTask notifyTask = new NotifyTask("aaaaa", "aaaaa", "aaaaa", 1L);

    // Act
    notifyTask.setFailCount(1);

    // Assert
    assertEquals(1, notifyTask.getFailCount());
  }

  @Test
  public void setLastModifiedTest() {
    // Arrange
    NotifyTask notifyTask = new NotifyTask("aaaaa", "aaaaa", "aaaaa", 1L);

    // Act
    notifyTask.setLastModified(1L);

    // Assert
    assertEquals(1L, notifyTask.getLastModified());
  }

  @Test
  public void getLastModifiedTest() {
    // Arrange, Act and Assert
    assertEquals(1L, (new NotifyTask("aaaaa", "aaaaa", "aaaaa", 1L)).getLastModified());
  }

  @Test
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new NotifyTask("aaaaa", "aaaaa", "aaaaa", 1L)).getTenant());
  }

  @Test
  public void getFailCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NotifyTask("aaaaa", "aaaaa", "aaaaa", 1L)).getFailCount());
  }

  @Test
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new NotifyTask("aaaaa", "aaaaa", "aaaaa", 1L)).getGroup());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    NotifyTask actualNotifyTask = new NotifyTask("aaaaa", "aaaaa", "aaaaa", 1L);

    // Assert
    String actualDataId = actualNotifyTask.getDataId();
    long actualTaskInterval = actualNotifyTask.getTaskInterval();
    String actualGroup = actualNotifyTask.getGroup();
    String actualTenant = actualNotifyTask.getTenant();
    assertEquals("aaaaa", actualDataId);
    assertEquals(1L, actualNotifyTask.getLastModified());
    assertEquals("aaaaa", actualTenant);
    assertEquals("aaaaa", actualGroup);
    assertEquals(3000L, actualTaskInterval);
  }

  @Test
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new NotifyTask("aaaaa", "aaaaa", "aaaaa", 1L)).getDataId());
  }
}

