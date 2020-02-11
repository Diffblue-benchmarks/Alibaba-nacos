package com.alibaba.nacos.client.naming.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.utils.Pair
 *
 * @author Diffblue JCover
 */

public class PairTest {

    @Test(timeout=10000)
    public void item() {
        Object item = new Object();
        assertThat(new Pair<Object>(item, 1.0).item(), sameInstance(item));
    }

    @Test(timeout=10000)
    public void weightReturnsOne() {
        assertEquals(1.0, new Pair<Object>("foo", 1.0).weight(), 0);
    }
}
