package com.alibaba.nacos.config.server.service.dump;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.alibaba.nacos.config.server.manager.AbstractTask;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.dump.DumpTask
 *
 * @author Diffblue JCover
 */

public class DumpTaskTest {

    @Test(timeout=10000)
    public void merge() {
        AbstractTask task = mock(AbstractTask.class);
        new DumpTask("foo", 1L, "foo").merge(task);
    }

    @Test(timeout=10000)
    public void shouldProcessReturnsTrue() {
        assertThat(new DumpTask("foo", 1L, "foo").shouldProcess(), is(true));
    }
}
