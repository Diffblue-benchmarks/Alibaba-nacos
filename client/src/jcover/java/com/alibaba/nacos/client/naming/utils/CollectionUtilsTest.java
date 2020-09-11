package com.alibaba.nacos.client.naming.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.utils.CollectionUtils
 *
 * @author Diffblue Cover
 */

class CollectionUtilsTest {

    @Test
    void subtract() {
        LinkedList a = new LinkedList();
        Object object1 = new Object();
        a.add(object1);
        LinkedList b = new LinkedList();
        b.add(new Object());
        assertThat(CollectionUtils.subtract(a, b).size(), is(1));
    }

    @Test
    void getCardinalityMap() {
        LinkedList coll = new LinkedList();
        Object object = 1;
        coll.add(object);
        assertThat(CollectionUtils.getCardinalityMap(coll).get(object), sameInstance(object));
    }

    @Test
    void getCardinalityMapCollIsEmptyReturnsEmpty() {
        assertThat(CollectionUtils.getCardinalityMap(new LinkedList()).isEmpty(), is(true));
    }

    @Test
    void isEqualCollectionAIsEmptyAndBIsEmptyReturnsTrue() {
        assertThat(CollectionUtils.isEqualCollection(new LinkedList(), new LinkedList()), is(true));
    }

    @Test
    void isEqualCollectionAIsEmptyReturnsFalse() {
        LinkedList b = new LinkedList();
        b.add("foo");
        assertThat(CollectionUtils.isEqualCollection(new LinkedList(), b), is(false));
    }

    @Test
    void isEqualCollectionReturnsFalse() {
        LinkedList a = new LinkedList();
        a.add(1);
        LinkedList b = new LinkedList();
        b.add("foo");
        assertThat(CollectionUtils.isEqualCollection(a, b), is(false));
    }

    @Test
    void isEqualCollectionReturnsTrue() {
        LinkedList a = new LinkedList();
        a.add("foo");
        LinkedList b = new LinkedList();
        b.add("foo");
        assertThat(CollectionUtils.isEqualCollection(a, b), is(true));
    }

    @Test
    void isEmpty() {
        assertThat(CollectionUtils.isEmpty(new LinkedList()), is(true));
        assertThat(CollectionUtils.isEmpty(null), is(true));
    }

    @Test
    void isEmptyReturnsFalse() {
        LinkedList coll = new LinkedList();
        coll.add("foo");
        assertThat(CollectionUtils.isEmpty(coll), is(false));
    }
}
