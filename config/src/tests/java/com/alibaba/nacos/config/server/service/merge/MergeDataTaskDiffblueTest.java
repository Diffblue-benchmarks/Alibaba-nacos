package com.alibaba.nacos.config.server.service.merge;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.alibaba.nacos.config.server.manager.AbstractTask;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.merge.MergeDataTask
 *
 * @author Diffblue JCover
 */

public class MergeDataTaskDiffblueTest {

    @Test(timeout=10000)
    public void getClientIpReturnsSomething() {
        assertThat(new MergeDataTask("something", "something", "something", "something").getClientIp(), is("something"));
    }

    @Test(timeout=10000)
    public void getId() {
        assertThat(new MergeDataTask("something", "something", "something", "something").getId(), is("MergeTask[something, something, something, something]"));
    }

    @Test(timeout=10000)
    public void merge() {
        AbstractTask task = mock(AbstractTask.class);
        new MergeDataTask("something", "something", "something", "something").merge(task);
    }

    @Test(timeout=10000)
    public void shouldProcessReturnsTrue() {
        assertThat(new MergeDataTask("something", "something", "something", "something").shouldProcess(), is(true));
    }
}
