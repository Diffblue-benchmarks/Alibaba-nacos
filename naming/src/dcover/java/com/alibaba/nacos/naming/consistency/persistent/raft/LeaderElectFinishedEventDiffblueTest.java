package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class LeaderElectFinishedEventDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange
    RaftPeer raftPeer = new RaftPeer();

    // Act and Assert
    assertSame(raftPeer, (new LeaderElectFinishedEvent("foo", raftPeer)).getRaftPeer());
  }
}

