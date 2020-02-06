package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RaftPeerSetDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void updateTest() {
    // Arrange
    RaftPeerSet raftPeerSet = new RaftPeerSet();
    RaftPeer raftPeer = new RaftPeer();

    // Act and Assert
    assertSame(raftPeer, raftPeerSet.update(raftPeer));
    assertEquals(1, raftPeerSet.size());
  }

  @Test
  public void majorityCountTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new RaftPeerSet()).majorityCount());
  }

  @Test
  public void getTest() {
    // Arrange, Act and Assert
    assertNull((new RaftPeerSet()).get("/v1/ns/raft/peer"));
  }

  @Test
  public void getTermTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new RaftPeerSet()).getTerm());
  }

  @Test
  public void containsTest() {
    // Arrange
    RaftPeerSet raftPeerSet = new RaftPeerSet();

    // Act and Assert
    assertFalse(raftPeerSet.contains(new RaftPeer()));
  }

  @Test
  public void allPeersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RaftPeerSet()).allPeers().size());
  }

  @Test
  public void allServersWithoutMySelfTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new RaftPeerSet()).allServersWithoutMySelf();
  }

  @Test
  public void isLeaderTest() {
    // Arrange, Act and Assert
    assertFalse((new RaftPeerSet()).isLeader("/v1/ns/raft/peer"));
  }

  @Test
  public void setTermTest() {
    // Arrange
    RaftPeerSet raftPeerSet = new RaftPeerSet();

    // Act
    raftPeerSet.setTerm(1L);

    // Assert
    assertEquals(1L, raftPeerSet.getTerm());
  }

  @Test
  public void localTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new RaftPeerSet()).local();
  }

  @Test
  public void isReadyTest() {
    // Arrange, Act and Assert
    assertFalse((new RaftPeerSet()).isReady());
  }

  @Test
  public void sizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RaftPeerSet()).size());
  }

  @Test
  public void decideLeaderTest() {
    // Arrange
    RaftPeerSet raftPeerSet = new RaftPeerSet();

    // Act and Assert
    assertNull(raftPeerSet.decideLeader(new RaftPeer()));
    assertEquals(1, raftPeerSet.size());
  }

  @Test
  public void resetTest() {
    // Arrange
    RaftPeerSet raftPeerSet = new RaftPeerSet();

    // Act
    raftPeerSet.reset();

    // Assert
    assertNull(raftPeerSet.getLeader());
  }

  @Test
  public void getLeaderTest() {
    // Arrange, Act and Assert
    assertNull((new RaftPeerSet()).getLeader());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    RaftPeerSet actualRaftPeerSet = new RaftPeerSet();

    // Assert
    boolean actualIsReadyResult = actualRaftPeerSet.isReady();
    RaftPeer actualLeader = actualRaftPeerSet.getLeader();
    long actualTerm = actualRaftPeerSet.getTerm();
    assertFalse(actualIsReadyResult);
    assertEquals(0, actualRaftPeerSet.size());
    assertEquals(0L, actualTerm);
    assertNull(actualLeader);
  }

  @Test
  public void allSitesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RaftPeerSet()).allSites().size());
  }

  @Test
  public void allServersIncludeMyselfTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RaftPeerSet()).allServersIncludeMyself().size());
  }
}

