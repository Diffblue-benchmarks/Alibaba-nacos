package com.alibaba.nacos.config.server.service.notify;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NotifyTaskDiffblueTest {
  @Test(timeout=10000)
  public void setTenantTest() {
    // Arrange
    NotifyTask notifyTask = new NotifyTask("123", "foo", "foo", 1L);

    // Act
    notifyTask.setTenant("foo");

    // Assert
    assertEquals("foo", notifyTask.getTenant());
  }

  @Test(timeout=10000)
  public void setGroupTest() {
    // Arrange
    NotifyTask notifyTask = new NotifyTask("123", "foo", "foo", 1L);

    // Act
    notifyTask.setGroup("foo");

    // Assert
    assertEquals("foo", notifyTask.getGroup());
  }

  @Test(timeout=10000)
  public void setDataIdTest() {
    // Arrange
    NotifyTask notifyTask = new NotifyTask("123", "foo", "foo", 1L);

    // Act
    notifyTask.setDataId("123");

    // Assert
    assertEquals("123", notifyTask.getDataId());
  }

  @Test(timeout=10000)
  public void setFailCountTest() {
    // Arrange
    NotifyTask notifyTask = new NotifyTask("123", "foo", "foo", 1L);

    // Act
    notifyTask.setFailCount(3);

    // Assert
    assertEquals(3, notifyTask.getFailCount());
  }

  @Test(timeout=10000)
  public void setLastModifiedTest() {
    // Arrange
    NotifyTask notifyTask = new NotifyTask("123", "foo", "foo", 1L);

    // Act
    notifyTask.setLastModified(1L);

    // Assert
    assertEquals(1L, notifyTask.getLastModified());
  }

  @Test(timeout=10000)
  public void getLastModifiedTest() {
    // Arrange, Act and Assert
    assertEquals(1L, (new NotifyTask("123", "foo", "foo", 1L)).getLastModified());
  }

  @Test(timeout=10000)
  public void getTenantTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new NotifyTask("123", "foo", "foo", 1L)).getTenant());
  }

  @Test(timeout=10000)
  public void getFailCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new NotifyTask("123", "foo", "foo", 1L)).getFailCount());
  }

  @Test(timeout=10000)
  public void getGroupTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new NotifyTask("123", "foo", "foo", 1L)).getGroup());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    NotifyTask actualNotifyTask = new NotifyTask("123", "foo", "foo", 1L);

    // Assert
    String actualGroup = actualNotifyTask.getGroup();
    String actualTenant = actualNotifyTask.getTenant();
    assertEquals(1L, actualNotifyTask.getLastModified());
    assertEquals("foo", actualTenant);
    assertEquals("foo", actualGroup);
  }

  @Test(timeout=10000)
  public void getDataIdTest() {
    // Arrange, Act and Assert
    assertEquals("123", (new NotifyTask("123", "foo", "foo", 1L)).getDataId());
  }
}

