package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import com.alibaba.nacos.naming.consistency.ApplyAction;
import org.junit.Test;

public class RaftCoreDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals(0, ((new RaftCore()).new Notifier()).getTaskSize());
  }

  @Test(timeout=10000)
  public void addTaskTest() {
    // Arrange
    RaftCore.Notifier notifier = (new RaftCore()).new Notifier();

    // Act
    notifier.addTask("foo", ApplyAction.CHANGE);

    // Assert
    assertEquals(1, notifier.getTaskSize());
  }

  @Test(timeout=10000)
  public void getTaskSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, ((new RaftCore()).new Notifier()).getTaskSize());
  }

  @Test(timeout=10000)
  public void datumSizeTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RaftCore()).datumSize());
  }

  @Test(timeout=10000)
  public void getListenersTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RaftCore()).getListeners().size());
  }

  @Test(timeout=10000)
  public void getNotifyTaskCountTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RaftCore()).getNotifyTaskCount());
  }

  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new RaftCore()).getNotifyTaskCount());
  }

  @Test(timeout=10000)
  public void getDatumTest() {
    // Arrange, Act and Assert
    assertNull((new RaftCore()).getDatum("foo"));
  }

  @Test(timeout=10000)
  public void buildURLTest() {
    // Arrange, Act and Assert
    assertEquals("http://127.0.0.1:0/nacosfoo", RaftCore.buildURL("127.0.0.1", "foo"));
  }

  @Test(timeout=10000)
  public void setPeerSetTest() {
    // Arrange
    RaftCore raftCore = new RaftCore();

    // Act
    raftCore.setPeerSet(new RaftPeerSet());

    // Assert
    assertNull(raftCore.getLeader());
  }

  @Test(timeout=10000)
  public void getPeerSetTest() {
    // Arrange, Act and Assert
    assertNull((new RaftCore()).getPeerSet());
  }
}

