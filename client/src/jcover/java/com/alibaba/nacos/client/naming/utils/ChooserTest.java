package com.alibaba.nacos.client.naming.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.utils.Chooser
 *
 * @author Diffblue Cover
 */

class ChooserTest {

    @Test
    void factory() {
        assertThat(new Chooser<String, String>("foo").getUniqueKey(), is("foo"));
    }

    @Test
    void randomReturnsFoo() {
        ArrayList<Pair<String>> pairs = new ArrayList<Pair<String>>();
        pairs.add(new Pair<String>("foo", 1.0));
        assertThat(new Chooser<String, String>("bar", pairs).random(), is("foo"));
    }

    @Test
    void randomReturnsNull() {
        assertThat(new Chooser<String, String>("foo").random(), is(nullValue()));
    }

    @Test
    void randomWithWeightReturnsFoo() {
        ArrayList<Pair<String>> pairs = new ArrayList<Pair<String>>();
        pairs.add(new Pair<String>("foo", 1.0));
        assertThat(new Chooser<String, String>("bar", pairs).randomWithWeight(), is("foo"));
    }

    @Test
    void refreshItemsWithWeightIsEmpty() {
        new Chooser<String, String>("foo").refresh(new ArrayList<Pair<String>>());
    }

    @Test
    void testEquals() {
        assertThat(new Chooser<String, String>("foo").equals(new Object()), is(false));
        assertThat(new Chooser<String, String>("foo").equals(null), is(false));
    }
}
