package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.alibaba.nacos.naming.consistency.ApplyAction;
import org.junit.Test;

public class RaftCoreDiffblueTest {
  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals(0, ((new RaftCore()).new Notifier()).getTaskSize());
  }

  @Test
  public void addTaskTest() {
    // Arrange
    RaftCore.Notifier notifier = (new RaftCore()).new Notifier();

    // Act
    notifier.addTask("com.alibaba.nacos.naming.domains.meta.", ApplyAction.CHANGE);

    // Assert
    assertEquals(1, notifier.getTaskSize());
  }

  @Test
  public void getTaskSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, ((new RaftCore()).new Notifier()).getTaskSize());
  }

  @Test
  public void datumSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RaftCore()).datumSize());
  }

  @Test
  public void getListenersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RaftCore()).getListeners().size());
  }

  @Test
  public void getNotifyTaskCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RaftCore()).getNotifyTaskCount());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    RaftCore actualRaftCore = new RaftCore();

    // Assert
    int actualNotifyTaskCount = actualRaftCore.getNotifyTaskCount();
    assertEquals(0, actualNotifyTaskCount);
    assertEquals(0, actualRaftCore.notifier.getTaskSize());
  }

  @Test
  public void getDatumTest() {
    // Arrange, Act and Assert
    assertNull((new RaftCore()).getDatum(","));
  }

  @Test
  public void buildURLTest() {
    // Arrange, Act and Assert
    assertEquals("http://,:0/nacos,", RaftCore.buildURL(",", ","));
  }

  @Test
  public void setPeerSetTest() {
    // Arrange
    RaftCore raftCore = new RaftCore();

    // Act
    raftCore.setPeerSet(new RaftPeerSet());

    // Assert
    assertNull(raftCore.getLeader());
  }

  @Test
  public void getPeerSetTest() {
    // Arrange, Act and Assert
    assertNull((new RaftCore()).getPeerSet());
  }
}

