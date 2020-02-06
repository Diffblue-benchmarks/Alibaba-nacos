package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class RaftPeerDiffblueTest {
  @Test
  public void equalsTest() {
    // Arrange, Act and Assert
    assertFalse((new RaftPeer()).equals("foo"));
  }

  @Test
  public void resetHeartbeatDueTest() {
    // Arrange
    RaftPeer raftPeer = new RaftPeer();

    // Act
    raftPeer.resetHeartbeatDue();

    // Assert
    assertEquals(5000L, raftPeer.heartbeatDueMs);
  }

  @Test
  public void hashCodeTest() {
    // Arrange, Act and Assert
    assertEquals(31, (new RaftPeer()).hashCode());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(RaftPeer.State.FOLLOWER, (new RaftPeer()).state);
  }
}

