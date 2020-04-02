package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class RaftStoreDiffblueTest {
  @Autowired
  private RaftStore raftStore;
  @Test
  public void testLoad() throws Exception {
    // Arrange, Act and Assert
    assertNull(this.raftStore.load(""));
  }
  @Test
  public void testLoadMeta() throws Exception {
    // Arrange, Act and Assert
    assertEquals(1, this.raftStore.loadMeta().size());
  }
}

