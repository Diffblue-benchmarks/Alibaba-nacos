package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.consistency.persistent.raft.RaftPeer
 *
 * @author Diffblue JCover
 */

public class RaftPeerDiffblueTest {

    @Test(timeout=10000)
    public void resetHeartbeatDue() {
        new RaftPeer().resetHeartbeatDue();
    }

    @Test(timeout=10000)
    public void resetLeaderDue() {
        new RaftPeer().resetLeaderDue();
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new RaftPeer().equals("foo"), is(false));
        assertThat(new RaftPeer().equals(null), is(false));
        assertThat(new RaftPeer().equals(new RaftPeer()), is(true));
    }
}
