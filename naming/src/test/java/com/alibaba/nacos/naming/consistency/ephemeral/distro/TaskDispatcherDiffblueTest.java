package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TaskDispatcherDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getIndexTest() {
    // Arrange, Act and Assert
    assertEquals(1, ((new TaskDispatcher()).new TaskScheduler(1)).getIndex());
  }
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(1, ((new TaskDispatcher()).new TaskScheduler(1)).getIndex());
  }
  @Test
  public void addTaskTest() {
    // Arrange, Act and Assert
    thrown.expect(IndexOutOfBoundsException.class);
    (new TaskDispatcher()).addTask("foo");
  }
}

