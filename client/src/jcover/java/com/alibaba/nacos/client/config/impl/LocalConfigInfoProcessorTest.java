package com.alibaba.nacos.client.config.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.impl.LocalConfigInfoProcessor
 *
 * @author Diffblue JCover
 */

public class LocalConfigInfoProcessorTest {

    @Test(timeout=10000)
    public void cleanAllSnapshot() {
        LocalConfigInfoProcessor.cleanAllSnapshot();
    }

    @Test(timeout=10000)
    public void getFailoverDataIdIsSomethingAndGroupIsDataAndServerNameIsBarReturnsNull() {
        assertThat(LocalConfigInfoProcessor.getFailover("bar", "something", "data", "545321456"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getPath() {
        assertThat(LocalConfigInfoProcessor.getFailoverFile("bar", "something", "/bin/bash", "/bin/bash").getPath(), is("/home/thomas_perkins/nacos/config/bar_nacos/data/config-data-tenant/bin/bash/bin/bash/something"));
        assertThat(LocalConfigInfoProcessor.getFailoverFile("/bin/bash", "something", "/bin/bash", "").getPath(), is("/home/thomas_perkins/nacos/config/bin/bash_nacos/data/config-data/bin/bash/something"));
        assertThat(LocalConfigInfoProcessor.getSnapshotFile("bar", "something", "/bin/bash", "/bin/bash").getPath(), is("/home/thomas_perkins/nacos/config/bar_nacos/snapshot-tenant/bin/bash/bin/bash/something"));
        assertThat(LocalConfigInfoProcessor.getSnapshotFile("/bin/bash", "something", "/bin/bash", "").getPath(), is("/home/thomas_perkins/nacos/config/bin/bash_nacos/snapshot/bin/bash/something"));
    }

    @Test(timeout=10000)
    public void getSnapshot() {
        assertThat(LocalConfigInfoProcessor.getSnapshot("bar", "", "545321456", "545321456"), is(nullValue()));
        assertThat(LocalConfigInfoProcessor.getSnapshot("bar", "something", "foo", "545321456"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void saveSnapshotConfigIsFoo() {
        LocalConfigInfoProcessor.saveSnapshot("bar", "something", "545321456", "545321456", "foo");
    }

    @Test(timeout=10000)
    public void saveSnapshotDataIdIsEmpty() {
        LocalConfigInfoProcessor.saveSnapshot("bar", "", "545321456", "545321456", "545321456");
    }

    @Test(timeout=10000)
    public void saveSnapshotGroupIsFoo() {
        LocalConfigInfoProcessor.saveSnapshot("bar", "something", "foo", "545321456", "545321456");
    }
}
