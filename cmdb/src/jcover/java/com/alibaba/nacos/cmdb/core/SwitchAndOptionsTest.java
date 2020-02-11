package com.alibaba.nacos.cmdb.core;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.cmdb.core.SwitchAndOptions
 *
 * @author Diffblue JCover
 */

public class SwitchAndOptionsTest {

    @Test(timeout=10000)
    public void getDumpTaskIntervalReturnsZero() {
        assertThat(new SwitchAndOptions().getDumpTaskInterval(), is(0));
    }

    @Test(timeout=10000)
    public void getEventTaskIntervalReturnsZero() {
        assertThat(new SwitchAndOptions().getEventTaskInterval(), is(0));
    }

    @Test(timeout=10000)
    public void getLabelTaskIntervalReturnsZero() {
        assertThat(new SwitchAndOptions().getLabelTaskInterval(), is(0));
    }

    @Test(timeout=10000)
    public void isLoadDataAtStartReturnsFalse() {
        assertThat(new SwitchAndOptions().isLoadDataAtStart(), is(false));
    }
}
