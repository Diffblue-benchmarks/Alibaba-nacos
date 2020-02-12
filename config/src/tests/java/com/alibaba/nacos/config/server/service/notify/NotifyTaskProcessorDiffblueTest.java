package com.alibaba.nacos.config.server.service.notify;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.nacos.config.server.service.ServerListService;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.notify.NotifyTaskProcessor
 *
 * @author Diffblue JCover
 */

public class NotifyTaskProcessorDiffblueTest {

    @Test(timeout=10000)
    public void notifyToDumpDataIdIsSomethingAndGroupIsBarAndLastModifiedIsOneAndServerIpIsFooAndTenantIsExceptionReturnsFalse() {
        assertThat(new NotifyTaskProcessor(new ServerListService()).notifyToDump("something", "bar", "exception", 1L, "foo"), is(false));
    }
}
