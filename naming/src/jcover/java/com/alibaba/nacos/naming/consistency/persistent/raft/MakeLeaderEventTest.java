package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.consistency.persistent.raft.MakeLeaderEvent
 *
 * @author Diffblue Cover
 */

public class MakeLeaderEventTest {

    @Test
    public void factory() {
        Object source = new Object();
        RaftPeer raftPeer = new RaftPeer();
        MakeLeaderEvent makeLeaderEvent =
             new MakeLeaderEvent(source, raftPeer);
        assertThat(makeLeaderEvent.getRaftPeer(), sameInstance(raftPeer));
        assertThat(makeLeaderEvent.getSource(), sameInstance(source));
    }
}
