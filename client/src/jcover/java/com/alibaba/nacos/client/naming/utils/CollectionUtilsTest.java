package com.alibaba.nacos.client.naming.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.LinkedList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.utils.CollectionUtils
 *
 * @author Diffblue JCover
 */

public class CollectionUtilsTest {

    @Test(timeout=10000)
    public void getCardinalityMap() {
        Collection coll = new LinkedList();
        Object object = 1;
        ((LinkedList)coll).add(object);
        assertThat(CollectionUtils.getCardinalityMap(coll).get(object), sameInstance(object));
    }

    @Test(timeout=10000)
    public void isEmpty() {
        assertThat(CollectionUtils.getCardinalityMap(new LinkedList()).isEmpty(), is(true));
        assertThat(CollectionUtils.isEmpty(new LinkedList()), is(true));
        assertThat(CollectionUtils.isEmpty(null), is(true));
    }

    @Test(timeout=10000)
    public void isEmptyReturnsFalse() {
        Collection coll = new LinkedList();
        ((LinkedList)coll).add(new Object());
        assertThat(CollectionUtils.isEmpty(coll), is(false));
    }

    @Test(timeout=10000)
    public void isEqualCollectionAIsEmptyReturnsTrue() {
        assertThat(CollectionUtils.isEqualCollection(new LinkedList(), new LinkedList()), is(true));
    }

    @Test(timeout=10000)
    public void isEqualCollectionReturnsFalse() {
        Collection a = new LinkedList();
        ((LinkedList)a).add(new Object());
        assertThat(CollectionUtils.isEqualCollection(a, new LinkedList()), is(false));
    }

    @Test(timeout=10000)
    public void subtract() {
        Collection b = new LinkedList();
        ((LinkedList)b).add(new Object());
        assertTrue(CollectionUtils.subtract(new LinkedList(), b).isEmpty());
    }

    @Test(timeout=10000)
    public void subtractBIsEmpty() {
        assertTrue(CollectionUtils.subtract(new LinkedList(), new LinkedList()).isEmpty());
    }
}
