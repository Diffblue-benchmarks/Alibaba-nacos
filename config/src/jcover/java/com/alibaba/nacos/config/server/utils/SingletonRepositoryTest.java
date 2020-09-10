package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.SingletonRepository
 *
 * @author Diffblue Cover
 */

class SingletonRepositoryTest {

    @Test
    void getSingletonObjIsBarReturnsBar() {
        assertThat(new SingletonRepository<String>().getSingleton("bar"), is("bar"));
    }

    @Test
    void sizeReturnsZero() {
        assertThat(new SingletonRepository<String>().size(), is(0));
    }

    @Test
    void remove() {
        new SingletonRepository<String>().remove(new Object());
    }
}
