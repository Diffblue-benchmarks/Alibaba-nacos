package com.alibaba.nacos.client.config.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.impl.Limiter
 *
 * @author Diffblue JCover
 */

public class LimiterTest {

    @Test(timeout=10000)
    public void isLimitReturnsFalse() {
        assertThat(Limiter.isLimit(" "), is(false));
    }
}
