package com.alibaba.nacos.naming.misc;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.misc.GlobalExecutor
 *
 * @author Diffblue JCover
 */

public class GlobalExecutorTest {

    @Test(timeout=10000)
    public void notifyServerListChange() {
        GlobalExecutor.notifyServerListChange(Thread.currentThread());
    }

    @Test(timeout=10000)
    public void registerHeartbeat() {
        GlobalExecutor.registerHeartbeat(Thread.currentThread());
    }

    @Test(timeout=10000)
    public void registerMasterElection() {
        GlobalExecutor.registerMasterElection(Thread.currentThread());
    }

    @Test(timeout=10000)
    public void registerServerListUpdater() {
        GlobalExecutor.registerServerListUpdater(Thread.currentThread());
    }

    @Test(timeout=10000)
    public void registerServerStatusReporterDelayIsOne() {
        GlobalExecutor.registerServerStatusReporter(Thread.currentThread(), 1L);
    }

    @Test(timeout=10000)
    public void registerServerStatusUpdater() {
        GlobalExecutor.registerServerStatusUpdater(Thread.currentThread());
    }

    @Test(timeout=10000)
    public void schedulePartitionDataTimedSync() {
        GlobalExecutor.schedulePartitionDataTimedSync(Thread.currentThread());
    }

    @Test(timeout=10000)
    public void schedulePeriodIsOne() {
        GlobalExecutor.schedule(Thread.currentThread(), 1L);
    }

    @Test(timeout=10000)
    public void submit() {
        GlobalExecutor.submit(Thread.currentThread());
    }

    @Test(timeout=10000)
    public void submitDataSyncDelayIsOne() {
        GlobalExecutor.submitDataSync(Thread.currentThread(), 1L);
    }

    @Test(timeout=10000)
    public void submitServiceUpdate() {
        GlobalExecutor.submitServiceUpdate(Thread.currentThread());
    }

    @Test(timeout=10000)
    public void submitTaskDispatch() {
        GlobalExecutor.submitTaskDispatch(Thread.currentThread());
    }
}
