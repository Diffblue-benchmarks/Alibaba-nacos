package com.alibaba.nacos.naming.healthcheck;

import static org.junit.Assert.assertNull;
import com.alibaba.nacos.naming.core.Service;
import org.junit.Test;

public class ClientBeatCheckTaskDiffblueTest {
  @Test
  public void testTaskKey() {
    // Arrange, Act and Assert
    assertNull((new ClientBeatCheckTask(new Service())).taskKey());
  }
}

