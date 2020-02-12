package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TaskDispatcherDiffblueTest {
  @Test(timeout=10000)
  public void getIndexTest() {
    // Arrange, Act and Assert
    assertEquals(1, ((new TaskDispatcher()).new TaskScheduler(1)).getIndex());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(1, ((new TaskDispatcher()).new TaskScheduler(1)).getIndex());
  }
}

