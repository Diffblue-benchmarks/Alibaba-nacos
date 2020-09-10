package com.alibaba.nacos.config.server.service.notify;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.nacos.config.server.service.ServerListService;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.notify.NotifyTaskProcessor
 *
 * @author Diffblue Cover
 */

class NotifyTaskProcessorTest {

    @Test
    void notifyToDumpGroupIsBarAndLastModifiedIsOneReturnsFalse() {
        assertThat(new NotifyTaskProcessor(new ServerListService()).notifyToDump("1234", "bar", "/some/path.html", 1L, "/some/path.html"), is(false));
    }
}
