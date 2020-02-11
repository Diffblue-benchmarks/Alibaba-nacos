package com.alibaba.nacos.config.server.service.notify;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.nacos.config.server.service.ServerListService;

import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.notify.NotifySingleService
 *
 * @author Diffblue JCover
 */

public class NotifySingleServiceTest {

    @Test(timeout=10000)
    public void getExecutorsReturnsEmpty() {
        NotifySingleService notifySingleService = new NotifySingleService(new ServerListService());
        ConcurrentHashMap<String, java.util.concurrent.Executor> result = notifySingleService.getExecutors();
        assertThat(result.isEmpty(), is(true));
        assertThat(notifySingleService.getExecutors(), sameInstance(result));
    }
}
