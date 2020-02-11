package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.nacos.naming.cluster.servers.Server;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;

/**
 * Unit tests for com.alibaba.nacos.naming.consistency.persistent.raft.RaftPeerSet
 *
 * @author Diffblue JCover
 */

public class RaftPeerSetTest {

    @Test(timeout=10000)
    public void allPeersReturnsEmpty() {
        assertThat(new RaftPeerSet().allPeers(), empty());
    }

    @Test(timeout=10000)
    public void allServersIncludeMyselfReturnsEmpty() {
        assertThat(new RaftPeerSet().allServersIncludeMyself(), empty());
    }

    @Test(timeout=10000)
    public void allSitesReturnsEmpty() {
        assertThat(new RaftPeerSet().allSites(), empty());
    }

    @Test(timeout=10000)
    public void containsReturnsFalse() {
        assertThat(new RaftPeerSet().contains(new RaftPeer()), is(false));
    }

    @Test(timeout=10000)
    public void decideLeaderReturnsNull() {
        assertThat(new RaftPeerSet().decideLeader(new RaftPeer()), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getLeaderReturnsNull() {
        assertThat(new RaftPeerSet().getLeader(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getServerIsFooReturnsNull() {
        assertThat(new RaftPeerSet().get("foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTermReturnsZero() {
        assertThat(new RaftPeerSet().getTerm(), is(0L));
    }

    @Test(timeout=10000)
    public void isLeaderIpIsFooReturnsFalse() {
        assertThat(new RaftPeerSet().isLeader("foo"), is(false));
    }

    @Test(timeout=10000)
    public void isReadyReturnsFalse() {
        assertThat(new RaftPeerSet().isReady(), is(false));
    }

    @Test(timeout=10000)
    public void majorityCountReturnsOne() {
        assertThat(new RaftPeerSet().majorityCount(), is(1));
    }

    @Test(timeout=10000)
    public void onChangeHealthyServerListLatestReachableMembersIsEmpty() {
        new RaftPeerSet().onChangeHealthyServerList(new ArrayList<com.alibaba.nacos.naming.cluster.servers.Server>());
    }

    @Test(timeout=10000)
    public void onChangeServerList() {
        List<Server> latestMembers = new ArrayList<Server>();
        ((ArrayList<Server>)latestMembers).add(new Server());
        new RaftPeerSet().onChangeServerList(latestMembers);
    }

    @Test(timeout=10000)
    public void onChangeServerListLatestMembersIsEmpty() {
        new RaftPeerSet().onChangeServerList(new ArrayList<Server>());
    }

    @Test(timeout=10000)
    public void removeServersIsEmpty() {
        new RaftPeerSet().remove(new ArrayList<String>());
    }

    @Test(timeout=10000)
    public void removeServersIsFoo() {
        List<String> servers = new ArrayList<String>();
        ((ArrayList<String>)servers).add("foo");
        new RaftPeerSet().remove(servers);
    }

    @Test(timeout=10000)
    public void reset() {
        new RaftPeerSet().reset();
    }

    @Test(timeout=10000)
    public void setApplicationContext() throws org.springframework.beans.BeansException {
        ApplicationContext applicationContext = mock(ApplicationContext.class);
        new RaftPeerSet().setApplicationContext(applicationContext);
    }

    @Test(timeout=10000)
    public void setTermToOne() {
        RaftPeerSet raftPeerSet = new RaftPeerSet();
        raftPeerSet.setTerm(1L);
        assertThat(raftPeerSet.getTerm(), is(1L));
    }

    @Test(timeout=10000)
    public void sizeReturnsZero() {
        assertThat(new RaftPeerSet().size(), is(0));
    }

    @Test(timeout=10000)
    public void update() {
        RaftPeer peer = new RaftPeer();
        assertThat(new RaftPeerSet().update(peer), sameInstance(peer));
    }
}
