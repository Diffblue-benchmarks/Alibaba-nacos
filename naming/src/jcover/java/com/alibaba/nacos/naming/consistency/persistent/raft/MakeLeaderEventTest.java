package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.consistency.persistent.raft.MakeLeaderEvent
 *
 * @author Diffblue JCover
 */

public class MakeLeaderEventTest {

    @Test(timeout=10000)
    public void getRaftPeer() {
        RaftPeer raftPeer = new RaftPeer();
        assertThat(new MakeLeaderEvent(new Object(), raftPeer).getRaftPeer(), sameInstance(raftPeer));
    }
}
