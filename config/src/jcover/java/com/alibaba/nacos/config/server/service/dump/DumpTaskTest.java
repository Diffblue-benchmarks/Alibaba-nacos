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
    void factory() {
        DumpTask dumpTask = new DumpTask("key", 1L, "/some/path.html");
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
