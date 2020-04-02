package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class RaftPeerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(RaftPeer.State.FOLLOWER, (new RaftPeer()).state);
  }

  @Test
  public void testEquals() {
    // Arrange, Act and Assert
    assertFalse((new RaftPeer()).equals("obj"));
  }

  @Test
  public void testEquals2() {
    // Arrange, Act and Assert
    assertFalse((new RaftPeer()).equals(null));
  }

  @Test
  public void testHashCode() {
    // Arrange, Act and Assert
    assertEquals(31, (new RaftPeer()).hashCode());
  }

  @Test
  public void testResetHeartbeatDue() {
    // Arrange
    RaftPeer raftPeer = new RaftPeer();

    // Act
    raftPeer.resetHeartbeatDue();

    // Assert
    assertEquals(5000L, raftPeer.heartbeatDueMs);
  }
}

