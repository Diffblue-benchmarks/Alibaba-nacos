package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class RaftPeerSetDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange and Act
    RaftPeerSet actualRaftPeerSet = new RaftPeerSet();

    // Assert
    assertFalse(actualRaftPeerSet.isReady());
    assertEquals(0, actualRaftPeerSet.size());
    assertEquals(0L, actualRaftPeerSet.getTerm());
    assertNull(actualRaftPeerSet.getLeader());
  }
}

