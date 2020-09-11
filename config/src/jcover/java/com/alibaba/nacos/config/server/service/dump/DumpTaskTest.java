package com.alibaba.nacos.config.server.service.dump;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.alibaba.nacos.config.server.manager.AbstractTask;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.dump.DumpTask
 *
 * @author Diffblue Cover
 */

class DumpTaskTest {

    @Test
    void factory1() {
        DumpTask dumpTask = new DumpTask("key", 1L, "/some/path.html");
        dumpTask.setLastProcessTime(1L);
        dumpTask.setTaskInterval(1L);
        assertThat(dumpTask.getLastProcessTime(), is(1L));
        assertThat(dumpTask.getTaskInterval(), is(1L));
    }

    @Test
    void factory2() {
        DumpTask dumpTask = new DumpTask("key", 1L, "/some/path.html", false);
        dumpTask.setLastProcessTime(1L);
        dumpTask.setTaskInterval(1L);
        assertThat(dumpTask.getLastProcessTime(), is(1L));
        assertThat(dumpTask.getTaskInterval(), is(1L));
    }

    @Test
    void factory3() {
        DumpTask dumpTask =
             new DumpTask("key", "tag", 1L, "/some/path.html", false);
        dumpTask.setLastProcessTime(1L);
        dumpTask.setTaskInterval(1L);
        assertThat(dumpTask.getLastProcessTime(), is(1L));
        assertThat(dumpTask.getTaskInterval(), is(1L));
    }

    @Test
    void merge() {
        AbstractTask task = mock(AbstractTask.class);
        new DumpTask("key", 1L, "/some/path.html").merge(task);
    }
}
