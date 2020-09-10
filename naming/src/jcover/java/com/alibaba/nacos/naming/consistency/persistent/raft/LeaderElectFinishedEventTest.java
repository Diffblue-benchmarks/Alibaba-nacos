package com.alibaba.nacos.naming.consistency.persistent.raft;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.consistency.persistent.raft.LeaderElectFinishedEvent
 *
 * @author Diffblue Cover
 */

public class LeaderElectFinishedEventTest {

    @Test
    public void factory() {
        Object source = new Object();
        RaftPeer raftPeer = new RaftPeer();
        LeaderElectFinishedEvent leaderElectFinishedEvent =
             new LeaderElectFinishedEvent(source, raftPeer);
        assertThat(leaderElectFinishedEvent.getRaftPeer(), sameInstance(raftPeer));
        assertThat(leaderElectFinishedEvent.getSource(), sameInstance(source));
    }
}
