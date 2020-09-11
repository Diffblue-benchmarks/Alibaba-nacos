package com.alibaba.nacos.config.server.service.merge;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.nacos.config.server.service.dump.DumpTask;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.merge.MergeDataTask
 *
 * @author Diffblue Cover
 */

class MergeDataTaskTest {

    @Test
    void factory() {
        MergeDataTask mergeDataTask =
             new MergeDataTask("1234", "1234", "foo", "foo");
        mergeDataTask.setLastProcessTime(1L);
        mergeDataTask.setTaskInterval(1L);
        assertThat(mergeDataTask.getClientIp(), is("foo"));
        assertThat(mergeDataTask.getLastProcessTime(), is(1L));
        assertThat(mergeDataTask.getTaskInterval(), is(1L));
    }

    @Test
    void merge() {
        new MergeDataTask("something", "1234", "something", "something").merge(new DumpTask("key", 1L, "/some/path.html"));
    }

    @Test
    void getId() {
        assertThat(new MergeDataTask("something", "1234", "something", "something").getId(), is("MergeTask[something, 1234, something, something]"));
    }
}
