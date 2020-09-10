package com.alibaba.nacos.config.server.service.notify;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.nacos.config.server.service.ServerListService;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.notify.NotifySingleService
 *
 * @author Diffblue Cover
 */

class NotifySingleServiceTest {

    @Test
    void factory() {
        assertThat(new NotifySingleService(new ServerListService()).getExecutors().isEmpty(), is(true));
    }
}
