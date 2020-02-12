package com.alibaba.nacos.api.selector;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.api.selector.NoneSelector
 *
 * @author Diffblue JCover
 */

public class NoneSelectorDiffblueTest {

    @Test(timeout=10000)
    public void getTypeReturnsNone() {
        assertThat(new NoneSelector().getType(), is("none"));
    }
}
