package com.alibaba.nacos.client.naming.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.utils.CollectionUtils
 *
 * @author Diffblue Cover
 */

class CollectionUtilsTest {

    @Test
    void subtractAIsEmptyAndBIsFooReturnsEmpty() {
        LinkedList<String> b = new LinkedList<String>();
        b.add("foo");
        assertTrue((CollectionUtils.subtract(new LinkedList<String>(), b)).isEmpty());
    }

    @Test
    void getCardinalityMapCollIsEmptyReturnsEmpty() {
        assertThat(CollectionUtils.getCardinalityMap(new LinkedList<String>()).isEmpty(), is(true));
    }

    @Test
    void getCardinalityMapCollIsFooReturnsOne() {
        LinkedList<String> coll = new LinkedList<String>();
        coll.add("foo");
        assertThat((Integer) CollectionUtils.getCardinalityMap(coll).get("foo"), is(1));
    }

    @Test
    void isEqualCollectionAIsBar() {
        LinkedList<String> a = new LinkedList<String>();
        a.add("bar");
        LinkedList<String> b = new LinkedList<String>();
        b.add("foo");
        assertThat(CollectionUtils.isEqualCollection(a, b), is(false));
    }

    @Test
    void isEqualCollectionAIsEmpty() {
        LinkedList<String> b = new LinkedList<String>();
        b.add("foo");
        assertThat(CollectionUtils.isEqualCollection(new LinkedList<String>(), b), is(false));
    }

    @Test
    void isEqualCollectionAIsFooReturnsTrue() {
        LinkedList<String> a = new LinkedList<String>();
        a.add("foo");
        LinkedList<String> b = new LinkedList<String>();
        b.add("foo");
        assertThat(CollectionUtils.isEqualCollection(a, b), is(true));
    }

    @Test
    void isEmpty() {
        assertThat(CollectionUtils.isEmpty(new LinkedList<String>()), is(true));
        assertThat(CollectionUtils.isEmpty(null), is(true));
    }

    @Test
    void isEmptyCollIsFooReturnsFalse() {
        LinkedList<String> coll = new LinkedList<String>();
        coll.add("foo");
        assertThat(CollectionUtils.isEmpty(coll), is(false));
    }
}
