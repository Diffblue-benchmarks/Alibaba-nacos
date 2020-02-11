package com.alibaba.nacos.naming.misc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.misc.GlobalConfig
 *
 * @author Diffblue JCover
 */

public class GlobalConfigTest {

    @Test(timeout=10000)
    public void getBatchSyncKeyCountReturnsOneThousand() {
        assertThat(new GlobalConfig().getBatchSyncKeyCount(), is(1_000));
    }

    @Test(timeout=10000)
    public void getSyncRetryDelay() {
        assertThat(new GlobalConfig().getSyncRetryDelay(), is(5_000L));
    }

    @Test(timeout=10000)
    public void getTaskDispatchPeriod() {
        assertThat(new GlobalConfig().getTaskDispatchPeriod(), is(2_000));
    }

    @Test(timeout=10000)
    public void isDataWarmupReturnsFalse() {
        assertThat(new GlobalConfig().isDataWarmup(), is(false));
    }

    @Test(timeout=10000)
    public void isExpireInstanceReturnsTrue() {
        assertThat(new GlobalConfig().isExpireInstance(), is(true));
    }
}
