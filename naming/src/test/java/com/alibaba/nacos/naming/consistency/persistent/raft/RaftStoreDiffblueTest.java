package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class RaftStoreDiffblueTest {
  @Test
  public void loadTest() throws Exception {
    // Arrange, Act and Assert
    assertNull((new RaftStore()).load("foo"));
  }
}

