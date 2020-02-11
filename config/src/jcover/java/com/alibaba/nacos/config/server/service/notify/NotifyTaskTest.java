package com.alibaba.nacos.config.server.service.notify;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.alibaba.nacos.config.server.manager.AbstractTask;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.notify.NotifyTask
 *
 * @author Diffblue JCover
 */

public class NotifyTaskTest {

    @Test(timeout=10000)
    public void getDataIdReturnsSomething() {
        assertThat(new NotifyTask("something", "foo", "foo", 1L).getDataId(), is("something"));
    }

    @Test(timeout=10000)
    public void getFailCountReturnsZero() {
        assertThat(new NotifyTask("something", "bar", "foo", 1L).getFailCount(), is(0));
    }

    @Test(timeout=10000)
    public void getGroupReturnsFoo() {
        assertThat(new NotifyTask("something", "foo", "foo", 1L).getGroup(), is("foo"));
    }

    @Test(timeout=10000)
    public void getLastModified() {
        assertThat(new NotifyTask("something", "bar", "foo", 1L).getLastModified(), is(1L));
        assertThat(new NotifyTask("something", "foo", "foo", 0L).getLastModified(), is(0L));
    }

    @Test(timeout=10000)
    public void getTenantReturnsFoo() {
        assertThat(new NotifyTask("something", "foo", "foo", 1L).getTenant(), is("foo"));
    }

    @Test(timeout=10000)
    public void merge() {
        AbstractTask task = mock(AbstractTask.class);
        new NotifyTask("something", "foo", "foo", 1L).merge(task);
    }

    @Test(timeout=10000)
    public void setDataIdToSomething() {
        new NotifyTask("something", "foo", "foo", 1L).setDataId("something");
    }

    @Test(timeout=10000)
    public void setFailCountToOne() {
        NotifyTask notifyTask = new NotifyTask("something", "foo", "foo", 1L);
        notifyTask.setFailCount(1);
        assertThat(notifyTask.getFailCount(), is(1));
    }

    @Test(timeout=10000)
    public void setGroupToFoo() {
        new NotifyTask("something", "foo", "foo", 1L).setGroup("foo");
    }

    @Test(timeout=10000)
    public void setLastModifiedToOne() {
        new NotifyTask("something", "foo", "foo", 1L).setLastModified(1L);
    }

    @Test(timeout=10000)
    public void shouldProcessReturnsTrue() {
        assertThat(new NotifyTask("something", "foo", "foo", 1L).shouldProcess(), is(true));
    }
}
