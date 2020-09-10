package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.ThreadUtil
 *
 * @author Diffblue Cover
 */

class ThreadUtilTest {

    @Test
    void getSuitableThreadCount() {
        assertThat(ThreadUtil.getSuitableThreadCount(), is(16));
    }
}
