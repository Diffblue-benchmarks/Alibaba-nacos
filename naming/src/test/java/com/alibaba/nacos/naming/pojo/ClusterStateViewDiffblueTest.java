package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ClusterStateViewDiffblueTest {
  @Test
  public void getClusterTermTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ClusterStateView()).getClusterTerm());
  }

  @Test
  public void getNodeStateTest() {
    // Arrange, Act and Assert
    assertNull((new ClusterStateView()).getNodeState());
  }

  @Test
  public void getLeaderDueMsTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ClusterStateView()).getLeaderDueMs());
  }

  @Test
  public void setLeaderDueMsTest() {
    // Arrange
    ClusterStateView clusterStateView = new ClusterStateView();

    // Act
    clusterStateView.setLeaderDueMs(1L);

    // Assert
    assertEquals(1L, clusterStateView.getLeaderDueMs());
  }

  @Test
  public void getNodeIpTest() {
    // Arrange, Act and Assert
    assertNull((new ClusterStateView()).getNodeIp());
  }

  @Test
  public void setClusterTermTest() {
    // Arrange
    ClusterStateView clusterStateView = new ClusterStateView();

    // Act
    clusterStateView.setClusterTerm(1L);

    // Assert
    assertEquals(1L, clusterStateView.getClusterTerm());
  }

  @Test
  public void setNodeIpTest() {
    // Arrange
    ClusterStateView clusterStateView = new ClusterStateView();

    // Act
    clusterStateView.setNodeIp("foo");

    // Assert
    assertEquals("foo", clusterStateView.getNodeIp());
  }

  @Test
  public void setHeartbeatDueMsTest() {
    // Arrange
    ClusterStateView clusterStateView = new ClusterStateView();

    // Act
    clusterStateView.setHeartbeatDueMs(1L);

    // Assert
    assertEquals(1L, clusterStateView.getHeartbeatDueMs());
  }

  @Test
  public void getVoteForTest() {
    // Arrange, Act and Assert
    assertNull((new ClusterStateView()).getVoteFor());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    ClusterStateView actualClusterStateView = new ClusterStateView();

    // Assert
    String actualToStringResult = actualClusterStateView.toString();
    long actualHeartbeatDueMs = actualClusterStateView.getHeartbeatDueMs();
    String actualVoteFor = actualClusterStateView.getVoteFor();
    long actualLeaderDueMs = actualClusterStateView.getLeaderDueMs();
    String actualNodeState = actualClusterStateView.getNodeState();
    String actualNodeIp = actualClusterStateView.getNodeIp();
    assertEquals("{\"clusterTerm\":0,\"heartbeatDueMs\":0,\"leaderDueMs" + "\":0}", actualToStringResult);
    assertEquals(0L, actualClusterStateView.getClusterTerm());
    assertNull(actualNodeIp);
    assertNull(actualNodeState);
    assertEquals(0L, actualLeaderDueMs);
    assertNull(actualVoteFor);
    assertEquals(0L, actualHeartbeatDueMs);
  }

  @Test
  public void getHeartbeatDueMsTest() {
    // Arrange, Act and Assert
    assertEquals(0L, (new ClusterStateView()).getHeartbeatDueMs());
  }

  @Test
  public void setVoteForTest() {
    // Arrange
    ClusterStateView clusterStateView = new ClusterStateView();

    // Act
    clusterStateView.setVoteFor("foo");

    // Assert
    assertEquals("foo", clusterStateView.getVoteFor());
  }

  @Test
  public void toStringTest() {
    // Arrange
    ClusterStateView clusterStateView = new ClusterStateView();

    // Act and Assert
    assertEquals("{\"clusterTerm\":0,\"heartbeatDueMs\":0,\"leaderDueMs" + "\":0}", clusterStateView.toString());
    assertEquals("{\"clusterTerm\":0,\"heartbeatDueMs\":0,\"leaderDueMs" + "\":0}", clusterStateView.toString());
  }

  @Test
  public void setNodeStateTest() {
    // Arrange
    ClusterStateView clusterStateView = new ClusterStateView();

    // Act
    clusterStateView.setNodeState("foo");

    // Assert
    assertEquals("foo", clusterStateView.getNodeState());
  }
}

