package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.nacos.naming.consistency.RecordListener;

import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.consistency.persistent.raft.RaftCore
 *
 * @author Diffblue JCover
 */

public class RaftCoreTest {

    @Test(timeout=10000)
    public void buildURL() {
        assertThat(RaftCore.buildURL(":", "OX13QD"), is("http://:/nacosOX13QD"));
        assertThat(RaftCore.buildURL("bar", "OX13QD"), is("http://bar:0/nacosOX13QD"));
    }

    @Test(timeout=10000)
    public void datumSizeReturnsZero() {
        assertThat(new RaftCore().datumSize(), is(0));
    }

    @Test(timeout=10000)
    public void getDatumReturnsNull() {
        assertThat(new RaftCore().getDatum("OX13QD"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getListenersReturnsEmpty() {
        RaftCore raftCore = new RaftCore();
        Map<String, java.util.List<com.alibaba.nacos.naming.consistency.RecordListener>> result = raftCore.getListeners();
        assertThat(result.isEmpty(), is(true));
        assertThat(raftCore.getListeners(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getNotifyTaskCountReturnsZero() {
        assertThat(new RaftCore().getNotifyTaskCount(), is(0));
    }

    @Test(timeout=10000)
    public void getPeerSetReturnsNull() {
        assertThat(new RaftCore().getPeerSet(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void listen() {
        RaftCore raftCore = new RaftCore();
        RecordListener listener = mock(RecordListener.class);
        raftCore.listen("OX13QD", listener);
        assertThat(raftCore.getListeners().get("OX13QD"), hasSize(1));
        assertThat(raftCore.getListeners().get("OX13QD").get(0), sameInstance(listener));
    }

    @Test(timeout=10000)
    public void loadDatum() {
        new RaftCore().loadDatum("OX13QD");
    }

    @Test(timeout=10000)
    public void setPeerSet() {
        RaftCore raftCore = new RaftCore();
        RaftPeerSet peerSet = new RaftPeerSet();
        raftCore.setPeerSet(peerSet);
        assertThat(raftCore.getLeader(), is(nullValue()));
        assertThat(raftCore.getPeerSet(), sameInstance(peerSet));
        assertThat(raftCore.getPeers(), empty());
        assertThat(raftCore.isLeader(), is(false));
    }

    @Test(timeout=10000)
    public void unlisten() {
        RecordListener listener = mock(RecordListener.class);
        new RaftCore().unlisten("OX13QD", listener);
    }

    @Test(timeout=10000)
    public void unlistenAll() {
        new RaftCore().unlistenAll("OX13QD");
    }
}
