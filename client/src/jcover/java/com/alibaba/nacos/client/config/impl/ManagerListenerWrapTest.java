package com.alibaba.nacos.client.config.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.alibaba.nacos.api.config.listener.Listener;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.impl.ManagerListenerWrap
 *
 * @author Diffblue JCover
 */

public class ManagerListenerWrapTest {

    @Test(timeout=10000)
    public void testequals1() {
        Listener listener1 = mock(Listener.class);
        assertThat(new ManagerListenerWrap(listener1).equals("foo"), is(false));
    }

    @Test(timeout=10000)
    public void testequals2() {
        Listener listener = mock(Listener.class);
        assertThat(new ManagerListenerWrap(listener, "bar").equals("foo"), is(false));
    }
}
