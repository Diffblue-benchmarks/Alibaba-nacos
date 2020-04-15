package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class MakeLeaderEventDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    RaftPeer raftPeer = new RaftPeer();

    // Act and Assert
    assertSame(raftPeer, (new MakeLeaderEvent("source", raftPeer)).getRaftPeer());
  }
}

