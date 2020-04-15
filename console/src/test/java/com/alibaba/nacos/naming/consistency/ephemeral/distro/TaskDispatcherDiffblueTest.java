package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class TaskDispatcherDiffblueTest {
  @Autowired
  private TaskDispatcher taskDispatcher;
  @Test
  public void testTaskSchedulerConstructor() {
    // Arrange, Act and Assert
    assertEquals(1, (this.taskDispatcher.new TaskScheduler(1)).getIndex());
  }
}

