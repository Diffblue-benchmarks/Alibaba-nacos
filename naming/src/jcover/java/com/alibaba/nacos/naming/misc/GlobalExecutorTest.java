package com.alibaba.nacos.naming.misc;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.misc.GlobalExecutor
 *
 * @author Diffblue Cover
 */

public class GlobalExecutorTest {

    @Test
    public void submitDataSyncDelayIsOne() {
        GlobalExecutor.submitDataSync(Thread.currentThread(), 1L);
    }

    @Test
    public void schedulePartitionDataTimedSync() {
        GlobalExecutor.schedulePartitionDataTimedSync(Thread.currentThread());
    }

    @Test
    public void registerMasterElection() {
        GlobalExecutor.registerMasterElection(Thread.currentThread());
    }

    @Test
    public void registerServerListUpdater() {
        GlobalExecutor.registerServerListUpdater(Thread.currentThread());
    }

    @Test
    public void registerServerStatusReporterDelayIsOne() {
        GlobalExecutor.registerServerStatusReporter(Thread.currentThread(), 1L);
    }

    @Test
    public void registerServerStatusUpdater() {
        GlobalExecutor.registerServerStatusUpdater(Thread.currentThread());
    }

    @Test
    public void registerHeartbeat() {
        GlobalExecutor.registerHeartbeat(Thread.currentThread());
    }

    @Test
    public void schedulePeriodIsOne() {
        GlobalExecutor.schedule(Thread.currentThread(), 1L);
    }

    @Test
    public void notifyServerListChange() {
        GlobalExecutor.notifyServerListChange(Thread.currentThread());
    }

    @Test
    public void submitTaskDispatch() {
        GlobalExecutor.submitTaskDispatch(Thread.currentThread());
    }

    @Test
    public void submit() {
        GlobalExecutor.submit(Thread.currentThread());
    }

    @Test
    public void submitServiceUpdate() {
        GlobalExecutor.submitServiceUpdate(Thread.currentThread());
    }
}
