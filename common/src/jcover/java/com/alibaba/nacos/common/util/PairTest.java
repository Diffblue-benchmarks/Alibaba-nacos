package com.alibaba.nacos.common.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.common.util.Pair
 *
 * @author Diffblue JCover
 */

public class PairTest {

    @Test(timeout=10000)
    public void getKeyReturnsEmpty() {
        assertThat(new Pair().getKey(), is(""));
    }

    @Test(timeout=10000)
    public void getValueReturnsEmpty() {
        assertThat(new Pair().getValue(), is(""));
    }

    @Test(timeout=10000)
    public void setKeyToFoo() {
        Pair pair = new Pair();
        pair.setKey("foo");
        assertThat(pair.getKey(), is("foo"));
    }

    @Test(timeout=10000)
    public void setValueToFoo() {
        Pair pair = new Pair();
        pair.setValue("foo");
        assertThat(pair.getValue(), is("foo"));
    }
}
