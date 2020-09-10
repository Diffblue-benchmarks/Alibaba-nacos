package com.alibaba.nacos.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.pojo.ClusterStateView
 *
 * @author Diffblue Cover
 */

public class ClusterStateViewTest {

    @Test
    public void factory() {
        ClusterStateView clusterStateView = new ClusterStateView();
        clusterStateView.setClusterTerm(-1L);
        clusterStateView.setHeartbeatDueMs(0L);
        clusterStateView.setLeaderDueMs(1L);
        clusterStateView.setNodeIp("DE");
        clusterStateView.setNodeState("New York");
        clusterStateView.setVoteFor("New York");
        assertThat(clusterStateView.getClusterTerm(), is(-1L));
        assertThat(clusterStateView.getHeartbeatDueMs(), is(0L));
        assertThat(clusterStateView.getLeaderDueMs(), is(1L));
        assertThat(clusterStateView.getNodeIp(), is("DE"));
        assertThat(clusterStateView.getNodeState(), is("New York"));
        assertThat(clusterStateView.getVoteFor(), is("New York"));
    }
}
