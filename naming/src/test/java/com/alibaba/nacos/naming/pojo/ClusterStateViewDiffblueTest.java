package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ClusterStateViewDiffblueTest {
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
    clusterStateView.setNodeIp("aaaaa");

    // Assert
    assertEquals("aaaaa", clusterStateView.getNodeIp());
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
    clusterStateView.setNodeState("aaaaa");

    // Assert
    assertEquals("aaaaa", clusterStateView.getNodeState());
  }
}

