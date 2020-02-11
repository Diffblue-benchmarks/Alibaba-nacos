package com.alibaba.nacos.naming.boot;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.boot.RunningConfig
 *
 * @author Diffblue JCover
 */

public class RunningConfigTest {

    @Test(timeout=10000)
    public void getContextPath() {
        assertThat(RunningConfig.getContextPath(), is("/nacos"));
    }

    @Test(timeout=10000)
    public void getServerPortReturnsZero() {
        assertThat(RunningConfig.getServerPort(), is(0));
    }
}
