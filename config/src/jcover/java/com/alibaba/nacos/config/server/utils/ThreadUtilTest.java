package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.ThreadUtil
 *
 * @author Diffblue JCover
 */

public class ThreadUtilTest {

    @Test(timeout=10000)
    public void getSuitableThreadCountReturnsEight() {
        assertThat(ThreadUtil.getSuitableThreadCount(), is(8));
    }
}
