package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.consistency.ephemeral.distro.SyncTask
 *
 * @author Diffblue Cover
 */

public class SyncTaskTest {

    @Test
    public void factory() {
        SyncTask syncTask = new SyncTask();
        syncTask.setKeys(new ArrayList<String>());
        syncTask.setLastExecuteTime(1L);
        syncTask.setRetryCount(1);
        syncTask.setTargetServer("bar");
        assertThat(syncTask.getKeys(), empty());
        assertThat(syncTask.getLastExecuteTime(), is(1L));
        assertThat(syncTask.getRetryCount(), is(1));
        assertThat(syncTask.getTargetServer(), is("bar"));
    }
}
