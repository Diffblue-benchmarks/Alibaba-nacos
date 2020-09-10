package com.alibaba.nacos.config.server.service.notify;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.nacos.config.server.service.dump.DumpTask;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.notify.NotifyTask
 *
 * @author Diffblue Cover
 */

class NotifyTaskTest {

    @Test
    void factory() {
        NotifyTask notifyTask = new NotifyTask("bar", "foo", "/some/path.html", 1L);
        notifyTask.setDataId("1234");
        notifyTask.setFailCount(1);
        notifyTask.setGroup("/some/path.html");
        notifyTask.setLastModified(1L);
        notifyTask.setTenant("/some/path.html");
        notifyTask.setLastProcessTime(1L);
        notifyTask.setTaskInterval(1L);
        assertThat(notifyTask.getDataId(), is("1234"));
        assertThat(notifyTask.getFailCount(), is(1));
        assertThat(notifyTask.getGroup(), is("/some/path.html"));
        assertThat(notifyTask.getLastModified(), is(1L));
        assertThat(notifyTask.getTenant(), is("/some/path.html"));
        assertThat(notifyTask.getLastProcessTime(), is(1L));
        assertThat(notifyTask.getTaskInterval(), is(1L));
    }

    @Test
    void merge() {
        new NotifyTask("1234", "/some/path.html", "/some/path.html", 1L).merge(new DumpTask("key", 1L, "/some/path.html"));
    }
}
