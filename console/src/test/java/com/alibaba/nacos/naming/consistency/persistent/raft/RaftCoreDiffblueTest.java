package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import com.alibaba.nacos.naming.consistency.ApplyAction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class RaftCoreDiffblueTest {
  @Autowired
  private RaftPeerSet raftPeerSet;
  @Autowired
  private RaftCore raftCore;
  @Test
  public void testBuildURL() {
    // Arrange
    String actualBuildURLResult = RaftCore.buildURL(",", ",");

    // Act and Assert
    assertEquals("http://,:0/nacos,", actualBuildURLResult);
    assertEquals("http://:/nacos,", RaftCore.buildURL(":", ","));
  }
  @Test
  public void testConstructor() {
    // Arrange and Act
    RaftCore actualRaftCore = new RaftCore();

    // Assert
    int actualTaskSize = actualRaftCore.notifier.getTaskSize();
    assertEquals(0, actualRaftCore.getNotifyTaskCount());
    assertEquals(0, actualTaskSize);
  }
  @Test
  public void testDatumSize() {
    // Arrange, Act and Assert
    assertEquals(1, this.raftCore.datumSize());
  }
  @Test
  public void testGetDatum() {
    // Arrange, Act and Assert
    assertNull(this.raftCore.getDatum(","));
  }
  @Test
  public void testGetLeader() {
    // Arrange, Act and Assert
    assertNull(this.raftCore.getLeader());
  }
  @Test
  public void testGetNotifyTaskCount() {
    // Arrange, Act and Assert
    assertEquals(0, this.raftCore.getNotifyTaskCount());
  }
  @Test
  public void testGetPeers() {
    // Arrange, Act and Assert
    assertEquals(0, this.raftCore.getPeers().size());
  }
  @Test
  public void testInit() throws Exception {
    // Arrange and Act
    this.raftCore.init();

    // Assert
    assertTrue(this.raftCore.isInitialized());
    assertEquals(300L, this.raftCore.getPeerSet().getTerm());
  }
  @Test
  public void testIsInitialized() {
    // Arrange, Act and Assert
    assertTrue(this.raftCore.isInitialized());
  }
  @Test
  public void testIsLeader() {
    // Arrange, Act and Assert
    assertFalse(this.raftCore.isLeader(","));
  }
  @Test
  public void testIsLeader2() {
    // Arrange, Act and Assert
    assertFalse(this.raftCore.isLeader());
  }
  @Test
  public void testNotifierAddTask() {
    // Arrange
    RaftCore.Notifier notifier = this.raftCore.new Notifier();

    // Act
    notifier.addTask("com.alibaba.nacos.naming.domains.meta.", ApplyAction.CHANGE);

    // Assert
    assertEquals(1, notifier.getTaskSize());
  }
  @Test
  public void testNotifierConstructor() {
    // Arrange, Act and Assert
    assertEquals(0, (this.raftCore.new Notifier()).getTaskSize());
  }
  @Test
  public void testNotifierGetTaskSize() {
    // Arrange, Act and Assert
    assertEquals(0, (this.raftCore.new Notifier()).getTaskSize());
  }
  @Test
  public void testSetPeerSet() {
    // Arrange and Act
    this.raftCore.setPeerSet(this.raftPeerSet);

    // Assert
    assertNull(this.raftCore.getLeader());
  }
  @Test
  public void testSetTerm() {
    // Arrange and Act
    this.raftCore.setTerm(100L);

    // Assert
    assertEquals(100L, this.raftCore.getPeerSet().getTerm());
  }
}

