package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.junit.Assert.assertEquals;
import com.alibaba.nacos.naming.consistency.ApplyAction;
import org.junit.Test;

public class DistroConsistencyServiceImplDiffblueTest {
  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals(0, ((new DistroConsistencyServiceImpl()).new Notifier()).getTaskSize());
  }

  @Test
  public void addTaskTest() {
    // Arrange
    DistroConsistencyServiceImpl.Notifier notifier = (new DistroConsistencyServiceImpl()).new Notifier();

    // Act
    notifier.addTask("aaaaa", ApplyAction.CHANGE);

    // Assert
    assertEquals(1, notifier.getTaskSize());
  }

  @Test
  public void getTaskSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, ((new DistroConsistencyServiceImpl()).new Notifier()).getTaskSize());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new DistroConsistencyServiceImpl()).notifier.getTaskSize());
  }
}

