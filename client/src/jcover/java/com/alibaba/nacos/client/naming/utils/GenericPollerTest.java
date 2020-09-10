package com.alibaba.nacos.client.naming.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.utils.GenericPoller
 *
 * @author Diffblue Cover
 */

class GenericPollerTest {

    @Test
    void nextReturnsFoo() {
        ArrayList<String> items = new ArrayList<String>();
        items.add("foo");
        assertThat(new GenericPoller<String>(items).next(), is("foo"));
    }

    @Test
    void refreshItemsIsEmpty() {
        // pojo Poller<String>
    }
}
