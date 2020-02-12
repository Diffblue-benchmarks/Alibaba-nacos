package com.alibaba.nacos.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.pojo.ClusterStateView
 *
 * @author Diffblue JCover
 */

public class ClusterStateViewDiffblueTest {

    @Test(timeout=10000)
    public void getClusterTermReturnsZero() {
        assertThat(new ClusterStateView().getClusterTerm(), is(0L));
    }

    @Test(timeout=10000)
    public void getHeartbeatDueMsReturnsZero() {
        assertThat(new ClusterStateView().getHeartbeatDueMs(), is(0L));
    }

    @Test(timeout=10000)
    public void getLeaderDueMsReturnsZero() {
        assertThat(new ClusterStateView().getLeaderDueMs(), is(0L));
    }

    @Test(timeout=10000)
    public void getNodeIpReturnsNull() {
        assertThat(new ClusterStateView().getNodeIp(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getNodeStateReturnsNull() {
        assertThat(new ClusterStateView().getNodeState(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getVoteForReturnsNull() {
        assertThat(new ClusterStateView().getVoteFor(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setClusterTermToOne() {
        ClusterStateView clusterStateView = new ClusterStateView();
        clusterStateView.setClusterTerm(1L);
        assertThat(clusterStateView.getClusterTerm(), is(1L));
    }

    @Test(timeout=10000)
    public void setHeartbeatDueMsToOne() {
        ClusterStateView clusterStateView = new ClusterStateView();
        clusterStateView.setHeartbeatDueMs(1L);
        assertThat(clusterStateView.getHeartbeatDueMs(), is(1L));
    }

    @Test(timeout=10000)
    public void setLeaderDueMsToOne() {
        ClusterStateView clusterStateView = new ClusterStateView();
        clusterStateView.setLeaderDueMs(1L);
        assertThat(clusterStateView.getLeaderDueMs(), is(1L));
    }

    @Test(timeout=10000)
    public void setNodeIp() {
        ClusterStateView clusterStateView = new ClusterStateView();
        clusterStateView.setNodeIp("OX13QD");
        assertThat(clusterStateView.getNodeIp(), is("OX13QD"));
    }

    @Test(timeout=10000)
    public void setNodeState() {
        ClusterStateView clusterStateView = new ClusterStateView();
        clusterStateView.setNodeState("New York");
        assertThat(clusterStateView.getNodeState(), is("New York"));
    }

    @Test(timeout=10000)
    public void setVoteFor() {
        ClusterStateView clusterStateView = new ClusterStateView();
        clusterStateView.setVoteFor("New York");
        assertThat(clusterStateView.getVoteFor(), is("New York"));
    }
}
