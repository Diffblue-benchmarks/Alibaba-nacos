package com.alibaba.nacos.api.selector;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.api.selector.NoneSelector
 *
 * @author Diffblue Cover
 */

class NoneSelectorTest {

    @Test
    void factory() {
        assertThat(new NoneSelector().getType(), is("none"));
    }
}
