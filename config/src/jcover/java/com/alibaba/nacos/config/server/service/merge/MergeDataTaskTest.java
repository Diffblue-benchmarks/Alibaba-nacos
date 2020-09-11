package com.alibaba.nacos.config.server.service.merge;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.alibaba.nacos.config.server.manager.AbstractTask;

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
             new MergeDataTask("something", "1234", "something", "something");
        mergeDataTask.setLastProcessTime(1L);
        mergeDataTask.setTaskInterval(1L);
        assertThat(mergeDataTask.getClientIp(), is("something"));
        assertThat(mergeDataTask.getLastProcessTime(), is(1L));
        assertThat(mergeDataTask.getTaskInterval(), is(1L));
    }

    @Test
    void merge() {
        AbstractTask task = mock(AbstractTask.class);
        new MergeDataTask("something", "1234", "something", "something").merge(task);
    }

    @Test
    void getId() {
        assertThat(new MergeDataTask("something", "1234", "something", "something").getId(), is("MergeTask[something, 1234, something, something]"));
    }
}
