package com.alibaba.nacos.config.server.service.notify;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.alibaba.nacos.config.server.service.ServerListService;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.notify.NotifySingleService
 *
 * @author Diffblue Cover
 */

class NotifySingleServiceTest {

    @Test
    void factory1() {
        assertThat(new NotifySingleService(new ServerListService()).getExecutors().isEmpty(), is(true));
    }

    @Test
    void factory2() {
        List<String> list = new ArrayList<String>();
        list.add("foo");
        ServerListService serverListService = mock(ServerListService.class);
        when(serverListService.getServerList())
            .thenReturn(list);
        // pojo java.util.concurrent.Executor
    }
}
