package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class RaftPeerDiffblueTest {
  @Test(timeout=10000)
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new RaftPeer()).equals("foo"));
  }

  @Test(timeout=10000)
  public void resetHeartbeatDueTest() {
    // Arrange
    RaftPeer raftPeer = new RaftPeer();

    // Act
    raftPeer.resetHeartbeatDue();

    // Assert
    assertEquals(5000L, raftPeer.heartbeatDueMs);
  }

  @Test(timeout=10000)
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(31, (new RaftPeer()).hashCode());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(RaftPeer.State.FOLLOWER, (new RaftPeer()).state);
  }
}

