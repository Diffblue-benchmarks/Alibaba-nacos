package com.alibaba.nacos.naming.misc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.misc.SwitchManager
 *
 * @author Diffblue JCover
 */

public class SwitchManagerTest {

    @Test(timeout=10000)
    public void getSwitchDomainReturnsNull() {
        assertThat(new SwitchManager().getSwitchDomain(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void interestsKeyIsFooReturnsFalse() {
        assertThat(new SwitchManager().interests("foo"), is(false));
    }

    @Test(timeout=10000)
    public void matchUnlistenKeyKeyIsFooReturnsFalse() {
        assertThat(new SwitchManager().matchUnlistenKey("foo"), is(false));
    }

    @Test(timeout=10000)
    public void onDelete() throws Exception {
        new SwitchManager().onDelete(" ");
    }
}
