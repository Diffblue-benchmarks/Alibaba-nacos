package com.alibaba.nacos.naming.consistency.ephemeral.distro;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.consistency.ephemeral.distro.DataSyncer
 *
 * @author Diffblue JCover
 */

public class DataSyncerTest {

    @Test(timeout=10000)
    public void buildKeyKeyIsSomethingAndTargetServerIsSomething() {
        assertThat(new DataSyncer().buildKey("something", "something"), is("something@@@@something"));
    }

    @Test(timeout=10000)
    public void init() {
        new DataSyncer().init();
    }
}
