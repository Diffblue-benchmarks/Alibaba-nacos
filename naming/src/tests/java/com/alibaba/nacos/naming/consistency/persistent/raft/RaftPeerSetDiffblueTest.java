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

  @Test(timeout=10000)
  public void updateTest() {
    // Arrange
    RaftPeerSet raftPeerSet = new RaftPeerSet();
    RaftPeer raftPeer = new RaftPeer();

    // Act and Assert
    assertSame(raftPeer, raftPeerSet.update(raftPeer));
    assertEquals(1, raftPeerSet.size());
  }

  @Test(timeout=10000)
  public void majorityCountTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new RaftPeerSet()).majorityCount());
  }

  @Test(timeout=10000)
  public void getTest() {
    // Arrange, Act and Assert
    assertNull((new RaftPeerSet()).get("foo"));
  }

  @Test(timeout=10000)
  public void getTermTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new RaftPeerSet()).getTerm());
  }

  @Test(timeout=10000)
  public void containsTest() {
    // Arrange
    RaftPeerSet raftPeerSet = new RaftPeerSet();

    // Act and Assert
    assertFalse(raftPeerSet.contains(new RaftPeer()));
  }

  @Test(timeout=10000)
  public void allPeersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RaftPeerSet()).allPeers().size());
  }

  @Test(timeout=10000)
  public void allServersWithoutMySelfTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new RaftPeerSet()).allServersWithoutMySelf();
  }

  @Test(timeout=10000)
  public void isLeaderTest() {
    // Arrange, Act and Assert
    assertFalse((new RaftPeerSet()).isLeader("127.0.0.1"));
  }

  @Test(timeout=10000)
  public void setTermTest() {
    // Arrange
    RaftPeerSet raftPeerSet = new RaftPeerSet();

    // Act
    raftPeerSet.setTerm(1L);

    // Assert
    assertEquals(1L, raftPeerSet.getTerm());
  }

  @Test(timeout=10000)
  public void localTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalStateException.class);
    (new RaftPeerSet()).local();
  }

  @Test(timeout=10000)
  public void isReadyTest() {
    // Arrange, Act and Assert
    assertFalse((new RaftPeerSet()).isReady());
  }

  @Test(timeout=10000)
  public void sizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RaftPeerSet()).size());
  }

  @Test(timeout=10000)
  public void decideLeaderTest() {
    // Arrange
    RaftPeerSet raftPeerSet = new RaftPeerSet();

    // Act and Assert
    assertNull(raftPeerSet.decideLeader(new RaftPeer()));
    assertEquals(1, raftPeerSet.size());
  }

  @Test(timeout=10000)
  public void resetTest() {
    // Arrange
    RaftPeerSet raftPeerSet = new RaftPeerSet();

    // Act
    raftPeerSet.reset();

    // Assert
    assertNull(raftPeerSet.getLeader());
  }

  @Test(timeout=10000)
  public void getLeaderTest() {
    // Arrange, Act and Assert
    assertNull((new RaftPeerSet()).getLeader());
  }

  @Test(timeout=10000)
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

  @Test(timeout=10000)
  public void allSitesTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RaftPeerSet()).allSites().size());
  }

  @Test(timeout=10000)
  public void allServersIncludeMyselfTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RaftPeerSet()).allServersIncludeMyself().size());
  }
}

