package com.alibaba.nacos.naming.pojo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ClusterStateViewDiffblueTest {
  @Test
  public void testSetClusterTerm() {
    // Arrange
    ClusterStateView clusterStateView = new ClusterStateView();

    // Act
    clusterStateView.setClusterTerm(1L);

    // Assert
    assertEquals(1L, clusterStateView.getClusterTerm());
  }

  @Test
  public void testSetLeaderDueMs() {
    // Arrange
    ClusterStateView clusterStateView = new ClusterStateView();

    // Act
    clusterStateView.setLeaderDueMs(1L);

    // Assert
    assertEquals(1L, clusterStateView.getLeaderDueMs());
  }

  @Test
  public void testSetNodeIp() {
    // Arrange
    ClusterStateView clusterStateView = new ClusterStateView();

    // Act
    clusterStateView.setNodeIp("nodeIp");

    // Assert
    assertEquals("nodeIp", clusterStateView.getNodeIp());
  }

  @Test
  public void testSetNodeState() {
    // Arrange
    ClusterStateView clusterStateView = new ClusterStateView();

    // Act
    clusterStateView.setNodeState("nodeState");

    // Assert
    assertEquals("nodeState", clusterStateView.getNodeState());
  }

  @Test
  public void testSetVoteFor() {
    // Arrange
    ClusterStateView clusterStateView = new ClusterStateView();

    // Act
    clusterStateView.setVoteFor("voteFor");

    // Assert
    assertEquals("voteFor", clusterStateView.getVoteFor());
  }
}

