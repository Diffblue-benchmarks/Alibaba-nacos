package com.alibaba.nacos.config.server.service.dump;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.dump.DumpTask
 *
 * @author Diffblue Cover
 */

class DumpTaskTest {

    @Test
    void factory1() {
        DumpTask dumpTask = new DumpTask("key", 1L, "foo");
        dumpTask.setLastProcessTime(1L);
        dumpTask.setTaskInterval(1L);
        assertThat(dumpTask.getLastProcessTime(), is(1L));
        assertThat(dumpTask.getTaskInterval(), is(1L));
    }

    @Test
    void factory2() {
        DumpTask dumpTask = new DumpTask("key", 1L, "foo", false);
        dumpTask.setLastProcessTime(1L);
        dumpTask.setTaskInterval(1L);
        assertThat(dumpTask.getLastProcessTime(), is(1L));
        assertThat(dumpTask.getTaskInterval(), is(1L));
    }

    @Test
    void factory3() {
        DumpTask dumpTask = new DumpTask("key", "tag", 1L, "foo", false);
        dumpTask.setLastProcessTime(1L);
        dumpTask.setTaskInterval(1L);
        assertThat(dumpTask.getLastProcessTime(), is(1L));
        assertThat(dumpTask.getTaskInterval(), is(1L));
    }

    @Test
    void merge() {
        new DumpTask("key", 1L, "/some/path.html").merge(new DumpTask("key", 1L, "/some/path.html"));
    }
}
