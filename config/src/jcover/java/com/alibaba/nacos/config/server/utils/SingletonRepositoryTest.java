package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.SingletonRepository
 *
 * @author Diffblue JCover
 */

public class SingletonRepositoryTest {

    @Test(timeout=10000)
    public void getSingletonObjIsFoo() {
        Object obj = "foo";
        assertThat(new SingletonRepository<Object>().getSingleton(obj), sameInstance(obj));
    }

    @Test(timeout=10000)
    public void remove() {
        new SingletonRepository<Object>().remove(new Object());
    }

    @Test(timeout=10000)
    public void sizeReturnsZero() {
        assertThat(new SingletonRepository<Object>().size(), is(0));
    }
}
