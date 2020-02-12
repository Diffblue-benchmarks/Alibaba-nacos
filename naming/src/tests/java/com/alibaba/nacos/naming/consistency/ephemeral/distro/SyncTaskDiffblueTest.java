package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.consistency.ephemeral.distro.SyncTask
 *
 * @author Diffblue JCover
 */

public class SyncTaskDiffblueTest {

    @Test(timeout=10000)
    public void getKeysReturnsNull() {
        assertThat(new SyncTask().getKeys(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getLastExecuteTimeReturnsZero() {
        assertThat(new SyncTask().getLastExecuteTime(), is(0L));
    }

    @Test(timeout=10000)
    public void getRetryCountReturnsZero() {
        assertThat(new SyncTask().getRetryCount(), is(0));
    }

    @Test(timeout=10000)
    public void getTargetServerReturnsNull() {
        assertThat(new SyncTask().getTargetServer(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setKeysToEmpty() {
        SyncTask syncTask = new SyncTask();
        List<String> keys = new ArrayList<String>();
        syncTask.setKeys(keys);
        assertThat(syncTask.getKeys(), sameInstance(keys));
    }

    @Test(timeout=10000)
    public void setLastExecuteTimeToOne() {
        SyncTask syncTask = new SyncTask();
        syncTask.setLastExecuteTime(1L);
        assertThat(syncTask.getLastExecuteTime(), is(1L));
    }

    @Test(timeout=10000)
    public void setRetryCountToOne() {
        SyncTask syncTask = new SyncTask();
        syncTask.setRetryCount(1);
        assertThat(syncTask.getRetryCount(), is(1));
    }

    @Test(timeout=10000)
    public void setTargetServerToFoo() {
        SyncTask syncTask = new SyncTask();
        syncTask.setTargetServer("foo");
        assertThat(syncTask.getTargetServer(), is("foo"));
    }
}
