package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.naming.cluster.servers.Server;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class RaftPeerSetDiffblueTest {
  @Autowired
  private RaftPeerSet raftPeerSet;
  @Test
  public void testAllPeers() {
    // Arrange, Act and Assert
    assertEquals(1, this.raftPeerSet.allPeers().size());
  }
  @Test
  public void testAllServersIncludeMyself() {
    // Arrange, Act and Assert
    assertEquals(0, this.raftPeerSet.allServersIncludeMyself().size());
  }
  @Test
  public void testAllSites() {
    // Arrange, Act and Assert
    assertEquals(0, this.raftPeerSet.allSites().size());
  }
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
  @Test
  public void testContains() {
    // Arrange, Act and Assert
    assertTrue(this.raftPeerSet.contains(new RaftPeer()));
  }
  @Test
  public void testDecideLeader() {
    // Arrange, Act and Assert
    assertNull(this.raftPeerSet.decideLeader(new RaftPeer()));
    assertEquals(1, this.raftPeerSet.size());
  }
  @Test
  public void testGet() {
    // Arrange, Act and Assert
    assertNull(this.raftPeerSet.get("/v1/ns/raft/peer"));
  }
  @Test
  public void testGetLeader() {
    // Arrange, Act and Assert
    assertNull(this.raftPeerSet.getLeader());
  }
  @Test
  public void testGetTerm() {
    // Arrange, Act and Assert
    assertEquals(0L, this.raftPeerSet.getTerm());
  }
  @Test
  public void testIsLeader() {
    // Arrange, Act and Assert
    assertFalse(this.raftPeerSet.isLeader("127.0.0.1"));
  }
  @Test
  public void testMajorityCount() {
    // Arrange, Act and Assert
    assertEquals(1, this.raftPeerSet.majorityCount());
  }
  @Test
  public void testMakeLeader() {
    // Arrange
    RaftPeer raftPeer = new RaftPeer();

    // Act and Assert
    assertSame(raftPeer, this.raftPeerSet.makeLeader(raftPeer));
    assertEquals(1, this.raftPeerSet.size());
  }
  @Test
  public void testOnChangeServerList() {
    // Arrange
    ArrayList<Server> serverList = new ArrayList<Server>();
    serverList.add(new Server());

    // Act
    this.raftPeerSet.onChangeServerList(serverList);

    // Assert
    assertEquals(1, this.raftPeerSet.size());
  }
  @Test
  public void testRemove() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("foo");

    // Act
    this.raftPeerSet.remove(stringList);

    // Assert
    assertEquals(1, this.raftPeerSet.size());
  }
  @Test
  public void testReset() {
    // Arrange and Act
    this.raftPeerSet.reset();

    // Assert
    assertNull(this.raftPeerSet.getLeader());
  }
  @Test
  public void testSetTerm() {
    // Arrange and Act
    this.raftPeerSet.setTerm(0L);

    // Assert
    assertEquals(0L, this.raftPeerSet.getTerm());
  }
  @Test
  public void testSize() {
    // Arrange, Act and Assert
    assertEquals(1, this.raftPeerSet.size());
  }
  @Test
  public void testUpdate() {
    // Arrange
    RaftPeer raftPeer = new RaftPeer();

    // Act and Assert
    assertSame(raftPeer, this.raftPeerSet.update(raftPeer));
    assertEquals(2, this.raftPeerSet.size());
  }
}

