package com.alibaba.nacos.naming.healthcheck;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import com.alibaba.nacos.naming.core.Service;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.healthcheck.ClientBeatCheckTask
 *
 * @author Diffblue JCover
 */

public class ClientBeatCheckTaskTest {

    @Test(timeout=10000)
    public void run() {
        new ClientBeatCheckTask(new com.alibaba.nacos.naming.core.Service()).run();
    }

    @Test(timeout=10000)
    public void taskKeyReturnsNull() {
        assertThat(new ClientBeatCheckTask(new Service()).taskKey(), is(nullValue()));
    }
}
