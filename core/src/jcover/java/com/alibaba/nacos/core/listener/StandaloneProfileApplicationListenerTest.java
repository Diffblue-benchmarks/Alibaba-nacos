package com.alibaba.nacos.core.listener;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.core.listener.StandaloneProfileApplicationListener
 *
 * @author Diffblue JCover
 */

public class StandaloneProfileApplicationListenerTest {

    @Test(timeout=10000)
    public void getOrderReturnsIntMin() {
        assertThat(new StandaloneProfileApplicationListener().getOrder(), is(-2_147_483_648));
    }
}
